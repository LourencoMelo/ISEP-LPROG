%{							
    #include <stdio.h>
%}

%union {
	float real;
	}
	
%error-verbose 
%token <real> MOEDA PRODUTO 
%type <real> dinheiro pedido

%%

inicio: /*vazio*/
		| inicio pedido ;
		
pedido: PRODUTO ',' dinheiro '\n' { if ($3>=$1) printf("-->%.2f de troco\n", $3-$1); //falta converter o troco em moedas...
										 else printf("\n--Não seja forreta!\n"); }
	  
	  | PRODUTO {yyerror("!!falta vírgula!!");} dinheiro '\n' 
	  
	  | error '\n' /*on error, skip until '\n' is read*/ {yyerrok; /*força msg erro*/} 
	  ;
	
dinheiro: MOEDA { $$=$1; }
		| dinheiro ',' MOEDA { $$=$1+$3; };
		


%%

int main(){
	printf("AKELA*MAKINA\n");
	yyparse();
	printf("\nF I M\n");
}

int yyerror(char* s) {
    printf("\n»»»Erro sintactico: %s\n", s);
}