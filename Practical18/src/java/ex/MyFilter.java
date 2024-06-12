package ex;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/MyFilter")
public class MyFilter implements Filter {
 
  @Override
    public void init(FilterConfig fConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,FilterChain chain) 
        throws IOException, ServletException 
    { 
        PrintWriter out = resp.getWriter(); 
         String password = req.getParameter("password"); 
  
        if (password.equals("admin")) { 
             RequestDispatcher rd 
                = req.getRequestDispatcher("AdminServlet"); 
            rd.include(req, resp); 
            // Sending request to next 
            chain.doFilter(req, resp); 
        } 
  
        // Password incorrect 
        else { 
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ADMIN</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>username or password is wrong</h1>");
             out.println("<a href=\"index.html\">Login Again</a>");
            
            out.println("</body>");
            out.println("</html>"); 
            
        } 
   }
  
}
