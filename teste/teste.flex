%{
    #include "teste.tab.h"
    extern int nErr;
%}

%option nounput
%option header-file="lex.yy.h"

%%
[a-zA-Z]+[ ]+[a-zA-Z]+ {yylval.str = yytext; return NOMEPROVA;}
([0-2][0-9]|3[0-1])+[A-Z]{3}+[0-9]{4} {yylval.str = yytext; return DATA;}
[0-9]{1,2} {yylval.inteiro = atoi(yytext); return NUMERO;} //volta e piloto
[A-Z]{1}+[a-z]*[ ]+[A-Z]+ {yylval.str = yytext; return NOMEPILOTO;}
[A-Z]{2,3} {yylval.str = yytext; return NACIONALIDADE;}
([A-Z]+[ ]+[A-Z]+)+ {yylval.str = yytext; return EQUIPA;}
[0-9]+[\.][0-9]{3} {yylval.str = yytext; return TEMPO;}
[\@] return ARROBA;
[\$] return DOLLAR;
[\#] return HASHTAG;    
[\,]    /*ignorado */
[ \t\r]     /* ignorado */
\n    return '\n';
.       {printf("Carater desconhecido! \n");}
<<EOF>> return 0;
%%