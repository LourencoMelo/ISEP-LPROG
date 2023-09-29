%{
  #include <stdio.h>

  void yyerror(const char *s){
    printf("erro sintactico/semantico: %s\n",s);
  }
%}

%token HELLO WORLD PALAVRA
%start inicio

%error-verbose
 

%%

inicio:   /* vazio */
        | inicio HELLO WORLD {printf("Hello World!!!\n");}
        | inicio PALAVRA
        | inicio HELLO       {printf("Hello sem World\n");}
        | inicio {yyerror("World sem Hello\n");} WORLD       
    ;


%%

int main(){
  yyparse();

  return 0;
}
