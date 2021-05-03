package prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import prova.dto.MovimentoBancarioRequestDto;
import prova.dto.MovimentoBancarioResponseDto;
import prova.service.MovimentoBancarioService;

@RestController
@CrossOrigin("*")


public class MovimentoBancarioController {
	
	@Autowired
	MovimentoBancarioService movimentoBancarioService;
	
	@RequestMapping("calcola-dollari")
	@ResponseBody
	public MovimentoBancarioResponseDto calcola(@RequestBody MovimentoBancarioRequestDto dto) {
		return null;
	}
	
	
	

}
