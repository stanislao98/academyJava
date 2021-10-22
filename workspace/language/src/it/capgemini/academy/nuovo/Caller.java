package it.capgemini.academy.nuovo;

public class Caller  extends Thread{
	String msg;
	Callme target;
	
	public Caller(Callme targ, String s) {
		target = target;
		msg = s;
	}
	
	public void run() {
		target.call(msg);
	}

}
