import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		int score, good = 0, bad = 0;
		System.out.print("성적을 입력하세요: ");
		Scanner input = new Scanner(System.in); // Scanner : 키보드 입력 받기 위한 method
		score = input.nextInt(); // 키보드에서 숫자 입력
		System.out.println("성적은 " + score + " 점입니다.");
		
		// 성적이 60점이면 "합격입니다", 60점 미만이면 "불합격입니다"를 출력
		// 비교 >=: 관계연산자
		// if (조건식) {참일 경우 수행} else {거짓일 경우 수행}
		if (score >= 60) {
			System.out.println("합격입니다.");
			good++;
		} // 복합문(Compound Statement) : 여러 문장을 중괄호{}로 묶어 하나의 문장으로 처리
		else {
			System.out.println("불합격입니다.");
			bad++;
		}
		// 성적이 80점 이상이면 A, 60점 이상이면 B, 60점 미만이면 F
		if (score >= 80)
			System.out.println("학점은 A입니다.");
		else if (score >= 60)
			System.out.println("학점은 B입니다.");
		else
			System.out.println("학점은 F입니다.");
		
		// 0->"없음", 1->"하나", 2->"둘", 0/1/2가 아니면 "많음"을 출력
		switch (score) {
		case 0:
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("많음");
			break;
		}
		System.out.println("==============프로그램 종료==============");
	}

}
