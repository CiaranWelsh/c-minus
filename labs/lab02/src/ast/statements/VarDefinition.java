/**
 * AST node representing the definition of a global variable.
 *
 * @author Francisco Ortin
 */

package ast.statements;

import ast.AbstractLocatable;
import ast.types.Type;
import visitor.Visitor;

public class VarDefinition extends AbstractLocatable implements Statement {

    /**
     * The offset of the variable
     */
    private int offset;

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    private final String name;

    public String getName() {
        return this.name;
    }


    private final Type type;

    public Type getType() {
        return this.type;
    }

    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %s; // offset: %d.", this.getType(), this.getName(), this.getOffset());
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }


}
	

