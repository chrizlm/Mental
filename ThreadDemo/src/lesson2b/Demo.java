package lesson2b;

class MyClass implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			    System.out.println(Thread.currentThread().getId() + "value " + i);
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

public class Demo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass());
		Thread t2 = new Thread(new MyClass());
		
		t1.start();
		t2.start();
		

	}

}
