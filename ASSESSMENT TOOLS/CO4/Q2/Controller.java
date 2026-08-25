import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/controller")
public class Controller extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        Model model = new Model();

        String data = model.getData();

        request.setAttribute("data", data);

        RequestDispatcher rd = request.getRequestDispatcher("view.jsp");

        rd.forward(request, response);
    }
}
