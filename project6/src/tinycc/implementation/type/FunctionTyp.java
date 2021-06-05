package tinycc.implementation.type;

import java.util.List;

public class FunctionTyp extends Type{

	private Type returnType;
	private List<Type> parameters;
	
	public Type getReturnType() {
		return returnType;
	}

	public List<Type> getParameters() {
		return parameters;
	}

	public FunctionTyp(Type returnType, List<Type> parameters) {
		super();
		this.returnType = returnType;
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		String p ;
		if (parameters.isEmpty()) return returnType.toString()+"()" ;
		else {
			p =  parameters.get(0).toString() ;
			for ( int i = 1 ; i < parameters.size() ; i++ ) {
				p += "," + parameters.get(i) ;
			}
			return returnType.toString() + "(" + p + ")" ;
		}
	}

}
