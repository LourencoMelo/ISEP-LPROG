%option nounput
%%

FEUP {printf("ISEP");}
2007 {printf("2008");}
.

%%
main(){
    yylex();
}