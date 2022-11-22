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
	}
}