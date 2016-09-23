package prob6;

public interface Stack<T> {
	public void push(T item);
	public T pop() throws MyStackException;
	public boolean isEmpty();
	public int size();
}
