import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("5번 문제");
		// 5. 메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
		//	  choose one of the following.
		//	  apple
		//	  orange
		//	  banana
		//	  peach
		//	  enter your choice here : (사용자 입력)orange
		//	  --------------
		//	  Your choice is “orange”.

		String x; // 하나의 변수 선언 
		String a = "apple";
		String b = "orange";
		String c = "banana";
		String d = "peach";
		
		System.out.println("Choose one of the following.");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your choice here : ");
		x = input.nextLine(); // 키보드에서 메뉴 입력
		System.out.println("-----------");
		
		switch (x) {
		case "apple" :
			System.out.println("Your choice is " + x);
			break;
		case "orange" :
			System.out.println("Your choice is " + x);
			break;
		case "banana" :
			System.out.println("Your choice is " + x);
			break;
		case "peach" :
			System.out.println("Your choice is " + x);
			break;
		default :
			System.out.println("We don't care about that");
			break;
		}
				
		System.out.println("==============프로그램 종료==============");

	}

}
