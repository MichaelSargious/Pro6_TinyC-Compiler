package tinycc.implementation.expression;

import tinycc.parser.Token;

public class UnaryExp extends Expression{
	
	private Token op ;
	private boolean post ;
	private Expression operand ;
	
	public UnaryExp(Token op, boolean post, Expression operand) {
		super();
		this.op = op;
		this.post = post;
		this.operand = operand;
	}

	public Token getOp () {
		return this.op ;
	}

	public boolean getPost () {
		return this.post ;
	}

	public Expression getOperand () {
		return this.operand ;
	}

	@Override
	public String toString() {
		if (this.post)
			return null;
		return  "(" + this.op.toString() + this.operand.toString() + ")" ;
	}
	

}
