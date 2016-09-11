import java.util.*;
import java.lang.*;
import java.util.Scanner;
 
class Main
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		double  f=1;
		while(n>0)
		{	
			f=1;
			int p = sc.nextInt();
			for(int i=1;i<=p;i++)
			    f=f*i;
			    System.out.println(f);
			    n--;
		}
	}
}