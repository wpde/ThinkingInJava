package _03operator;

/**
 * @Author cofe
 * @Date 2018��8��1��
 * @Description ��ϵ��������==
 */


class Dog{
	String name;
	String says;
	
	Dog(String name,String says){
		this.name=name;
		this.says=says;
	}
	
	void showName() {
		System.out.println(name);
	}
	void showSays() {
		System.out.println(says);
	}
}
public class Demo05 {
	public static void main(String[] args) {
		Dog spot=new Dog("spot","Ruff! ");
		Dog scruffy=new Dog("scruffy", "Wurf! ");
		spot.showName();
		spot.showSays();
		scruffy.showName();
		scruffy.showSays();
	}
}
