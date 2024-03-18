package basicCalculator;

public class NotANumberException extends Exception{
	public NotANumberException() {
		super("Input is not a number");
	}

}
