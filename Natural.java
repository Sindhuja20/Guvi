import java.io.*;
import java.util.*;
public class Natural
{
public static void main(String args[])
{
	int n,sum=0,i=1;
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
while(i<=n)
{
	sum=sum+i;
i++;
}
System.out.println("sum is "+sum);
}
}
