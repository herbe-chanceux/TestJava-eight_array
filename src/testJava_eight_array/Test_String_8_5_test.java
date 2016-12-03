package testJava_eight_array;

import java.util.Arrays;

public class Test_String_8_5_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={25,24,12,76,98,101,9,28};
		System.out.print("排序前的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.print("排序后的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
