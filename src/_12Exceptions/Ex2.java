package _12Exceptions;


/**  
* @Description: ����ʱ�쳣(RuntimeException)���Զ���java������׳�
* IllegalAccessException����Ȩ�����쳣��IllegalArgumentException��������������
* SQLException��IOException��NoSuchMethodError��NullPointerException��NumberFormatException
* ClassNotFoundException��IndexOutOfBoundsException��ArrayIndexOutOfBoundsException��
* @author cofe  
* @date 2019��4��27��  
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
