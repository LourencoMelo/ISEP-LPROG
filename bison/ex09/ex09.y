%{
#include <stdio.h>
#include <string.h>
#include "lex.yy.h"
void yyerror(char *s);
int totalAula = 0;
int totalMusc = 0;
int nErr = 0;
%}

%union{
    char *str;
    int inteiro;
}

%token <str> DATA
%token <str> HORA
%token <str> NOME
%token <str> COD_AULA
%token <inteiro> NUMERO
%token <str> AULINHA
%type <inteiro> expr
%type <inteiro> cont

%%
inicio: /*vazio*/
        |inicio DATA HORA NUMERO '\n' expr{
            if($4 >= 0 && $4 < 100){
                printf("Analise para o dia %s \n", $2);
                printf("Aulas com mais de 90 minutos: %d \n", totalAula);
                printf("Sessoes de musculacao superior a 90 minutos: %d \n", totalMusc);
                printf("Total registos: %d", $6);
            }
        }
        |inicio DATA HORA '\n' expr{
            printf("Analise para o dia %s \n", $2);
            printf("Aulas com mais de 90 minutos: %d \n", totalAula);
            printf("Sessoes de musculacao superior a 90 minutos: %d \n", totalMusc);
            printf("Total registos: %d", $6);
        }
        |inicio error
        ;

expr: expr cont {$$ = $1+$2;}
    | cont {$$ = $1;}
    ;

cont: AULINHA COD_AULA HORA NUMERO NUMERO NOME 'n'{
            if($4 >= 0 && $4 < 1500){
                if($5 > 90){
                    totalAula =+ 1;
                }
                $$=1;
            }else{
                printf("Erro no numero de cliente");
                nErr ++;
            }
        }
        | AULINHA COD_AULA HORA NUMERO NUMERO 'n'{
            if($4 >= 0 && $4 < 1500){
                 if($5 > 90){
                    totalAula =+ 1;
                }
                $$=1;
            }else{
                printf("Erro no numero de cliente");
                nErr ++;
            }
        }
        | AULINHA HORA NUMERO NUMERO NOME 'n'{
            if($3 >= 0 && $3 < 1500){
                 if($4 > 90){
                    totalMusc =+ 1;
                    
                }
                $$=1;
            }else{
                printf("Erro no numero de cliente");
                nErr ++;
            }

        }
        | AULINHA HORA NUMERO NUMERO 'n'{
            if($3 >= 0 && $3 < 1500){
                 if($4 > 90){
                    totalMusc =+ 1;
                }
                $$=1;
            }else{
                printf("Erro no numero de cliente");
                nErr ++;
            }
        }
        ;
%%

int main(){
    yyparse();
    return 0;
}

void yyerror(char *s){
    nErr ++;
    printf("Erro semantico:%s \n",s);
}