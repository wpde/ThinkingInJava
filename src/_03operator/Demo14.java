package _03operator;

/**
 * 
 * @author cofe
 * @Date 2018年8月3日
 * @Description 加法的优先级高于“==”和“!=”
 */
public class Demo14 {

	public static void main(String[] args) {
		Demo14 demo14=new Demo14();
		demo14.TestBoolean("true", "true");
		/*demo14.TestBoolean("true", "false");
		demo14.TestBoolean("false", "true");
		demo14.TestBoolean("false", "false");*/
		
		String s1="a"+"true";
		String s2="a"+"true";
		String s3="true";
		String s4="a"+s3;
		System.out.println(s1==s2);
		System.out.println(s1==s4);
	}
	
	void TestBoolean(String s1,String s2){
		//                  ==true 和  equalsetrue 比较 
		String s3="=="+s1;
		String s7="=="+s2;
		System.out.println(s3==s7);
		String s4="=="+s1.equals(s2);
		System.out.println(s3==s4);
		System.out.println("===============");
		boolean b = s1.equals(s2);
		String s5="=="+b;
		System.out.println(s3 == s5);
		boolean b2=true;
		String s6="=="+b2;
		System.out.println(s3== s6);
	}

}
