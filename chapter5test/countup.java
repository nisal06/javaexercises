
/**
 * Write a description of class ccc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class countup
{
    public static void countup (int n){
        
        if (n==4){
            System.out.println("go!!!");
        } else{
        System.out.println(n);
        countup (n+1);

        }
       
    }
    public static void main (String[]args){
    
       countup(1);
    }
        
        
       
    }
