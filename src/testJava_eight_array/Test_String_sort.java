package testJava_eight_array;

import java.util.*;

public class Test_String_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={4,32,45,32,65,32,2};
		System.out.println("��������ǰ��˳��Ϊ��");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("");
		Arrays.sort(a);//sort������Ϊ�Ӵ�С����ģ����������java.util����
		System.out.println("����������˳��Ϊ��");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
