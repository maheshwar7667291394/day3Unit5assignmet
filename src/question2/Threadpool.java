package question2;

public class Threadpool implements Runnable{
	String name;
	Threadpool(String name){
		this.name=name;
		
		
	}

	@Override
	public void run() {
		System.out.println(name+"Threaed started by "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(name+" thread ended by "+Thread.currentThread().getName());
		
	}

}
