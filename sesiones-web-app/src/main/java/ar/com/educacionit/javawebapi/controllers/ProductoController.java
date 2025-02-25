package ar.com.educacionit.javawebapi.controllers;

import java.io.IOException;

import ar.com.educacionit.repository.dto.ProductoDTO;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.ProductoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 1 Convierto en webserlet

@WebServlet("/api/producto")
public class ProductoController extends HttpServlet {
		
	@Override
	protected void doGet(HttpServletRequest req, //vienen todos los parametros desde el front
						 HttpServletResponse resp
	) throws ServletException, IOException {
		// Busca un producto en la DB por su id
        //capturo el parametro desde el req
		String id = req.getParameter("id");
		Long idL = Long.parseLong(id);
		// ahora instancio el servicio
		
		ProductoService service = new ProductoServiceImpl();
		ProductoDTO productoDTO = service.getById(idL);
		// obtengo el producto usando el service
		// propio de los Servlets para escrtibir en el response
		// resp.getWriter().print(productoDTO.toString());
		req.getSession().setAttribute("PRODUCTO", productoDTO);
		getServletContext().getRequestDispatcher("/datos.jsp").forward(req, resp);
	}


}
