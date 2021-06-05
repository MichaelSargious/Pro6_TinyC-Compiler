package tinycc.implementation.expression;

import tinycc.parser.Token;

public class BinaryExp extends Expression{

	private Token operator;
	private Expression left ;
	private Expression right ;
	
	
	
	public BinaryExp(Token operator, Expression left, Expression right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	public Token getOperator() {
		return operator;
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}

	@Override
	public String toString() {
		return "(" + left.toString() + operator.toString() + right.toString() + ")" ;
	}

}
