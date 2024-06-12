package ex;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
    response.setContentType("text/html");
    try (PrintWriter out = response.getWriter()) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ADMIN</title>");
        out.println("</head>");
        out.println("<body style='background-color: #808080;'>");
        out.println("<h1>WELCOME ADMIN </h1>");
        out.println("<h4>YOU ARE SUCCESS FULLY LOGED IN USING CHAIN FILTER</h4>");
        out.println("</body>");
        out.println("</html>");
    }
}

    
}
