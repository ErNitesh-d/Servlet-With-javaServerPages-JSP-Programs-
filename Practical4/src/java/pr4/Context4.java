package pr4;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Context4")
public class Context4 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) 
                 throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<table border='1' align='center'>");
        out.println("<tr>");
        out.println("<th> Server Pport : </th><td>"+request.getServerPort()+",</td></tr>");
        out.println("<tr><th> Server Name : </th><td>"+request.getServerName()+"</td></tr>");
        out.println("<tr><th>Protocol : </th><td>"+request.getProtocol()+"</td></tr>");
        out.println("<tr><th>  Charater-Encoding :</th><td> "+request.getCharacterEncoding() + "</td></tr>");
        out.println("<tr><th> Content Type : </th><td>" + request.getContentType() + "</td></tr>");
        out.println("<tr><th> Content Length : </th><td>" + request.getContentLength() + "</td></tr>");
        out.println("<tr><th> Remote Address : </th><td>" + request.getRemoteAddr() + "</td></tr>");
        out.println("<tr><th> Remote Host : </th><td>" + request.getRemoteHost() + "</td>");
        out.println("</tr>");
        out.println("</table>");

        
    }
}
