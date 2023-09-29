%{
  #include "ex1b.tab.h"   /* header gerado pelo bison */
%}

%%

hello       return HELLO;
world       return WORLD;
[a-zA-Z]+   return PALAVRA;
[ \t\n]     /* ignorado */
.           /* ignorado */
<<EOF>>     return 0;

%%
