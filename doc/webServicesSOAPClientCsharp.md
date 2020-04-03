# Client SOAP en Csharp

[video youtube](https://www.youtube.com/watch?v=0WKP0x_qvnU&list=PLxr551TUsmAozms7qX1iT8JzAwllHq0vD&index=4)



![soap client java](images/webservicesClientCSHARP/stubClientCsharp.jpg)


![soap client java](images/webservicesClientJAVA/stubClientJava.jpg)


- **Cr�er un nouveau projet console**
- **G�n�rer un proxy STUB**
    - SoapUI est l�un des outils qui peuvent �tre utilis�s pour g�n�rer les artefacts client en utilisant diff�rents Framework (Axis, CXF, JaxWS, dotNet etc�)
    - On utilsera plut�t  Visual Studio et ajout� une r�f�rence vers les webServices

    
 
## creation du projet console

Cr�ation d'un projet console avec Visual Studio
![projet console](images/webservicesClientCSHARP/projetConsolecsharp.jpg)



## G�n�ration de l'assembly

Ajouter une r�f�rence externe.

![projet console](images/webservicesClientCSHARP/generationSubWSbanque.jpg)

verification du stub

![projet console](images/webservicesClientCSHARP/generationSubWSbanque2.jpg)


## Application Client Csharp main

Programme csharp
 
```csharp
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace webServvicesSoapClientcSharp
{
    class Program
    {
        static void Main(string[] args)
        {

            Service.BanqueWebService stubBanque = new Service.BanqueWebServiceClient();
            double montant = 100; 
            double conversionArgent = stubBanque.conversionEuroToDirham(montant);
            Console.WriteLine("conversion: " + conversionArgent);

            Service.compte compte = stubBanque.getCompte(1.0);
            Console.WriteLine("solde: " + compte.solde); 


            //Service.compte compte = stubBanque.getCompte(1L);
        }
    }
}
```