import java.util.Scanner;

public class SumofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n;
int sum=0;
System.out.println("enter the number");
Scanner s=new  Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
	sum=sum+i;
	System.out.println("sum after adding"+i+"is:"+sum);
}
System.out.println();
System.out.println("sum of numbers till"+n+"is"+sum);
	}

}
