import java.io.*;
import java.util.Scanner;
public class Calculatordemo
{
public static void main(String args[])
{
    int a,b,c;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the operation:");
    int x=sc.nextInt();
    System.out.println("enter the two positive numbers:");
    a=sc.nextInt();
    b=sc.nextInt();
    switch(x)
    {
        case 1: System.out.println("Addition of two numbers");
                c=a+b;
                System.out.println("addition is"+c);
                break;
        case 2: System.out.println("substraction of two numbers");
                c=a-b;
                System.out.println("substraction is"+c);
                break;
        case 3: System.out.println("Multiplication of two numbers");
                c=a*b;
                System.out.println("multiplication is"+c);
                break;
        case 4: System.out.println("division of two numbers");
                c=a/b;
                System.out.println("division is"+c);
                break;
	default:System.out.println("Enter the valid option");

    }
}
}
