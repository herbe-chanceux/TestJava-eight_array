package testJava_eight_array;

public class Test_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,min,max;
		int A[]={74,48,30,17,62};
		System.out.println("数组包含的数有：");
		min=max=A[0];
		for(i=0;i<A.length;i++){
			System.out.print("A["+i+"]="+A[i]+"\n");
			if (A[i]>max)
		    max=A[i];
			if (A[i]<min)
			min=A[i];
		}
		System.out.println("the max="+max+",the min="+min);
	}

}
