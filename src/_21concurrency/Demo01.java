package _21concurrency;

import java.util.Iterator;

/**  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author cofe  
* @date 2018年11月4日  
*    
*/
public class Demo01 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			new Thread(new T1()).start();
		}
	}
}

class T1 implements Runnable{
	
	
	
	public T1() {
		super();
		System.out.println("创建了一个T1类");
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.yield();
		}
		System.out.println(Thread.currentThread().getName()+"任务结束");
		return;
	}
	
}