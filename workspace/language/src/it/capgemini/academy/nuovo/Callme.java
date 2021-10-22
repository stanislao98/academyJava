package it.capgemini.academy.nuovo;

public class Callme {
	synchronized void call(String msg) {
		System.out.println(" " + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}
