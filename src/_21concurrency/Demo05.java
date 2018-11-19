package _21concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**  
* @Description: TODO(������һ�仰��������������)  
* @author cofe  
* @date 2018��11��13��  
*    
*/
public class Demo05 {
	public static void main(String[] args) {
		Fibonacci2 t=new Fibonacci2(10);
		FutureTask<String> future=new FutureTask<String>(t);
		new Thread(future).start();
		try {
			String string = future.get();
			System.out.println(string);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}

class 	Fibonacci2 implements Callable<String>{
	
	private int num;
	
	
	public Fibonacci2(int num) {
		super();
		this.num = num;
	}
	
	public  int fib(int n) {
		if(n<2) return 1;
		else return fib(n-1)+fib(n-2);
	}

	@Override
	public String call() throws Exception {
		String res="";
		for(int i=0;i<num;i++) {
			res=res +new Integer(fib(i)).toString()+" ";
		}
		return res;
	}
	
} 