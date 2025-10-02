package ast.expressions;

import ast.types.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression {


    private final Type newType;
    private final Variable dest;

    public Cast(int line, int column, Type newType, Variable dest) {
        super(line, column);
        this.newType = newType;
        this.dest = dest;
    }

    public Type getNewType() {
        return newType;
    }

    public Variable getDest() {
        return dest;
    }

    @Override
    public <Context, ResultType> ResultType accept(Visitor<Context, ResultType> visitor, Context param) {
        return visitor.visit(this, param);
    }
}
