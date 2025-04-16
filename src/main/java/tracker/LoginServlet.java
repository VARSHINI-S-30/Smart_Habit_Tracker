package tracker;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

      
        if ("sri".equals(username) && "varsh".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("registration.html");
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h3 style='color:red; text-align:center;'>Invalid login</h3>");
            response.getWriter().println("<a href='login.html' style='text-align:center;'>Try Again</a>");
        }
    }
}
