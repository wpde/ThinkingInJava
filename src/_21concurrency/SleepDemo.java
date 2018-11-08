package _21concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**  
* @Description: TODO(TimeUtil中的sleep方法)  
* @author cofe  
* @date 2018年11月8日  
*    
*/
public class SleepDemo extends Thread {
	private int i=10;
	public void run() {
		while(i-->0) {
			try {
				System.out.println(Thread.currentThread().getName()+" i: "+i);
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++) {
			pool.execute(new SleepDemo());
		}
		pool.shutdown();
	}
}
