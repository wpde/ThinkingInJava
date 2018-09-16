package _03operator.exercise;


public class Demo06 {
	public static void main(String[] args) {
		Dog spot=new Dog("spot","Ruff! ");
		Dog scruffy=new Dog("scruffy", "Wurf! ");
		Dog spot2=spot;
		// 加法“+”优先级高于关系运算符“==”
		System.out.println("spot == scruffy: " + (spot == scruffy));
		System.out.println("spot.equals(scruffy): " + spot.equals(scruffy));
		System.out.println("spot==spot2: " + (spot == spot2));
		System.out.println("spot.equals(spot2): " + spot.equals(spot2));
		System.out.println("scruffy == spot2: " + (scruffy == spot2));
		System.out.println("scruffy.equals(spot2): " + scruffy.equals(spot2));
	}
}
