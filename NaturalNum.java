import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,i=1;
int sum=0;
System.out.println("enter the number");
Scanner s=new Scanner(System.in);
x=s.nextInt();
while(i<=x)
{
	sum=sum+i;
	i++;
}
System.out.println("sun of natural number is:"+sum);
	}

}
