
/**
 * Write a description of class vvv here.
 *
 * @author (Nisal)
 * @version (day 24 chapter 6)
 */
import java.util.Scanner;
public class ex03{
 
    public static boolean isTriangle(int a, int b, int c){
    
       if( (a > (b+c))||( b>(a+c))||(c > (a+b))){
          return false;
 
     
        }else{
            return true;}
        }
        public static void main (String[]args){
            Scanner reader = new Scanner(System.in);
        System.out.println("Type a value a");
        int a = reader.nextInt();
    
        System.out.println("Type a value b");
        int b = reader.nextInt();
        System.out.println("Type a value c");
        int c = reader.nextInt();
       boolean result =isTriangle(a,b,c);
       System.out.println(result);
    }
    
}
