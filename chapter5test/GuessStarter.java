
/**
 * Write a description of class ex7 here.
 *
 * @author (nisal)
 * @version (30.01.2019)
 */
import java.util.Random;
import java.util.Scanner;
public class GuessStarter {

    public static void guessNumber(int user,int number) {
        
        if (user == number){
            System.out.println("You are amazing!!");
    }else {
        System.out.println( number - user );
     }
 }
public static void main(String[]args){
     System.out.println("guess a number");
    Scanner reader = new Scanner ( System.in);
        int user = reader. nextInt();
    Random random = new Random();
        int number = random.nextInt(100) + 1;
        
         guessNumber(user,number);


  }
}
