/**
  * Default implementation of the Visitor interface. 
  * The default traversal provided is depth first.
  * 
  * @author  Francisco Ortin
  */

package visitor;

import ast.Program;
import ast.expressions.Arithmetic;
import ast.expressions.IntLiteral;
import ast.expressions.RealLiteral;
import ast.expressions.Variable;
import ast.statements.Assignment;
import ast.statements.Statement;
import ast.statements.VarDefinition;
import ast.statements.Write;
import ast.types.ErrorType;
import ast.types.IntType;
import ast.types.RealType;

public class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {

	@Override
	public TR visit(Program program, TP param) {
		for(VarDefinition varDefinition: program.getVarDefinitions())
			varDefinition.accept(this, param);
		for(Statement statement: program.getStatements())
			statement.accept(this, param);
		return null;
	}

	@Override
	public TR visit(Variable variable, TP param) {
		return null;
	}

	@Override
	public TR visit(IntLiteral intLiteral, TP param) {
		return null;
	}

	@Override
	public TR visit(RealLiteral realLiteral, TP param) {
		return null;
	}

	@Override
	public TR visit(Assignment assignment, TP param) {
		assignment.getLeftHandSide().accept(this, param);
		assignment.getRightHandSide().accept(this, param);
		return null;
	}


	@Override
	public TR visit(Write write, TP param) {
		write.getExpression().accept(this, param);
		return null;
	}

	@Override
	public TR visit(VarDefinition varDefinition, TP param) {
		varDefinition.getType().accept(this, param);
		return null;
	}


	@Override
	public TR visit(IntType intType, TP param) {
		return null;
	}

	@Override
	public TR visit(ErrorType errorType, TP param) {
		return null;
	}

	@Override
	public TR visit(RealType realType, TP param) {
		return null;
	}

	@Override
	public TR visit(Arithmetic arithmetic, TP param) {
		arithmetic.getOperand1().accept(this, param);
		arithmetic.getOperand2().accept(this, param);
		return null;
	}

}
