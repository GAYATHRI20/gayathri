import java.util.Scanner;

public class Multipilcation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=1,n;
System.out.println("enter the number");
Scanner s=new  Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=10;i++)
{
	m=n*i;
	System.out.println(+n+"*"+i+"="+m);
}
	}

}
