package tracker;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/RegisterServlet")
public class RegsiterServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        @SuppressWarnings("unused")
		String username = request.getParameter("username");

        HttpSession session = request.getSession();
        session.setAttribute("username", firstName); 

        response.sendRedirect("dashboard.html");
    }
}
