
public class Twentythree {

	public static void main(String[] args) {
		System.out.println("23�� ����");
		// 23. ***** * 12345678 6, 12, 18 / 8, 16
		//     *** ***
		//     * *****
		//     �� ����Ͻÿ�(�ݺ��� �Ἥ!)
		
		int i; // ���� ����
		for (i=1; i<=24; i++) {
			if (i==6 || i==12 || i==18) // i�� 6 �Ǵ� 12 �Ǵ� 18�̸�
				System.out.print(" ");
			else if (i==8 || i==16 || i==24) // i�� 8 �Ǵ� 16 �Ǵ� 24�̸�
				System.out.println("");
			else // �� �ܿ�
				System.out.print("*");
		}
		System.out.println("==============���α׷� ����==============");
	}

}