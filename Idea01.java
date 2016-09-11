import java.io.*;
import java.util.Scanner;
class Idea01
{
	public static void main(String[] args) {
		try
		{
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the file ");
           String name = sc.nextLine();
           FileInputStream fis = new FileInputStream(name);
           File f = new File(name);
           int a;

           
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}