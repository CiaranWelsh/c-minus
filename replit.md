# Overview

This repository contains a C-- (Cmm) language compiler implementation using ANTLR for parsing and lexical analysis. The project demonstrates a complete compiler pipeline that takes C-- source code as input and generates assembly-like intermediate code that can be executed. The system includes variable definitions for integers and doubles, basic arithmetic operations, assignment statements, and write operations. The compiler transforms high-level C-- constructs into stack-based virtual machine instructions that run on the TextVM.

**Current Status**: Fully functional - the project has been successfully set up in Replit environment with Java 19 (GraalVM), ANTLR 4.13.2, and Mono for executing the generated assembly code.

# User Preferences

Preferred communication style: Simple, everyday language.

# System Architecture

## Parser and Lexer Design
The project uses ANTLR (ANother Tool for Language Recognition) to define both grammar rules and lexical analysis for the C-- language subset. The grammar is specified in `src/parser/Cmm.txt` which defines the syntax rules for programs, variable definitions, statements, and expressions.

## Abstract Syntax Tree (AST) Structure
The parser generates an AST using custom classes from the `ast` and `ast.types` packages. Key AST nodes include:
- **Program**: Root node containing variable definitions and statements
- **VarDefinition**: Represents variable declarations with type information
- **Statement types**: Write operations and assignments
- **Expression types**: Variables, literals (int/real), and arithmetic operations
- **Type system**: Supports integer and double data types

## Code Generation Architecture
The compiler follows a multi-pass approach:
1. **Parsing phase**: Converts source code into AST using ANTLR-generated parser
2. **Code generation phase**: Traverses AST to produce stack-based assembly code
3. **Output format**: Generates commented assembly with line number references and variable offset tracking

## Stack-Based Virtual Machine Model
The generated code targets a stack-based virtual machine with operations like:
- Memory operations: `pusha` (push address), `loadi`/`loadf` (load values), `storei`/`storef` (store values)
- Arithmetic operations: `addi`/`addf`, `muli` (multiply integers)
- I/O operations: `outi`/`outf` (output integers/floats)
- Stack operations: `pushi`/`pushf` (push immediate values)

## Memory Management
Variables are allocated using offset-based addressing where each variable type has a specific size (integers: 2 bytes, doubles: presumed larger). The compiler tracks variable offsets automatically during code generation.

# External Dependencies

## ANTLR Framework
- **Purpose**: Parser and lexer generation from grammar specifications
- **Version**: 4.13.2
- **Usage**: Generates Java classes for parsing C-- language constructs
- **Status**: Fully configured and working

## Mono Framework
- **Purpose**: Executes Windows .NET applications on Linux
- **Usage**: Runs the TextVM.exe virtual machine to execute generated assembly code
- **Status**: Successfully installed and operational

## Custom AST Libraries
- **ast package**: Contains core AST node implementations
- **ast.types package**: Provides type system implementation for the language
- **LexerHelper utility**: Handles conversion of lexemes to appropriate data types

## Java Runtime Environment
- **Purpose**: Host platform for the compiler implementation
- **Version**: OpenJDK 19.0.2 with GraalVM CE 22.3.1
- **Features used**: Collections (ArrayList), object-oriented programming constructs
- **Integration**: ANTLR generates Java code that integrates with custom AST classes

# Recent Changes

- **September 16, 2025**: Initial Replit environment setup completed
  - Installed Java 19 with GraalVM
  - Generated ANTLR parser/lexer files from grammar
  - Successfully compiled all Java source files
  - Installed Mono to run TextVM executable
  - Created `compiler_demo` workflow that demonstrates full compilation and execution pipeline
  - Configured deployment for scheduled runs
  - Verified complete functionality: C-- source → assembly code → execution results