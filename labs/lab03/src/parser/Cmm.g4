grammar Cmm;


/*
Main program
*/

program: ( CHAR_CONSTANT
        | ID
        | REAL_CONSTANT
        | INT_CONSTANT
    )+
    ;


//====================================================
//    Lexer
//====================================================
/*
Character constants
*/

CHAR_CONSTANT: '\'' (SAFE_CHAR  | ESCAPE_SEQUENCE) '\''
    ;

// Any character EXCPET the following (using '|' as delimiter)
//      ' | \ | CR | CF
fragment SAFE_CHAR: ~['\\\r\n]          // or '\'' | '\' | '\r' | '\n'
    ;

// '\n'  '\t'  '\''  '\\'  '\0'  '\126'
fragment ESCAPE_SEQUENCE: '\\' ( [nt'\\]  | [0-9]+ )
    ;

/*
Identifier
*/

ID: [_A-Za-z]+[_A-Za-z0-9]*
    ;


/*
Real constants
*/

REAL_CONSTANT: [0-9]* '.' [0-9]*  // 12.3, 2. , .34
    | [0-9]* '.' [0-9]* [Ee] '-'?  [0-9]+ // 34.12E-3  34.2e-3  .3e-4  .3e4
    | [0-9]* [Ee] '-'? [0-9]+  // 4e-32 4e3
    ;

/*
Integer constant
*/
// YES: 0 | 1 | 12 | 123
// NO : 00
INT_CONSTANT : '0'
    | [1-9][0-9]*
    ;

/*
 do the following later if needed:

  Maybe replace INT_CONSTANT
 with a non-terminal and match for INT_CONSTANT AND NOT INT_ERROR;
 the INT_CONSTANT rule alone does not error
 on 002 (for instance) but seems to match just "0"
 (using the ANTLR Preview tool, jetbrains). So
 explicitely match the error constants.
INVALID_INT_CONSTANT : '0'[0-9]+ ;
*/

/*
Comments
*/

MULTI_LINE_COMMENT: '/*'  .*?  '*/' -> skip
    ; // Could also use (~[*/]).* instead of .?
SINGLE_LINE_COMMENT: '//' ~[\n\r]* -> skip
    ;
WHITE_SPACE: [ \t\n\r]+ -> skip
    ;









//program: func_definition
//    | var_definition
//    ;
//
//func_definition: type  ID()args
//    ;
//
//type: INT_TYPE
//    | CHAR_TYPE
//    | REAL_TYPE
//    ;




//INT_CONSTANT: [0-9]+
//            ;
//IDENTIFIER: [_A-Za-z]+
//    ;
//
//WS  :   (' ' | '\t' | '\r'| '\n' | '\r' '\n' ) -> channel(HIDDEN)
//    ;
//
//COMMENT: '/' '/'
//    ;