%{

%}

/////////////////////////////////////////////////////////////////////////////
// declarations section

// lexical analyser name
%name mylexer

// class members
{
		int k,c;
}

// constructor
{
		// place any extra initialisation code here
}

// place any declarations here

%%

/////////////////////////////////////////////////////////////////////////////
// rules section

// place your Lex rules here

\+?[0-9]+ {

	k=Integer.parseInt(String.valueOf(yytext).trim()) ;
	c=(k%2 == 0 ? k+1 : k);
	System.out.println(c);

}
-?[0-9]+|[A-Za-z][A-Za-z0-9]+ ECHO;

%%

/////////////////////////////////////////////////////////////////////////////
// programs section

	public static void main(String args[]) {
		int n = 1;
		mylexer lexer = new mylexer();
		if (lexer.yycreate(null)) {
			n = lexer.yylex();
		}
		System.exit(n);
	}

}

