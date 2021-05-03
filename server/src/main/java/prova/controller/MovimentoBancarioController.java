package prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import prova.service.MovimentoBancarioService;

@RestController
@CrossOrigin("*")


public class MovimentoBancarioController {
	
	@Autowired
	MovimentoBancarioService movimentoBancarioService;
	
	
	

}
