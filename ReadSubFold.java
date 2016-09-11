import java.util.Scanner;
import java.io.*;
class ReadSubFold 
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
            String []s = f.list();
            System.out.println("No. of Files: "+ s.length);
            for(String str: s)
               System.out.println(str);
         } 
         else
         	System.out.println("Invalid Folder or directory");
	 	}
	 	catch(Exception ex)
	 	{
	 		System.out.println(ex);
	 	}
	 }
}