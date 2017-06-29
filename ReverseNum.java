import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,reverse=0;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0)
		{
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println("reverse number of given number is"+reverse);
			}
}


