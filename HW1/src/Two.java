import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("2�� ����");
		// 2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a; // �ϳ��� ���� �Է��� ���� ���� ����
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		
		if (a%2 == 0) // a�� 2�� ���� �� �������� 0�̸�
			System.out.println("�Է��� ������ ¦�� �Դϴ�.");
		else // a�� 2�� ���� �������� 0�� �ƴϸ�
			System.out.println("�Է��� ������ Ȧ�� �Դϴ�.");
		
		System.out.println("==============���α׷� ����==============");
	}

}