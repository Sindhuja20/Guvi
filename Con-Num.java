/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Number
{
    public void convert(String st)
    {
        int num=0;
        //String str=new String();
        HashMap <String,Integer> map=new HashMap<String,Integer>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        map.put("ten",10);
        map.put("eleven",11);
        map.put("twelve",12);
        map.put("thirteen",13);
        map.put("fourteen",14);
        map.put("fifteen",15);
        map.put("sixteen",16);
        map.put("seventeen",17);
        map.put("eighteen",18);
        map.put("nineteen",19);
        map.put("twenty",20);
         map.put("thirty",30);
          map.put("forty",40);
           map.put("fifty",50);
            map.put("sixty",60);
             map.put("seventy",70);
              map.put("eighty",80);
               map.put("ninety",90);
                map.put("hundred",100);
                map.put("thousand",1000);
          

        String arr[]=st.split(" ");
        for(int loop=0;loop<arr.length;loop++)
        {
        if(map.containsKey(arr[loop]))
        {
            if(map.get(arr[loop])<100)
            num=num+map.get(arr[loop]);
            else
            num=num*map.get(arr[loop]);
        }
        else
        {
            System.out.println("no such number");
        }
    }
    System.out.println(num);
    }
}
class Con-Num
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str=new String();
		int n;
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		System.out.println("Enter num less than or equal to thousand");
		Number num=new Number();
		num.convert(str);
	}
}
