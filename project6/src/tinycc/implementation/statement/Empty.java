package tinycc.implementation.statement;

import tinycc.diagnostic.Locatable;

public class Empty extends Statement {

	private Locatable loc ;
	
	public Locatable getLoc() {
		return loc;
	}
	
	public Empty(Locatable loc) {
		super();
		this.loc = loc;
	}

	@Override
	public String toString() {
		if (loc == null) return null;
		else return ";" ;
	}
	

}
