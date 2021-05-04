package prova.service;

import prova.dto.MovimentoBancarioDto;

/* 
 * Interfaccia del servizio per il calcolo della conversione da euro in dollari
 */

public interface MovimentoBancarioService {
	MovimentoBancarioDto calcola(MovimentoBancarioDto dto);
}
