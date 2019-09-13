
/**
 * Write a description of class vvv here.
 *
 * @author (Nisal)
 * @version (day 24 chapter 6)
 */
import java.util.Scanner;
public class ex04{
 
    public static double multiAdd(double a, double b, double c){
    
       
          return a*b+c;
 
     
       
        }
        public static void main (String[]args){
            Scanner reader = new Scanner(System.in);
        System.out.println("Type a value a");
        double a = reader.nextInt();
    
        System.out.println("Type a value b");
        double b = reader.nextInt();
        System.out.println("Type a value c");
        double c = reader.nextInt();
       double result =multiAdd(a,b,c);
       System.out.println(result);
    }
    
}
