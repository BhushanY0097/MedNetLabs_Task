package servletDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import entities.Employee;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con = (Connection) config.getServletContext().getAttribute("jdbccon");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher reqDis = null;
		String uid = req.getParameter("uid");
		String pwd = req.getParameter("pwd");
		boolean flag = false;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
			while (rs.next()) {
				if (uid.equals(rs.getString(2)) && pwd.equals(rs.getString(3))) {
					Employee emp = new Employee(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
							rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
					HttpSession session = req.getSession();
					session.setAttribute("UserInfo", emp);
					flag = true;
					break;
				}
			}
			if (flag) {
				Cookie[] allCookie = req.getCookies();
				if (allCookie != null) {
					for (Cookie c : allCookie) {
						if (c.getName().equals("loginerr")) {
							c.setMaxAge(0);
							res.addCookie(c);
						}
					}
				}
				reqDis = req.getRequestDispatcher("/success?uid=" + uid + "");
				reqDis.forward(req, res);
			} else {
				// reqDis = req.getRequestDispatcher("/error");
				// reqDis = req.getRequestDispatcher("/Login.jsp");
				// reqDis.forward(req, res);
				Cookie cookie = new Cookie("loginerr", "Incorrect_Login_Credentials");
				res.addCookie(cookie);
				res.sendRedirect("/MedNetLabs/Login.jsp");
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}