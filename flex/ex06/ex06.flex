%option nounput
%%
[0-9+]+|[0-9-]+|[0-9] printf("%s ",yytext);
.  ;
%%
int main(){
    yylex();
    return 0;
}