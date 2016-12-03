package testJava_eight_array;

public class Test_String_duowei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,sum=0;
		int A[][][]={{{5,1},{6,7}},{{9,4},{8,3}}};
		//三维数组的输出需要采用三层for循环方式输出
		for(i=0;i<A.length;i++){
			for(j=0;j<A[i].length;j++){
				for(k=0;k<A[i][j].length;k++){
					System.out.print("A["+i+"]["+j+"]["+k+"]=");
					System.out.println(A[i][j][k]);
					sum+=A[i][j][k];
				}
			}
		}
		System.out.println("sum="+sum);
}

}
