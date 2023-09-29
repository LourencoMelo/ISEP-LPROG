%{

    #include "ex2.tab.h" /* header gerado pelo bison */

%}

%%

[0-9]+  yylval=atoi(yytext); return NUMERO;
[=<>\n]   return yytext[0];
"<="    return MENORIGUAL;
">="    return MAIORIGUAL;
"<>"    return DIFERENTE;
[ \t\r]     /* ignorado */
.       yyerror("Erro léxico");
<<EOF>> return 0;

%%