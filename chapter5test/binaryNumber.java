
// @author (Nisal)
 // @version (12.19 day 22)
 
public class binaryNumber
{
    public static void binaryNumber (int num ){
        
        if (num > 0){
            
          System.out.println(num % 2);
        
            int result = (num/2);
        
            
            binaryNumber (result );
           

          
        }
    }
        public static void main (String[]args){
    
           binaryNumber(23);
       }
        
        
       
    }
