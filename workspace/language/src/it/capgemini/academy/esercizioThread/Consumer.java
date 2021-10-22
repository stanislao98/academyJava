package it.capgemini.academy.esercizioThread;


public class Consumer extends Thread{
	CodaThread coda = new CodaThread();
	public Consumer(CodaThread coda) {
	this.coda = coda;
	
}
	public void run() {
		try {
			System.out.println(coda.take());
			System.out.println(coda.take());
			System.out.println(coda.take());
			System.out.println(coda.take());

			
		
 

        
			
		} catch (Exception e) {
			// TODO: handle exception
            e.printStackTrace();

		}
	}
}
