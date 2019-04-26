package _11HoldingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**  
* @Description: Integer类型的list集合 ，集合方法demo
* @author cofe  
* @date 2019年4月25日  
*    
*/
public class Ex5 {
	
	/**
	 * 
	 * @Description: 返回一个整数类型的数组   
	 * @param: @param length
	 * @param: @param size
	 * @param: @return
	 * @return: List<Integer>
	 */
	public static List<Integer> getIntegersFromRandom(int length,int size) {
		Random random=new Random();
		List<Integer> res=new ArrayList<>();
		for (int i = 0; i < length; i++) {
			res.add(random.nextInt(size));
		}
		return res;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> li = getIntegersFromRandom(7, 10);
		System.out.println("1: " + li);
		Integer h = new Integer(rand.nextInt(10));
		li.add(h);
		System.out.println("2: " + li);
		System.out.println("3: " + li.contains(h));
		li.remove(h);
		System.out.println("3: " + li);
		Integer p = li.get(2);
		System.out.println("4: " + p + " " +  li.indexOf(p));
		Integer cy = new Integer(rand.nextInt(10));
		System.out.println("5: " + cy +" " + li.indexOf(cy));//不同原因：无法保证li集合是否中包含cy，cy随机产生
		System.out.println("6: " + li.remove(cy));//不同原因：无法保证li集合是否中包含cy，cy随机产生
		System.out.println("7: " + li.remove(p));
		System.out.println("8: " + li);
		li.add(3, new Integer(rand.nextInt(10)));
		System.out.println("9: " + li);
		List<Integer> sub = li.subList(1, 4);
		System.out.println("sublist: " + sub);
		System.out.println("10: " + li.containsAll(sub));
		// will also sort sub elements within li:
		Collections.sort(sub);
		System.out.println("sorted sublist: " + sub);
		System.out.println("11: " + li.containsAll(sub));
		System.out.println("11.25: " + li);
		// will also shuffle sub elements within li:
		Collections.shuffle(sub, rand);
		System.out.println("11.5: " + li);
		System.out.println("shuffled sublist: " + sub);
		System.out.println("12: " + li.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(li);
		System.out.println("12.5: " + li);
		sub = Arrays.asList(li.get(1), li.get(4));
		System.out.println("sub: " + sub);	
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(li);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub); 
		System.out.println("15: " + copy);
		if(copy.size() > 1) // to avoid out of bounds exception
			copy.set(1, 8); // autoboxing int -> Integer
		System.out.println("16: " + copy);
		if(copy.size() > 2)
			copy.addAll(2, sub);
		System.out.println("17: " + copy);
		System.out.println("18: " + li.isEmpty());
		li.clear();
		System.out.println("19: " + li);
		System.out.println("20: " + li.isEmpty());
		li.addAll(getIntegersFromRandom(4, 10));
		System.out.println("21: " + li);
		Object[] o = li.toArray();
		System.out.println("22: " + o[3]);
		Integer[] ia = li.toArray(new Integer[0]);
		System.out.println("23: " + ia[3]);
		
	}
}






