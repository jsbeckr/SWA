package Operations;
import Main.Expression;


public class SubOperation extends Operation {

	public SubOperation(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double evaluate() {
		return this.left.evaluate() - this.right.evaluate();
	}
	
	@Override
	public String getString() {
		return "(" + this.left.getString() + " - " + this.right.getString() + ")";
	}

}
