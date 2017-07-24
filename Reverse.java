package guvi;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,reversed=0,digit;
System.out.println("enter the number");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0)
{
	digit=n%10;
	reversed=reversed*10+digit;
	n/=10;
}
System.out.println("Reversed number:"+reversed);
}
	}


