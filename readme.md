
# Web Service SOAP et RESTful  

https://www.youtube.com/watch?v=V1HErlQdrCo


## Exigence d'un projet informatique
* **Exigences fonctionnelles:**
    - R�pondre aux besoins fonctionnelles de l'entreprise
* **Exigences techniques:**
    - **Les performances**
        - Temps de r�ponse
        - HA
        - Problemes de monter en charge
    - **La maintenance:**
        - Application doit �voluer dans le temps
        - Application ferm�e � la modification et ouverte � l'extension ( IOC)
 * **S�curit�**
 * **Portablit�**
 * **Co�t logiciel**
 * <span style="color:red">**Distribution**</span>
 * <span style="color:red">**Capacit� de communiquer avec d'autres applications distantes ( web Service )**</span>
     - Desktop, mobile, Sms, http, ...
  
  
## Constat 
- **Il faut utiliser les Server d'applications JEE**
    - JBOSS, Web Sphere,WebLogic, GlassFish : Pour EJB ( Container Lourd )
    - Tomcat : pour Spring ( container leger )
    - ...
- **Framework IOC**
    - Spring ( container l�ger )
    - EJB ( Container lourd )
 - **Framewroks:**
    - Mapping Object Relationel ( ORM), JPA, Hibernate, Toplink
    - Application Web: Struts, JFS, SpringMVC
- **MidlleWares:**
    - RMI, CORBA (Common Object Request Broker Architecture)
    - Applications distribu�es
    - <span style="color:red"> JAXWS pour les Web Services SOAP</span>
    - <span style="color:red"> JAXRS pour les Webs Services RESTful</span>
    - JMS: Communication asynchrone entre les application.


Web Server remplace de plus en plus le protocole CORBA.


Architeture G�n�rale J2EE

![Architeture J2EE](doc/images/webservicesServer/ArchitectureJ2EE.jpg)




## SOAP vs RESTful

**Soap** est g�n�ralement impl�ment� pour des communications interfaces applications tant dis que le **RESTful** est impl�ment� pour des consommations clients mobile , jquery, flash ....

## Web Service SOAP et WSDL


## Rappelle HTTP

Le protocole **http **est **stateless** ( sans �tat ) Il y a une reconnexion  � toute demande de nouvelles pages. Pour maintenir une connexion permettre le server cr�� une session que le client devra renvoyer � toute les requetes. Les sessions ont une date d'exp�rience que le client renouvelle.

### connexion Client vers Server ( creation d'une socket client )
![image](doc/images/webservicesServer/protcoleHttp1.jpg)

### renvoi doc suit GET/POST
![image](doc/images/webservicesServer/protcoleHttp2.jpg)

### fermeture de la connexion.
![image](doc/images/webservicesServer/protcoleHttp3.jpg)



## SOAP

voir see documentation [SOAP](doc/soap.md)


## Mise en oeuvre webServices SOAP Server

voir see documentation [Mise en oeuvre Server](doc/WebServiceSOAPServer.md)


## Mise en oeuvre webServices SOAP Client Java

voir see documentation [Mise en oeuvre Client Java](doc/webServiceSOAPClientJava.md)


## Mise en oeuvre webServices SOAP Client C#

voir see documentation [Mise en oeuvre Client Java](doc/webServicesSOAPClientCsharp.md)

## Mise en oeuvre webServices SOAP Client via JSP page

voir see documentation [Mise en oeuvre Client Java](doc/webServicesSOAPJSP.md)






-------------------------------------------------------------------
-------------------------------------------------------------------

```java

```


![image](doc/images/webservicesServer/xxxxxxxxxxxxxxx)


```bash

```



```bash
```


```java
```

```java
```


```java
```

```java
```
