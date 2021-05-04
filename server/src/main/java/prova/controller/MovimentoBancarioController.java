package prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import prova.dto.MovimentoBancarioDto;
import prova.service.MovimentoBancarioService;

/*
 * Si occupa di gestire la richesta del RequestMapping "calcola-dollari" e utilizza una richiesta POST 
 */

@RestController
@CrossOrigin("*")
public class MovimentoBancarioController {

	@Autowired
	MovimentoBancarioService movimentoBancarioService;

	@RequestMapping("calcola-dollari")
	@ResponseBody
	public MovimentoBancarioDto calcola(@RequestBody MovimentoBancarioDto dto) {
		System.out.println(dto);
		return movimentoBancarioService.calcola(dto);
		
	}

}
