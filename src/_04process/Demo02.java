package _04process;

/**
 * 
 * @author cofe
 * @Date 2018��8��4��
 * @Description
 */
public class Demo02 {
	public static void main(String[] args) {
		double num =Math.random();
		for(int i=2;i<=25;i++) {
			double numNext =Math.random();
			if(num>numNext) {
				System.out.println("���������"+num +"������һ�������");
			}else if(num <numNext) {
				System.out.println("���������"+num +"С����һ�������");
			}else {
				System.out.println("���������"+num +"��������һ�������");
			}
			num =numNext;
		}
	}
}
