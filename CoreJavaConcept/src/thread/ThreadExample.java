package thread;

class Hi extends Thread{

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");

			try {
				java.lang.Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread {
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");

			try {
				java.lang.Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class Hi5 implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi " + i);

			try {
				java.lang.Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello5 implements Runnable {
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello "+i);

			try {
				java.lang.Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		
		Runnable r1 = new Hi5();
		
		Runnable r2 = new Hello5();
		
		Thread t1 = new Thread(r1);
		
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();

//		Hi hi = new Hi();
//
//		Hello hello = new Hello();
//		
//		hi.start();
//	
//		hello.start();

	}

}
