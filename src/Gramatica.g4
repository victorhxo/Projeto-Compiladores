grammar Gramatica;

programa: declaracoes algoritmo EOF;
declaracoes: DEC declaracao+;
declaracao: TIPO ID;
algoritmo: ALG instrucoes;
instrucoes: operacoes*;
operacoes: atribuicao | leitura | escrita | condicional | repeticao;
atribuicao: ATR (ID | NUM | expressao) IGUAL ID;
leitura: LER ID;
escrita: ESC ( ID | NUM | expressao);
condicional: SE expressao OP_REL expressao ENTAO instrucoes SENAO instrucoes;
repeticao: ENQUANTO expressao OP_REL expressao instrucoes;
expressao: operando operacao_cauda | operando;
operando: NUM | ID;
operacao_cauda: OP_ARIT operando(operacao_cauda)*;


DEC: 'DECLARACOES';
ALG: 'ALGORITMO';
TIPO: 'zInt' | 'rFloat' | 'sLinha';
ATR: '->';
IGUAL: '=';
SE: 'SE';
SENAO: 'SENAO';
ENTAO: 'ENTAO';
ENQUANTO: 'ENQWHILE';
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
