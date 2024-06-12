// AS9_urlwriting.java
package practical;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UrlWriting")
public class UrlWriting extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ADMIN</title>");
            out.println("</head>");
            out.println("<body style='background-color: #8DC3E7 ;'>");
        String user = request.getParameter("txtuser");
        out.print("<b><h3>WELCOME USER : " + user+"<h3></b>");
        String newurl = "UrlWriting_2?txtuser=" + user;
        out.print("<br><b><a href=" + newurl + ">CLICK HERE </a></b>");
    }
}
