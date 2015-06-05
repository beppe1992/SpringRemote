package com.example.remote.mainspring;


import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.remote.api.dto.UtenteRegistrazione;
import com.example.remote.client.services.MioSitoClient;

/**
 * Classe a cui serve chiamare il servizio del mio sito attraverso Spring
 * 
 */

public class App {

	public static void main(String[] args) throws Exception {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:ApplicationContext.xml");
		ctx.refresh();

		MioSitoClient client = ctx.getBean(MioSitoClient.class);
		
		UtenteRegistrazione utente = new UtenteRegistrazione();
        utente.setUser("arx50011");
        client.registraUtente(utente);
        
        
        client.utenteGiaRegistrato("arx50011");
	}
}
