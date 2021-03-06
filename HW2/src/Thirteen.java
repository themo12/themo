import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		System.out.println("13번 문제");
		// 13. month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용)
		//     1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		
		// 1월, 3월, 5월, 7월, 8월, 10월, 12월 : 31일
		// 2월 : 28일
		// 4월, 6월, 9월, 11월 : 30일
		
		int month; // 월 입력을 위한 변수 선언
		int day; // 일 입력을 위한 변수 선언
		int x = 0; // 총 day수 계산을 위한 변수 선언 및 초기화
		
		Scanner input = new Scanner(System.in);
		System.out.print("month를 입력하세요. : ");
		month = input.nextInt(); // 키보드에서 숫자 입력
		System.out.print("day를 입력하세요. : ");
		day = input.nextInt(); // 키보드에서 숫자 입력
		
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
		System.out.println("총 day 수 = " + x + "일");
		System.out.println("==============프로그램 종료==============");
	}
}
