package com.example.remote.impl.services;

import com.example.remote.api.dto.UtenteRegistrazione;
import com.example.remote.api.services.IMioSitoService;

/**
 * Implementazione del servizi per il mio sito (SONO SERVIZI MOCK)
 * 
 * ATTENZIONE, LA LISTA DEGLI UTENTI NON E' PERSISTENTE
 * 
 * @author arx50011
 * 
 */
public class MioSitoService implements IMioSitoService {

	@Override
	public String registraUtente(UtenteRegistrazione utente) {

		System.out.println("Utente " + utente.getUser()
				+ " registrato correttamente");
		return "Utente " + utente.getUser() + " registrato correttamente";
	}

	@Override
	public boolean loginCorretta(String user, String password) {

		boolean loginCorretta = Math.random() < 0.5;

		System.out.println(loginCorretta);
		// boolean random
		return loginCorretta;
	}

	@Override
	public boolean utenteGiaRegistrato(String user) {

		boolean utenteGiaRegistrato = Math.random() < 0.5;

		System.out.println(utenteGiaRegistrato);

		// boolean random
		return utenteGiaRegistrato;
	}

}
