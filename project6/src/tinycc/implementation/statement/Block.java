package tinycc.implementation.statement;

import java.util.List;

import tinycc.diagnostic.Locatable;

public class Block extends Statement{

	private Locatable loc ;
	private List<Statement> statements ;
	
	
	public Locatable getLoc() {
		return loc;
	}


	public List<Statement> getStatements() {
		return statements;
	}

	public Block(Locatable loc, List<Statement> statements) {
		super();
		this.loc = loc;
		this.statements = statements;
	}

	@Override
	public String toString() {
		String s = "" ;
			if (!statements.isEmpty()) {
				for (int i = 0 ; i < statements.size() ; i++ ) {
				s += statements.get(i).toString() ;
				}
				return "{" + s + "}" ;
		} else return "{}" ;
	}

}
