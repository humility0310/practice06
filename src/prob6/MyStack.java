package prob6;

public class MyStack<T> implements Stack<T> {
	private String[] array;
	private int top = 0;
	private T[] buufer;

	public MyStack(int i) {
		this.array = new String[i];
		this.size();
	}

	@Override
	public void push(T item) {
		try {
			// if (this.top != this.size()) {
			this.array[top] = (String) item;
			this.top++;
			System.out.println("["+item + "]을 잘 넣었습니다, top의 번호는 [" + this.top + "]입니다");
			// }
		} catch (Exception e) {
			System.out.println("===스택의 공간이 부족합니다. 공간을 2배 늘리겠습니다===");
			T[] str = (T[])new Object[(this.array.length) * 2];
			System.arraycopy(this.array, 0, str, 0, this.array.length);
			this.array = (String[]) str;

			this.array[top] = (String) item;
			this.top++;
			System.out.println("["+item + "]을 잘 넣었습니다, top의 번호는 [" + this.top + "]입니다");
		}
		System.out.println("===========배열 내용==============");
		for (int i = 0; i < this.array.length; i++) {
			System.out.println("배열내용 : 	[" + array[i] + "],    	배열번호 : [" + i+"]");
		}
		System.out.println("=============================");
	}

	@Override
	public T pop() throws MyStackException {
		if (isEmpty()) {
			this.isEmpty();
			throw new MyStackException(": stack is empty");
		}
		System.out.println("["+this.array[this.top] + "]을 빼내겠습니다, top의 번호는 [" + this.top + "]입니다");
		for (int i = this.top; i > 0; i--) {
			this.array[i - 1] = this.array[i];
			this.array[i] = null;
		}
		this.top--;
		// System.out.println("이제 top는" + this.array[this.top] + "이구요, top은 " +
		// this.top + "에용");
		System.out.println("===========배열 내용==============");
		for (int i = 0; i < this.array.length; i++) {
			System.out.println("배열내용 : 	[" + array[i] + "], 	배열번호 : [" + i+"]");
		}
		System.out.println("=============================");
		return (T) ("현재 top의 내용은[" + this.array[this.top] + "]입니다, top의 번호는 [" + this.top + "]입니다");
	}

	@Override
	public boolean isEmpty() {
		if(this.top == 0){
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return array.length;
	}
}
