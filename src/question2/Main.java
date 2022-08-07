package question2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		Threadpool[] poolth= {
				new Threadpool("mahesh"),
				new Threadpool("ramukaka"),
				new Threadpool("babaji panwala")
				
		};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(Threadpool item:poolth) {
			service.submit(item);
		}
		service.shutdown();
	}

}
