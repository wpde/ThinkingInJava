package _21concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**  
* @Description: TODO(������һ�仰��������������)  
* @author cofe  
* @date 2018��11��8��  
*    
*/
public class Demo04 {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		for(int i=1;i<20;i++)
			pool.execute(new Fibonacci(i));
		pool.shutdown();
	}
}
