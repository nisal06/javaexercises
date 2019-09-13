
/**
 * クラス tempnew の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.util.Arrays;
public class tempnew
{
    public static void main(String[]args){
     double []temp1 = {26.0,24.5,22.3};
     double []temp2= new double[temp1.length];
     for (int i=0;i<temp1.length;i++){
        temp2[i] = temp1[i];
        
        }
     
        System.out.print(Arrays.toString(temp2));
        
        
        
    }
}
