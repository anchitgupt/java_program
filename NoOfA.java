
import java.util.Scanner;
class NoOfA
{
	
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the string");
			String str[]=new String[10];
			for(int i=0;i<str.length;i++)
				str[i]=sc.nextLine();
		System.out.println("Names are");
		String str2;
		for(int i=0;i<str.length;i++)
		{ str2 = str[i];
		 char ch[] = str2.toCharArray();
		 if(ch[0]=='a' && ch[ch.length-1]=='a')
		 System.out.println(str[i]);	
		}
       } 
	
}