/**
 * Default implementation of expressions.
 * 
 * @author  Francisco Ortin
 */

package ast.expressions;

import ast.AbstractLocatable;
import ast.types.Type;

abstract class AbstractExpression extends AbstractLocatable implements Expression {

	public AbstractExpression(int line, int column) {
		super(line, column);
	}

	private Type type;
	
	@Override 
	public Type getType() {
		return this.type;
	}
	
	@Override
	public void setType(Type type) {
		this.type = type;
	}
	
}
