import java.io.*;
import java.util.*;
public class Sign
{
public static void main(String args[])
{
int n;
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n>0)
System.out.println("Positive number");
else if(n<0)
System.out.println("Negative number");
else
	System.out.println("Zero");
}
}
