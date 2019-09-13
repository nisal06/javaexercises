
/**
 * Write a description of class ex34 here.
 *
 * @author (Nisal)
 * @version (12.12)
 */

import java.util.Scanner;
public class ex04
{
 public static void checkFermat(int a,int b,int c,int n){
    
    
    
    }
 
   
    
    
 public static void main(String[]args){
     
     int a,b,c,n;
     Scanner reader = new Scanner ( System.in);
     System.out.println("enter a value for a?");
     a = reader. nextInt();
     System.out.println("enter a value for b?");
     b = reader. nextInt();
     System.out.println("enter a value for c?");
     c = reader. nextInt();
     System.out.println("enter a value for n?");
     n = reader. nextInt();
      
      if((((Math.pow (n ,a))+(Math.pow (n ,b)))== (Math.pow (n ,c)) ) && (n > 2)){
     System.out.println("Holy smokes, Fermat was wrong!");
     }else{
    
      System.out.println("No, that doesn’t work");
    
     }
     checkFermat(a,b,c,n);
  }
  
}
  
