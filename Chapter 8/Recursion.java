

/**
 * Write a description of class Recursion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion
{
    static int num = 6;
    
    public static void n(int num)
    {
        if(num == 0)
        {
            System.out.print(num);
        }
        else
        {
            System.out.print(num);
            n(num-1);
        }
    }
    
    public static void zero(int num)
    {
        if(num == 0)
        {
            System.out.print(num);
        }
        else
        {
            zero(num-1);
            System.out.print(num);            
        }
    }
    
    public static void str(String s)
    {
        int pos = s.length();
        if(pos == 1)
            System.out.print(s.charAt(pos-1));
        else
        {
            
            System.out.print(s.charAt(pos-1));
            str(s.substring(0,pos-1));
        }
    }
    
    public static boolean prime(int num, int d)
    {
        if(d != 1)
            return true;
        else
        {
            return !((num % d-1 == 0) || prime(num, d-1));
        }
    }
    
    public static int fib(int n)
    {
        if(n <= 2)
            return 1;
        else
        {
            num = fib(n-1) + fib(n-2);
            return num;
        }
    }

}
