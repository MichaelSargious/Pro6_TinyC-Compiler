package tinycc.implementation;

import java.util.List;


import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.BinaryExp;
import tinycc.implementation.expression.Expression;
import tinycc.implementation.expression.PrimaryExp;
import tinycc.implementation.expression.UnaryExp;
import tinycc.implementation.expression.callExp;
import tinycc.implementation.statement.Block;
import tinycc.implementation.statement.Declaration;
import tinycc.implementation.statement.Empty;
import tinycc.implementation.statement.ExpStat;
import tinycc.implementation.statement.IfStat;
import tinycc.implementation.statement.ReturnStat;
import tinycc.implementation.statement.Statement;
import tinycc.implementation.statement.WhileStat;
import tinycc.implementation.type.BaseTyp;
import tinycc.implementation.type.FunctionTyp;
import tinycc.implementation.type.Type;
import tinycc.implementation.type.pointerTyp;
import tinycc.parser.ASTFactory;
import tinycc.parser.Token;
import tinycc.parser.TokenKind;

public class AST_IMP implements ASTFactory {

	@Override
	public Statement createBlockStatement(Locatable loc, List<Statement> statements) {
		return new Block( loc, statements);
	}

	@Override
	public Statement createBreakStatement(Locatable loc) {
		return null;
	}

	@Override
	public Statement createContinueStatement(Locatable loc) {
		return null;
	}

	@Override
	public Statement createDeclarationStatement(Type type, Token name, Expression init) {
		return new  Declaration( type,  name,  init) ;
	}

	@Override
	public Statement createEmptyStatement(Locatable loc) {
		return new Empty(loc);
	}

	@Override
	public Statement createErrorStatement(Locatable loc) {
		return null;
	}

	@Override
	public Statement createExpressionStatement(Locatable loc, Expression expression) {
		return new ExpStat( loc,  expression) ;
	}

	@Override
	public Statement createIfStatement(Locatable loc, Expression condition, Statement consequence,
			Statement alternative) {
		return new IfStat( loc,  condition,  consequence,  alternative) ;
	}

	@Override
	public Statement createReturnStatement(Locatable loc, Expression expression) {
		return new ReturnStat( loc,  expression);
	}

	@Override
	public Statement createWhileStatement(Locatable loc, Expression condition, Statement body) {
		return new WhileStat( loc,  condition,  body);
	}

	@Override
	public Type createFunctionType(Type returnType, List<Type> parameters) {
		return new FunctionTyp( returnType,  parameters);
	}

	@Override
	public Type createPointerType(Type pointsTo) {
		return new pointerTyp( pointsTo);
	}

	@Override
	public Type createBaseType(TokenKind kind) {
		return new BaseTyp( kind);
	}

	@Override
	public Expression createBinaryExpression(Token operator, Expression left, Expression right) {
		return new BinaryExp( operator,  left,  right);
	}

	@Override
	public Expression createCallExpression(Token token, Expression callee, List<Expression> arguments) {
		return new callExp( token , callee, arguments);
	}

	@Override
	public Expression createConditionalExpression(Token token, Expression condition, Expression consequence,
			Expression alternative) {
		return null;
	}

	@Override
	public Expression createUnaryExpression(Token operator, boolean postfix, Expression operand) {
		return new UnaryExp(operator, postfix, operand);
	}

	@Override
	public Expression createPrimaryExpression(Token token) {
		return  new PrimaryExp(token) ;
	}

	@Override
	public void createExternalDeclaration(Type type, Token name) {
		new ExternalDek( type,  name) ;
	}

	@Override
	public void createFunctionDefinition(Type type, Token name, List<Token> parameterNames, Statement body) {
		new FunkDef( type,  name,  parameterNames,  body) ;
	}

}
