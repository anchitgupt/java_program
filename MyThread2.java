class MyThread2 implements Runnable
{
	int available =2;
	int want;
	MyThread2(int a)
	{
		want=a;
	}
	public void run()
	{
		try
		{
			if(available>=want)
			{
				System.out.println(available+"tickets are availableable");
				System.out.println(want+"ticket is reserved for "+Thread.currentThread().getName());
				Thread.sleep(3000);
				available=available-want;
			}
			else 
				System.out.println("Sorry!No more Are availableable");

		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		
		MyThread2 m = new MyThread2(1);
		Thread t = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);

		t.setName("AYUSH");
		t2.setName("AVNEESH");
		t3.setName("ANCHIT");

		t.start();
		t2.start();
		t3.start();
	}
} 