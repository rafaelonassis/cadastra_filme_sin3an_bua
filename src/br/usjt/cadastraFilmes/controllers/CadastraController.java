package br.usjt.cadastraFilmes.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.cadastraFilmes.beans.Filme;

@Controller
public class CadastraController {
	@RequestMapping("/cadastrar")
	public String metodo (Filme f) {
		Random r = new Random();
		int id = r.nextInt();
		return "cadastrado";
	}
}
