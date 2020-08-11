package com.cesar.springmvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String procesarFormularioAlumno( @Valid @ModelAttribute("alumno") Alumno alumno, 
											BindingResult resultadoValidacion ) {	
		//System.out.println(resultadoValidacion.toString());
		if(resultadoValidacion.hasErrors()) {
			return "addAlumnoForm";
		}else {
			return "confirmacionRegistroAlumno";
		}
	}

}
