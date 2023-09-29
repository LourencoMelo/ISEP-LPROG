%{
  #include <stdio.h>
  void exec_express (int, int, int);
%}

%error-verbose

%token NUM ID
%token LEQ GEQ DIF  

%start oprel 

%%

oprel: /* empty */   
      | oprel exp '\n' {printf("\n");} 
	  | error 
      ;

exp: expn 
   | expc 
   ;

expn : NUM          {$$=$1;}
    | expn op NUM   {exec_express($1,$3,$2); $$=$3;}
    | expc op NUM 	{yyerror("Tipos incompatíveis!");}
    ;

expc : ID           {$$=$1;}
     | expc op ID   {exec_express($1,$3,$2); $$=$3;}
     | expn op ID 	{yyerror("Tipos incompatíveis!");}
     ;

op: '='             { $$ = '='; }
  | '<'             { $$ = '<'; }
  | '>'             { $$ = '>'; }
  | LEQ             { $$ = LEQ; }
  | GEQ             { $$ = GEQ; }
  | DIF             { $$ = DIF; }
  ;

%%

int yyerror (char* s){ 
  printf("\n>>>Erro: %s\n", s);
  return 0 ; 
}

void exec_express (int num1, int num2, int op){
    switch(op){
        case '=' : if (num1 == num2) 
                      printf ("verdadeiro "); 
                   else  
                      printf ("falso ");
                   break;
        case '<' : if (num1 < num2)   
                       printf ("verdadeiro "); 
                    else
                        printf ("falso "); 
                    break;
        case '>' :	if (num1 > num2)  
                        printf ("verdadeiro "); 
                    else
                        printf ("falso "); 
                    break; 
        case LEQ :  if (num1 <= num2)  
                        printf ("verdadeiro "); 
                    else
                        printf ("falso "); 
                    break;
        case GEQ  : if (num1 >= num2)  
                        printf ("verdadeiro "); 
                    else
                        printf ("falso "); 
                    break;
        case DIF :	if (num1 != num2)  
                        printf ("verdadeiro "); 
                    else
                        printf ("falso ");  
                    break;
    }
}

int main () {
   return yyparse() ; 
}