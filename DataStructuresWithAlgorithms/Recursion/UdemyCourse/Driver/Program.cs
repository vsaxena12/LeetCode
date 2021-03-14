using System;
using DataStructuresWithAlgorithms.Recursion.UdemyCourse.BasicRecursion;

/* A 'using namespace' directive can only be applied to namespaces; 'BasicRecursion' is a type not a namespace */

namespace UdemyCourse.Driver.Program
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            BasicRecursion test = new BasicRecursion();
            test.fun2(5);
        }
    }
}
