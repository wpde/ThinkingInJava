package _11HoldingYourObjects;

import java.util.HashSet;
import java.util.Set;

/**  
* @Description: TODO(������һ�仰��������������)  
* @author cofe  
* @date 2018��9��4��  
*    
*/
public class Demo02 {
	public static void main(String[] args) {
		Set<Integer> c=new HashSet<>();
		for (int i = 0; i < 10; i++) {
			c.add(i);
		}
		for (Integer integer : c) {
			System.out.println(integer);
		}
	}
}
