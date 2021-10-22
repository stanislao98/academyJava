package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//loadOnStartup: Il metodo init viene eseguita quando avviene la prima request
// se loadOnStartup = 1, la servlet viene inizializzata all'avvio dell'applicazione

import model.Automobile;
import service.AutomobileService;

@WebServlet(
		name="AutomobileServlet",
		urlPatterns = { "/" },
		loadOnStartup = 1
)

//il service si occuperà per la gestione delle automobili
public class AutomobileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AutomobileService service = new AutomobileService();
	
    public AutomobileServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//localhost:8080/PrimaServlet?action=list, view, create, update, delete
		String action = request.getParameter("action");
		if(action == null) 
			action = "list";
		
		switch(action) {
		case "view":
			viewAutomobile(request,response);
			break;
		case "create": 
			showAutomobileCreateForm(request,response);
			break;
		case "update":
			showAutomobileUpdateForm(request, response);
			break;

		case "delete":
			deleteAutomobile(request, response);
			break;
		default:
			listAutomobili(request,response);
			break;
		}
		
		
	}

	
	private void listAutomobili(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Con il forward la request e la response vengono passati ad un altro modulo dell'app
		// passa anche la response
		List<Automobile> automobili = service.getAllAutomobili();
		
		//passiamo alla jsp le automobili con una coppia chiave valore
		request.setAttribute("automobili", automobili);
		
		

		request.getRequestDispatcher("/automobile/listAutomobili.jsp")
									.forward(request, response);
		
		
		
	}

	private void deleteAutomobile(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void showAutomobileUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int auto_id = Integer.parseInt(request.getParameter("ticketId"));
		Automobile auto = service.getAuto(auto_id);
		request.setAttribute("auto", auto);
		request.getRequestDispatcher("/automobile/automobileForm.jsp").
							forward(request, response);
		
	}

	private void showAutomobileCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/automobile/automobileForm.jsp")
		.forward(request, response);
		
	}

	private void viewAutomobile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int auto_id = Integer.parseInt(request.getParameter("ticketId"));
		Automobile auto = service.getAuto(auto_id);
		request.setAttribute("auto", auto);
		request.getRequestDispatcher("/automobile/viewAutomobile.jsp").
							forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action == null) 
			action = "list";
		
		switch(action) {

		case "create": 
			createAutomobile(request, response);
			break;

		case "update":
			updateAutomobile(request, response);
			break;

		default:
			listAutomobili(request,response);
			break;
		}
	}

	private void updateAutomobile(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		Automobile auto = new Automobile();
		auto.setId(Integer.parseInt(request.getParameter("ticketId")));
		auto.setTarga(request.getParameter("targa"));
		auto.setModello(request.getParameter("marca"));
		auto.setMarca(request.getParameter("modello"));
		int el = (request.getParameter("elettrica").equals("SI") ? 1 : 0);
		auto.setElettrica(el);
		String kw = request.getParameter("kw");
		auto.setKw(Integer.parseInt(kw));
		service.updateAutomobile(auto);
		response.sendRedirect(request.getContextPath());
	
	}

	private void createAutomobile(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Automobile auto = new Automobile();
		auto.setTarga(request.getParameter("targa"));
		auto.setModello(request.getParameter("marca"));
		auto.setMarca(request.getParameter("modello"));
		int el = (request.getParameter("elettrica").equals("SI") ? 1 : 0);
		auto.setElettrica(el);
		String kw = request.getParameter("kw");
		auto.setKw(Integer.parseInt(kw));
		service.saveAutomobile(auto);
		response.sendRedirect(request.getContextPath());


	}

}
