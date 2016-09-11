import java.io.*;
import java.net.*;
class MyServer 
{
   public static void main(String []ar) 
   {
      try
     {
       ServerSocket ss = new ServerSocket(1234);
       System.out.println("Server Starts...Waiting for client");
         Socket      s   = ss.accept();
     System.out.println("Client Connected..");
   PrintStream ps = new PrintStream(s.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
    while(true)
   {
        String str,str2;
         while((str=br.readLine())!=null)
          {
              System.out.println("Send by Client: "+str);
                    str2  = kb.readLine();
                   ps.println(str2);
          }
      s.close();
      ps.close();
      br.close();
      kb.close();
      ss.close();
     System.exit(0);
   }
     }
    catch(Exception ex){}
   }
}