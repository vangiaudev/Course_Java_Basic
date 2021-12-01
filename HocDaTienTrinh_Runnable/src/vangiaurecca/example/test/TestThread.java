package vangiaurecca.example.test;

import vangiaurecca.example.model.MyThread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread run1 = new MyThread();
		MyThread run2 =new MyThread();
		MyThread run3 = new MyThread();
		
		Thread tt1 = new Thread(run1);
		tt1.setName("Tien trinh A");
		Thread tt2 = new Thread(run2);
		tt2.setName("Tien trinh B");
		Thread tt3 = new Thread(run3);
		tt3.setName("Tien trinh C");
		
		tt1.start();
		tt2.start();
		tt3.start();
	}

}
