%{
#include <stdio.h>
#include <string.h>
#include "lex.yy.h"
int vlogico;
int nErr = 0;
int maximo = 0;
char strCodCurso[100];
void yyerror(char *s); 

%}
%union{
    char *str;
    int inteiro;
}
%token ESPACO
%token <str> COD_FOR 
%token <str> NOME
%token <str> COD_CURSO
%token <inteiro> INTEIRO
%type <inteiro> expr
%type <inteiro> cursos
%%
inicio: /*vazio*/
        |inicio COD_FOR '\n' expr {
            printf("%s %s %d alunos\n",$2 , strCodCurso, maximo);
            memset(strCodCurso,'\0',sizeof(strCodCurso));
            maximo = 0;
            printf("Total:%d\n", $4);
        }
        |inicio COD_FOR ESPACO NOME '\n' expr {
            printf("%s %s %d alunos\n",$2, strCodCurso, maximo);
            maximo = 0;
            printf("Total:%d\n", $6);
        }
        |inicio error
        ;

expr: expr  cursos  {$$ = $1+$2;}
        | cursos {$$ = $1;}
        ;

cursos: COD_CURSO ESPACO NOME ESPACO INTEIRO ESPACO INTEIRO ESPACO INTEIRO '\n' {
            if($5 > 0 && $5<10 && $7 > 0 && $9 > 0 && $9 < 20){
                if($7 > maximo){
                    maximo = $7;
                    strcpy(strCodCurso,$1);
                }
                $$ = $7;
            }else{
                printf("Erro na gramatica!");
            }
        }
        | COD_CURSO ESPACO INTEIRO ESPACO INTEIRO ESPACO INTEIRO '\n' {
            if($3 > 0 && $3<10 && $5 > 0 && $7 > 0 && $7 < 20){
                if($5 > maximo){
                    maximo = $5;
                    strcpy(strCodCurso,$1);
                }
                $$ = $5;
            }else{
                printf("Erro na gramatica!");
            }
        }
        ;



%%

int main(){
    yyparse();
    return 0;
}
void yyerror(char *s){
    nErr++;
    printf("erro semantico:%s\n",s);
}