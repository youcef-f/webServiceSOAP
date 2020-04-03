package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Client;

@WebService(name = "ClientWebService")
public class ClientWebService {

	@WebMethod(operationName = "convertToLowcase")
	public String convertToUpperCase(@WebParam(name = "nom") String nom) {
		return nom.toUpperCase();
	}

	@WebMethod
	public Client getClient(@WebParam(name = "nom") String nom) {
		return new Client(nom, "random");
	}

	@WebMethod
	public List<Client> getClients() {
		List<Client> clients = new ArrayList<Client>();
		clients.add(new Client("nom1", "random"));
		clients.add(new Client("nom2", "random"));
		clients.add(new Client("nom3", "random"));

		return clients;
	}

}
