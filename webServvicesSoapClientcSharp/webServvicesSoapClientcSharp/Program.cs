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
            Console.ReadKey();

            //Service.compte compte = stubBanque.getCompte(1L);
        }
    }
}
