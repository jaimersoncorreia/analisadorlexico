package br.com.compiladores.top;

%%

%{

private void imprimir(String descricao, String lexema){
	System.out.println(lexema + " - " + descricao);
}

%}

%class LexicalAnalyzer
%type void

BRANCO = [\n| |\t|\r]
ID = [_|a-z|A-Z][a-z|A-Z|0-9|_]*

SOMA = "+"
SUBTRACAO = "-"
MULTIPLICACAO = "*"
DIVISAO = "/"

INTEIRO = 0|[1-9][0-9]*

SE = "se"
ENQUANTO = "enquanto"
%%
{SE}			{imprimir("Palavra reservada se",yytext());}
{ENQUANTO}		{imprimir("Palavra reservada enquanto",yytext());}
{SOMA}			{imprimir("Operador de soma",yytext());}
{SUBTRACAO}		{imprimir("Operador de subtração",yytext());}
{MULTIPLICACAO} {imprimir("Operador de multiplicação",yytext());}
{DIVISAO}		{imprimir("Operador de divisão",yytext());}
{BRANCO}	{imprimir("Espaço em branco",yytext());}
{ID}		{imprimir("Identificador",yytext());}

{INTEIRO}	{imprimir("Número inteiro",yytext());}

. {throw new RuntimeException("Caractere inválido " + yytext());}


