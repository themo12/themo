
public class Twentyfive {

	public static void main(String[] args) {
		System.out.println("25번 문제");
		// 25.다음과 같은 출력이 나오도록 프로그램을 작성하시오.
		//    (1) ***********
		//        *********
		//        *******
		//        *****
		//        ***
		//        *
		//        *** 
		//        ***** 
		//        ******* 
		//        ********* 
		//        ***********
		//    (2)54321012345
		//       432101234
		//       3210123
		//       21012
		//       101
		//       0
		//       101
		//       21012
		//       3210123
		//       432101234
		//       54321012345

		System.out.println("(1)번 문제 출력");
		int x; // 각 줄에서 출력할 별표의 갯수를 위한 변수 선언
		int y; // 각 줄에서 출력할 별표의 갯수를 위한 변수 선언
		for (x=10; x>0; x=x-2) {
			for (y=x; y>=0; y--)
				System.out.print("*");
			System.out.println("");
		}
		
		for (x=0; x<=10; x=x+2) {
			for (y=x; y>=0; y--)
				System.out.print("*");
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("(2)번 문제 출력");
		int a; // 줄에서 처음 시작할 숫자를 위한 변수 선언
		int b; // 출력할 숫자를 위한 변수 선언
		for (a=5; a>0; a--) { // 크기가 줄어드는 삼각형을 위한 for문
			for (b=a; b>=0; b--) // 543210, 43210, 3210...을 위한 for문
				System.out.print(b);
			for (b=1; b<=a; b++) // 12345, 1234, 123...을 위한 for문
				System.out.print(b);
			System.out.println(""); // 줄 넘김을 위한 for문
		}
		
		for (a=0; a<=5; a++) { // 크기가 늘어나는 삼각형을 위한 for문
			for (b=a; b>=0; b--) // 0, 10, 210...을 위한 for문
				System.out.print(b);
			for (b=1; b<=a; b++) // 1, 12, 123...을 위한 for문
				System.out.print(b);
			System.out.println(""); // 줄 넘김을 위한 for문
		}
		
		System.out.println("==============프로그램 종료==============");
	}

}




