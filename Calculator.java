package guvi;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		String operation;
Scanner s=new Scanner(System.in);
System.out.println("enter the first number:");
 a=s.nextInt();
 System.out.println("enter the second number:");
 b=s.nextInt();
Scanner op=new Scanner(System.in);
System.out.println("choose the operation:");
operation=op.next();
if(operation=="+")
{
	System.out.println("result is:"+(a+b));
}
if(operation=="-")
{
	System.out.println("the result is:"+(a-b));
}
if(operation=="*")
{
	System.out.println("the result is:"+(a*b));
}
if(operation=="/")
{
	System.out.println("the result is:"+(a/b));
}
if(operation=="^")
{
	System.out.println("the result is:"+(a^b));
}
	}

}
