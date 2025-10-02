package ast.statements;

import ast.AbstractLocatable;
import ast.types.FunctionType;
import visitor.Visitor;

import java.util.ArrayList;

public class FuncDefinition extends AbstractLocatable {

    FunctionType fnType;
    String functionIdentifier;
    ArrayList<Statement> fnBody;

    public FuncDefinition(
            int line,
            int col,
            FunctionType fnType,
            String functionIdentifier,
            ArrayList<Statement> body
    ) {
        super(line, col);
        this.fnType = fnType;
        this.functionIdentifier = functionIdentifier;
        this.fnBody = body;
    }

    @Override
    public <Context, ResultType> ResultType accept(Visitor<Context, ResultType> visitor, Context param) {
        return null;
    }
}

class FunctionBody {
    public ArrayList<VarDefinition> localVariables = new ArrayList<>();
    public ArrayList<Statement> statements = new ArrayList<>();

    public FunctionBody(ArrayList<VarDefinition> localDefinitions, ArrayList<Statement> statements) {
        this.localVariables = localDefinitions;
        this.statements = statements;
    }
}
