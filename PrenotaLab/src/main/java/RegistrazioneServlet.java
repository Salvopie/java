import java.io.IOException;

import Oggetti.Utente;
import businessLogic.GestioneUtente;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class RegistrazioneServlet
 */
@WebServlet("/RegistrazioneServlet")
public class RegistrazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 

    /**
     * Default constructor. 
     */
    public RegistrazioneServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String codFis= request.getParameter("codFis");
		String password = request.getParameter("password");
		
		Utente u = new Utente(nome, cognome, codFis, password);
		GestioneUtente gu = new GestioneUtente();
		
		try {
			boolean registrazione = gu.addUtente(u);
			if(registrazione) {
				response.setHeader("registrazione", "registrazione avvenuta con successo");
				RequestDispatcher ris = request.getRequestDispatcher("/login.jsp");
				ris.forward(request,response);
			}	
			else {
				response.setHeader("registrazione", "utente già registrato");
				RequestDispatcher ris = request.getRequestDispatcher("/registrazione.jsp");
				ris.forward(request,response);
			}
		} catch(Exception e) {
			response.setHeader("registrazione", "Registrazione fallita");
			RequestDispatcher ris = request.getRequestDispatcher("/registrazione.jsp");
			ris.forward(request,response);
		}
		} 
		

		
		// TODO Auto-generated method stub

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
