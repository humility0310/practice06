package prob6;

public class MyStackException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyStackException() {
		super( "MyStackException" );
	}
	
	public MyStackException( String message ) {
		super( message );
	}
}