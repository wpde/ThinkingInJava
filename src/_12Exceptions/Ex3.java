package _12Exceptions;


/**  
* @Description:ArrayIndexOutOfBoundsException异常
* @author cofe  
* @date 2019年4月27日  
*    
*/
public class Ex3 {
	public static void main(String[] args) {
		int [] array=new int[3];
		try {
			System.out.println(array[4]);
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
}
