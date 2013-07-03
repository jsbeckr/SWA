package Main;

public abstract class Expression {
	/**
	 * Prints the Expression to System.out
	 */
	public void print() {
		System.out.println(this.getString());
	}
	
	/**
	 * Returns the final value
	 * @return computed value
	 */
	public abstract double evaluate();
	
	/**
	 * Returns a string of the Expression and all its children
	 * @return String of the Expression
	 */
	public abstract String getString();
}
