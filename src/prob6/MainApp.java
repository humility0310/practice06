package prob6;//익셉션까지 같이해야함.(MyStack클래스 에서 메소드와 매개변수 구현)-> 익셉션 메세지 수정

public class MainApp {

	public static void main(String[] args) {
		try {
			Stack<String> stack = new MyStack(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (!stack.isEmpty() == false) {
				System.out.println(stack.pop());
			}

			System.out.println("======================================");

			stack = new MyStack(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());

		} catch (MyStackException ex) {
			System.out.println(ex);
		}
	}
}
