package tinycc.implementation.expression;

import tinycc.parser.Token;

public class PrimaryExp extends Expression {

	private Token took ;
	
	
	
	
	public PrimaryExp(Token took) {
		super();
		this.took = took;
	}


	public Token getTook () {
		return this.took ;
	}


	@Override
	public String toString() { 
		return this.took.toString() ;
	}

	
	
	
}
