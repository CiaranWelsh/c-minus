/**
 * Generic type for any AST node. Any node should provide its line and column in the source program.
 * @see The default implementation in AbstractASTNode
 * 
 * @author  Francisco Ortin
 */

package ast;

import visitor.Visitor;

public interface ASTNode {

	/**
	 * Visitor pattern accept method.
	 * @param <TP> Context type - contextual information passed down during AST traversal (e.g., symbol table, scope, config)
	 * @param <TR> Result type - the value computed from visiting this node (e.g., type info, generated code, validation result)
	 */
	public abstract <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param);

}

