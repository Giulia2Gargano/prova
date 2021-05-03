package prova.service.impl;

import org.springframework.stereotype.Service;

import prova.dto.MovimentoBancarioDto;
import prova.service.MovimentoBancarioService;

@Service
public class MovimentoBancarioServiceImpl implements MovimentoBancarioService {

	@Override
	public MovimentoBancarioDto calcola(MovimentoBancarioDto dto) {
	Double d =	dto.getMovimento().getImporto()*1.21;
	dto.getMovimento().setImportoInDollari(d);
	System.out.println(d);
	System.out.println(dto);
		return dto;
	}

}
