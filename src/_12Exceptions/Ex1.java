package _12Exceptions;


/**  
* @Description: �쳣��������
* @author cofe  
* @date 2019��4��27��  
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
			System.out.println("finally��������");
		}
	}
}
