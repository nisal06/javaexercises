
/**
 * クラス exercise6 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class exercise6

{ public static void main(String[]args){
       String[]studentList= {"kalam","jose","jani","ahamed"} ;
       String name ="jani";
      search(studentList,name);
    }  
       
       
       
  public static String search(String[]a,String value)  {
       
      
      for (int i=0 ; i<a.length;i++){
           
           if (a[i]=="jani"){
        System.out.print ( a[i]+" is in this class  " );
        
        }
       
    }
                         return "not found";
      }
                   
}

