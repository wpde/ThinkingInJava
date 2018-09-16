package _11HoldingYourObjects.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cofe
 * @date 2018年9月4日
 * 
 */
public class Demo04 {
	public static void main(String[] args) {
		Factory f=new Factory();
		String [] array = new String[10];
		f.fillA(array);
		for (String string : array) {
			System.out.println(string);
		}
		System.out.println(f.fill(new ArrayList<String>(), 10));
		System.out.println(f.fill(new LinkedList<String>(), 10));
		System.out.println(f.fill(new HashSet<String>(), 10));
		System.out.println(f.fill(new TreeSet<String>(), 10));
		System.out.println(f.fill(new LinkedHashSet<String>(), 10));
	}                          
}

class Factory {
	int key = 0;
	public String next() {
		switch (key) {
		default:
		case 0:
			key++;
			return "Snow";
		case 1:
			key++;
			return "White";
		case 2:
			key++;
			return "Star";
		case 3:
			key = 0;
			return "Wars";
		}
	}
	
	/**
	 * 数组中添加元素
	 */
	public void fillA(String [] str) {
		for (int i = 0; i < str.length; i++) {
			str[i]=next();
		}
	}
	
	public Collection fill(Collection<String>c,int num) {
		for (int i = 0; i < num; i++) {
			c.add(next());
		}
		return c;
	}
}