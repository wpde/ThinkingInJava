/**
 * 
 */
package _04process;

/**
 * @author cofe
 * @Date 2018��8��4��
 * @Description 
 */
public class Demo04 {

	
	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			int num=0;
			for(int j=1;j<=i;j++) {
				if(i%j ==0) num++;
			}
			if(num <=2) System.out.println("������"+i);
		}
	}

}
