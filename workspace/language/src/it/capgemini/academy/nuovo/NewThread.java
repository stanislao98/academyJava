package it.capgemini.academy.nuovo;

public class NewThread extends Thread {
	NewThread() {
		super("Demo Thread");
		System.out.println("Child thread: " + this);
	}
	
	@Override
	public void run() {
		System.out.println("Entering child thread.");
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child thread " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("child rhread interrupted");

		}
		System.out.println("Child thread exiting");

		
	}
		
}
