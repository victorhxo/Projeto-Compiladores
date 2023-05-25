grammar Gramatica;

DEC: 'DECLARACOES';
ALG: 'ALGORITIMO';
TIPO: 'zInt' | 'rFloat';
ATR: '->';
IGUAL: '=';
AP: '(';
FP: ')';
ESC: 'out';
LER: 'in';
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
OP_ARIT: '+' | '-' | '*' | '/';
OP_REL: '>' | '<'| '==' | '>=' | '=<' | '!=';
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]* ->skip;
ErrorChar: . ;
