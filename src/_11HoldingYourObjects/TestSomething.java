package _11HoldingYourObjects;

import java.util.ArrayList;
import java.util.Iterator;

/**  
* @Description: �����ڼ������޸ġ���ӡ�ɾ��Ԫ��  
* @author cofe  
* @date 2019��7��2��  
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
         * 1��forѭ������
         * 	��ӣ�����
         * 	ɾ��������
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
         * 2��forearch����
         * ��ӣ�����,ԭ��modCount(ԭ�������޸Ĵ���) != expectedModCount(ѭ������ʱ�����modCount)
         * ɾ��������
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
         * 3��Iterator����
         *  ��ӣ�����
         *  ɾ����array.remove()����iterator.remove()����ԭ��(iterator.remove���������expectedModCountֵ)
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
