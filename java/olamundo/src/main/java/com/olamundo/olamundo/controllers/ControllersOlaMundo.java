package com.olamundo.olamundo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olamundo")
public class ControllersOlaMundo {
	
@GetMapping("/mentalidade")
public String mentalidadeehabilidade () {
   return "Persistência e Atenção aos detalhes";
}
@GetMapping("/objetivo")
 public String aprendizagem () {
	return "Aprender a fazer uma boa aplicação em java";
	 }
}
