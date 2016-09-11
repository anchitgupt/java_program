import java.util.Scanner;
import java.io.*;
public class DataCopyToAnoth
{
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Filename to read");
			String read = sc.nextLine();
			System.out.println("Enter the Filename to write");
			String write = sc.nextLine();

            FileInputStream fis = new FileInputStream(read);
            BufferedInputStream bis = new BufferedInputStream(fis,10000);

            FileOutputStream fos = new FileOutputStream(write,true);
            BufferedOutputStream bos = new BufferedOutputStream(fos,10000);
             
             long t1 = System.currentTimeMillis();
            int a;
            while((a=bis.read())!=-1)
            	{
                    System.out.print((char)a);
                    bos.write(a);
                }
        bis.close();
        fis.close();
        bos.close();
        fos.close();
        long t2 = System.currentTimeMillis();
        System.out.println("Time is: "+ (t2-t1));

		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}