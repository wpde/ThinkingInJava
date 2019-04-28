package _12Exceptions;


/**  
* @Description: 运行时异常(RuntimeException)，自动被java虚拟机抛出
* IllegalAccessException：无权访问异常、IllegalArgumentException：方法参数错误
* SQLException、IOException、NoSuchMethodError、NullPointerException、NumberFormatException
* ClassNotFoundException、IndexOutOfBoundsException、ArrayIndexOutOfBoundsException、
* @author cofe  
* @date 2019年4月27日  
*    
*/
public class Ex2 {
	private Ex2 ex2;
	public void nullPointException() {
		ex2.nullPointException();
	}
	public static void main(String[] args) {
//		try {
			new Ex2().nullPointException();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
