
public class Loop {

	public static void main(String[] args) {
//		// 1~10 정수를 화면에 출력(for문)
//		int i; // i는 루프변수
//		for (i=1; i<=10; i++) { // 1.루프 변수 초기화, 2.루프 조건식, 4.루프변수 변화
//			System.out.println(i); // 3.루프문
//		}
		
//		// 1~10 정수를 화면에 출력(while문)
//		int i; // i는 루프변수
//		i = 1; // 1.루프변수 초기화
//		while (i<=10) { // 2.루프 조건식
//			System.out.println(i); // 3.루프문
//			i++; // 4.루프 변수 변화
//		}
		
//		// 1~10 정수들 다 더하기 (while문)
//		int i, sum; // i, sum은 루프변수
//		i = 1; sum = 0; // 1.루프변수 초기화
//		while (i<=10) { // 2.루프 조건식
//			sum = sum + i; // 3.루프문
//			i++; // 4.루프 변수 변화
//		}
		
		// 1~10 정수들 다 더하기 (for문)
		int i;
		int sum = 0; // i, sum은 루프변수
		for (i=1; i<=10; i++) { // 1.루프변수 초기화, 2.루프 조건식, 4.루프 변수 변화
			sum = sum + i; // 3.루프문
		}
		
		System.out.println("sum = " + sum);
		
		// 문장에서 1의 갯수 구하기
		String str = "hello darkness my old friend";
		int count = 0;
		for (i=0; i < str.length(); i++) { // C언어에서와 달리 JAVA에서는 str이 object(객체), 따라서 ()안에 변수 안넣어줌.
			if (str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("문장에서 발견한 l의 갯수는 " + count + "개");
		System.out.println("==============프로그램 종료==============");
	}
}
