package prova.model;

import java.time.LocalDate;

/**
 * Classe che rappresenta l'oggetto movimentoBancario
 * 
 * L'importo in dollari è inserito come attributo della classe,
 * arriva nullo al server che ne calcola il valore e lo ritorna al client
 * 
 * */
public class MovimentoBancario {

	//attributi
	private LocalDate data;
	private String descrizione;
	private Double importo;
	private Double importoInDollari;
	
	//costruttori
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

	//getters e setters
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
