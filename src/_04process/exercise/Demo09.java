package _04process.exercise;
/**
 * 
 * @author cofe
 * @Date 2018Äê8ÔÂ5ÈÕ
 * @Description
 */
public class Demo09 {
	public static void main(String[] args) {
		int num =Integer.parseInt(args[0]);
//		int num =10;
		for(int i=1;i<=num;i++) {
			System.out.print(fibonacci(i));
			if(i<num)System.out.print("¡¢");
		}
	}
	
	static int fibonacci(int i){
		if(i>2) {
			return fibonacci(i-1)+fibonacci(i-2);
		}else {
			return 1;
		}
	}
}
