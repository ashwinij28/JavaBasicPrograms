package BasicPrograms;
import java.util.*;

public class PowerOfTwo {
    public static void main(String arg[])
    {
        System.out.println("Enter the power");
        Scanner input=new Scanner(System.in);
        double number= input.nextInt();
        double result=Math.pow(2,number);
        System.out.println("Power of Two=" + result);

    }
}
