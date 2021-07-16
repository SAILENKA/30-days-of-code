import java.util.*;
import java.lang.*;
public class LetsReview
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t--)
		{
		String str=sc.next();
		String str1="";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
		       str1=str1+str.charAt(i);
			}
			else
		       str2=str2+str.charAt(i);
		}
		System.out.println(str1+" "+str2);
	}
		
	}
}
