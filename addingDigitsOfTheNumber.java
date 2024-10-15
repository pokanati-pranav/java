import java.io.*;
import java.util.Scanner;
public class AddingDigitsOfTheNumber
{
public static void main(String args[])
{
    int num,rem,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the integer:");
    num=sc.nextInt();
    while(num>0)
    {
        rem=num%10;
        sum=sum+rem;
        num=num/10;
    }
    System.out.println("Sum of digitd of the given integer is:"+sum);
}
}
