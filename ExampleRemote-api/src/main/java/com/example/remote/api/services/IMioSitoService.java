package com.example.remote.api.services;

import com.example.remote.api.dto.UtenteRegistrazione;

/**
 * Espone i metodi per lavorare il mio sito
 * 
 * @author arx50011
 * 
 */
public interface IMioSitoService {

	/**
	 * Metodo che si occupa di registrare un nuovo utente
	 * 
	 * @param utente
	 *            dati dell'utente
	 * @return un messaggio di conferma/errore
	 */
	public String registraUtente(UtenteRegistrazione utente);

	/**
	 * Controlla se la user e la password immessi sono corretti
	 * 
	 * @param user
	 *            utente
	 * @param password
	 *            password
	 * @return se la combinazione utente e password e' corretta
	 */
	public boolean loginCorretta(String user, String password);

	/**
	 * Controlla se l'utente e' gia' registrato a sistema
	 * @param user
	 * 		utente
	 * @return
	 * 		se l'utente e' gia' registrato
	 */
	public boolean utenteGiaRegistrato(String user);
}
