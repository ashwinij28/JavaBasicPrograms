package BasicPrograms;

import java.util.Scanner;

public class BasicJavaPrograms {
    public void HarmonicNumber()
    {
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
    public void HeadTail()
    {
        int heads=0;
        int tails=0;
        if (Math.random() < 0.5) {
            heads+=1;
            int percentage=(heads/10)*100;
            System.out.println("Heads" + percentage +"%");

        } else {
            int percentage=(tails/10)*100;
            System.out.println("tails" + percentage +"%");

        }
    }
    public void LeapYear()
    {
        int year;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Year is a leap year");
        else
            System.out.println("Year is not a leap year");
    }
    public void PowerOfTwo()
    {
        System.out.println("Enter the power");
        Scanner input=new Scanner(System.in);
        double number= input.nextInt();
        double result=Math.pow(2,number);
        System.out.println("Power of Two=" + result);
    }
    public void QuotientAndRemainder()
    {
        System.out.println("Enter the num1");
        System.out.println("Enter the num2");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int quotient = 0, remainder = 0;

        quotient = num1 / num2;
        remainder = num1 % num2;

        System.out.println("Quotient when " + num1 + "/" + num2 + " is: " + quotient);
        System.out.println("Remainder when " + num1 + " is divided by " + num2 + " is: " + remainder);
    }
    public void SwapOfNumber()
    {
        int x, y, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();
        t = x;
        x = y;
        y = t;
        System.out.println("Number After Swapping: "+x +"   " + y);
        System.out.println( );
    }
}
