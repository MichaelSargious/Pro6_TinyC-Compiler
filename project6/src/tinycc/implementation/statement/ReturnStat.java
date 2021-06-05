package tinycc.implementation.statement;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.Expression;

public class ReturnStat extends Statement{

	private Locatable loc;
	private Expression expression;
	
	public ReturnStat(Locatable loc, Expression expression) {
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
		if (loc != null) {
			if (expression != null) return "return" + expression.toString() + ";" ; 
			else return "return" + ";" ;
		}else return null;
	}

}
