package com.cesar.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HolaAlumnosControlador {
	
	//Método proporciona formulario, se puede definir o no un parametro url
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {	
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
	
	@RequestMapping("/procesarFormularioConModelo")
	//	public String otroProcesoFormulario(HttpServletRequest req, Model modelo) {
	//		String nombre = req.getParameter("nombre");

	//Se sustituyer la clase HttpServlet por la anntation RequestParam
	public String otroProcesoFormulario(@RequestParam("nombre") String nombre, Model modelo) {
		//agregar informacion al modelo		
		modelo.addAttribute("nombreMayusculas", nombre.toUpperCase());
		
		return "HolaAlumnosSpring";
	}
	
}
