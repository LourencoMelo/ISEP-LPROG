%{
   #include "exerc3.tab.h"		//contém os tokens e yylval

%}

%%

[ \t\r]+	/* ignore */

[+-]?[0-9]+ { yylval=atoi(yytext) ;
              return NUM; }

[a-zA-Z]   	{ yylval=*yytext;
              return ID; }
                      
[=<>\n]	   	{ return *yytext; }

"<="        { return LEQ; } 
">="        { return GEQ; }  
"<>"        { return DIF; } 

.           ;
