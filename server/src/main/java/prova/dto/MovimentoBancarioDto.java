package prova.dto;

import prova.model.MovimentoBancario;

/**
 * Classe per la trasmissione dell'oggetto movimentoBancario
 * tra client e server
 * */
public class MovimentoBancarioDto {

	private MovimentoBancario movimento;

	public MovimentoBancarioDto() {
		super();
	}

	public MovimentoBancarioDto(MovimentoBancario movimento) {
		super();
		this.movimento = movimento;
	}

	public MovimentoBancario getMovimento() {
		return movimento;
	}

	public void setMovimento(MovimentoBancario movimento) {
		this.movimento = movimento;
	}

	@Override
	public String toString() {
		return "MovimentoBancarioDto [movimento=" + movimento + "]";
	}
	
	 
	
}
