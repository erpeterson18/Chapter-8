

/**
 * Write a description of class Fundraising here.
 * 
 * @author Ethan Peterson
 * @version 1.0
 */
public class Fundraising
{
    
    private static int number;
    
    
    public Fundraising()
    {
        number = 0;
        
    }
    
    public static void main()
    {
        fund(1000);
        System.out.println(number);
    }
    
    public static void fund(int money)
    {
        if(money == 1)
        {
            //number += 1;
            System.out.println(money);
            return;
        }
        
        else
        {
            for(int i = 0; i < 10; i++)
            {
                System.out.println(money);
                fund(money/10);
                number += 1;
                //fund(money%10);
            }
        }
        
    }

}
