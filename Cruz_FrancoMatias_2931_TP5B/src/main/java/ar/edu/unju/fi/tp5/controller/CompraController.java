package ar.edu.unju.fi.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp5.model.Compra;
import ar.edu.unju.fi.tp5.service.ICompraService;
import ar.edu.unju.fi.tp5.service.IProductoService;




@Controller
public class CompraController {

	@Autowired
	private Compra compra;
	
	@Autowired
	private IProductoService productoService;
	
	
	@Autowired
	
	private ICompraService compraService;
	
	
	@GetMapping("/compra/nuevo")
	public String getCompraPage(Model model) {
		model.addAttribute("compra",compra);
		model.addAttribute("productos", productoService.getAllProductos());
		return "compra";
	}
	
	@PostMapping("/compra/guardar")
	   public ModelAndView getGuardarCompraPage(@ModelAttribute("compra")Compra compra) {
		    ModelAndView modelView = new ModelAndView("lista-compra");
		 //   Producto producto = productoService.getProductoporCodigo(compra.getProducto().getCodigo());
		  //  compra.setProducto(producto);
		    compraService.guardarCompra(compra);
		    modelView.addObject("compras",compraService.getAllCompras());
		    
	         return modelView;
	
	}
	
	
	
	
	
}
