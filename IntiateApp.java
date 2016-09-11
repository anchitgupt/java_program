import java.util.Scanner;
import java.io.*;
class IntiateApp
{
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
		Runtime rs = Runtime.getRuntime();
		System.out.println("enter the name:");
		String name = sc.nextLine();
		rs.exec(name);
	}
	catch(Exception ex){
		System.out.println(ex);
	}

	}
}