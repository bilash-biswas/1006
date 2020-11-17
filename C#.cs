using System;

namespace Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            double a,b,c,d;
            a = Convert.ToDouble(Console.ReadLine());
            b = Convert.ToDouble(Console.ReadLine());
            c = Convert.ToDouble(Console.ReadLine());
            d = (a * 2 + b * 3 + c * 5) / 10;
            Console.WriteLine("MEDIA = " + string.Format("{0:0.0}", d));
            Console.ReadLine();
        }
    }
}
