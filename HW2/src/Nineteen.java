import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		System.out.println("19�� ����");
		// 19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int a;
		int i;
		
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�. : ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		
		for (i=2; i<=a; i++) {
			if (i!=a) {
				if (a%i != 0)
					continue;
				else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
					break;
				}
			}
			else
				System.out.println("�Ҽ��Դϴ�.");
				break;
		}
		
		System.out.println("==============���α׷� ����==============");
	}
}