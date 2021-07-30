 package com.comit.demoSpring.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.comit.demoSpring.modelo.Persona;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Usuario extends Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
//	@Column (name = "Nombre de Usuario", length = 50)
//	private String Usuario;
//	
//	private String contraseña;
//	
//	
//	
//	public Usuario() {
//		
//		
//	}
//
//
//
//	public String getUsuario() {
//		return Usuario;
//	}
//
//
//
//	public void setUsuario(String usuario) {
//		Usuario = usuario;
//	}
//
//
//
//	public String getContraseña() {
//		return contraseña;
//	}
//
//
//
//	public void setContraseña(String contraseña) {
//		this.contraseña = contraseña;
//	}
}
