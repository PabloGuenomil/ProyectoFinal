package com.comit.demoSpring.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comit.demoSpring.modelo.Usuario;
import com.comit.demoSpring.services.UsuarioService;


//Controlador para ver el Index
@Controller
@RequestMapping("/")
public class MainController {

		public UsuarioService usuarioService;
		
		@Autowired
		public MainController(UsuarioService usuarioService) {
			
			this.usuarioService = usuarioService;
		}
		
		
		@GetMapping("/")
		public String index(Model model) {
			model.addAttribute("usuarios",usuarioService.getUsuario());
			return "index";
		}

		
}
