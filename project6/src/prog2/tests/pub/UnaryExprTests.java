package prog2.tests.pub;

import org.junit.Test;

import tinycc.implementation.expression.Expression;
import tinycc.parser.TokenKind;
import prog2.tests.CompilerTests;

public class UnaryExprTests extends CompilerTests {
	public static String getCategory() {
		return "public";
	}

	public static String getExercise() {
		return "AST";
	}


	@Test
	public void testSizeof() {
		final ASTMaker   m = new ASTMaker("testSizeof");
		final Expression a = m.createNumber("42");
		final Expression e = m.createUnary(TokenKind.SIZEOF, a);
		assertEqualsNormalized("(sizeof42)", e.toString());
	}

	@Test
	public void testAddress() {
		final ASTMaker   m = new ASTMaker("testAddress");
		final Expression a = m.createIdentifier("a");
		final Expression e = m.createUnary(TokenKind.AND, a);
		assertEqualsNormalized("(&a)", e.toString());
	}

	@Test
	public void testIndirection() {
		final ASTMaker   m = new ASTMaker("testIndirection");
		final Expression a = m.createIdentifier("a");
		final Expression e = m.createUnary(TokenKind.ASTERISK, a);
		assertEqualsNormalized("(*a)", e.toString());
	}
}
