import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            HttpSession session = req.getSession();
            String name = req.getParameter("username");
            String pwd = req.getParameter("password");
            if (name != null && pwd != null) {
                session.setAttribute("key_name", name);
                session.setAttribute("key_pwd", pwd);
                resp.sendRedirect(req.getContextPath() + "/main.jsp");
            }


        }

}
