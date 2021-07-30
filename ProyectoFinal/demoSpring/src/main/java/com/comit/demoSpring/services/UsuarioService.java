package com.comit.demoSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.demoSpring.modelo.Usuario;
import com.comit.demoSpring.repositorios.UsuarioRepository;
import java.util.List;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}


	public Usuario guardar(Usuario usuario) {
		
		usuario= usuarioRepository.save(usuario);
		return usuario;
		
	}	
//	public Usuario obtenerPorNombre(String string) {
//	
////		return usuarioRepository.findByNombre(string);		
//	}


	public List<Usuario> getUsuario() {
		
		return usuarioRepository.findAll();
	}




}
