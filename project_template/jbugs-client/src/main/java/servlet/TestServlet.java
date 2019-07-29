package servlet;

import ro.msg.edu.jbugs.dto.UserDTO;
import ro.msg.edu.jbugs.user.userManager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Document me.
 *
 * @author msg systems AG; User Name.
 * @since 19.1.2
 */
@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
    private String message;
    UserDTO userDTO;

    @EJB
    private userManager userManage;

    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World";
        userDTO = new UserDTO();

        userDTO.setCounter(1);
        userDTO.setEmail("email");
        userDTO.setFirstName("Klaus");
        userDTO.setLastName("Siegel");
        userDTO.setMobileNumber("1234356789");
        userDTO.setPassword("pwd");
        userDTO.setStatus("status");
        userDTO.setUserName("esername");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");

        out.print(userDTO.toString());
        userManage.insertUser(userDTO);
    }

    public void destroy() {
        // do nothing.
    }

}
