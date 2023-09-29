%{
    #include "ex09.tab.h"
    extern int nErr;
%}

%option nounput
%option header-file="lex.yy.h"

%%
[0-9]{2}\-[0-9]{2}\-[0-9]{4} {yylval.str = yytext; return DATA;}
[0-9]{2}\:[0-9]{2}\:[0-9]{2} {yylval.str = yytext; return HORA;}
[0-9]+ {yylval.inteiro = atoi(yytext); return NUMERO;}
\"[a-zA-Z( )]+\" {yylval.str = yytext; return NOME;}
[a-zA-Z( )]+ {yylval.str = yytext; return AULINHA;}
[a-zA-Z]{3} {yylval.str = yytext; return COD_AULA;}
[ \t\r]     /* ignorado */
\n    return '\n';
.       {printf("Carater desconhecido! \n");}
<<EOF>> return 0;
%%

