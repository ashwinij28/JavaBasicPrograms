package BasicPrograms;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int number;
        System.out.println("Please Enter the value of N:=");
        number = sc.nextInt();
        for (int i = number; i > 0; i--)
        {
            sum = sum + (double)1 / number;
            System.out.println("Harmonic Sum is="+ sum + ",");
        }

    }
}