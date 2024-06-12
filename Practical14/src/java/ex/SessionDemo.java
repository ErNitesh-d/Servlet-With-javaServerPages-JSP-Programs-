package ex;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("TrackUser is called");

        HttpSession session = req.getSession();
        Integer accessCount = (Integer) session.getAttribute("accesscount");
        if (accessCount == null) {
            accessCount = 0;
        }
        String sessionUrl = (String) session.getAttribute("url");
        if (sessionUrl == null) {
            sessionUrl = "";
        }
        out.println("<br> Access pages: " + sessionUrl);
        out.println("<br> User has requested: " + accessCount);
    }
}
