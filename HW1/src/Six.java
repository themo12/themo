import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		System.out.println("6번 문제");
		// 6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		//    사용자 입력 : 한 개의 두 자리 정수
		//    출력 : 자릿수의 순서가 반대로 된 정수

		int a; // 두 자리 수의 정수 입력을 위한 변수 
		int b; // 입력한 두 자리 수의 자릿수의 순서를 바꾸기 위한 변수
		
		Scanner input = new Scanner(System.in);
		System.out.print("두 자리 수의 정수를 입력하시오 : ");
		a = input.nextInt(); // 키보드에서 숫자 입력
		
		b = (a%10)*10+(a/10);
		
		if (a>=10 && a<100)
			System.out.println("입력한 정수의 자릿수의 순서를 바꾼 숫자는 : " + b);
		else
			System.out.println("입력한 정수는 두 자릿수의 정수가 아닙니다.");
				
		System.out.println("==============프로그램 종료==============");

	}

}
