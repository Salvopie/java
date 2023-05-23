import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String codFis= request.getParameter("codFis");
		String password = request.getParameter("password");
		
		//INTERROGAZIONE AL DB
		
		/*HttpSession session = request.getSession();
		session.setAttribute("codFis",codFis);
		session.setAttribute("nome","pippo");
		session.setAttribute("cognome","pluto");
		*/
		
		
		Cookie c = new Cookie("codFis", codFis);
		Cookie cname = new Cookie("nome","pippo");
		Cookie ccognome = new Cookie("conome","pluto");
		response.addCookie(ccognome);
		response.addCookie(cname);
		response.addCookie(c);
		
		RequestDispatcher rs = request.getRequestDispatcher("/homePage.jsp");
		rs.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
