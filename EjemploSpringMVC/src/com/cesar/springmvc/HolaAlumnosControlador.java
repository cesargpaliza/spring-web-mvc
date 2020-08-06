package com.cesar.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
}
