%{
    #include "ex08.tab.h"
    extern int nErr;
%}

%option nounput
%option header-file="lex.yy.h"

%%
[a-z]{3}[0-9]{2} {yylval.str = yytext; return COD_FOR;}
\"[a-zA-Z( )]+\" {yylval.str = yytext; return NOME;}
[A-Z]{3}[0-9]{2} {yylval.str = yytext; return COD_CURSO;}
[0-9]+ {yylval.inteiro = atoi(yytext); return INTEIRO;}
[ \t] return ESPACO;
. {printf("Caracter desconhecido!");}
[\n] return yytext[0];
<<EOF>> return 0;
%%
