package testJava_eight_array;

public class Test_String_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[]={1,2,3,4,5,6};
		int a2[]={9,8,7,6,5,4,3};
		System.arraycopy(a1, 0, a2, 0, 3);//System.arraycopy(source,0,dest,0,x)
		//����Դ������±�0��ʼ��x��Ԫ�ص�Ŀ�����飬��Ŀ��������±�0����Ӧ��λ�ÿ�ʼ��ȡ��
		
		System.out.print("a1���������Ϊ��");
		for(int i=0;i<a1.length;i++) 
			System.out.print(a1[i]+" ");
		System.out.print("a2���������Ϊ��");
		for(int j=0;j<a2.length;j++) 
			System.out.print(a2[j]+" "); 
}
}