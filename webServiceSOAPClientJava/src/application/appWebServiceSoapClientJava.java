package application;

import java.util.List;

import service.BanqueWebService;
import service.BanqueWebServiceService;
import service.Client;
import service.ClientWebService;
import service.ClientWebServiceService;
import service.Compte;

public class appWebServiceSoapClientJava {


	 public static void main(String[] args) {
		
		 // BanqueWebService et le WebService soap exposé.
		 BanqueWebService stubBanque = new BanqueWebServiceService().getBanqueWebServicePort();
		 Compte compte = stubBanque.getCompte(1L) ; 
		 System.out.println(compte.getSolde());
		 
		 Double montant = stubBanque.conversionEuroToDirham(100) ;
		 System.out.println("montant conversion 100euros: "+montant);
		 
		 List<Compte> comptes = stubBanque.getComptes() ; 
		 
		 for (Compte c:comptes)
		 {
			 System.out.println("code: "+ c.getCode() + " solde: "+ c.getSolde());
		 }
		 
		 /*
		  Resultat
		  	55444.26663184944
			montant conversion 100euros: 3300.0
			code: 1 solde: 7285.530767676764
			code: 2 solde: 42676.21418284019
			code: 3 solde: 36756.52112541289
			code: 4 solde: 59337.82985501098
			code: 5 solde: 5952.432874987679	 
		  */
		 
		 

		 // ClientWebService et le WebService soap exposé.
		 ClientWebService stubClient = new ClientWebServiceService().getClientWebServicePort();
		 Client client = stubClient.getClient("youcef") ; 
		 System.out.println(client.getNom());
		 
		 String chaineMajuscule = stubClient.convertToLowcase("AbCdEfGh");
		 System.out.println("la chaine AbCdEfGh en majuscule est: "+chaineMajuscule);
		 
		 
		 /*
		  	Resultat:
		  	youcef
			La chaine AbCdEfGh en majuscule est: ABCDEFGH

		  */
		 
		 
	}
}
