package tinycc.implementation.statement;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.Expression;

public class ExpStat extends Statement{

	private Locatable loc ;
	private Expression expression ;
	
	public ExpStat(Locatable loc, Expression expression) {
		super();
		this.loc = loc;
		this.expression = expression;
	}
	
	public Locatable getLoc() {
		return loc;
	}

	public Expression getExpression() {
		return expression;
	}

	@Override
	public String toString() {
		if ( loc == null) return null;
		else return expression.toString() + ";" ;
	}

}
