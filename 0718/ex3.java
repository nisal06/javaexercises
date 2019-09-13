
import java.util.Scanner;
public class ex3{
    public static void main(String[]args){
     
     Scanner reader = new Scanner (System.in);
     
     
     System.out.println("please,input a number");
     int number ;
 
     number = reader.nextInt();
     int remainer = number % 100 ;
     System.out.printf(number+" /100 remains  %d .",remainer);
     
     
     
     
     
    }
 
}