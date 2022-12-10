package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher reqDis = null;
	Connection con;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqDis = request.getRequestDispatcher("/header");
		reqDis.include(request, response);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=ISO-8859-1");
		String uid = request.getParameter("uid");
		//out.println("<h2>login is successful</h2>");
		try {
			List<Employee> emps = new ArrayList<Employee>();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
			while (rs.next()) {
				if (!uid.equals(rs.getString(2))) {
					Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
							rs.getString(10), rs.getString(11));
					emps.add(emp);
				}
			}
			out.println("<br><br><h2>List of registered Users: </h2>");
			for (Employee employee : emps) {
				out.println("<h3>" + employee.getFname() + " " + employee.getLname() + "</h3>");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
