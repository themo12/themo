import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		System.out.println("13�� ����");
		// 13. month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (switch�� ���)
		//     1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		
		// 1��, 3��, 5��, 7��, 8��, 10��, 12�� : 31��
		// 2�� : 28��
		// 4��, 6��, 9��, 11�� : 30��
		
		int month; // �� �Է��� ���� ���� ����
		int day; // �� �Է��� ���� ���� ����
		int x = 0; // �� day�� ����� ���� ���� ���� �� �ʱ�ȭ
		
		Scanner input = new Scanner(System.in);
		System.out.print("month�� �Է��ϼ���. : ");
		month = input.nextInt(); // Ű���忡�� ���� �Է�
		System.out.print("day�� �Է��ϼ���. : ");
		day = input.nextInt(); // Ű���忡�� ���� �Է�
		
		while (month > 1) {
			switch (month) {
			case 2: case 4: case 6: case 8: case 9: case 11:
				x = x + 31;
				break;
			case 3:
				x = x + 28;
				break;
			case 5: case 7: case 10: case 12:
				x = x + 30;
				break;
			default :
				break;
			}
			month--;		
		}
		x = x + day;
		System.out.println("�� day �� = " + x + "��");
		System.out.println("==============���α׷� ����==============");
	}
}