
/**
 * Write a description of class vvv here.
 *
 * @author (Nisal)
 * @version (day 24 chapter 6)
 */
public class ex02{
 
    public static boolean sum(int n, int m){
    
       if (n % m == 0){
       return true;
 
     }else {
         return false;}
        }
        public static void main (String[]args){
    
       boolean result = sum(3,2);
       System.out.println(result);
    }
    
}
