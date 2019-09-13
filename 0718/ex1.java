
import java.util.Scanner;
public class ex1{
    public static void main(String[]args){
     
     Scanner reader = new Scanner (System.in);
     
     
     System.out.println("please,input a number");
     int number ;
 
     number = reader.nextInt();
     int remainer = number % 2 ;
     System.out.printf(number+" /2 remains  %d .",remainer);
     
     
     
     
     
    }
 
}