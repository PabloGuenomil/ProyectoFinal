 package com.comit.demoSpring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.comit.demoSpring.modelo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

//		@GetMapping("/registrarse")
//		public static String nuevoUsurario(Model model) {
//			model.addAttribute("usuario", new Usuario());
//			
//			return nuevoUsuario;
//		}
}
