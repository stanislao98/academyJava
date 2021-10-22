package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String DEFAULT_USER = "Stani";
  
    public HelloServlet() {
        super();
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet "  + " has started");	
	}

	
	public void destroy() {
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//l'oggetto  response mi consente di scrivere nel body e nell'header
		//response.getWriter().println("<h2>Hello World!</h2>");
		// localhost:8080/PrimaServlet?user=PIPPO
	String user = request.getParameter("user");
		if(user==null)
			user = DEFAULT_USER;
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		// stiamo scrivendo nel body
		PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println(" <head>");
        writer.println(" <title>Hello User Application</title>");
        writer.println(" </head>");
        writer.println(" <body>");
        writer.println(" Hello, " + user + "!<br/><br/>");
        writer.println(" <form action=\"greeting\" method=\"POST\">");
        writer.println(" Enter your name:<br/>");
        writer.println(" <input type=\"text\" name=\"user\"/><br/>");
        writer.println(" <input type=\"submit\" value=\"Submit\"/>");
        writer.println(" </form>");
        writer.println(" </body>");
        writer.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
