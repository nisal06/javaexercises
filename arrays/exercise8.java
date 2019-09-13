
/**
 * クラス ex8 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class exercise8

{ public static void main(String[]args){
       int numbers[]
       = {1,2,3,4,5} ;
       int number =5;
      
      System.out.print(search(numbers,number));
    }  
       
       
       
  public static int search(int[]a,int value)  {
       
      
      for (int i=0 ; i<a.length;i++){
           
           if (a[i]==6){
        return 1;
        //System.out.print("5");
        }
       
    }
                         return -1;
      }
                   
}
