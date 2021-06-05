package tinycc.implementation.statement;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.Expression;

public class WhileStat extends Statement{

	private Locatable loc ;
	private Expression condition;
	private Statement body ;

	public WhileStat(Locatable loc, Expression condition, Statement body) {
		super();
		this.loc = loc;
		this.condition = condition;
		this.body = body;
	}
	
	public Locatable getLoc() {
		return loc;
	}

	public Expression getCondition() {
		return condition;
	}

	public Statement getBody() {
		return body;
	}

	@Override
	public String toString() {
		if (loc !=null) {
			return "while" + "(" + condition.toString() + ")" +  body.toString() ; 
		}else return null;
	}

}
