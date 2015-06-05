package com.example.remote.main;

import com.example.remote.api.configuration.MioSitoConfiguration;
import com.example.remote.api.dto.UtenteRegistrazione;
import com.example.remote.client.services.MioSitoClient;

/**
 * Classe a cui serve chiamare il servizio del mio sito
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        MioSitoConfiguration configuration = new MioSitoConfiguration();
        configuration.setServerUrl("localhost");
        configuration.setPort("8080");
        configuration.setContextRoot("ExampleRemote-web/remoting/");
        
        // chiamo io l'after property set perche' non uso spring
        MioSitoClient client = new MioSitoClient();
        client.setClientConfiguration(configuration);
        client.afterPropertiesSet();
        
        UtenteRegistrazione utente = new UtenteRegistrazione();
        utente.setUser("arx50011");
        client.registraUtente(utente);
        
        
        client.utenteGiaRegistrato("arx50011");
    }
}
