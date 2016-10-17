/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Time
{
    public void calc(String str,String str1)
    {
        String t1[]=str.split(":");
        String t2[]=str1.split(":");
        int num1=0,num2=0,tim=0;
        for(int loop=0;loop<t1.length-1;loop++)
        {
            
            
         num1=(Integer.parseInt(t1[loop])*60)+Integer.parseInt(t1[loop+1]);   
         num2=(Integer.parseInt(t2[loop])*60)+Integer.parseInt(t2[loop+1]);
        }
        if(num1>num2)
        tim=num1-num2;
        else
        tim=num2-num1;
        System.out.println("Minutes difference is "+tim);
    }
}
class Time_Calc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str=new String();
		String str1=new String();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the times in 24 hour hr:mins format");
     	str=scan.next();
		str1=scan.next();
		Time t= new Time();
		t.calc(str,str1);
	}
}
