package Operations;
import Main.Expression;


public abstract class Operation extends Expression {

	protected Expression left;
	protected Expression right;

	public Operation(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public abstract String getString();
	
	//public abstract String getOperator();

}
