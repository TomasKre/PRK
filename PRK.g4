grammar PRK;

syntax : file;
file : line*;
line : declarationPRK NL
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
charPRK : '\'' (ZERO | ONE | NONZERO | HEXALPHA) '\''; //ok
stringPRK : '"' (ZERO | ONE | NONZERO | HEXALPHA | DOT | WS | US | NL | SYMBOL)* '"'; //ok
expressionPRK : LPAR WS* expressionPRK WS* RPAR
              | expressionPRK WS* (POW | SQR) WS* expressionPRK
              | expressionPRK WS* (MUL | DIV) WS* expressionPRK
              | expressionPRK WS* (ADD | SUB) WS* expressionPRK
              | WS* integerPRK WS*
              | WS* floatPRK WS*
              | WS* (HEXALPHA | ALPHA | US)+ WS*
              ;
assignmentToVarPRK : (HEXALPHA | ALPHA | US)* WS* ASS WS* expressionPRK;
declarationPRK: declareBooleanPRK | declareIntegerPRK | declareFloatPRK | declareCharPRK | declareStringPRK;
declareBooleanPRK : BOOL WS* (HEXALPHA | ALPHA | US)* WS* ASS WS* booleanPRK;
declareIntegerPRK : BOOL WS* (HEXALPHA | ALPHA | US)* WS* ASS WS* integerPRK;
declareFloatPRK : BOOL WS* (HEXALPHA | ALPHA | US)* WS* ASS WS* floatPRK;
declareCharPRK : BOOL WS* (HEXALPHA | ALPHA | US)* WS* ASS WS* charPRK;
declareStringPRK : BOOL WS* (HEXALPHA | ALPHA | US)* WS* ASS WS* stringPRK;

ZERO : '0';
ONE : '1';
NONZERO : '1'..'9';
SIGN : '+' | '-';
HEXAPREFIX : '🅰';
BINPREFIX : '🅱';
HEXALPHA : 'a'..'f' | 'A'..'F';
ALPHA: 'a'..'z' | 'A'..'Z';
DOT : '.';
WS : ' ';
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