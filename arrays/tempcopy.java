import java.util.Arrays;
public class tempcopy
{
    public static void main(String[]args){
       double []tempcopy ={26.0,24.5,22.3};
       double []tempcopy3 = Arrays.copyOf(tempcopy,2);
        System.out.print(Arrays.toString(tempcopy3));
    }
    }