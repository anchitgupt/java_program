//import java.io.*;
import java.net.*;
import java.util.Scanner;
class Ip
{
	public static void main(String[] args) {
		try
		{
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the website");
           String name = sc.nextLine();
           System.out.println("Adress is: "+ InetAddress.getByName(name));
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}