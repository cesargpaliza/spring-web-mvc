package com.cesar.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@RequestMapping("/addAlumno")
	public String getForm(Model model) {
		
		//Mando un alumno vacio a la vista
		Alumno alumno = new Alumno();		
		model.addAttribute("alumno", alumno);
		
		return "addAlumnoForm";
	}
	
	@RequestMapping("/processFormAlumno")
	public String procesarFormularioAlumno(@ModelAttribute("alumno") Alumno alumno) {
		
		
		return "confirmacionRegistroAlumno";
	}

}
