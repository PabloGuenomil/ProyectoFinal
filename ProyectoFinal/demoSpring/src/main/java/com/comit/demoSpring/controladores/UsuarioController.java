package com.comit.demoSpring.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comit.demoSpring.modelo.Usuario;
import com.comit.demoSpring.repositorios.UsuarioRepository;
import com.comit.demoSpring.services.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private  UsuarioRepository usuarioRepository;
	
	@GetMapping
	public String listarUsuarios(Model model) {
		model.addAttribute("usuarios", usuarioRepository.findAll() );
		return "listaUsuraios";
	}
	
	
	
	@GetMapping("/nuevo")
	public String nuevoUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "nuevoUsuario";
	}
	
	@GetMapping("/{id}")
	public String editarUsuario(@PathVariable(name = "id", required = true)long id, Model model) {
		
		Optional<Usuario> usuarioOP = usuarioRepository.findById(id);
		if (!usuarioOP.isPresent()) {
			return "redirect:/error";
		}
		model.addAttribute("usuario", usuarioOP.get());
		return "nuevoUsuario";
	}
	
	@PostMapping("/crear")
	public String crearUsuario(@ModelAtributte(name = "usuario") Usuario usuario) {
		usuario = usuarioRepository.save(usuario);
		return "redirect:/usuarios";
	}

}
