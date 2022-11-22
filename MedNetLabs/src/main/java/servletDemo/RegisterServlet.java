package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con = (Connection) config.getServletContext().getAttribute("jdbccon");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html;charset=ISO-8859-1");
		String uid = req.getParameter("uid");
		String pwd = req.getParameter("pwd");
		String fname = req.getParameter("fname");
		String mname = req.getParameter("mname");
		String lname = req.getParameter("lname");
		String gender = req.getParameter("gender");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String query = "insert into employees values(0,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, uid);
			pstmt.setString(2, pwd);
			pstmt.setString(3, fname);
			pstmt.setString(4, mname);
			pstmt.setString(5, lname);
			pstmt.setString(6, gender);
			pstmt.setString(7, dob);
			pstmt.setString(8, address);
			pstmt.setString(9, city);
			pstmt.setString(10, state);
			pstmt.execute();
			out.println("<h2>Record inserted successfully..</h2>");
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			out.println("<h2>Registration failed..!!</h2>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
