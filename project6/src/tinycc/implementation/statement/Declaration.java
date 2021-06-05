package tinycc.implementation.statement;

import tinycc.implementation.expression.Expression;
import tinycc.implementation.type.Type;
import tinycc.parser.Token;

public class Declaration extends Statement {

	private Type type ;
	private Token name ;
	private Expression init ;
	
	public Type getType() {
		return type;
	}


	public Token getName() {
		return name;
	}


	public Expression getInit() {
		return init;
	}

	public Declaration(Type type, Token name, Expression init) {
		super();
		this.type = type;
		this.name = name;
		this.init = init;
	}


	@Override
	public String toString() {
		if (init != null) return type.toString() + name.toString() + "=" + init.toString() + ";" ;
		else return type.toString() + name.toString() + ";" ;
	}
	

}
