package _21concurrency;

import java.util.Iterator;

/**  
* @Description: TODO(������һ�仰��������������)  
* @author cofe  
* @date 2018��11��4��  
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
		System.out.println("������һ��T1��");
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.yield();
		}
		System.out.println(Thread.currentThread().getName()+"�������");
		return;
	}
	
}