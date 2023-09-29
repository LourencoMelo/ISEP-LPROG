%{
    int contadorAlgarismos = 0;
    int contadorLetra = 0;
    int contadorLinhas = 0;
    int contadorEspacos = 0;
    int contadorOvnis = 0;
%}

%option nounput
%%
[0-9] contadorAlgarismos++;
[a-zA-Z] contadorLetra++;
\n contadorLinhas++;
[(\t)] contadorEspacos++;
. contadorOvnis++;
%%

main(){
    yylex();
    printf("Digitos:%d  Letras:%d  Linhas:%d  Espacos:%d  Ovnis:%d\n", contadorAlgarismos, contadorLetra, contadorLinhas, contadorEspacos, contadorOvnis);
}