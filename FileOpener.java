import java.util.Scanner;
import java.io.*;
class FileOpener 
{
	 public static void main(String[] args) {
	 	try
	 	{
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the File name:");
         String name = sc.nextLine();
         File f = new File(name);
         if(f.exists())
         {
         	System.out.println("Name is :"+f.getName());
         	System.out.println("Path :"+f.getPath());
         	System.out.println("Size in bytes: "+f.length());
         	System.out.println("File: "+f.isFile());
         	System.out.println("Directory: "+f.isDirectory());
         } 
         else
         	System.out.println("Name is invalid or path specified is invalid");
	 	}
	 	catch(Exception ex)
	 	{
	 		System.out.println(ex);
	 	}
	 }
}