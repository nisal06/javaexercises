
/**
 * Write a description of class newyear here.
 *
 * @author (Nisal
 * )
 * @version (12.12 day 21)
 */
public class newyearcountdown
{
    public static void countdown (int n){
        
        if (n==0){
            System.out.println("HAPPY NEW YEAR!!!");
        } else{
        System.out.println(n);
        countdown (n-1);

        }
       
    }
    public static void main (String[]args){
    
       countdown(10);
    }
        
        
       
    }
