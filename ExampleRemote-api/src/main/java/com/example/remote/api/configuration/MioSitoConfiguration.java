package com.example.remote.api.configuration;

import java.io.Serializable;

/**
 * Classe di configurazione per le chiamate
 * @author arx50011
 *
 */
public class MioSitoConfiguration implements Serializable {

	private static final long serialVersionUID = 1L;

	private String serverUrl;
	private String port;
	private String contextRoot;

	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getContextRoot() {
		return contextRoot;
	}

	public void setContextRoot(String contextRoot) {
		this.contextRoot = contextRoot;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
