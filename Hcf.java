package guvi;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		int h;
Scanner s=new Scanner(System.in);
System.out.println("enter the first number:");
n1=s.nextInt();
System.out.println("enter the second number:");
n2=s.nextInt();
while(n2!=0) 
{
	h=n1%n2;
    n1=n2;
    n2=h;
}
System.out.println("HCF is"+n1);
	}

}
