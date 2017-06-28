import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,fact=1;
System.out.println("enter the number");
Scanner s=new  Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
     fact=fact*i;
}
System.out.println(" the factorial of given number is:"+fact);
	}

}
