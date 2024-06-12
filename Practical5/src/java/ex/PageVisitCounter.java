package ex;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;
@WebServlet("/PageVisitCounter")
public class PageVisitCounter extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
       
    PrintWriter out = res.getWriter();
    Cookie[] myCookie = req.getCookies();
    
    boolean found = false;
    int v=0; if(myCookie != null)
        {
       for(int i=0; i<myCookie.length;i++){
            if (myCookie[i].getName().equals("pageCount")) 
            {
            
                v = Integer.parseInt(myCookie[i].getValue());
                v++;
                Cookie c1 = new Cookie("pageCount",String.valueOf(v));
                res.addCookie(c1);
                 out.println("Visit No :"+v);
                 found = true;
                 break;
            }
        }
    }
    if(found==false)
     {
       Cookie c1 = new Cookie("pageCount",String.valueOf(v)); res.addCookie(c1);
            out.println("<h1> Welcome to www.Er/NiteshDagiya.com site</h1><br><br><br>You have done first visit..!");
     }
    }
}