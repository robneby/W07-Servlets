/** @author Rob Nebeker 
 W07 Servlets
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rnebeker
 */
@WebServlet(name = "Servlet", urlPatterns={"/Servlet"})
public class Servlet extends HttpServlet {

    /** this is the main method that uses the two parameters and displays them. */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head></head><body>");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        out.println("<h1>Super Secret Login Information</h1>");
        out.println("<p>Login: " + login + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("This resource is not available directly.");
    }

}