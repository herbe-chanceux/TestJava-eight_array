package testJava_eight_array;

public class Test_String_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[]={1,2,3,4,5,6};
		int a2[]={9,8,7,6,5,4,3};
		System.arraycopy(a1, 0, a2, 0, 3);//System.arraycopy(source,0,dest,0,x)
		//复制源数组从下标0开始的x个元素到目标数组，从目标数组的下标0所对应的位置开始存取；
		
		System.out.print("a1数组的数字为：");
		for(int i=0;i<a1.length;i++) 
			System.out.print(a1[i]+" ");
		System.out.print("a2数组的数字为：");
		for(int j=0;j<a2.length;j++) 
			System.out.print(a2[j]+" "); 
}
}