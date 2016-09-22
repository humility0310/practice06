package prob4;

public class MyStack implements Stack {
	private String[] array;
	private int top = 0;

	public MyStack(int i) {
		this.array = new String[i];
		this.size();
	}

	@Override
	public void push(String item) {
		try {
			// if (this.top != this.size()) {
			this.array[top] = item;
			this.top++;
			System.out.println(item + "을 잘 넣었구욤, top은 " + this.top + "에용");
			// }
		} catch (Exception e) {
			System.out.println("===다찼어욤. 배열을 2배로 늘릴께염===");
			String[] str = new String[(this.array.length) * 2];
			System.arraycopy(this.array, 0, str, 0, this.array.length);
			this.array = str;

			this.array[top] = item;
			this.top++;
			System.out.println(item + "을 잘 넣었구욤, top은 " + this.top + "에용");
		}
		System.out.println("===========배열 내용==============");
		for (int i = 0; i < this.array.length; i++) {
			System.out.println("배열내용 : 	" + array[i] + ", 	배열번호 : " + i);
		}
		System.out.println("=============================");
	}

	@Override
	public String pop() throws MyStackException {
		if (this.top == 0) {
			this.isEmpty();
			throw new MyStackException(": stack is empty");
		}
		System.out.println(this.array[this.top] + "을 뺄거구욤, top은 " + this.top + "에용");
		for (int i = this.top; i > 0; i--) {
			this.array[i - 1] = this.array[i];
			this.array[i] = null;
		}
		this.top--;
		// System.out.println("이제 top는" + this.array[this.top] + "이구요, top은 " +
		// this.top + "에용");
		System.out.println("===========배열 내용==============");
		for (int i = 0; i < this.array.length; i++) {
			System.out.println("배열내용 : 	" + array[i] + ", 	배열번호 : " + i);
		}
		System.out.println("=============================");
		return "이제 top는 " + this.array[this.top] + "이구요, top은 " + this.top + "에용";
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int size() {
		return array.length;
	}
}
