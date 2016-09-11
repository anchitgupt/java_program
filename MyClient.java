import java.io.*;
import java.net.*;
import java.util.Scanner;

class MyClient
{
   public static void main(String []ar)
   {
     try
     { 
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the host");
          String ip = sc.nextLine();
          System.out.println("Enter the port Nnumber: ");
          int port = sc.nextInt();
          Socket  s = new Socket(ip,port);
          DataOutputStream dos = new DataOutputStream(s.getOutputStream());
       BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
      BufferedReader  kb = new BufferedReader(new InputStreamReader(System.in));
    String str,str2;
        while(!(str=kb.readLine()).equals("bye"))
         {
               dos.writeBytes(str+"\n");
                    str2     =   br.readLine();
               System.out.println("Send by Server: "+str2);
         }
               dos.close();
               s.close();
               br.close();
               kb.close();  
      }
    catch(Exception ex){}
   }
}