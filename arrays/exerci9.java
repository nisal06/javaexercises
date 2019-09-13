
/**
 * クラス exerci9 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class exerci9
{
      public static void main(String []args){
    int[] a = {1,2,3,4,5};
    int total = 0;
    System.out.println(reduce(a,total));
 }
 

 public static int reduce(int[]a,int total){  
    for(int i =0 ; i<a.length;i++){
       total=total+a[i];
    }
     
     return total;
    }
   
}
