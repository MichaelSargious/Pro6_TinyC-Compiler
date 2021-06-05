package tinycc.implementation.expression;

import java.util.List;

import tinycc.parser.Token;

public class callExp extends Expression {

	private Token toke; 
	private Expression callee ;
	private List<Expression> arguments ;
	
	public callExp(Token toke, Expression callee, List<Expression> arguments) {
		super();
		this.toke = toke;
		this.callee = callee;
		this.arguments = arguments;
	}
	
	public Token getToke() {
		return toke;
	}

	public Expression getCallee() {
		return callee;
	}

	public List<Expression> getArguments() {
		return arguments;
	}

	@Override
	public String toString() {
		String x = "" ;
		
		if (! arguments.isEmpty())
		x = arguments.get(0).toString() ;
		
		if ( arguments.size() >= 1 ) {
			for (int i = 1 ; i < arguments.size() ; i++ ) {
				x += "," + arguments.get(i).toString() ;
			}
			return "(" + toke.toString() + callee.toString() + "(" + x + ")" + ")" ;
		}
		
		return "(" + toke.toString() + callee.toString() + "(" + ")" + ")" ;
	}
	
}
