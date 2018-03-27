import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		System.out.println("4번 문제");
		// 4. 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
		//    (A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		
		int a; // 하나의 변수 선언 
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		a = input.nextInt(); // 키보드에서 숫자 입력
		
		if (a >= 80) // 점수가 80~100점 이상이면
			System.out.println("당신의 등급은 A입니다.");
		else if(a >= 60) // 점수가 60~79점이면
			System.out.println("당신의 등급은 B입니다.");
		else if(a >= 40) // 점수가 40~59점이면
			System.out.println("당신의 등급은 C입니다.");
		else if(a >= 20) // 점수가 20~39점이면
			System.out.println("당신의 등급은 D입니다.");
		else // 점수가 0~19점이면
			System.out.println("당신의 등급은 E입니다.");
		
		System.out.println("==============프로그램 종료==============");
	}

}
