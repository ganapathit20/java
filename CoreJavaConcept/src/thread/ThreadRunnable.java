package thread;

public class ThreadRunnable {

	public static void main(String[] args) {


		Runnable r1 = new Runnable() {

			@Override
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
			
		};

		Runnable r2 = new Runnable() {

			@Override
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
			
		};

		Thread t1 = new Thread(r1);

		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		
		
		
		/********************************************/

		Thread t3 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("hi");
				try {
					java.lang.Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("hello");

				try {
					java.lang.Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t3.start();
		t4.start();

	}

}
