// AS92_urlwriting.java
package ex;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UrlWriting_2")
public class UrlWriting_2 extends HttpServlet {
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
            out.println("<body style='background-color: #DAF7A6 ;'>");
        out.print("<h3></b>WELCOME TO MAIN PAGE  : " +  request.getParameter("txtuser")+"<h3></b>");
        out.println("<a href=index.html>back</a>");
    }
}
