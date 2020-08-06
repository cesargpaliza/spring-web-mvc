package com.cesar.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	//Especificar cual es la vista que debe retornar un archivo JSP
	@RequestMapping 
	public String mostrarPagina() {
		return "paginaEjemplo";
	}

}
