package com.example.remote.client.services;

import org.springframework.beans.factory.InitializingBean;

import com.example.remote.api.configuration.MioSitoConfiguration;
import com.example.remote.api.dto.UtenteRegistrazione;
import com.example.remote.api.services.IMioSitoService;
import com.example.remote.client.locator.ServiceLocator;

public class MioSitoClient implements IMioSitoService, InitializingBean {

	private MioSitoConfiguration clientConfiguration;

	private IMioSitoService mioSitoService;

	@Override
	public void afterPropertiesSet() throws Exception {
		if (clientConfiguration == null) {
			throw new IllegalArgumentException(
					"Property 'clientConfiguration' is required");
		}

		mioSitoService = ServiceLocator.locate(clientConfiguration,
				IMioSitoService.class);
	}

	@Override
	public String registraUtente(UtenteRegistrazione utente) {
		return mioSitoService.registraUtente(utente);
	}

	@Override
	public boolean loginCorretta(String user, String password) {
		return mioSitoService.loginCorretta(user, password);
	}

	@Override
	public boolean utenteGiaRegistrato(String user) {
		return mioSitoService.utenteGiaRegistrato(user);
	}

	public MioSitoConfiguration getClientConfiguration() {
		return clientConfiguration;
	}

	public void setClientConfiguration(MioSitoConfiguration clientConfiguration) {
		this.clientConfiguration = clientConfiguration;
	}

}
