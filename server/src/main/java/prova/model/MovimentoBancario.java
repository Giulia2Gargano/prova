package prova.model;

import java.time.LocalDateTime;


public class MovimentoBancario {

	private LocalDateTime data;
	private String descrizione;
	private Double importo;
	
	public MovimentoBancario() {
		super();
	}

	public MovimentoBancario(LocalDateTime data, String descrizione, Double importo) {
		super();
		this.data = data;
		this.descrizione = descrizione;
		this.importo = importo;
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

	@Override
	public String toString() {
		return "MovimentoBancario [data=" + data + ", descrizione=" + descrizione + ", importo=" + importo + "]";
	}
	
	
}
