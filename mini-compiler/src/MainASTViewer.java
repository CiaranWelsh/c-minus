/**
 * AST Viewer - Shows the Abstract Syntax Tree structure in text format
 * This replaces the GUI introspector for debugging and learning purposes.
 * @author Assistant
 */

import org.antlr.v4.runtime.*;
import parser.*;
import semantic.*;
import ast.*;
import ast.types.*;
import errorhandler.*;
import visitor.*;

public class MainASTViewer {
    
    public static void main(String... args) throws Exception {
        if (args.length < 1) {
            System.err.println("Please, pass me the input file name.");
            return;
        }
        
        // Creates lexer and parser
        CharStream input = CharStreams.fromFileName(args[0]);
        CmmLexer lexer = new CmmLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CmmParser parser = new CmmParser(tokens);
        Program ast = parser.program().ast;
        
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Program with syntax errors. AST may be incomplete.");
        }
        
        // Run semantic analysis
        ast.accept(new IdentificationVisitor(), null);
        ast.accept(new TypeCheckingVisitor(), null);
        
        if (ErrorHandler.getErrorHandler().anyError()) {
            ErrorHandler.getErrorHandler().showErrors(System.err);
            System.err.println("Program with semantic errors.");
        }
        
        // Display the AST structure
        System.out.println("=== ABSTRACT SYNTAX TREE ===");
        System.out.println("Input file: " + args[0]);
        System.out.println();
        
        ASTViewer viewer = new ASTViewer();
        ast.accept(viewer, 0);
    }
    
    // Custom visitor to print AST structure
    static class ASTViewer implements Visitor<Integer, Void> {
        
        private void printIndent(int level) {
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
        }
        
        @Override
        public Void visit(Program program, Integer level) {
            printIndent(level);
            System.out.println("Program:");
            
            printIndent(level + 1);
            System.out.println("Variable Definitions:");
            for (VarDefinition varDef : program.getVarDefinitions()) {
                varDef.accept(this, level + 2);
            }
            
            printIndent(level + 1);
            System.out.println("Statements:");
            for (Statement stmt : program.getStatements()) {
                stmt.accept(this, level + 2);
            }
            
            return null;
        }
        
        @Override
        public Void visit(VarDefinition varDef, Integer level) {
            printIndent(level);
            System.out.println("VarDefinition: " + varDef.getName() + " : " + varDef.getType());
            return null;
        }
        
        @Override
        public Void visit(Assignment assignment, Integer level) {
            printIndent(level);
            System.out.println("Assignment:");
            
            printIndent(level + 1);
            System.out.println("Left:");
            assignment.getLeft().accept(this, level + 2);
            
            printIndent(level + 1);
            System.out.println("Right:");
            assignment.getRight().accept(this, level + 2);
            
            return null;
        }
        
        @Override
        public Void visit(Write write, Integer level) {
            printIndent(level);
            System.out.println("Write:");
            write.getExpression().accept(this, level + 1);
            return null;
        }
        
        @Override
        public Void visit(Arithmetic arithmetic, Integer level) {
            printIndent(level);
            System.out.println("Arithmetic (" + arithmetic.getOperator() + "):");
            
            printIndent(level + 1);
            System.out.println("Left:");
            arithmetic.getLeft().accept(this, level + 2);
            
            printIndent(level + 1);
            System.out.println("Right:");
            arithmetic.getRight().accept(this, level + 2);
            
            return null;
        }
        
        @Override
        public Void visit(Variable variable, Integer level) {
            printIndent(level);
            System.out.println("Variable: " + variable.getName() + 
                             (variable.getType() != null ? " [type: " + variable.getType() + "]" : ""));
            return null;
        }
        
        @Override
        public Void visit(IntLiteral intLiteral, Integer level) {
            printIndent(level);
            System.out.println("IntLiteral: " + intLiteral.getValue() + 
                             (intLiteral.getType() != null ? " [type: " + intLiteral.getType() + "]" : ""));
            return null;
        }
        
        @Override
        public Void visit(RealLiteral realLiteral, Integer level) {
            printIndent(level);
            System.out.println("RealLiteral: " + realLiteral.getValue() + 
                             (realLiteral.getType() != null ? " [type: " + realLiteral.getType() + "]" : ""));
            return null;
        }
        
        // Type visitors
        @Override
        public Void visit(IntType intType, Integer level) {
            return null;
        }
        
        @Override
        public Void visit(RealType realType, Integer level) {
            return null;
        }
        
        @Override
        public Void visit(ErrorType errorType, Integer level) {
            return null;
        }
    }
}