package br.com.arthur.locadora;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class PvServlet
 */
@WebServlet(urlPatterns = {"/PvServlet", "/cadastro", "/listagem", "/incluir", "/voltar", "/limpar"})
public class PvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Carro> listaCarros = new ArrayList<>();
	static int idContador = 0;
	Carro veiculo = new Carro();
	
    public PvServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/cadastro")) {
			RequestDispatcher rd = request.getRequestDispatcher("cadastro.jsp");
			rd.forward(request, response);
			
		} else if (action.equals("/listagem")) {
			listagem(request, response);
			
		} else if (action.equals("/incluir")) {
			novoVeiculo(request, response);
			
		} else if (action.equals("/voltar")){
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			
		} else if (action.equals("/limpar")) {
			limpar(request, response);
			
		} else {
			response.sendRedirect("index.html");
		}
		
	}
	
	protected void listagem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Criando um objeto que ira receber os dados
		ArrayList<Carro> lista = listaCarros;
		
		// Encaminhar a lista ao documento listagem.jsp
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listagem.jsp");
		rd.forward(request, response);
		
		// Teste de recebimento da lista
		/**for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getId());
			System.out.println(lista.get(i).getNome());
			System.out.println(lista.get(i).getMarca());
		}**/
		
	}
	
	protected void novoVeiculo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Setar as variáveis do Veiculo pelo construtor
		listaCarros.add(idContador, new Carro(idContador, request.getParameter("nome"), request.getParameter("marca")));
		
		// Redirecionar para o documento listagem.jsp
		response.sendRedirect("listagem");
		
		if (idContador >= 0) {
			idContador++;
		}
		
		// Teste de recebimento dos dados do formulário
		/**System.out.println(listaCarros.get(0).getId());
		System.out.println(listaCarros.get(0).getNome());
		System.out.println(listaCarros.get(0).getMarca());**/
		
	}
	
	protected void limpar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		listaCarros.clear();
		idContador = 0;
		
		RequestDispatcher rd = request.getRequestDispatcher("listagem.jsp");
		rd.forward(request, response);
		
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
