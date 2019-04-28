package _12Exceptions;


/**  
* @Description: 异常参数接收
* @author cofe  
* @date 2019年4月27日  
*    
*/
public class Ex1 {
	public static void main(String[] args) {
		try {
			throw new Exception("msg:exception");
		}catch(Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}finally{
			System.out.println("finally方法运行");
		}
	}
}
