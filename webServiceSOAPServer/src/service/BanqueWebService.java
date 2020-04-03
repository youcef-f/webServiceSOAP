package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;

@WebService(name = "BanqueWebService")
public class BanqueWebService {

	@WebMethod(operationName = "conversionEuroToDirham")
	public double conversion(@WebParam(name = "montant") double montant) {
		return montant * 11 * 3;
	}

	@WebMethod
	public Compte getCompte(@WebParam(name = "code") Long code) {
		return new Compte(code, Math.random() * 80000, new Date());
	}

	@WebMethod
	public List<Compte> getComptes() {
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(new Compte(1L, Math.random() * 80000, new Date()));
		comptes.add(new Compte(2L, Math.random() * 80000, new Date()));
		comptes.add(new Compte(3L, Math.random() * 80000, new Date()));
		comptes.add(new Compte(4L, Math.random() * 80000, new Date()));
		comptes.add(new Compte(5L, Math.random() * 80000, new Date()));

		return comptes;
	}

}
