package prova.model;

import java.time.LocalDateTime;


public class MovimentoBancario {

	private LocalDateTime data;
	private String descrizione;
	private Double importo;
	private Double importoInDollaro;
	
	public MovimentoBancario() {
		super();
	}

	
	public MovimentoBancario(LocalDateTime data, String descrizione, Double importo, Double importoInDollaro) {
		super();
		this.data = data;
		this.descrizione = descrizione;
		this.importo = importo;
		this.importoInDollaro = importoInDollaro;
	}


	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Double getImporto() {
		return importo;
	}

	public void setImporto(Double importo) {
		this.importo = importo;
	}

	public Double getImportoInDollaro() {
		return importoInDollaro;
	}

	public void setImportoInDollaro(Double importoInDollaro) {
		this.importoInDollaro = importoInDollaro;
	}

	@Override
	public String toString() {
		return "MovimentoBancario [data=" + data + ", descrizione=" + descrizione + ", importo=" + importo
				+ ", importoInDollaro=" + importoInDollaro + "]";
	}

	
}
