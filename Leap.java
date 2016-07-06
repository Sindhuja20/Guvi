import java.io.*;
import java.util.*;
public class Leap
{
public static void main(String args[])
{
int n;
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n%4==0)
System.out.println("Leap year");
else
System.out.println("Not a leap year");
}
}
