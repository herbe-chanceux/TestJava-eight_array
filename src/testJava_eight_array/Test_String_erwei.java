package testJava_eight_array;

public class Test_String_erwei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//数组名.length  取得数组的行数
		//数组名[行的索引].length 取得数组特定行的元素个数
		//二位数组只能取行数和特定行的元素个数，因为二位数组的每行元素个数可以是不同的、
		int i,j,sum = 0;
		int num[][]={{30,35,26,32},{33,34,30,29}};
		
		for(i=0;i<num.length;i++){
			System.out.print("第 "+(i+1)+"个人的成绩为： "); 
			for(j=0;j<num[i].length;j++){
				System.out.print(num[i][j]+" ");
				sum+=num[i][j];
			}
			System.out.println();
		}
		System.out.println("\n 总成绩是："+sum+"分！");
	}

}
