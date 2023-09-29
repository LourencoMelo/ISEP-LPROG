%{
int matriculasValidas = 0;
%}

inteiro [0-9]
letra [A-Z]

%%
{letra}{letra}{inteiro}{inteiro}{letra}{letra} { printf("%s é valida\n", yytext);  matriculasValidas++;}
{letra}{letra}-{inteiro}{inteiro}-[0-9][0-9] { printf("%s é valida\n", yytext); matriculasValidas++;}
{inteiro}{inteiro}-{letra}{letra}-{inteiro}{inteiro} { printf("%s é valida\n", yytext); matriculasValidas++;}
{inteiro}{inteiro}-{inteiro}{inteiro}-{letra}{letra} { printf("%s é valida\n", yytext); matriculasValidas++;}
.

%%
main()
{
    printf("INÍCIO \n");
    yylex(); /* CTRL+D */
    printf("\n Matricula validas: %d\n ", matriculasValidas);
    printf("FIM \n");
}