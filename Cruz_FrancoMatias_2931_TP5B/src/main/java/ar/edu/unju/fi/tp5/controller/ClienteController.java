package ar.edu.unju.fi.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp5.model.Cliente;
import ar.edu.unju.fi.tp5.service.IClienteService;





@Controller
public class ClienteController {
	 
	@Autowired 
    private Cliente cliente;
   
   @Autowired 
   @Qualifier("clienteUtilService")
   private IClienteService clienteService;
   
   
   @GetMapping("/index")
	public String getTestCirculo() {
		return "index";
	}
   
   
   
   
   
   
   @GetMapping("/cliente/nuevo")
	public String getNuevoClientePage(Model model) {
		model.addAttribute("cliente",cliente);
		return "nuevocliente";
		}
  
  
	 @PostMapping("/cliente/guardar")
	public ModelAndView guardarCliente(@ModelAttribute("cliente")Cliente cliente) {
		 ModelAndView modelView = new ModelAndView("clientes");
		 clienteService.guardarAlumno(cliente);
		modelView.addObject("clientes",clienteService.obtenerClientes());
		return modelView;
	}
	
 @GetMapping("/cliente/listado")
 public ModelAndView getClientesPage() {
	  ModelAndView modelView = new ModelAndView("clientes");
	  if(clienteService.obtenerClientes() == null) {
		  clienteService.generarTablaClientes();
	  }
	modelView.addObject("clientes",clienteService.obtenerClientes());
	return modelView;
 }







}