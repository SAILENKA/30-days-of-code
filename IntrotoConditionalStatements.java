import java.lang.*;
import java.util.*;
public class IntrotoConditionalStatements
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int var=sc.nextInt();
		if(var%2!=0)
		System.out.println("Weird");
		else
		{
			if(var>=2&&var<=5)
			System.out.println("Not Weird");
			else if(var>=6&&var<=20)
			System.out.println("Weird");
			else
			System.out.println("Not Weird");
		}
	}
}