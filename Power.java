import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,p,i;
int result=1;
System.out.println("enter the number");
Scanner s=new  Scanner(System.in);
n=s.nextInt();
p=s.nextInt();
if(n>=0 && p==0)
{
	result=1;
}
else if(n==0 && p>=0)
{
	result=0;
}
else
{
	for(i=0;i<=p;i++)
	{
		result=result*n;
	}
}
System.out.println(+n+"^"+p+"="+result);
	}

}
