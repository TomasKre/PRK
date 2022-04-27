grammar PRK;

ZERO : '0';
ONE : '1';
NONZERO : '1'..'9';
SIGN : '+' | '-';
HEXAPREFIX : '🅰';
BINPREFIX : '🅱';
HEXALPHA : 'a'..'f' | 'A'..'F';
ALPHA: 'a'..'z' | 'A'..'Z';
DOT : '.';
US : '_';
NL : '\n' | '\r' | '\r\n' | '\n\r';
SYMBOL : ',' | ':' | ';' | '?' | '!' | '~' | '+' | '-' | '*' | '/' | '=';
LPAR : '▶';
RPAR : '◀';
ASS : '⬅';
MUL : '✖';
ADD : '➕';
SUB : '➖';
DIV : '➗';
POW : '✨✖';
SQR : '✨➗';
TRUE : '✔';
FALSE : '❌';
BOOL : '❓';
INT : '🔢';
FLOAT : '🔣';
CHAR : '🔡';
STRING : '🔠';
WS : (' ' | '\t')+ -> skip;
ERROR : . ;

syntax : line*;
line : declarationPRK
     | assignmentToVarPRK NL
     | NL
     ;
booleanPRK : TRUE | FALSE; //ok
integerPRK : ZERO
           | (SIGN? (ONE | NONZERO) (ZERO | ONE | NONZERO)*)
           | BINPREFIX (ZERO | ONE)+
           | HEXAPREFIX (ZERO | ONE | NONZERO | HEXALPHA)+
           ; //ok
floatPRK : SIGN? (ZERO | ONE | NONZERO)+ DOT (ZERO | ONE | NONZERO)+; //ok
charPRK : '\'' (ZERO | ONE | NONZERO | HEXALPHA | ALPHA) '\''; //ok
stringPRK : '"' (ZERO | ONE | NONZERO | HEXALPHA | ALPHA | DOT | WS | US | NL | SYMBOL)* '"'; //ok
expressionPRK : lp=LPAR expressionPRK rp=RPAR               # Parenthesis
              | expressionPRK op=(POW | SQR) expressionPRK  # PowSqr
              | expressionPRK op=(MUL | DIV) expressionPRK  # MulDiv
              | expressionPRK op=(ADD | SUB) expressionPRK  # AddSub
              | integerPRK                                  # Int
              | floatPRK                                    # Float
              | (HEXALPHA | ALPHA | US)+                    # Name
              ;
assignmentToVarPRK : (HEXALPHA | ALPHA | US)* ASS expressionPRK;
declarationPRK: declareBooleanPRK | declareIntegerPRK | declareFloatPRK | declareCharPRK | declareStringPRK;
declareBooleanPRK : BOOL (HEXALPHA | ALPHA | US)* ASS booleanPRK NL;
declareIntegerPRK : INT (HEXALPHA | ALPHA | US)* ASS integerPRK NL;
declareFloatPRK : FLOAT (HEXALPHA | ALPHA | US)* ASS floatPRK NL;
declareCharPRK : CHAR (HEXALPHA | ALPHA | US)* ASS charPRK NL;
declareStringPRK : STRING (HEXALPHA | ALPHA | US)* ASS stringPRK NL;
