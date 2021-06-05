package tinycc.implementation;

import java.util.List;

import tinycc.implementation.statement.Statement;
import tinycc.implementation.type.Type;
import tinycc.parser.Token;

public class FunkDef {

	private Type type;
	private Token name;
	private List<Token> parameterNames;
	private Statement body;
	public FunkDef(Type type, Token name, List<Token> parameterNames, Statement body) {
		super();
		this.type = type;
		this.name = name;
		this.parameterNames = parameterNames;
		this.body = body;
	}
	public Type getType() {
		return type;
	}
	public Token getName() {
		return name;
	}
	public List<Token> getParameterNames() {
		return parameterNames;
	}
	public Statement getBody() {
		return body;
	}
	
}
