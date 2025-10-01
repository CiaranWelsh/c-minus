package ast;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

import introspector.view.IntrospectorView;
import introspector.model.IntrospectorModel;

import java.util.*;

public class ASTTest {

	/**
	 * Builds an AST and shows it with the Introspector tool.
	 * The input program is:
	 *   void main() { 
	 *     int a;
	 *     double b;
	 *     read a; 
	 *     b = (double)a + b*2.2; 
	 *     write b;
	 *   }
	 */
	private static Program createAST() {
		// * Line 2
		VarDefinition varDef1 = new VarDefinition(2, 3, "a", IntType.getInstance());
		// * Line 3
		VarDefinition varDef2 = new VarDefinition(3, 3, "b", RealType.getInstance());
		// * Line 4
		Read read = new Read(4, 3, new Variable(4, 8, "a"));
		// * Line 5
		Assignment assignment = new Assignment(5, 3,
				new Variable(5, 3, "b"),
				new Arithmetic(5, 3, new Cast(5, 7, RealType.getInstance(), new Variable(5, 15, "a")),
						"+",
						new Arithmetic(5, 19, new Variable(5, 19, "b"),
								"*",
								new RealLiteral(5, 21, 2.2))
						)
				);
		// * Line 6
		Write write = new Write(6, 3, new Variable(6, 9, "b"));
		// * We build and return the AST
		FunctionType mainType = new FunctionType(VoidType.getInstance(), new ArrayList<>());
		List<Statement> mainBody = new ArrayList<Statement>(Arrays.asList(varDef1, varDef2, read, assignment, write));
		FuncDefinition funcDefinition = new FuncDefinition(1, 1, mainType, "main", mainBody);
		return new Program(new ArrayList<>(Arrays.asList(funcDefinition)));
	}

	public static void main(String[] args) {
		IntrospectorModel model = new IntrospectorModel("Program", createAST());
		new IntrospectorView("Introspector", model);
	}
}
