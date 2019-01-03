package chapter11_16;

public class ExceptionA extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionA() {
		super("Type of exception ExceptionA");
	}
	
	public ExceptionA(String message) {
		super (message);
	}
	
	public ExceptionA(String message, Throwable er) {
		super (message, er);
	}
	
	public ExceptionA(Throwable er) {
		super (er);
	}
	

}
