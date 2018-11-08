package _21concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author cofe  
* @date 2018年11月8日  
*    
*/
public class Demo03 {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++)
			pool.execute(new T1());
		pool.shutdown();
	}
}
