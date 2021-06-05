package tinycc.implementation.statement;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.Expression;

public class IfStat extends Statement{

	private Locatable loc;
	private Expression condition;
	private Statement consequence;
	private Statement alternative ;
	
	public Locatable getLoc() {
		return loc;
	}

	public Expression getCondition() {
		return condition;
	}

	public Statement getConsequence() {
		return consequence;
	}

	public Statement getAlternative() {
		return alternative;
	}
	
	public IfStat(Locatable loc, Expression condition, Statement consequence, Statement alternative) {
		super();
		this.loc = loc;
		this.condition = condition;
		this.consequence = consequence;
		this.alternative = alternative;
	}

	@Override
	public String toString() {
		if ( loc != null ) {
			if (alternative == null) return "if" + "(" + condition.toString() + ")" + consequence.toString() ;
			else return "if" + "(" + condition.toString() + ")" + consequence.toString() + "else" + alternative.toString() ;	
	    }else return null;
	}

}
