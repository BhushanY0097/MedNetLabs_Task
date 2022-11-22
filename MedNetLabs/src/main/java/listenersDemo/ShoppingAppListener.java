package listenersDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ShoppingAppListener implements ServletContextListener {
	
	Connection con;
    public void contextInitialized(ServletContextEvent sce)  { 
    	String driver = sce.getServletContext().getInitParameter("MySqlDriverClass");
        String jdbcurl = sce.getServletContext().getInitParameter("DriverURL");
        try {
       	 Class.forName(driver);
            con = DriverManager.getConnection(jdbcurl,"root","Myroot123");
            sce.getServletContext().setAttribute("jdbccon", con);
    		 System.out.println("Database Connection Set in Context Parameter");
        } catch(Exception exp) {
       	 exp.printStackTrace();
        }
    }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
        try {
    		con.close();
    	} catch (Exception exp) {
    		exp.printStackTrace();
    	}
    }
}
