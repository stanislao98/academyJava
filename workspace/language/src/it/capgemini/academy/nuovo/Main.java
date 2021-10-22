package it.capgemini.academy.nuovo;

import java.util.*;
interface Azione {
	int function(int vin);
}
class MyClass {
public int incr (int v) {
	
return ++v;
}
public static int rem(int v1) {
	return ++v1;
}
}
public class Main {

public static void main(String[] args) {
	//TestGeneric();
	//TestThread1();
	//ThestThread2();
	//TestThread3();
	TestThread4();
	Azione v_lambda1 = (v) -> ++v;
	// metodo anonimo realizzato mediante una espressione lambda
	Azione v_lambda = (v) -> {// assegno alla variabile il reference al metodo anonimo
							// reference è un puntatore alla memoria virtuale interna
		return ++v;
	};
	
	int a = 4;
	int b = v_lambda.function(a);
	System.out.println(b);
	System.out.println();

	v_lambda = (v) -> v%2;
	b = v_lambda.function(a);

	System.out.println(b);
	v_lambda = (v) -> ++v;
	int c = 33;
	MyClass cls = new MyClass();
	int d = 11;
	v_lambda = cls::incr;
	PrintLambda(v_lambda, d);
	v_lambda = MyClass::rem; // assegno a v_lambda il metodo statico rem di MyClass
	List<Integer> list = new ArrayList<Integer>();
	list.forEach(element -> System.out.println(element));
}
	private static void TestThread4() {
	// TODO Auto-generated method stub
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "hello");
		Caller ob2 = new Caller(target, "sync");
		Caller ob3 = new Caller(target, "world");
		
		ob1.start();
		ob2.start();
		ob3.start();
		try {
			ob1.join();
			ob2.join();
			ob3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	
}
	private static void TestThread3() {
	// TODO Auto-generated method stub
	
}
	private static void ThestThread2() {
	// TODO Auto-generated method stub
		Thread t = Thread.currentThread();

		NewThread nt = new NewThread();
		nt.start(); 		//start thread
		t.setName("My Thread");

		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Main rhread interrupted");
		}
		System.out.println("Main thread exiting");
	
}
	private static void TestThread1() {
		//riferimento al thread corrente
		Thread t = Thread.currentThread();
		System.out.println("current thread " + t );
		t.setName("My Thread");
		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Main rhread interrupted");
		}
		
	}
	private static void TestGeneric() {
		MyGenClass<Integer, String> cls = new MyGenClass<Integer, String>();
		int a = 10;
		String msg = cls.meth2(a);
		//istanza di una classe che implementa una interfaccia
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
}
	private static void PrintLambda(Azione f, int v) {
		int res = f.function(v);
		System.out.println(res);
	}
	
	

}

class MyGenClass<T,R> {
	public int meth1 (T t) {
		return 0;
	}
		
	
	public R meth2 (T v) {
		return null;
	}
	public String meth3 (Object v) {
		return  v.toString();
	}
}




