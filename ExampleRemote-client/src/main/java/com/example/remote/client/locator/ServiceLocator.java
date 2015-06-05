package com.example.remote.client.locator;

import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.example.remote.api.configuration.MioSitoConfiguration;

public class ServiceLocator {

	@SuppressWarnings("unchecked")
	public static <T> T locate(MioSitoConfiguration clientConfiguration,
			Class<T> clazz) {
		HttpInvokerProxyFactoryBean factoryBean = new HttpInvokerProxyFactoryBean();

		factoryBean.setServiceUrl(createServiceUrl(clientConfiguration, clazz));

		factoryBean.setServiceInterface(clazz);

		factoryBean.afterPropertiesSet();

		return (T) factoryBean.getObject();

	}

	private static <T> String createServiceUrl(
			MioSitoConfiguration clientConfiguration, Class<T> clazz) {

		return "http://" + clientConfiguration.getServerUrl() + ":" + clientConfiguration.getPort() + "/" + clientConfiguration.getContextRoot() + "/" + clazz.getSimpleName();
	}
}
