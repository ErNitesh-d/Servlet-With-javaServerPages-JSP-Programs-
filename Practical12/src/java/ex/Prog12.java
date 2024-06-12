package ex;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Prog12")
public class Prog12 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        float p = Float.parseFloat(request.getParameter("p"));
        float r = Float.parseFloat(request.getParameter("r"));
        float n = Float.parseFloat(request.getParameter("n"));
        float i = (p * r * n) / 100;
         out.println("<head><style>body{ background: lightgreen;}</style></head>");
        out.println("<center><br><h1>Simple Interest Calculation</h1></center>");
        out.println("<center><br><h2>Principal Amount: " + p + "</h2></center>");
        out.println("<center><br><h2>Rate of Interest: " + r + "</h2></center>");
        out.println("<center><br><h2>Time Period: " + n + "</h2></center>");
        out.println("<center><br><h2>Simple Interest: " + i + "</h2></center>");
         request.getRequestDispatcher("/footer.jsp").include(request, response);
    }
}
