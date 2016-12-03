package testJava_eight_array;

import java.util.*;

public class Test_String_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={4,32,45,32,65,32,2};
		System.out.println("数组排序前的顺序为：");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("");
		Arrays.sort(a);//sort的排序为从大到小排序的；这个方法在java.util包中
		System.out.println("数组排序后的顺序为：");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
