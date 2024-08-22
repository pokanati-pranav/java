import java.io.*;
import java.util.Scanner;
class Factorial
  {
    public static void main(String args[]) 
    {

        int num ;
        int factorial = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the positive integer:");
        num=sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
