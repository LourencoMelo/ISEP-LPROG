%{						
	#include"6-MakBubidas2.tab.h" // header gerado pelo BISON
%}

%%
	
(([12]\.00|0\.[125]0|0\.0[125])	printf("%s",yytext); yytext++; yylval.real=atof(yytext);return MOEDA;

cafe 	|
pingo 	|
cha 		printf("%s",yytext); yylval.real=0.35; return PRODUTO;	
copo 		printf("%s",yytext); yylval.real=0.05; return PRODUTO;	
leite 		printf("%s",yytext); yylval.real=0.30; return PRODUTO;	
chocolate 	printf("%s",yytext); yylval.real=0.40; return PRODUTO;	

","				printf("%s",yytext); return yytext[0];

[ \t\r]			/*ignora*/
\n				return yytext[0];
<<EOF>>			return 0;
.				printf("\nErro lexico: token <%s> desconhecido!", yytext); 

%%
