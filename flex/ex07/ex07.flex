ALGARISMO [0-9]
VIRGULA [,.]
SINAL [-+]

NUMERO ({SINAL})?({ALGARISMO})+(({VIRGULA})({ALGARISMO})+)*

%option nounput
%%
{NUMERO} printf("%s ", yytext);
.  ;
%%
int main(){
    yylex();
    return 0;
}