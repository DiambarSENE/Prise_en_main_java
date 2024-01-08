package sn.dev;

public class NoMoneyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoMoneyException() {
		System.out.println("la balance ne doit pas etre negatif");
	}
}
