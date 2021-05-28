package ar.edu.unju.fi.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp5.model.Producto;
import ar.edu.unju.fi.tp5.service.IProductoService;





@Controller
public class ProductoController {
	
	@Autowired
	 IProductoService productoService;
	
	@GetMapping("/producto")
	
	public String getProductoFormPage(Model model){
	
	model.addAttribute("producto", productoService.getProducto());
     return "nuevo";
	}
	@PostMapping("/producto/guardar")
	public String getProductoResultPage(@ModelAttribute("producto") Producto unEmpleado) {
		
		productoService.addProducto(unEmpleado);
		return "resultado";
	}
	@GetMapping("/producto/ultimo")
    public ModelAndView getUltimoProductoPage(){
		ModelAndView modelView  = new ModelAndView("ultimoproducto");
		modelView.addObject("produ", productoService.getUltimoProducto());
		 return modelView;
		}
}