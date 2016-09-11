import java.util.Scanner;
interface MasterClass
{
  int add(int a,int b);
}
interface MasterClass2
{
	 float div(int a,int b);
}
class Slave1 extends MasterClass,MasterClass2
{
    public int add(int a ,int b)
    {
    	return(a+b);
    }
    public float div(int a,int b)
    {
    	return(float)(a/b);
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Slave1 s1= new Slave1();
    	System.out.println("Enter the Two Numbers: ");
    	int a = sc.nextInt();
    	int b = sc.nextInt();
        System.out.println("Sum is: "+ s1.add(a,b));
        system.out.println("Div is :"+s1.div(a,b));     
    }
}
