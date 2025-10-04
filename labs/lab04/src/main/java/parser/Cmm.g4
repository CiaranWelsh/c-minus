grammar Cmm;


/*
Main program
*/

program: variable_declaration*  function_declaration+
    ;
function_declaration: type ID '(' ( type ID (',' type ID )?  )? ')' '{' (variable_declaration* | statement* ) '}'
    ;
variable_declaration: type ID ';'
    ;
type: BUILTIN_TYPE ( '[' INT_CONSTANT ']' )*
    ;



//=======================
// Statements
//=======================

/*
assignment
function calls
if
ifelse
read
write
while
return
*/
statement: expression '=' expression  ';'   // assignment
    | ID '(' ( expression (',' expression )*  )? ')' ';'   // function invocation
    | 'if' '(' expression ')' '{' statement* '}' ('else' '{' statement* '}' )?
    | 'while' '(' expression ')' '{' statement* '}'
    | 'read' expression
    | 'write' expression
    | 'return' expression
    ;



//=======================
// Expressions
//=======================
expression: '(' expression ')'          // grouping
  | '(' type ')' expression             // cast
  | ID ('[' expression ']')+            // Array access
  | '-' expression                      // unary
  | expression ('*'| '/' | '%' ) expression
  | expression ('+' |'-' ) expression
  | expression ('>' | '<' | '>=' | '<=' | '==' | '!=') expression
  | expression ('&&' |'||' ) expression

  | ID
  | INT_CONSTANT
  | REAL_CONSTANT
  | CHAR_CONSTANT
  ;


//=============================
// Lexer
//=============================

BUILTIN_TYPE : 'double'
    | 'int'
    | 'char'
    | 'error'
    | 'void'
    ;

/*
Character constants
*/
// Any character EXCPET the following (using '|' as delimiter)
//      ' | \ | CR | CF
fragment SAFE_CHAR: ~['\\\r\n]          // or '\'' | '\' | '\r' | '\n'
    ;
// '\n'  '\t'  '\''  '\\'  '\0'  '\126'
fragment ESCAPE_SEQUENCE: '\\' ( [nt'\\]  | [0-9]+ )
    ;
CHAR_CONSTANT: '\'' (SAFE_CHAR  | ESCAPE_SEQUENCE) '\''
    ;
ID: [_A-Za-z]+[_A-Za-z0-9]*
    ;
REAL_CONSTANT: [0-9]* '.' [0-9]*  // 12.3, 2. , .34
    | [0-9]* '.' [0-9]* [Ee] '-'?  [0-9]+ // 34.12E-3  34.2e-3  .3e-4  .3e4
    | [0-9]* [Ee] '-'? [0-9]+  // 4e-32 4e3
    ;
// YES: 0 | 1 | 12 | 123
// NO : 00
INT_CONSTANT : '0'
    | [1-9][0-9]*
;
OPEN_PAREN      : '(';
CLOSE_PAREN     : ')';
OPEN_BRACKET    : '[';
CLOSE_BRACKET   : ']';
OPEN_BRACE      : '{';
CLOSE_BRACE     : '}';
PLUS            : '+';
MINUS           : '-';
MUL             : '*';
DIV             : '/';
MOD             : '%';
AND             : '&&';
OR              : '||';
NOT             : '!';
LT              : '<';
GT              : '>';
LE              : '<=';
GE              : '>=';
NE              : '!=';
EQ              : '==';
MULTI_LINE_COMMENT: '/*'  .*?  '*/' -> skip;  // Could also use (~[*/]).* instead of .?
SINGLE_LINE_COMMENT: '//' ~[\n\r]* -> skip;
WHITE_SPACE: [ \t\n\r]+ -> skip;


