// Generated from C:/Users/Tomáš/Desktop/PRK/PRK\PRK.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PRKLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ZERO=3, ONE=4, NONZERO=5, SIGN=6, HEXAPREFIX=7, BINPREFIX=8, 
		HEXALPHA=9, ALPHA=10, DOT=11, WS=12, US=13, NL=14, SYMBOL=15, LPAR=16, 
		RPAR=17, ASS=18, MUL=19, ADD=20, SUB=21, DIV=22, POW=23, SQR=24, TRUE=25, 
		FALSE=26, BOOL=27, INT=28, FLOAT=29, CHAR=30, STRING=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "ZERO", "ONE", "NONZERO", "SIGN", "HEXAPREFIX", "BINPREFIX", 
			"HEXALPHA", "ALPHA", "DOT", "WS", "US", "NL", "SYMBOL", "LPAR", "RPAR", 
			"ASS", "MUL", "ADD", "SUB", "DIV", "POW", "SQR", "TRUE", "FALSE", "BOOL", 
			"INT", "FLOAT", "CHAR", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'''", "'\"'", "'0'", "'1'", null, null, "'\u0111\u017A\u2026\u00B0'", 
			"'\u0111\u017A\u2026\u00B1'", null, null, "'.'", "' '", "'_'", null, 
			null, "'\u00E2\u2013\u00B6'", "'\u00E2\u2014\u20AC'", "'\u00E2\u00AC\u2026'", 
			"'\u00E2\u015B\u2013'", "'\u00E2\u017E\u2022'", "'\u00E2\u017E\u2013'", 
			"'\u00E2\u017E\u2014'", "'\u00E2\u015B\u00A8\u00E2\u015B\u2013'", "'\u00E2\u015B\u00A8\u00E2\u017E\u2014'", 
			"'\u00E2\u015B\u201D'", "'\u00E2\u0165\u015A'", "'\u00E2\u0165\u201C'", 
			"'\u0111\u017A\u201D\u02D8'", "'\u0111\u017A\u201D\u0141'", "'\u0111\u017A\u201D\u02C7'", 
			"'\u0111\u017A\u201D\u00A0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ZERO", "ONE", "NONZERO", "SIGN", "HEXAPREFIX", "BINPREFIX", 
			"HEXALPHA", "ALPHA", "DOT", "WS", "US", "NL", "SYMBOL", "LPAR", "RPAR", 
			"ASS", "MUL", "ADD", "SUB", "DIV", "POW", "SQR", "TRUE", "FALSE", "BOOL", 
			"INT", "FLOAT", "CHAR", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public PRKLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PRK.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\5\17g\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \2\2!\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\7\4\2--//"+
		"\4\2CHch\4\2C\\c|\4\2\f\f\17\17\t\2##,/\61\61<=??AA\u0080\u0080\2\u00b5"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2"+
		"\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21R\3\2\2\2\23W\3\2\2\2\25Y\3\2"+
		"\2\2\27[\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2!j\3\2"+
		"\2\2#n\3\2\2\2%r\3\2\2\2\'v\3\2\2\2)z\3\2\2\2+~\3\2\2\2-\u0082\3\2\2\2"+
		"/\u0086\3\2\2\2\61\u008d\3\2\2\2\63\u0094\3\2\2\2\65\u0098\3\2\2\2\67"+
		"\u009c\3\2\2\29\u00a0\3\2\2\2;\u00a5\3\2\2\2=\u00aa\3\2\2\2?\u00af\3\2"+
		"\2\2AB\7)\2\2B\4\3\2\2\2CD\7$\2\2D\6\3\2\2\2EF\7\62\2\2F\b\3\2\2\2GH\7"+
		"\63\2\2H\n\3\2\2\2IJ\4\63;\2J\f\3\2\2\2KL\t\2\2\2L\16\3\2\2\2MN\7\u0113"+
		"\2\2NO\7\u017c\2\2OP\7\u2028\2\2PQ\7\u00b2\2\2Q\20\3\2\2\2RS\7\u0113\2"+
		"\2ST\7\u017c\2\2TU\7\u2028\2\2UV\7\u00b3\2\2V\22\3\2\2\2WX\t\3\2\2X\24"+
		"\3\2\2\2YZ\t\4\2\2Z\26\3\2\2\2[\\\7\60\2\2\\\30\3\2\2\2]^\7\"\2\2^\32"+
		"\3\2\2\2_`\7a\2\2`\34\3\2\2\2ag\t\5\2\2bc\7\17\2\2cg\7\f\2\2de\7\f\2\2"+
		"eg\7\17\2\2fa\3\2\2\2fb\3\2\2\2fd\3\2\2\2g\36\3\2\2\2hi\t\6\2\2i \3\2"+
		"\2\2jk\7\u00e4\2\2kl\7\u2015\2\2lm\7\u00b8\2\2m\"\3\2\2\2no\7\u00e4\2"+
		"\2op\7\u2016\2\2pq\7\u20ae\2\2q$\3\2\2\2rs\7\u00e4\2\2st\7\u00ae\2\2t"+
		"u\7\u2028\2\2u&\3\2\2\2vw\7\u00e4\2\2wx\7\u015d\2\2xy\7\u2015\2\2y(\3"+
		"\2\2\2z{\7\u00e4\2\2{|\7\u0180\2\2|}\7\u2024\2\2}*\3\2\2\2~\177\7\u00e4"+
		"\2\2\177\u0080\7\u0180\2\2\u0080\u0081\7\u2015\2\2\u0081,\3\2\2\2\u0082"+
		"\u0083\7\u00e4\2\2\u0083\u0084\7\u0180\2\2\u0084\u0085\7\u2016\2\2\u0085"+
		".\3\2\2\2\u0086\u0087\7\u00e4\2\2\u0087\u0088\7\u015d\2\2\u0088\u0089"+
		"\7\u00aa\2\2\u0089\u008a\7\u00e4\2\2\u008a\u008b\7\u015d\2\2\u008b\u008c"+
		"\7\u2015\2\2\u008c\60\3\2\2\2\u008d\u008e\7\u00e4\2\2\u008e\u008f\7\u015d"+
		"\2\2\u008f\u0090\7\u00aa\2\2\u0090\u0091\7\u00e4\2\2\u0091\u0092\7\u0180"+
		"\2\2\u0092\u0093\7\u2016\2\2\u0093\62\3\2\2\2\u0094\u0095\7\u00e4\2\2"+
		"\u0095\u0096\7\u015d\2\2\u0096\u0097\7\u201f\2\2\u0097\64\3\2\2\2\u0098"+
		"\u0099\7\u00e4\2\2\u0099\u009a\7\u0167\2\2\u009a\u009b\7\u015c\2\2\u009b"+
		"\66\3\2\2\2\u009c\u009d\7\u00e4\2\2\u009d\u009e\7\u0167\2\2\u009e\u009f"+
		"\7\u201e\2\2\u009f8\3\2\2\2\u00a0\u00a1\7\u0113\2\2\u00a1\u00a2\7\u017c"+
		"\2\2\u00a2\u00a3\7\u201f\2\2\u00a3\u00a4\7\u02da\2\2\u00a4:\3\2\2\2\u00a5"+
		"\u00a6\7\u0113\2\2\u00a6\u00a7\7\u017c\2\2\u00a7\u00a8\7\u201f\2\2\u00a8"+
		"\u00a9\7\u0143\2\2\u00a9<\3\2\2\2\u00aa\u00ab\7\u0113\2\2\u00ab\u00ac"+
		"\7\u017c\2\2\u00ac\u00ad\7\u201f\2\2\u00ad\u00ae\7\u02c9\2\2\u00ae>\3"+
		"\2\2\2\u00af\u00b0\7\u0113\2\2\u00b0\u00b1\7\u017c\2\2\u00b1\u00b2\7\u201f"+
		"\2\2\u00b2\u00b3\7\u00a2\2\2\u00b3@\3\2\2\2\4\2f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}