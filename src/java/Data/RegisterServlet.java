package Data;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
       PrintWriter out= resp.getWriter();
       out.println("<h2>welcome to register servlet</h2>");
       String name = req.getParameter("user_name");
       String password = req.getParameter("user_password");
       String email = req.getParameter("user_email");
       String gender = req.getParameter("user_gender");
       
       out.println("<h2>Name :"+name+"</h2>");
       out.println("<h2>Password :"+password+"</h2>");
       out.println("<h2>Email:"+email+"</h2>");
       out.println("<h2>gender:"+gender+"</h2>");
       
     //  RequestDispatcher rd=req.getRequestDispatcher("index.html");
     //  rd.include(req, resp);
       
       RequestDispatcher rd=req.getRequestDispatcher("Success");
       rd.forward(req, resp);
 
    }
    
    
    
}
