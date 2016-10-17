/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Iso
{
public boolean Isomorphic(String s,String t)
{
    char c1,c2;
    int i;
    HashMap<Character,Character> map=new HashMap<Character,Character>();
    if(s.length()!=t.length())
    {
        return false;
    }
    for(i=0;i<s.length();i++)
    {
        c1=s.charAt(i);
        c2=t.charAt(i);
        if(map.containsKey(c1))
        {
            if(map.get(c1)!=c2)
                return false;
        }
        else
        {
            if(map.containsValue(c2))
                return false;
            map.put(c1,c2);
        }
    }
    return true;
    
}
}
class Isom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str=new String();
		String str1=new String();
		Boolean res;
	Scanner scan=new Scanner(System.in);
    str=scan.next();
	str1=scan.next();
		Iso is=new Iso();
		res=is.Isomorphic(str,str1);
		System.out.println(res);
	}
}
