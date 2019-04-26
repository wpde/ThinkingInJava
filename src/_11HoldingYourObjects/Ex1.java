package _11HoldingYourObjects;

import java.util.ArrayList;
import java.util.List;

class Gerbil {
	int gerbilNumber;

	public Gerbil(int gerbilNumber) {
		super();
		this.gerbilNumber = gerbilNumber;
	}
	
	public void hop() {
		System.out.println("Gerbil:"+this.gerbilNumber +" hop");
	}
}
/**  
* @Description: list集合遍历 
* @author cofe  
* @date 2018年9月4日  
*    
*/
public class Ex1 {
	public static void main(String[] args) {
		List<Gerbil>list=new ArrayList<>();
		for(int i=1;i<6;i++) {
			list.add(new Gerbil(i));
		}
		for(int i=0;i<list.size();i++) {
			Gerbil gerbil = list.get(i);
			gerbil.hop();
		}
	}
}