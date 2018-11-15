/****************************************************************************
*                     U N R E G I S T E R E D   C O P Y
* 
* You are on day 1 of your 30 day trial period.
* 
* This file was produced by an UNREGISTERED COPY of Parser Generator. It is
* for evaluation purposes only. If you continue to use Parser Generator 30
* days after installation then you are required to purchase a license. For
* more information see the online help or go to the Bumble-Bee Software
* homepage at:
* 
* http://www.bumblebeesoftware.com
* 
* This notice must remain present in the file. It cannot be removed.
****************************************************************************/

/****************************************************************************
* Mylexer.java
* Java source file generated from Mylexer.l.
* 
* Date: 11/15/18
* Time: 11:13:06
* 
* ALex Version: 2.07
****************************************************************************/

// line 1 ".\\Mylexer.l"



// line 32 "Mylexer.java"
import yl.*;

/////////////////////////////////////////////////////////////////////////////
// mylexer

public class Mylexer extends yyflexer {
// line 12 ".\\Mylexer.l"

		int k,c;

// line 43 "Mylexer.java"
	public Mylexer() {
		yytables();
// line 17 ".\\Mylexer.l"

		// place any extra initialisation code here

// line 50 "Mylexer.java"
	}

	public static final int INITIAL = 0;

	protected static yyftables yytables = null;

	public final int yyaction(int action) {
		yyreturnflg = true;
		switch (action) {
		case 1:
			{
// line 30 ".\\Mylexer.l"


	k=Integer.parseInt(String.valueOf(yytext).trim()) ;
	c=(k%2 == 0 ? k+1 : k);
	System.out.println(c);


// line 70 "Mylexer.java"
			}
			break;
		case 2:
			{
// line 37 ".\\Mylexer.l"
				System.out.println(yylex());
// line 77 "Mylexer.java"
			}
			break;
		default:
			break;
		}
		yyreturnflg = false;
		return 0;
	}

	protected final void yytables() {
		yystext_size = 100;
		yysunput_size = 100;
		yytext_max = 0;
		yyunput_max = 0;

		yycreatetables();
		yymatch = yytables.yymatch;
		yytransition = yytables.yytransition;
		yystate = yytables.yystate;
		yybackup = yytables.yybackup;
	}

	public static synchronized final void yycreatetables() {
		if (yytables == null) {
			yytables = new yyftables();

			final short match[] = {
				0
			};
			yytables.yymatch = match;

			final yytransition transition[] = {
				new yytransition(0, 0),
				new yytransition(3, 1),
				new yytransition(0, 0),
				new yytransition(4, 1),
				new yytransition(7, 7),
				new yytransition(7, 7),
				new yytransition(7, 7),
				new yytransition(7, 7),
				new yytransition(7, 7),
				new yytransition(7, 7),
				new yytransition(7, 7),
				new yytransition(7, 7),
				new yytransition(7, 7),
				new yytransition(7, 7),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(6, 1),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(0, 0),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(8, 8),
				new yytransition(5, 5),
				new yytransition(5, 5),
				new yytransition(5, 5),
				new yytransition(5, 5),
				new yytransition(5, 5),
				new yytransition(5, 5),
				new yytransition(5, 5),
				new yytransition(5, 5),
				new yytransition(5, 5),
				new yytransition(5, 5)
			};
			yytables.yytransition = transition;

			final yystate state[] = {
				new yystate(0, 0, 0),
				new yystate(5, -42, 0),
				new yystate(1, 0, 0),
				new yystate(5, 0, 0),
				new yystate(7, 0, 0),
				new yystate(0, 108, 1),
				new yystate(8, 0, 0),
				new yystate(0, -44, 2),
				new yystate(0, 33, 2)
			};
			yytables.yystate = state;

			final boolean backup[] = {
				false,
				false,
				false
			};
			yytables.yybackup = backup;
		}
	}
// line 39 ".\\Mylexer.l"


/////////////////////////////////////////////////////////////////////////////
// programs section

	public static void main(String args[]) {
		int n = 1;
		Mylexer lexer = new Mylexer();
		if (lexer.yycreate(null)) {
			n = lexer.yylex();
		}
		System.exit(n);
	}

}


