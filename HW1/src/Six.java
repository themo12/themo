import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		System.out.println("6�� ����");
		// 6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		//    ����� �Է� : �� ���� �� �ڸ� ����
		//    ��� : �ڸ����� ������ �ݴ�� �� ����

		int a; // �� �ڸ� ���� ���� �Է��� ���� ���� 
		int b; // �Է��� �� �ڸ� ���� �ڸ����� ������ �ٲٱ� ���� ����
		
		Scanner input = new Scanner(System.in);
		System.out.print("�� �ڸ� ���� ������ �Է��Ͻÿ� : ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		
		b = (a%10)*10+(a/10);
		
		if (a>=10 && a<100)
			System.out.println("�Է��� ������ �ڸ����� ������ �ٲ� ���ڴ� : " + b);
		else
			System.out.println("�Է��� ������ �� �ڸ����� ������ �ƴմϴ�.");
				
		System.out.println("==============���α׷� ����==============");

	}

}