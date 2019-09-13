
/**
 * クラス ex77 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex77
{
    public static void searchInt(int[] array, int target){
        
        
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return 1;
            }else{
            return -1;
            }
        }
        
    }
    public static void main(){
        int[] array =  {1,2,3,4,5};
        searchInt(array, 5);
        
    }
}
