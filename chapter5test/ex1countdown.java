
/**
 * Write a description of class ex1countdown here.
 *day 21
 *exercise no:5
 *chapter:5
 *book:think java
 * @author (Nisal)
 * @version (12.12 day 21)
 */
public class ex1countdown
{
    public static void countdown (int n){
        
        if (n==0){
            System.out.println("Blast Off!!!");
        } else{
        System.out.println(n);
        countdown (n-1);

        }
       
    }
    public static void main (String[]args){
    
       countdown(5);
    }
        
        
       
    }
