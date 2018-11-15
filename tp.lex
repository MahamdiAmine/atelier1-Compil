%{

	#include <stdlib.h>
	int k;

%}

%%

\+?[0-9]+ {

	k=atoi (yytext) ;
	printf ("%d", k%2 == 0 ? k+1 : k);

}
-?[0-9]+|[A-Za-z][A-Za-z0-9]+ ECHO;
	.;
%%

int main(){
   yylex();
}
