import java.util.Scanner;
import java.io.*;
class CreateFold
{
	public static void main(String[] args) {
		try
		{
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the File to create:");
         String name = sc.nextLine();
         FileOutputStream fis =  new  FileOutputStream(name); 
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
