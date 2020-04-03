package jaxwsServerSOAP;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.ws.Endpoint;

import service.BanqueWebService;
import service.ClientWebService;

public class ServerJAXWS {

	public static void main(String[] args) {

		// Ecoute les connexions clientes sur toutes les interfaces
		String urlBanqueWebService = "http://0.0.0.0:8585/BWS";
		String urlClientWebService = "http://0.0.0.0:8585/CWS";

		// Permet de lancer un Server JAX-WS avec la Classe BanqueWebService et
		// ClientWebService.
		Endpoint.publish(urlBanqueWebService, new BanqueWebService());
		Endpoint.publish(urlClientWebService, new ClientWebService());

		System.out.println(urlBanqueWebService);
		System.out.println(urlClientWebService);

	}

}
