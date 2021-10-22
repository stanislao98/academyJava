package it.capgemini.academy.esercizioThread;

import it.capgemini.academy.giorno6.eserciziocarta.comparatori.ComparatorData;

public class Producer extends Thread {
	CodaThread coda = new CodaThread();
	public Producer(CodaThread coda) {
       this.coda = coda;
	}
	
	 public void run()
	    {
	      
	            //add to the queue some sort of unique object
	            try {
		        	coda.put(4);
		        	coda.put(3);
		        	coda.put(2);
		        	coda.put(1);



				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
	        	
	        }
}