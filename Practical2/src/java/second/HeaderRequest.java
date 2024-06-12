package second;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@WebServlet(name = "HeaderRequest", urlPatterns = {"/HeaderRequest"})
public class HeaderRequest extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
  
    }
   @Override
   
        protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><head><body bgcolor=skyblue>");
        pw.println("HTTP headers sent by your client:</br>");
        pw.println("<table border=1 align=left><tr><th>Header Name</th><th>Header value</th></tr>");

        Enumeration enum1 = req.getHeaderNames();
        while (enum1.hasMoreElements()) {
            String headerName = (String) enum1.nextElement();
            pw.println("<tr><td>" + headerName + "</td>");
            pw.println("<td>" + req.getHeader(headerName) + "</td></tr>");
        }
        pw.println("</table></body></html>");
    }
        
 

}
