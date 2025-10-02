/**
  * AST node representing a program: a collection of variable definitions followed by a
  * collection of statements.
  * 
  * @author  Francisco Ortin
  */

package ast;

import ast.statements.FuncDefinition;
import ast.statements.Statement;
import ast.statements.VarDefinition;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program implements ASTNode {

	/**
	 * Global variables
	 */
	private List<VarDefinition> varDefinitions = new ArrayList<>();
	public List<VarDefinition> getVarDefinitions() {
		return this.varDefinitions;
	}

    /**
	 * function definitions
	 */
	private final List<FuncDefinition> funcDefinitions;
	public List<FuncDefinition> getFuncDefinitions() {
		return this.funcDefinitions;
	}

	public Program(List<VarDefinition> varDefinitions, List<FuncDefinition> funcDefinitions) {
		this.varDefinitions = varDefinitions;
		this.funcDefinitions= funcDefinitions;
	}

	public Program(List<FuncDefinition> funcDefinitions) {
		this.funcDefinitions= funcDefinitions;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
	
	@Override
	public String toString() {
		return String.format("Program with %d variable definitions and %d funcDefinitions.",
								this.varDefinitions.size(), this.funcDefinitions.size());
	}

}
