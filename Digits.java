import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,a=0;
System.out.println("enter the number");
Scanner s=new  Scanner(System.in);
n=s.nextInt();
if(n<0)
{
	n=n*-1;
}
else if(n==0)
{
	n=1;
}
while(n>0)
{
	n=n/10;
	a++;
}
System.out.println("the number of digits in given number is"+a);
	}

}
