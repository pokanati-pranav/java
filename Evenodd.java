import java.io.*;
import java.util.Scanner;
public class Evenodd
{
public static void main(String args[])
{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println(num+"is a even number");
	}
	else
	{
		System.out.println(num+"is a odd number");
	}
}
}
