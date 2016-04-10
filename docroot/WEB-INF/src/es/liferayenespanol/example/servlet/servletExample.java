package es.liferayenespanol.example.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletExample extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public servletExample() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/plain");
		response.getOutputStream().print("Llamada a doGet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain");
		response.getOutputStream().print("Llamada a doPost");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain");
		response.getOutputStream().print("Llamada a doDelete");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain");
		response.getOutputStream().print("Llamada a doPut");
	}

}
