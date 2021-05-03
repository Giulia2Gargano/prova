package prova.dto;

import prova.model.MovimentoBancario;

public class MovimentoBancarioDto {

	private MovimentoBancario movimentoBancario;

	public MovimentoBancarioDto() {
		super();
	}

	public MovimentoBancarioDto(MovimentoBancario movimentoBancario) {
		super();
		this.movimentoBancario = movimentoBancario;
	}

	public MovimentoBancario getMovimentoBancario() {
		return movimentoBancario;
	}

	public void setMovimentoBancario(MovimentoBancario movimentoBancario) {
		this.movimentoBancario = movimentoBancario;
	}

	@Override
	public String toString() {
		return "MovimentoBancarioRequestDto [movimentoBancario=" + movimentoBancario + "]";
	}
	
	
}
