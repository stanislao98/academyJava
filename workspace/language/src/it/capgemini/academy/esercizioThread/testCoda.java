package it.capgemini.academy.esercizioThread;

public class testCoda {
public static void main(String[] args) {
	CodaThread coda = new CodaThread();
	Producer p = new Producer(coda);
	Consumer c = new Consumer(coda);
	p.start();
	c.start();

	try {
		p.join();
		c.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
