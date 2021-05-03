package prova.model;

import java.time.LocalDate;

public class MovimentoBancario {

	private LocalDate data;
	private String descrizione;
	private Double importo;
	private Double importoInDollari;
	
	public MovimentoBancario() {
		super();
	}

	public MovimentoBancario(LocalDate data, String descrizione, Double importo, Double importoInDollari) {
		super();
		this.data = data;
		this.descrizione = descrizione;
		this.importo = importo;
		this.importoInDollari = importoInDollari;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
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

	public Double getImportoInDollari() {
		return importoInDollari;
	}

	public void setImportoInDollari(Double importoInDollari) {
		this.importoInDollari = importoInDollari;
	}

	@Override
	public String toString() {
		return "MovimentoBancario [data=" + data + ", descrizione=" + descrizione + ", importo=" + importo
				+ ", importoInDollari=" + importoInDollari + "]";
	}

  
}
