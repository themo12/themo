import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		System.out.println("15번 문제");
		// 15. 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.(10번 이내로 못 맞추었을 경우는 약간 머리가 딸리는 사람이므로 Game Over 처리를 신랄하게 해 주기 바람)
		//     예) 답이 49일 경우:
		//     숫자를 입력하시오: 36
		//     입력하신 숫자보다 큽니다.
		//     숫자를 입력하시오: 51
		//     입력하신 숫자보다 작습니다.
		//     숫자를 입력하시오: 49
		//     정답입니다!
		
		int number = (int) (Math.random()*100)+1; // 1~100 사이의 숫자 하나 생성
		
		int a; // 변수 선언
		int i; // 변수 선언
		
		Scanner input = new Scanner(System.in);
		
		for (i=1; i<=10; i++) {
			if (i != 10) {
				System.out.print("숫자를 입력하시오. : ");
				a = input.nextInt(); // 키보드에서 숫자 입력
				
				if (a > number)
					System.out.println("입력하신 숫자보다 작습니다.");
				else if (a < number)
					System.out.println("입력하신 숫자보다 큽니다.");
				else {
					System.out.println("정답입니다!!");
					break;
				}
			}
			else {
				System.out.print("숫자를 입력하시오. : ");
				a = input.nextInt(); // 키보드에서 숫자 입력
				if (a != number)
					System.out.println("Game Over");
				else
					System.out.println("정답입니다!!");					
			}
		}

		System.out.println("==============프로그램 종료==============");
	}
}
