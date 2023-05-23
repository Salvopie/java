package businessLogic;

import java.sql.SQLException;

import Oggetti.Utente;

public class GestioneUtente {
	
	public boolean addUtente(Utente u) throws Exception {
		DBConnect db = new DBConnect();
		boolean esisteUtente;
		try {
			esisteUtente = db.esisteUtente(u.getCodFis());
			if(!esisteUtente) {
				db.insertUtente(u);
				return true;
			}
			return false;
		} catch (ClassNotFoundException | SQLException e) {
			throw new Exception("addUtente: " + e.getMessage());
		}
			
	}

}
