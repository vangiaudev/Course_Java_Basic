package vangiaurecca.example.test;

import vangiaurecca.example.model.MyThread;

public class TestMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread tt1 = new MyThread();
		tt1.start();
		MyThread tt2 = new MyThread();
		tt2.start();
		
		MyThread tt3 = new MyThread();
		tt3.start();
	}

}
