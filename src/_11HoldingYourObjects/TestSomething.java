package _11HoldingYourObjects;

import java.util.ArrayList;
import java.util.Iterator;

/**  
* @Description: 测试在集合中修改、添加、删除元素  
* @author cofe  
* @date 2019年7月2日  
*    
*/

public class TestSomething {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
        array.add("cc");
        array.add("aa");
        array.add("bb");
        array.add("dd");
        /**
         * 
         * 1、for循环遍历
         * 	添加：可以
         * 	删除：可以
         */
        for (int i = 0; i < array.size(); i++) {
			if("aa".equals(array.get(i))) {
//				array.add("ee");
				array.remove(i);
			}
		}
        System.out.println("--------for----------");
        System.out.println(array);
        
        /**
         * 2、forearch遍历
         * 添加：报错,原因：modCount(原集合中修改次数) != expectedModCount(循环遍历时保存的modCount)
         * 删除：报错
         *
         */
        for (String string : array) {
			if("bb".equals(string)) {
//				array.add("ff");
//				array.remove(string);
			}
		}
        System.out.println("=========forearch==========");
        System.out.println(array);
        
        
        /**
         * 3、Iterator遍历
         *  添加：报错
         *  删除：array.remove()报错，iterator.remove()可以原因(iterator.remove方法会更新expectedModCount值)
         * 
         */
        Iterator<String> iterator = array.iterator();
        while(iterator.hasNext()) {
        	if("dd".equals(iterator.next())) {
//        		array.add("gg");
//        		array.remove(iterator.next());
        		iterator.remove();
        	}
        }
        System.out.println("+++++++++iterator+++++++++++");
        System.out.println(array);
        
	}
}
