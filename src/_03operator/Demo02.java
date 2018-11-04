package _03operator;
/**
 * 
 * @Author cofe
 * @Date 2018�?8�?1�?
 * @Description 类的别名机制
 */
public class Demo02 {

	public static void main(String[] args) {
		MyTank m1=new MyTank();
		MyTank m2=new MyTank();
		m1.level=1.0f;
		m2.level=2.0f;
		System.out.println("1:m1.level:"+m1.level+" m2.level:"+m2.level);
		// m2对象的引用赋值给了m1即类的别名机�?
		m1=m2;
		System.out.println("2:m1.level:"+m1.level+" m2.level:"+m2.level);
		m1.level=3.0f;
		System.out.println("3:m1.level:"+m1.level+" m2.level:"+m2.level);
		
		int i=1;
		//自增(++)和自�?(--)在前，先运算再赋�?
		System.out.println(++i);//2
		System.out.println(i++);//2
	}

}
class MyTank{
	float level;
}