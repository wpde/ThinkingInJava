package _03operator.exercise;

public class Demo04 {
	
	/**
	 * 
	 * @param length ����
	 * @param time ʱ��
	 * @return �ٶ�
	 */
	float speed(float length,float time) {
		if(time==0)return 0;
		else return length/time;
	}
	public static void main(String[] args) {
		Demo04 d=new Demo04();
		float speed = d.speed(11.2f, 2f);
		System.out.println(speed);
		int i=1;
		System.out.println("i++:" + i++);
		System.out.println("++i: "+ ++i);
		System.out.println("============");
		for(int i1=1;i1<100;++i1) {
			System.out.println(i1);
		}
	}
}
