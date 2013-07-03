package Main;

import Operations.AddOperation;
import Operations.MulOperation;
import Operations.SubOperation;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Value a = new Value("a", 2);
		Value b = new Value("b", 3);
		Value c = new Value("c", 5);
		Value d = new Value("d", 1);
		
		Expression root = 
				new AddOperation(
						new MulOperation(
								new AddOperation(a, b), new SubOperation(a, c)), 
						new SubOperation(
								new MulOperation(b, d), a)); 
		
		System.out.println(root.getString());
		System.out.println(root.evaluate());
	}
}
