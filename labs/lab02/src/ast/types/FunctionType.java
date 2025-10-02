package ast.types;

import ast.statements.VarDefinition;
import visitor.Visitor;

import java.util.ArrayList;

public class FunctionType extends AbstractType {

    private final Type returnType;
    private final ArrayList<VarDefinition> args;
//    private static final FunctionType instance = new FunctionType();

//    public static FunctionType getInstance() {
//        return instance;
//    }

    public FunctionType(Type returnType, ArrayList<VarDefinition> args) {
        this.returnType = returnType;
        this.args = args;
    }

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
