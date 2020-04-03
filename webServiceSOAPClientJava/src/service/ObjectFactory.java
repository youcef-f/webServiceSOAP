
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConvertToLowcaseResponse_QNAME = new QName("http://service/", "convertToLowcaseResponse");
    private final static QName _Compte_QNAME = new QName("http://service/", "compte");
    private final static QName _GetClientResponse_QNAME = new QName("http://service/", "getClientResponse");
    private final static QName _ConvertToLowcase_QNAME = new QName("http://service/", "convertToLowcase");
    private final static QName _GetComptesResponse_QNAME = new QName("http://service/", "getComptesResponse");
    private final static QName _GetClient_QNAME = new QName("http://service/", "getClient");
    private final static QName _Client_QNAME = new QName("http://service/", "client");
    private final static QName _GetComptes_QNAME = new QName("http://service/", "getComptes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertToLowcaseResponse }
     * 
     */
    public ConvertToLowcaseResponse createConvertToLowcaseResponse() {
        return new ConvertToLowcaseResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetClient }
     * 
     */
    public GetClient createGetClient() {
        return new GetClient();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link ConvertToLowcase }
     * 
     */
    public ConvertToLowcase createConvertToLowcase() {
        return new ConvertToLowcase();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link GetClientResponse }
     * 
     */
    public GetClientResponse createGetClientResponse() {
        return new GetClientResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertToLowcaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convertToLowcaseResponse")
    public JAXBElement<ConvertToLowcaseResponse> createConvertToLowcaseResponse(ConvertToLowcaseResponse value) {
        return new JAXBElement<ConvertToLowcaseResponse>(_ConvertToLowcaseResponse_QNAME, ConvertToLowcaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getClientResponse")
    public JAXBElement<GetClientResponse> createGetClientResponse(GetClientResponse value) {
        return new JAXBElement<GetClientResponse>(_GetClientResponse_QNAME, GetClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertToLowcase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convertToLowcase")
    public JAXBElement<ConvertToLowcase> createConvertToLowcase(ConvertToLowcase value) {
        return new JAXBElement<ConvertToLowcase>(_ConvertToLowcase_QNAME, ConvertToLowcase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getClient")
    public JAXBElement<GetClient> createGetClient(GetClient value) {
        return new JAXBElement<GetClient>(_GetClient_QNAME, GetClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

}
