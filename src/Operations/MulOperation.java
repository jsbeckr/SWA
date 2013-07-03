package Operations;
import Main.Expression;


public class MulOperation extends Operation {

	public MulOperation(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double evaluate() {
		return this.left.evaluate() * this.right.evaluate();
	}
	
	@Override
	public String getString() {
		return "(" + this.left.getString() + " * " + this.right.getString() + ")";
	}
}
