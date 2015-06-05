package com.example.remote.api.dto;

import java.io.Serializable;

/**
 * Classe avente i dati per la registrazione dell'utente
 * 
 * @author arx50011
 * 
 */
public class UtenteRegistrazione implements Serializable {

	private String user;
	private String password;
	private String nome;
	private String cognome;
	private String email;
	private String eta;
	private String sesso;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

}
