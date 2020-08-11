package com.cesar.springmvc;

import javax.validation.constraints.*;

public class Alumno {
	
	@NotNull
	@Size(min=4, message="El campo nombre es requerido")
	private String nombre;
	@NotNull
	@Size(min=4, message="El campo apellido es requerido")
	private String apellido;	
	private String optativa;
	private String provincia;
	
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getOptativa() {
		return optativa;
	}
	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
}
