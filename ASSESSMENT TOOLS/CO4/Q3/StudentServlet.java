import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String course = request.getParameter("course");

        request.setAttribute("name", name);
        request.setAttribute("course", course);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");

        rd.forward(request, response);
    }
}
