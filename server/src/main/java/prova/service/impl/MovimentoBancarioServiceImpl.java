package prova.service.impl;

import org.springframework.stereotype.Service;

import prova.dto.MovimentoBancarioDto;
import prova.service.MovimentoBancarioService;

@Service
public class MovimentoBancarioServiceImpl implements MovimentoBancarioService {

	@Override
	public MovimentoBancarioDto calcola(MovimentoBancarioDto dto) {
	Double d =	dto.getMovimentoBancario().getImporto()*1.21;
	dto.getMovimentoBancario().setImportoInDollaro(d);
		return dto;
	}

}
