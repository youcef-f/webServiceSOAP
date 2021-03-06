
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BanqueWebService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueWebService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEuroToDirham", targetNamespace = "http://service/", className = "service.ConversionEuroToDirham")
    @ResponseWrapper(localName = "conversionEuroToDirhamResponse", targetNamespace = "http://service/", className = "service.ConversionEuroToDirhamResponse")
    @Action(input = "http://service/BanqueWebService/conversionEuroToDirhamRequest", output = "http://service/BanqueWebService/conversionEuroToDirhamResponse")
    public double conversionEuroToDirham(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns service.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://service/", className = "service.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://service/", className = "service.GetCompteResponse")
    @Action(input = "http://service/BanqueWebService/getCompteRequest", output = "http://service/BanqueWebService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        Long code);

    /**
     * 
     * @return
     *     returns java.util.List<service.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://service/", className = "service.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://service/", className = "service.GetComptesResponse")
    @Action(input = "http://service/BanqueWebService/getComptesRequest", output = "http://service/BanqueWebService/getComptesResponse")
    public List<Compte> getComptes();

}
