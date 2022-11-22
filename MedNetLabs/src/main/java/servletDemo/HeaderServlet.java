package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import entities.Employee;

@WebServlet("/header")
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html;charset=ISO-8859-1");
		HttpSession session = req.getSession();
		Employee emp = (Employee) session.getAttribute("UserInfo");
		String fname = emp.getFname();
		String lname = emp.getLname();
		String msg = "Welcome "+fname+" "+lname+",";
		out.println("<h1>"+msg+"</h1>");
	}
}