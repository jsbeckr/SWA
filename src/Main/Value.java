package Main;

public class Value extends Expression {
	
	private String name;
	private double value;
	
	public Value(String name, double value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public double evaluate() {
		return value;
	}

	@Override
	public String getString() {
		return name;
	}

}
