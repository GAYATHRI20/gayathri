import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m=0,flag=0,n;
		System.out.println("enter the number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=n/2;
		for(i=2;i<=m;m++)
		{
			if(n%i==0)
			{
				System.out.println("number is not prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("number is prime");
	}



	}


