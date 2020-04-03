package service;

public class BanqueWebServiceProxy implements service.BanqueWebService {
  private String _endpoint = null;
  private service.BanqueWebService banqueWebService = null;
  
  public BanqueWebServiceProxy() {
    _initBanqueWebServiceProxy();
  }
  
  public BanqueWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBanqueWebServiceProxy();
  }
  
  private void _initBanqueWebServiceProxy() {
    try {
      banqueWebService = (new service.BanqueWebServiceServiceLocator()).getBanqueWebServicePort();
      if (banqueWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)banqueWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)banqueWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (banqueWebService != null)
      ((javax.xml.rpc.Stub)banqueWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.BanqueWebService getBanqueWebService() {
    if (banqueWebService == null)
      _initBanqueWebServiceProxy();
    return banqueWebService;
  }
  
  public double conversionEuroToDirham(double montant) throws java.rmi.RemoteException{
    if (banqueWebService == null)
      _initBanqueWebServiceProxy();
    return banqueWebService.conversionEuroToDirham(montant);
  }
  
  public service.Compte getCompte(java.lang.Long code) throws java.rmi.RemoteException{
    if (banqueWebService == null)
      _initBanqueWebServiceProxy();
    return banqueWebService.getCompte(code);
  }
  
  public service.Compte[] getComptes() throws java.rmi.RemoteException{
    if (banqueWebService == null)
      _initBanqueWebServiceProxy();
    return banqueWebService.getComptes();
  }
  
  
}