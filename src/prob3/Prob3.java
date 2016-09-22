package prob3;//자바문자열 확인->한글은 UTF-8(2byte)로 '자바'를 찾아서 Java로 바꾸기

public class Prob3 {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발 될 수 있습니다.";

		/* 코드를 작성합니다 */
		String result = "";
		result = str.replace("자바", "Java");
		System.out.println(result);
	}
}
