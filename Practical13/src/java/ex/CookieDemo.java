package ex;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;

@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Date currentDate = new Date();
        String currentDateStr = String.valueOf(currentDate.getTime());
        Cookie myCookie = new Cookie("nitesh", currentDateStr);
        myCookie.setMaxAge(60 * 60 * 24 * 365); // One year expiration
        res.addCookie(myCookie);
        
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("nitesh")) {
                    long lastVisitTime = Long.parseLong(cookie.getValue());
                    long currentTime = currentDate.getTime();
                    long elapsedTime = currentTime - lastVisitTime;
                    out.println("<html> <body> <h2> ");
                    out.println("You visited last date " + new Date(lastVisitTime) + "<br>");
                    out.println("Current Date is " + currentDate + "<br>");
                    out.println("You have visited since " + (elapsedTime / 1000) + " Seconds<br>");
                    break; // Once found, no need to continue looping
                }
            }
               out.println("</h2></body></html> ");
            
               out.println("<style> body { background:#38b3e3; }</style>");   
        }
    }
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        doPost(req, res);
    }
}
