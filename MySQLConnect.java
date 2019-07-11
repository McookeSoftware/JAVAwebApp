import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
 
/**
 * Servlet implementation class MySQLConnect
 */
 
public class MySQLConnect extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 //serialVersionUID is used during deserialization 
    //to verify that the sender and receiver of a serialized object
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    //The java class extends the HttpServlet,  
    //a HTTP servlet is designed for managing HTTP server requests and provides a response.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");// what the user is requried to enter
        String pass = request.getParameter("pass");
        try {
            Class.forName("com.mysql.jdbc.Driver");////JDBC Driver enables java application to interact with the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mattslogin", "matt", "M@tty121");
            //Connection to the database
            PreparedStatement pst = conn.prepareStatement("Select user,pass from account where user=? and pass=?");
            pst.setString(1, user); // what the user is requried to enter
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                out.println("Correct login credentials");
                  response.sendRedirect("index.xhtml");//response to the homepage if information inputted was correct.
            } 
            else {
                out.println("Incorrect login credentials");
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}