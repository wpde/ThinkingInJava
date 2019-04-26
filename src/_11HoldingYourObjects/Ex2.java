package _11HoldingYourObjects;

import java.util.HashSet;
import java.util.Set;

/**  
* @Description: set集合遍历  
* @author cofe  
* @date 2018年9月4日  
*    
*/
public class Ex2 {
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
