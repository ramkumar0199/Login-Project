package Data;
import java.io.IOException;
import java.io.PrintWriter;
 import javax.servlet.*;
import javax.servlet.http.*;

public class Success extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
      resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2>successful</h2>");
    }
    
    
}