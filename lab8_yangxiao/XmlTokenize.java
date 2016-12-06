// Generated from XmlTokenize.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XmlTokenize extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, END=2, EMAIL=3, DATE=4, PHONENUM=5, CREDITCARD=6, OTHEREL=7, 
		BAD=8, BAD2=9, WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "ALPHA", "SPECIAL", "HYPHENS", "UNDERSCORES", "PERIOD", "LOCAL", 
		"DOMAIN", "LOCALP", "DOMAINP", "ELEMENTF", "ELEMENT", "START", "END", 
		"EMAIL", "ONETONINE", "DAY", "MONTH", "YEAR", "DATE", "PHONE3", "PHONE4", 
		"SPACE", "PHONENUM", "DIGIT15", "DIGIT14", "DIGIT13", "DIGIT12", "DIGIT11", 
		"VISA", "MASTER", "AMEX", "DINERSCLUB", "DISCOVER", "JCB", "CREDITCARD", 
		"OTHEREL", "BAD", "BAD2", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "START", "END", "EMAIL", "DATE", "PHONENUM", "CREDITCARD", "OTHEREL", 
		"BAD", "BAD2", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    String elname = "";
	    boolean found = false;


	public XmlTokenize(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XmlTokenize.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 12:
			START_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			EMAIL_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			DATE_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			PHONENUM_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			CREDITCARD_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			OTHEREL_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			BAD_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			BAD2_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			found = true;
			String x = getText();
			x = x.substring(1);
			int len = x.length();
			x = x.substring(0, len-1);
			elname = x;
			System.out.println("Element " + x + " FOUND!");

			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			String x = getText();
			x = x.substring(2);
			int len = x.length();
			x = x.substring(0, len-1);
			System.out.println("Element " + x + " END!");
			found = false;

			break;
		}
	}
	private void EMAIL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			String x = getText();
			int pos = x.indexOf('@');
			String test = x.substring(0, pos);
			if(found)
			{
			System.out.println("Email: " + getText());
			}

			break;
		}
	}
	private void DATE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			System.out.println("Date: " + getText());

			break;
		}
	}
	private void PHONENUM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			System.out.println("Phone Number: " + getText());

			break;
		}
	}
	private void CREDITCARD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("Credit Card: " + getText());
			break;
		}
	}
	private void OTHEREL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			if(found && !elname.matches("(?i)email") && !elname.matches("(?i)phone") && !elname.matches("(?i)date") && !elname.matches("(?i)creditcard"))
			{
			System.out.println(elname + ": " + getText());}
			else{
			System.out.println("Error in " + elname + " element!");
			}

			break;
		}
	}
	private void BAD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 System.out.println("Muti period in local part! Showing partial email!"); 
			break;
		}
	}
	private void BAD2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			 System.out.println("SP " + getText()); 
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f\u016f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\bc\n\b\3\t\3\t\3\t\3"+
		"\t\5\ti\n\t\3\n\6\nl\n\n\r\n\16\nm\3\n\3\n\6\nr\n\n\r\n\16\ns\7\nv\n\n"+
		"\f\n\16\ny\13\n\3\13\6\13|\n\13\r\13\16\13}\3\f\3\f\5\f\u0082\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0089\n\r\3\16\3\16\3\16\6\16\u008e\n\16\r\16\16"+
		"\16\u008f\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\6\17\u009a\n\17\r\17"+
		"\16\17\u009b\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b0\n\22\3\23\3\23\3\23\5\23"+
		"\u00b5\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c1"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00ee\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u010d\n\37\3 \3 \3 \3 \3!\3!\3!\3"+
		"!\5!\u0117\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0125"+
		"\n\"\3\"\5\"\u0128\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0134\n#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\5$\u013e\n$\3$\3$\3$\3$\3$\5$\u0145\n$\3%\3%\3%\3"+
		"%\3%\3%\5%\u014d\n%\3%\3%\3&\3&\3&\3&\6&\u0155\n&\r&\16&\u0156\3&\3&\3"+
		"\'\6\'\u015c\n\'\r\'\16\'\u015d\3\'\3\'\3(\6(\u0163\n(\r(\16(\u0164\3"+
		"(\3(\3)\6)\u016a\n)\r)\16)\u016b\3)\3)\2\2*\3\2\5\2\7\2\t\2\13\2\r\2\17"+
		"\2\21\2\23\2\25\2\27\2\31\2\33\3\35\4\37\5!\2#\2%\2\'\2)\6+\2-\2/\2\61"+
		"\7\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\bK\tM\nO\13Q\f\3\2\n\3\2\62"+
		";\4\2C\\c|\t\2##&&(/<=??aa\u0080\u0080\3\2\63;\5\2\"\"^^uu\3\2\63\67\3"+
		"\2\62\67\5\2\13\f\17\17\"\"\u017b\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2)\3\2\2\2\2\61\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r"+
		"]\3\2\2\2\17b\3\2\2\2\21h\3\2\2\2\23k\3\2\2\2\25{\3\2\2\2\27\u0081\3\2"+
		"\2\2\31\u0088\3\2\2\2\33\u008a\3\2\2\2\35\u0094\3\2\2\2\37\u00a0\3\2\2"+
		"\2!\u00a6\3\2\2\2#\u00af\3\2\2\2%\u00b4\3\2\2\2\'\u00c0\3\2\2\2)\u00c2"+
		"\3\2\2\2+\u00c9\3\2\2\2-\u00cd\3\2\2\2/\u00d2\3\2\2\2\61\u00ed\3\2\2\2"+
		"\63\u00f1\3\2\2\2\65\u00f6\3\2\2\2\67\u00fc\3\2\2\29\u0101\3\2\2\2;\u0105"+
		"\3\2\2\2=\u0109\3\2\2\2?\u010e\3\2\2\2A\u0116\3\2\2\2C\u0127\3\2\2\2E"+
		"\u0133\3\2\2\2G\u0144\3\2\2\2I\u014c\3\2\2\2K\u0154\3\2\2\2M\u015b\3\2"+
		"\2\2O\u0162\3\2\2\2Q\u0169\3\2\2\2ST\t\2\2\2T\4\3\2\2\2UV\t\3\2\2V\6\3"+
		"\2\2\2WX\t\4\2\2X\b\3\2\2\2YZ\7/\2\2Z\n\3\2\2\2[\\\7a\2\2\\\f\3\2\2\2"+
		"]^\7\60\2\2^\16\3\2\2\2_c\5\5\3\2`c\5\3\2\2ac\5\7\4\2b_\3\2\2\2b`\3\2"+
		"\2\2ba\3\2\2\2c\20\3\2\2\2di\5\5\3\2ei\5\3\2\2fi\5\t\5\2gi\5\r\7\2hd\3"+
		"\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\22\3\2\2\2jl\5\17\b\2kj\3\2\2\2"+
		"lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2nw\3\2\2\2oq\5\r\7\2pr\5\17\b\2qp\3\2\2"+
		"\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uo\3\2\2\2vy\3\2\2\2wu\3\2\2"+
		"\2wx\3\2\2\2x\24\3\2\2\2yw\3\2\2\2z|\5\21\t\2{z\3\2\2\2|}\3\2\2\2}{\3"+
		"\2\2\2}~\3\2\2\2~\26\3\2\2\2\177\u0082\5\5\3\2\u0080\u0082\5\13\6\2\u0081"+
		"\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\30\3\2\2\2\u0083\u0089\5\5\3\2"+
		"\u0084\u0089\5\3\2\2\u0085\u0089\5\t\5\2\u0086\u0089\5\13\6\2\u0087\u0089"+
		"\5\r\7\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\32\3\2\2\2\u008a\u008b\7>\2\2"+
		"\u008b\u008d\5\27\f\2\u008c\u008e\5\31\r\2\u008d\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7@\2\2\u0092\u0093\b\16\2\2\u0093\34\3\2\2\2\u0094\u0095\7>\2\2"+
		"\u0095\u0096\7\61\2\2\u0096\u0097\3\2\2\2\u0097\u0099\5\27\f\2\u0098\u009a"+
		"\5\31\r\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7@\2\2\u009e\u009f"+
		"\b\17\3\2\u009f\36\3\2\2\2\u00a0\u00a1\5\23\n\2\u00a1\u00a2\7B\2\2\u00a2"+
		"\u00a3\5\25\13\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\20\4\2\u00a5 \3\2\2"+
		"\2\u00a6\u00a7\t\5\2\2\u00a7\"\3\2\2\2\u00a8\u00b0\5!\21\2\u00a9\u00aa"+
		"\7\63\2\2\u00aa\u00b0\5!\21\2\u00ab\u00ac\7\64\2\2\u00ac\u00b0\5!\21\2"+
		"\u00ad\u00ae\7\65\2\2\u00ae\u00b0\4\62\63\2\u00af\u00a8\3\2\2\2\u00af"+
		"\u00a9\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0$\3\2\2\2"+
		"\u00b1\u00b5\5!\21\2\u00b2\u00b3\7\63\2\2\u00b3\u00b5\4\62\64\2\u00b4"+
		"\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7\64\2\2"+
		"\u00b7\u00b8\7\62\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5\3\2\2\u00ba\u00bb"+
		"\5\3\2\2\u00bb\u00c1\3\2\2\2\u00bc\u00bd\7\64\2\2\u00bd\u00be\7\63\2\2"+
		"\u00be\u00bf\7\62\2\2\u00bf\u00c1\7\62\2\2\u00c0\u00b6\3\2\2\2\u00c0\u00bc"+
		"\3\2\2\2\u00c1(\3\2\2\2\u00c2\u00c3\5#\22\2\u00c3\u00c4\7\61\2\2\u00c4"+
		"\u00c5\5%\23\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\5\'\24\2\u00c7\u00c8\b"+
		"\25\5\2\u00c8*\3\2\2\2\u00c9\u00ca\5\3\2\2\u00ca\u00cb\5\3\2\2\u00cb\u00cc"+
		"\5\3\2\2\u00cc,\3\2\2\2\u00cd\u00ce\5\3\2\2\u00ce\u00cf\5\3\2\2\u00cf"+
		"\u00d0\5\3\2\2\u00d0\u00d1\5\3\2\2\u00d1.\3\2\2\2\u00d2\u00d3\t\6\2\2"+
		"\u00d3\60\3\2\2\2\u00d4\u00d5\5+\26\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7"+
		"\5+\26\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\5-\27\2\u00d9\u00ee\3\2\2\2\u00da"+
		"\u00db\5+\26\2\u00db\u00dc\7\60\2\2\u00dc\u00dd\5+\26\2\u00dd\u00de\7"+
		"\60\2\2\u00de\u00df\5-\27\2\u00df\u00ee\3\2\2\2\u00e0\u00e1\5+\26\2\u00e1"+
		"\u00e2\7/\2\2\u00e2\u00e3\5+\26\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\5-\27"+
		"\2\u00e5\u00ee\3\2\2\2\u00e6\u00e7\7*\2\2\u00e7\u00e8\5+\26\2\u00e8\u00e9"+
		"\7+\2\2\u00e9\u00ea\5+\26\2\u00ea\u00eb\7/\2\2\u00eb\u00ec\5-\27\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00d4\3\2\2\2\u00ed\u00da\3\2\2\2\u00ed\u00e0\3\2"+
		"\2\2\u00ed\u00e6\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\31\6\2\u00f0"+
		"\62\3\2\2\2\u00f1\u00f2\5-\27\2\u00f2\u00f3\5-\27\2\u00f3\u00f4\5-\27"+
		"\2\u00f4\u00f5\5+\26\2\u00f5\64\3\2\2\2\u00f6\u00f7\5-\27\2\u00f7\u00f8"+
		"\5-\27\2\u00f8\u00f9\5-\27\2\u00f9\u00fa\5\3\2\2\u00fa\u00fb\5\3\2\2\u00fb"+
		"\66\3\2\2\2\u00fc\u00fd\5-\27\2\u00fd\u00fe\5-\27\2\u00fe\u00ff\5-\27"+
		"\2\u00ff\u0100\5\3\2\2\u01008\3\2\2\2\u0101\u0102\5-\27\2\u0102\u0103"+
		"\5-\27\2\u0103\u0104\5-\27\2\u0104:\3\2\2\2\u0105\u0106\5-\27\2\u0106"+
		"\u0107\5-\27\2\u0107\u0108\5+\26\2\u0108<\3\2\2\2\u0109\u010c\7\66\2\2"+
		"\u010a\u010d\5\63\32\2\u010b\u010d\59\35\2\u010c\u010a\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d>\3\2\2\2\u010e\u010f\7\67\2\2\u010f\u0110\t\7\2\2\u0110"+
		"\u0111\5\65\33\2\u0111@\3\2\2\2\u0112\u0113\7\65\2\2\u0113\u0117\7\66"+
		"\2\2\u0114\u0115\7\65\2\2\u0115\u0117\79\2\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\5\67\34\2\u0119B\3\2\2"+
		"\2\u011a\u011b\7\65\2\2\u011b\u011c\7\62\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\t\b\2\2\u011e\u011f\3\2\2\2\u011f\u0128\5;\36\2\u0120\u0121\7\65"+
		"\2\2\u0121\u0125\78\2\2\u0122\u0123\7\65\2\2\u0123\u0125\7:\2\2\u0124"+
		"\u0120\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\59"+
		"\35\2\u0127\u011a\3\2\2\2\u0127\u0124\3\2\2\2\u0128D\3\2\2\2\u0129\u012a"+
		"\78\2\2\u012a\u012b\7\62\2\2\u012b\u012c\7\63\2\2\u012c\u012d\7\63\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u0134\59\35\2\u012f\u0130\78\2\2\u0130\u0131"+
		"\7\67\2\2\u0131\u0132\3\2\2\2\u0132\u0134\5\65\33\2\u0133\u0129\3\2\2"+
		"\2\u0133\u012f\3\2\2\2\u0134F\3\2\2\2\u0135\u0136\7\64\2\2\u0136\u0137"+
		"\7\63\2\2\u0137\u0138\7\65\2\2\u0138\u013e\7\63\2\2\u0139\u013a\7\63\2"+
		"\2\u013a\u013b\7:\2\2\u013b\u013c\7\62\2\2\u013c\u013e\7\62\2\2\u013d"+
		"\u0135\3\2\2\2\u013d\u0139\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0145\5;"+
		"\36\2\u0140\u0141\7\65\2\2\u0141\u0142\7\67\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0145\5\65\33\2\u0144\u013d\3\2\2\2\u0144\u0140\3\2\2\2\u0145H\3\2\2"+
		"\2\u0146\u014d\5=\37\2\u0147\u014d\5? \2\u0148\u014d\5A!\2\u0149\u014d"+
		"\5C\"\2\u014a\u014d\5E#\2\u014b\u014d\5G$\2\u014c\u0146\3\2\2\2\u014c"+
		"\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b%\7\2\u014f"+
		"J\3\2\2\2\u0150\u0155\5\5\3\2\u0151\u0155\5\3\2\2\u0152\u0155\5\7\4\2"+
		"\u0153\u0155\5/\30\2\u0154\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b&\b\2\u0159L\3\2\2\2\u015a"+
		"\u015c\5\r\7\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\'\t\2\u0160"+
		"N\3\2\2\2\u0161\u0163\5\7\4\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2"+
		"\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167"+
		"\b(\n\2\u0167P\3\2\2\2\u0168\u016a\t\t\2\2\u0169\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\b)\13\2\u016eR\3\2\2\2\36\2bhmsw}\u0081\u0088\u008f\u009b\u00af"+
		"\u00b4\u00c0\u00ed\u010c\u0116\u0124\u0127\u0133\u013d\u0144\u014c\u0154"+
		"\u0156\u015d\u0164\u016b\f\3\16\2\3\17\3\3\20\4\3\25\5\3\31\6\3%\7\3&"+
		"\b\3\'\t\3(\n\3)\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}