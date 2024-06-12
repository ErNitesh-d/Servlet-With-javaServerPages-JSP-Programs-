package pr3;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Requestparameter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        
        pw.println("<html><head><body bgcolor=cyan>");
        pw.println("<h3>Reading three request parameters</h3><br>");
        pw.println("Name::" + req.getParameter("nm") + "<br>");
        pw.println("Subject 1::" + req.getParameter("sub1") + "<br>");
        pw.println("Subject 2::" + req.getParameter("sub2") + "<br>");
        pw.println("</body></html>");
        
    }

}
