using System;
using Namespaces.TestNamespace; //Import the namespace and not the class

namespace Namespaces.Driver
{
    public class Driver
    {
        public static void Main(string[] args)
        {
            Namespace test = new Namespace();
            test.test();
        }
    }
}