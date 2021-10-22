package it.capgemini.academy.esercizioThread;

import java.util.LinkedList;

public class CodaThread {
	LinkedList<Integer> list = new LinkedList<>();
	final int CAPACITY = 4;
	
	synchronized public void put(int num) throws InterruptedException {
		while (list.size() == CAPACITY) {
			wait();
		}
		
		list.addLast(num);
		notify();
		Thread.sleep(1000);
	}
	
	synchronized public int take() throws InterruptedException {
		while (list.size() == 0) {
			wait();
		}
		int num1 = list.removeFirst();
		notify();
		Thread.sleep(1000);
		return num1;
	}
}
