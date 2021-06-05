package tinycc.implementation.type;

import tinycc.parser.TokenKind;

public class BaseTyp extends Type{

	private TokenKind kind ;
	
	public TokenKind getKind() {
		return kind;
	}

	public BaseTyp(TokenKind kind) {
		super();
		this.kind = kind;
	}

	@Override
	public String toString() {
		 return kind.toString() ;
	}

}
