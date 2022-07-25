package Task16;

public class Thread_Sum {
		public static void main(String[] args) {
			T a = new T();
			a.start();
		}
	}
	
	class T extends Thread {
		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
			}
		}
	}


