package testJava_eight_array;

public class Test_String_erwei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������.length  ȡ�����������
		//������[�е�����].length ȡ�������ض��е�Ԫ�ظ���
		//��λ����ֻ��ȡ�������ض��е�Ԫ�ظ�������Ϊ��λ�����ÿ��Ԫ�ظ��������ǲ�ͬ�ġ�
		int i,j,sum = 0;
		int num[][]={{30,35,26,32},{33,34,30,29}};
		
		for(i=0;i<num.length;i++){
			System.out.print("�� "+(i+1)+"���˵ĳɼ�Ϊ�� "); 
			for(j=0;j<num[i].length;j++){
				System.out.print(num[i][j]+" ");
				sum+=num[i][j];
			}
			System.out.println();
		}
		System.out.println("\n �ܳɼ��ǣ�"+sum+"�֣�");
	}

}
