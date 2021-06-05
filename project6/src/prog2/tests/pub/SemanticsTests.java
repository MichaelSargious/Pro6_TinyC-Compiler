package prog2.tests.pub;

import static org.junit.Assert.fail;

import java.io.StringReader;

import org.junit.Test;

import tinycc.parser.Lexer;
import prog2.tests.CompilerTests;
import prog2.tests.FatalCompilerError;

public class SemanticsTests extends CompilerTests {
	public static String getCategory() {
		return "public";
	}

	public static String getExercise() {
		return "Semantics";
	}

	private void runIntegrationTest(final String name, final String code) {
		final StringReader r = new StringReader(code);
		final Lexer        l = new Lexer(diagnostic, r, name);
		compiler.parseTranslationUnit(l);
		compiler.checkSemantics();
	}
	
	@Test
	public void testTypeCheckPositive() {
		runIntegrationTest("testTypeCheckPositive", "void f() { 42 + 1337; }");
	}

	@Test
	public void testTypeCheckNegative() {
		final String name  = "testTypeCheckNegative";
		try {
			runIntegrationTest(name, "int foo() { return 1 + x; }");
			fail("checkSemantics didn't fail.");
		} catch (final FatalCompilerError exc) {
			checkLocation(exc, name, 1, 24);
		}
	}

	@Test
	public void testCompleteProgram() {
		final String code = "" +
				"void swap(int *a, int *b);\n" +
				"int foo(int x, int y) {\n" +
				"	int z;\n" +
				"	x = x + (y * z) / sizeof(z) - (0 - 5);\n" +
				"  	y = 1337;\n" +
				"  	if ((z = 1000) < x) {\n" + /* yes, this is a valid expression */
				"    return x;\n" +
				"  	} else {\n" +
				"    swap(&x, &y);\n" +
				"    return foo(x, y);\n" +
				"  	}\n" +
				"}\n" +
				"void swap(int *a, int *b) {\n" +
				"  int t = *a;\n" +
				"  *b = *a;\n" +
				"  *a = t;\n" +
				"}\n" +
				"int main() {\n" +
				"	char *v;\n" +
				"	char w;\n" +
				"  	v = \"foobar\";\n" +
				"  	w = *(v + 3);\n" +
				"  	return foo(42, 42);\n" +
				"}\n";
		runIntegrationTest("testCompleteProgram", code);
	}
}
