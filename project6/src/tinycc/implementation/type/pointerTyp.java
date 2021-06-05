package tinycc.implementation.type;

public class pointerTyp extends Type{

	private Type pointsTo ;
	
	public Type getPointsTo() {
		return pointsTo;
	}

	public pointerTyp(Type pointsTo) {
		super();
		this.pointsTo = pointsTo;
	}

	@Override
	public String toString() {
		return pointsTo.toString() + "*";
	}
	
}
