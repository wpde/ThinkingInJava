package _05initialize.exercise;

public class Array {

	public static void main(String[] args) {
		Integer [][] ary=new Integer [2][];
		System.out.println(ary.length);
		ary[0]=new Integer[2];
		for(int i=0;i<ary[0].length;i++) {
			ary[0][i]=i;
		}
		ary[1]=new Integer[3];
		for(int i=0;i<ary[1].length;i++) {
			ary[1][i]=i;
		}
		System.out.println("±éÀúÊý×é");
		for (Integer[] integers : ary) {
			for (Integer integers2 : integers) {
				System.out.print(integers2);
			}
			System.out.println();
		}
	}

}
