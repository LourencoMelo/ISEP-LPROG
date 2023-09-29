%{
    #include <stdio.h>

    void yyerror(char *s) {
        printf("erro sintactico/semantico: %s\n",s);
    }

%}

%token NUMERO MENORIGUAL MAIORIGUAL DIFERENTE LETRA  
%start inicio

%error-verbose

%%

inicio: /* vazio */
        |   inicio comparacao '\n'
        |   inicio error '\n'
        ;

comparacao: NUMERO MENORIGUAL NUMERO {printf("%d <= %d -> ",$1,$3);compara($1, $3, MENORIGUAL);}
        | NUMERO MAIORIGUAL NUMERO {printf("%d >= %d -> ",$1,$3);compara($1, $3, MAIORIGUAL);}
        | NUMERO DIFERENTE NUMERO  {printf("%d <> %d -> ",$1,$3);compara($1, $3, DIFERENTE);}
        | NUMERO '<' NUMERO        {printf("%d < %d -> ",$1,$3);compara($1, $3, '<');}
        | NUMERO '>' NUMERO        {printf("%d > %d -> ",$1,$3);compara($1, $3, '>');}
        | NUMERO '=' NUMERO        {printf("%d = %d -> ",$1,$3);compara($1, $3, '=');}
        ;
%%

int main() {
    yyparse();

    return 0;
}

void compara(int um, int dois, int sinal) {
    switch (sinal){
        
        case '<':
            if(um<dois) {
                printf("1\n");
            } else {
                printf("0\n");
            }
            break;
        
        case '>':
            if(um>dois) {
                printf("1\n");
            } else {
                printf("0\n");
            }
            break;

        case '=':
            if(um==dois) {
                printf("1\n");
            } else {
                printf("0\n");
            }
            break;

        case MENORIGUAL:
            if(um<=dois) {
                printf("1\n");
            } else {
                printf("0\n");
            }
            break;

        case MAIORIGUAL:
            if(um>=dois) {
                printf("1\n");
            } else {
                printf("0\n");
            }
            break;
            
        case DIFERENTE:
            if(um!=dois) {
                printf("1\n");
            } else {
                printf("0\n");
            }
            break;   

        default:
            return 0; 
    }
}