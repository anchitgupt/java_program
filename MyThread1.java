class MyThread1 extends Thread
{
	String str;
	MyThread1(String str)
	{
		this.str=str;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{	System.out.println(str);
				Thread.sleep(1000);
				System.out.println("deafault thread is :"+Thread.currentThread().getName());
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		
		MyThread1 m =new MyThread1("Editing");
		MyThread1 m1 =new MyThread1("Printing");
		Thread t = new Thread(m);
		Thread t1 = new Thread(m1);
		t.start();
		t1.start();
	}
}