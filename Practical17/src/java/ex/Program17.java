package ex;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Program17")
public class Program17 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id;
        id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        int jwt = Integer.parseInt(request.getParameter("jwt"));
        int mad = Integer.parseInt(request.getParameter("mad"));
        int python = Integer.parseInt(request.getParameter("python"));
        int ds = Integer.parseInt(request.getParameter("ds"));
        int total = jwt + mad + python + ds;
        double per = total / 4.0;
        PrintWriter pw = response.getWriter();
        pw.println("<body style='background-color: #48C9B0;'>");
        pw.println("<h1 align=left>Student Information</h1>");
        pw.println("<table border=1 align=left style='float:left;'>");
        pw.println("<tr><th>Id</th><th>Name</th><th>Address</th></tr>");
        pw.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + address + "</td></tr>");
        pw.println("</table>");

        pw.println("<br><br><h1>Student Result Information</h1>");
        pw.println("<table border=1 align=left style='float:left;'>");
        pw.println("<tr><th>Id</th><th>Name</th><th>JWT</th><th>MAD</th><th>PYTHON</th><th>DS</th><th>Total</th><th>Percentage</th></tr>");
        pw.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + jwt + "</td><td>" + mad + "</td><td>" + python
                + "</td><td>" + ds + "</td><td>" + total + "</td><td>" + per + "</td></tr>");
        pw.println("</table>");


    }
}
