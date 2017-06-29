import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int n;
		System.out.println("enter the number");
		Scanner s=new  Scanner(System.in);
		n=s.nextInt();
		System.out.println("prime numbers");
		for(int i=2;i<=n;i++)
		{
			int a=i/2;
		for(int j=2;j<=a;j++)
		{
			if(i%j==0)
			{
				k=1;
				break;
				
			}
		}
		System.out.println(i+" ");
			}
			k=0;
		}
}
