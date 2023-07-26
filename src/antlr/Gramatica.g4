grammar Gramatica;

@header{
    package antlr;
}

programa: declaracoes algoritmo EOF #NPrograma;
declaracoes: DEC declaracao+ #BlocoDeclaracao;
declaracao: TIPO ID #NDeclaracao;
algoritmo: ALG instrucoes #BlocoAlgoritimo;
instrucoes: operacoes* #NInstrucao;
operacoes: (atribuicao | leitura | escrita | condicional | repeticao) #NOperacao;
atribuicao: ATR (ID | NUM | expressao) IGUAL ID #NAtribuicao;
leitura: LER ID #NLeitura;
escrita: ESC ( ID | NUM | expressao) #NEscrita;
condicional: SE expressao OP_REL expressao ENTAO instrucoes SENAO instrucoes #NCondicional;
repeticao: ENQUANTO expressao OP_REL expressao instrucoes #NRepeticao;
expressao: (operando operacao_cauda | operando) #NExpressao;
operando: NUM | ID #NOperando;
operacao_cauda: OP_ARIT operando(operacao_cauda)* #NOperacaoCauda;


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
