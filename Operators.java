import java.lang.*;
import java.util.*;
public class Operators
{
	public static int Total(Double m,int tip,int tax)
	{
		Double total=m+(tip*m)/100;
		total+=(tax*m)/100;
		int totall=(int)Math.round(total);
		return totall;	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Double meal=sc.nextDouble();
		int tip=sc.nextInt();
		int tax=sc.nextInt();
		System.out.println(Total(meal,tip,tax));
	}
}