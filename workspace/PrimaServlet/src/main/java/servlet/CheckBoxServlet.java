package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(
//		name="CheckBoxServlet",
//		urlPatterns = {"/"}
//)
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CheckBoxServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
          response.setCharacterEncoding("UTF-8");
         
          PrintWriter writer = response.getWriter();
         
          writer.println("<!DOCTYPE html>");
          writer.println("<html>");
          writer.println(" <head>");
          writer.println(" <title>Hello User Application</title>");
          writer.println(" </head>");
          writer.println(" <body>");
          writer.println(" <form action=\"checkboxes\" method=\"POST\">");
          writer.println("Select the fruits you like to eat:<br/>");
          writer.println("<input type=\"checkbox\" name=\"fruit\" value=\"Banana\"/>");
          writer.println(" Banana<br/>");
          writer.println("<input type=\"checkbox\" name=\"fruit\" value=\"Apple\"/>");
          writer.println(" Apple<br/>");
          writer.println("<input type=\"checkbox\" name=\"fruit\" value=\"Orange\"/>");
          writer.println(" Orange<br/>");
          writer.println("<input type=\"checkbox\" name=\"fruit\" value=\"Guava\"/>");
          writer.println(" Guava<br/>");
          writer.println("<input type=\"checkbox\" name=\"fruit\" value=\"Kiwi\"/>");
          writer.println(" Kiwi<br/>");
          writer.println("<input type=\"submit\" value=\"Submit\"/>");
          writer.println(" </form>");
          writer.println(" </body>");
          writer.println("</html>");
	}


	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          String[] fruits = request.getParameterValues("fruit");
         
          response.setContentType("text/html");
          response.setCharacterEncoding("UTF-8");
         
          PrintWriter writer = response.getWriter();
         
          writer.append("<!DOCTYPE html>\r\n")
          .append("<html>\r\n")
          .append(" <head>\r\n")
          .append(" <title>Hello User Application</title>\r\n")
          .append(" </head>\r\n")
          .append(" <body>\r\n")
          .append(" <h2>Your Selections</h2>\r\n");
         
          if(fruits == null)
                  writer.append(" You did not select any fruits.\r\n");
          else {
                  writer.append(" <ul>\r\n");
                 
                  for(String fruit : fruits) {
                          writer.append(" <li>")
                          .append(fruit)
                          .append("</li>\r\n");
                  }
                  writer.append(" </ul>\r\n");
          }
          writer.append(" </body>\r\n")
                  .append("</html>\r\n");
  }

}
