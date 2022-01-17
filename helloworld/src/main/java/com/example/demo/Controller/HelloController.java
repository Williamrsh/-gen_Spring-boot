package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello Família 41!";
	}
	
	@GetMapping("/2")
	public String hello2() {
		return "Hello Família 41!!!";
	}
	@GetMapping("/habilidadesementalidades")
	public String habilidadesementalidades() {
		return "A mentalidade utilizada foi persistência e a habilidade utilizada foi de atenção aos detalhes.";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "O objetivo de aprendizagem desta semana é inicio do estudo em Sprint Boot.";
	}


}
