package ast;

import visitor.Visitor;

public interface ASTNode {

    /**
     * Visitor pattern accept method.
     * @param <Context> Context type - contextual information passed down during AST traversal (e.g., symbol table, scope, config)
     * @param <ResultType> Result type - the value computed from visiting this node (e.g., type info, generated code, validation result)
     */
    public abstract <Context, ResultType> ResultType accept(Visitor<Context, ResultType> visitor, Context param);



}
