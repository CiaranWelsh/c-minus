package ast.statements;

import ast.AbstractLocatable;
import ast.types.Type;
import visitor.Visitor;

import java.util.ArrayList;

public class FuncDefinition extends AbstractLocatable {

    Type returnType;
    String functionIdentifier;
    ArrayList<VarDefinition> args;
    FunctionBody functionBody;

    public FuncDefinition(
            int line,
            int col,
            Type returnType,
            String functionIdentifier,
            ArrayList<VarDefinition> args,
            ArrayList<VarDefinition> localDefinitions,
            ArrayList<Statement> statements
    ) {
        super(line, col);
        this.returnType = returnType;
        this.functionIdentifier = functionIdentifier;
        this.args = args;
        this.functionBody = new FunctionBody(localDefinitions, statements);
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
