package businessLogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Oggetti.Utente;


public class DBConnect { 6

	
    public boolean esisteUtente(String codFis) throws SQLException, ClassNotFoundException {
    	Connection con = null;
    	ResultSet rs = null;
    	PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prenotalab","root", "");
			ps =  con.prepareStatement("Select * from Utente where codFis=?");
			ps.setString(1, codFis);
			rs =  ps.executeQuery();
			return rs.next();
			
		} 
		catch (SQLException e) {
			throw new SQLException("esisteUtente: " + e.getMessage());
		} 
		catch (ClassNotFoundException e) {
			System.out.println("esisteUtente " + e.getMessage());
    		throw new ClassCastException("esisteUtente: "+ e.getMessage());
    	}
		finally {
			closeConnection(con, rs, ps);
		}
	}
    
   
    public void insertUtente(Utente u) throws SQLException, ClassNotFoundException {
       	Connection con = null;
    	PreparedStatement ps = null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prenotalab","root","");
			ps=con.prepareStatement("Insert into utente(nome, cognome, codFis, password) values(?,?,?,?)");
			ps.setString(1,u.getNome());
			ps.setString(2, u.getCognome());
			ps.setString(3, u.getCodFis());
			ps.setString(4, u.getPassword());
			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("insert utente " + e.getMessage());
			throw new SQLException("Insert utente " + e.getMessage());
		}
    	catch (ClassNotFoundException e) {
			System.out.println("insert utente " + e.getMessage());
    		throw new ClassCastException("insertUtente: "+ e.getMessage());
    	}
    	finally {
			closeConnection(con, null, ps);
		}
    }

    //chiude la connessione col DB
    public void closeConnection(Connection con, ResultSet rs, PreparedStatement ps) throws SQLException{
        try{
        	
        	if(ps!= null) {
        		ps.close();
        	}
        	if(rs != null) {
        		rs.close();
        	}
        	if(con!= null) {
        		con.close();
        	}
        }catch(SQLException e){
        	System.out.println("close connection " + e.getMessage());
            throw new SQLException("Connessione fallita");
        }
    }
    
    
 
}