import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		System.out.println("11번 문제");
		// 11. 소수(prime-number) 검사와 흡사하게 사용자가 입력한 수의 인수들을 모두 출력하는 프로그램을 작성하시오.
		//     8 => 2 4 
		//     12 => 2 3 4 6
		//     위의 문제를 0을 입력하기 전까지는 계속 수행(인수 출력)하도록 수정하시오.
		
		int i; // 변수 선언
		int n; // 변수 선언
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		n = input.nextInt(); // 키보드에서 숫자 입력
		
		while (n != 0) {
			System.out.print(n + " => ");
			for(i=2; i<n; i++) {
				if (n%i == 0)
					System.out.print(i + " ");
			}
			System.out.println("");
			System.out.print("숫자를 입력하시오 : ");
			n = input.nextInt(); // 키보드에서 숫자 입력
		}
		System.out.println("");
		System.out.println("==============프로그램 종료==============");
	}
}
