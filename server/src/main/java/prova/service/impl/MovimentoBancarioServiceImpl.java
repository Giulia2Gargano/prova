package prova.service.impl;

import prova.dto.MovimentoBancarioDto;
import prova.service.MovimentoBancarioService;

public class MovimentoBancarioServiceImpl implements MovimentoBancarioService {

	@Override
	public MovimentoBancarioDto calcola(MovimentoBancarioDto dto) {
	Double d =	dto.getMovimentoBancario().getImporto()*1.21;
	dto.getMovimentoBancario().setImportoInDollaro(d);
		return dto;
	}

}
