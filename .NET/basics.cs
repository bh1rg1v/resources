using System;

class Program {

    static int add(int a, int b)
    {
        return a + b;
    }

    static void solve()
    {
        
        Console.WriteLine("Hello, World!");

        int a = 10;
        double b = 3.14;
        char c = 'A';
        String name = "Bhargav";
        bool flag = true;

        Console.WriteLine(a + " " + b + " " + c + " " + name + " " + flag);
        // Console.WriteLine(a, b, c, name, flag);      we can't write it like this
        Console.WriteLine($"{a} {b} {c} {name} {flag}");

        Console.WriteLine();

        int x = 20;
        int y = 5;

        Console.WriteLine(x + y);
        Console.WriteLine(x - y);
        Console.WriteLine(x * y);
        Console.WriteLine(x / y);
        Console.WriteLine(x % y);

        Console.WriteLine();

        if (x > 18)
            Console.WriteLine("eligible to vote");
        else
            Console.WriteLine("underage");

        for (int i = 0; i < x; i++)
        {
            Console.WriteLine(i);
        }

        int j = 0;

        while (j < 5)
        {
            Console.WriteLine(j);
            j++;
        }

        int[] nums = {1, 2, 3, 4};

        foreach(int num in nums)
        {
            Console.WriteLine(num);
        }

        Console.WriteLine(add(18, 17));

    }

    static void Main(string[] args) {

        solve();

    }
    
}