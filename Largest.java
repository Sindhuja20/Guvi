import java.io.*;
import java.util.*;
public class Large
{
public static void main(String args[])
{
int n1,n2,n3;
System.out.println("Enter the numbers:");
Scanner s=new Scanner(System.in);
n1=s.nextInt();
n2=s.nextInt();
n3=s.nextInt();
if(n1>n2&&n1>n3)
System.out.println(+n1+"is largest");
else if(n2>n3)
	System.out.println(+n2+"is largest");
else
	System.out.println(+n3+"is largest");
}
}
