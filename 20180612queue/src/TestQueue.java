import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException {
//		Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>(); // 알파벳 순으로 저장됨
		strs.add("trump"); // Queue 맨 끝에 요소를 추가
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");

		while (!strs.isEmpty()) {
			System.out.println(strs.remove()); // remove() : Queue 맨 앞에서 요소를 제거하여 그 요소를 반환
			Thread.sleep(2000); // 약 2초 기다려!!
		}
	}

}
