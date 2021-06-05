package tinycc.implementation;

import tinycc.implementation.type.Type;
import tinycc.parser.Token;

public class ExternalDek {
	private Type type;
	private Token name;
	
	public ExternalDek(Type type, Token name) {
		super();
		this.type = type;
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public Token getName() {
		return name;
	}
	
}
