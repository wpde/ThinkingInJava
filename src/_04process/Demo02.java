package _04process;

/**
 * 
 * @author cofe
 * @Date 2018年8月4日
 * @Description
 */
public class Demo02 {
	public static void main(String[] args) {
		double num =Math.random();
		for(int i=2;i<=25;i++) {
			double numNext =Math.random();
			if(num>numNext) {
				System.out.println("该随机数是"+num +"大于下一个随机数");
			}else if(num <numNext) {
				System.out.println("该随机数是"+num +"小于下一个随机数");
			}else {
				System.out.println("该随机数是"+num +"等于于下一个随机数");
			}
			num =numNext;
		}
	}
}
