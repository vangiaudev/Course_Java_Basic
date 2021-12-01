package vangiaurecca.example.model;

public class MyThread extends Thread {
	public void run() {
		super.run();
		try {
			for(int i = 0; i<10; i++)
			{
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+": i = " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
