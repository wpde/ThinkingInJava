package _12Exceptions;


/**  
* @Description:ArrayIndexOutOfBoundsException�쳣
* @author cofe  
* @date 2019��4��27��  
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
