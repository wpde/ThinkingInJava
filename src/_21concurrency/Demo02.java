package _21concurrency;


/**  
* @Description: TODO(������һ�仰��������������)  
* @author cofe  
* @date 2018��11��4��  
*    
*/
public class Demo02 {
	public static void main(String[] args) {
		for(int i=10;i<15;i++) {
			new Thread(new Fibonacci(i)).start();
		}
	}
}

class Fibonacci implements Runnable{
	
	private int num;
	
	public Fibonacci(int num) {
		super();
		this.num = num;
	}
	private int fib(int x) {
		if(x < 2) return 1;
		else return fib(x-1)+fib(x-2);
	}
	@Override
	public void run() {
		synchronized(Fibonacci.class) {
			System.out.println("����num: "+num);
			for(int i=0;i<num;i++) {
				System.out.print(fib(i)+ " ");
			}
			System.out.println();
		}
	}
	
}