package prova.dto;

import prova.model.MovimentoBancario;

public class MovimentoBancarioResponseDto {

	private MovimentoBancario movimentoBancario;

	public MovimentoBancarioResponseDto() {
		super();
	}

	public MovimentoBancarioResponseDto(MovimentoBancario movimentoBancario) {
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
		return "MovimentoBancarioResponseDto [movimentoBancario=" + movimentoBancario + "]";
	}

	
}
