package ast.types;

import visitor.Visitor;

public class VoidType extends AbstractType{
    @Override
    public <Context, ResultType> ResultType accept(Visitor<Context, ResultType> visitor, Context param) {
        return null;
    }

    @Override
    public int numberOfBytes() {
        throw new RuntimeException("Do not call numberOfBytes on error ast.types");
    }

    @Override
    public char suffix() {
        throw new RuntimeException("Do not call suffix on error ast.types");
    }
}
