class Threadsum implements Runnable {
	static int sum = 0;

	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println("Sum is 1:" + sum);
	}
}

class Threadsum2 extends Thread {
	static	int sum2 = 0;

	public void run() {
		for (int i = 1; i <= 50; i++) {
			sum2 = sum2 + i;
			System.out.println(sum2);
		}
		System.out.println("Sum is 2:" + sum2);
	}
}

class Threadsum3 extends Threadsum2 implements Runnable
{
	int sum3 = 0,sum;
	public void run() 
	{
		for (int i = 51; i <= 100; i++) 
		{
			sum3= sum3 + i;
			System.out.println(sum3);
		}
		System.out.println("Sum is 3:" + sum3);
		System.out.println("Total Sum of:"+ (sum=sum2+sum3));
	}
}

class Threadsum1 extends Thread 
{
	public static void main(String[] args) throws InterruptedException {
		Threadsum ts = new Threadsum();
		//ts.start();
		synchronized (ts) {
			ts.wait();
		}
		synchronized (ts) {
			ts.notify();
		}
			
			//Thread.sleep(500);
		Threadsum2 ts2 = new Threadsum2();
		ts2.start();
		synchronized (ts2) {
			ts2.wait();
		}
		synchronized (ts2) {
			
			ts2.notify();
		}
			
		// Thread.sleep(505);
		ts2.start();
		Threadsum3 ts3 = new Threadsum3();
		ts3.start();
		ts3.isAlive();
		synchronized (ts3) {
			ts3.wait();
//			System.out.println(ts3);
		}
		synchronized (ts3) {
			
			ts3.notify();
		}
			
		//	Thread.sleep(510);
			ts3.run();
	}
}
	
	
		