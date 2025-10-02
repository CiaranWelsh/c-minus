package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;
import visitor.Visitor;

public class Read extends AbstractLocatable implements Statement {

    private final Expression expression;

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Read " + expression;
    }

    public Read(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public <Context, ResultType> ResultType accept(Visitor<Context, ResultType> visitor, Context param) {
        return null;
    }
}
