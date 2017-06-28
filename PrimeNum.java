
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		System.out.println("prime numbers");
		for(int i=2;i<=99;i++)
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


