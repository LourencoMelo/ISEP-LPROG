%{
    int cont=0;
%}

%%

ISEP|isep { cont ++; printf("%s", yytext);}
.

%%
main()
{
    printf("INÍCIO \n");
    yylex(); /* CTRL+D*/
    printf("%d palavras encontradas \n ", cont);
    printf("FIM \n");
}