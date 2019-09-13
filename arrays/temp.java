
import java.util.Arrays;
public class temp
{
    public static void main(String[]args){
       double []tempforcast ={26.0,24.5,22.3};
       double []tempcopy = Arrays.copyOf(tempforcast,3);
        System.out.print(Arrays.toString(tempcopy));
    }
    }