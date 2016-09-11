import java.io.*;
class InOu
{
	public static void main(String[] args) {
		try
		{
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         System.out.println("Enter the two no.:");
         int a = Integer.parseInt(br.readLine());
         int b = Integer.parseInt(br.readLine());
         int c = a+b;
         System.out.println("Sum is : "+(a+b)); 
		}
		catch(Exception ex){
			System.out.println(ex);

		}
	}
}