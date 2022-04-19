// Generated from PRK.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PRKParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ZERO=3, ONE=4, NONZERO=5, SIGN=6, HEXAPREFIX=7, BINPREFIX=8, 
		HEXALPHA=9, ALPHA=10, DOT=11, WS=12, US=13, NL=14, SYMBOL=15, LPAR=16, 
		RPAR=17, ASS=18, MUL=19, ADD=20, SUB=21, DIV=22, POW=23, SQR=24, TRUE=25, 
		FALSE=26, BOOL=27, INT=28, FLOAT=29, CHAR=30, STRING=31;
	public static final int
		RULE_syntax = 0, RULE_file = 1, RULE_line = 2, RULE_booleanPRK = 3, RULE_integerPRK = 4, 
		RULE_floatPRK = 5, RULE_charPRK = 6, RULE_stringPRK = 7, RULE_expressionPRK = 8, 
		RULE_assignmentToVarPRK = 9, RULE_declarationPRK = 10, RULE_declareBooleanPRK = 11, 
		RULE_declareIntegerPRK = 12, RULE_declareFloatPRK = 13, RULE_declareCharPRK = 14, 
		RULE_declareStringPRK = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"syntax", "file", "line", "booleanPRK", "integerPRK", "floatPRK", "charPRK", 
			"stringPRK", "expressionPRK", "assignmentToVarPRK", "declarationPRK", 
			"declareBooleanPRK", "declareIntegerPRK", "declareFloatPRK", "declareCharPRK", 
			"declareStringPRK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'''", "'\"'", "'0'", "'1'", null, null, "'\\u0111\\u017A\\u2026\\u00B0'", 
			"'\\u0111\\u017A\\u2026\\u00B1'", null, null, "'.'", "' '", "'_'", null, 
			null, "'\\u00E2\\u2013\\u00B6'", "'\\u00E2\\u2014\\u20AC'", "'\\u00E2\\u00AC\\u2026'", 
			"'\\u00E2\\u015B\\u2013'", "'\\u00E2\\u017E\\u2022'", "'\\u00E2\\u017E\\u2013'", 
			"'\\u00E2\\u017E\\u2014'", "'\\u00E2\\u015B\\u00A8\\u00E2\\u015B\\u2013'", 
			"'\\u00E2\\u015B\\u00A8\\u00E2\\u017E\\u2014'", "'\\u00E2\\u015B\\u201D'", 
			"'\\u00E2\\u0165\\u015A'", "'\\u00E2\\u0165\\u201C'", "'\\u0111\\u017A\\u201D\\u02D8'", 
			"'\\u0111\\u017A\\u201D\\u0141'", "'\\u0111\\u017A\\u201D\\u02C7'", "'\\u0111\\u017A\\u201D\\u00A0'"
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

	@Override
	public String getGrammarFileName() { return "PRK.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PRKParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SyntaxContext extends ParserRuleContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitSyntax(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_syntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			file();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << WS) | (1L << US) | (1L << NL) | (1L << ASS) | (1L << BOOL) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				{
				setState(34);
				line();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public DeclarationPRKContext declarationPRK() {
			return getRuleContext(DeclarationPRKContext.class,0);
		}
		public AssignmentToVarPRKContext assignmentToVarPRK() {
			return getRuleContext(AssignmentToVarPRKContext.class,0);
		}
		public TerminalNode NL() { return getToken(PRKParser.NL, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				declarationPRK();
				}
				break;
			case HEXALPHA:
			case ALPHA:
			case WS:
			case US:
			case ASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				assignmentToVarPRK();
				setState(42);
				match(NL);
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(NL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanPRKContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PRKParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PRKParser.FALSE, 0); }
		public BooleanPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterBooleanPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitBooleanPRK(this);
		}
	}

	public final BooleanPRKContext booleanPRK() throws RecognitionException {
		BooleanPRKContext _localctx = new BooleanPRKContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_booleanPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerPRKContext extends ParserRuleContext {
		public List<TerminalNode> ZERO() { return getTokens(PRKParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(PRKParser.ZERO, i);
		}
		public List<TerminalNode> ONE() { return getTokens(PRKParser.ONE); }
		public TerminalNode ONE(int i) {
			return getToken(PRKParser.ONE, i);
		}
		public List<TerminalNode> NONZERO() { return getTokens(PRKParser.NONZERO); }
		public TerminalNode NONZERO(int i) {
			return getToken(PRKParser.NONZERO, i);
		}
		public TerminalNode SIGN() { return getToken(PRKParser.SIGN, 0); }
		public TerminalNode BINPREFIX() { return getToken(PRKParser.BINPREFIX, 0); }
		public TerminalNode HEXAPREFIX() { return getToken(PRKParser.HEXAPREFIX, 0); }
		public List<TerminalNode> HEXALPHA() { return getTokens(PRKParser.HEXALPHA); }
		public TerminalNode HEXALPHA(int i) {
			return getToken(PRKParser.HEXALPHA, i);
		}
		public IntegerPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterIntegerPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitIntegerPRK(this);
		}
	}

	public final IntegerPRKContext integerPRK() throws RecognitionException {
		IntegerPRKContext _localctx = new IntegerPRKContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integerPRK);
		int _la;
		try {
			int _alt;
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(ZERO);
				}
				break;
			case ONE:
			case NONZERO:
			case SIGN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(50);
					match(SIGN);
					}
				}

				setState(53);
				_la = _input.LA(1);
				if ( !(_la==ONE || _la==NONZERO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(54);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(59);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				}
				break;
			case BINPREFIX:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(BINPREFIX);
				setState(62); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(61);
						_la = _input.LA(1);
						if ( !(_la==ZERO || _la==ONE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(64); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case HEXAPREFIX:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(HEXAPREFIX);
				setState(68); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(67);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO) | (1L << HEXALPHA))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(70); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatPRKContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PRKParser.DOT, 0); }
		public TerminalNode SIGN() { return getToken(PRKParser.SIGN, 0); }
		public List<TerminalNode> ZERO() { return getTokens(PRKParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(PRKParser.ZERO, i);
		}
		public List<TerminalNode> ONE() { return getTokens(PRKParser.ONE); }
		public TerminalNode ONE(int i) {
			return getToken(PRKParser.ONE, i);
		}
		public List<TerminalNode> NONZERO() { return getTokens(PRKParser.NONZERO); }
		public TerminalNode NONZERO(int i) {
			return getToken(PRKParser.NONZERO, i);
		}
		public FloatPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterFloatPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitFloatPRK(this);
		}
	}

	public final FloatPRKContext floatPRK() throws RecognitionException {
		FloatPRKContext _localctx = new FloatPRKContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatPRK);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(74);
				match(SIGN);
				}
			}

			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO))) != 0) );
			setState(82);
			match(DOT);
			setState(84); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(83);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharPRKContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(PRKParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(PRKParser.ONE, 0); }
		public TerminalNode NONZERO() { return getToken(PRKParser.NONZERO, 0); }
		public TerminalNode HEXALPHA() { return getToken(PRKParser.HEXALPHA, 0); }
		public TerminalNode ALPHA() { return getToken(PRKParser.ALPHA, 0); }
		public CharPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterCharPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitCharPRK(this);
		}
	}

	public final CharPRKContext charPRK() throws RecognitionException {
		CharPRKContext _localctx = new CharPRKContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_charPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__0);
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO) | (1L << HEXALPHA) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(90);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringPRKContext extends ParserRuleContext {
		public List<TerminalNode> ZERO() { return getTokens(PRKParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(PRKParser.ZERO, i);
		}
		public List<TerminalNode> ONE() { return getTokens(PRKParser.ONE); }
		public TerminalNode ONE(int i) {
			return getToken(PRKParser.ONE, i);
		}
		public List<TerminalNode> NONZERO() { return getTokens(PRKParser.NONZERO); }
		public TerminalNode NONZERO(int i) {
			return getToken(PRKParser.NONZERO, i);
		}
		public List<TerminalNode> HEXALPHA() { return getTokens(PRKParser.HEXALPHA); }
		public TerminalNode HEXALPHA(int i) {
			return getToken(PRKParser.HEXALPHA, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(PRKParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(PRKParser.ALPHA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PRKParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PRKParser.DOT, i);
		}
		public List<TerminalNode> WS() { return getTokens(PRKParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PRKParser.WS, i);
		}
		public List<TerminalNode> US() { return getTokens(PRKParser.US); }
		public TerminalNode US(int i) {
			return getToken(PRKParser.US, i);
		}
		public List<TerminalNode> NL() { return getTokens(PRKParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PRKParser.NL, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(PRKParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(PRKParser.SYMBOL, i);
		}
		public StringPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterStringPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitStringPRK(this);
		}
	}

	public final StringPRKContext stringPRK() throws RecognitionException {
		StringPRKContext _localctx = new StringPRKContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stringPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__1);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO) | (1L << HEXALPHA) | (1L << ALPHA) | (1L << DOT) | (1L << WS) | (1L << US) | (1L << NL) | (1L << SYMBOL))) != 0)) {
				{
				{
				setState(93);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO) | (1L << HEXALPHA) | (1L << ALPHA) | (1L << DOT) | (1L << WS) | (1L << US) | (1L << NL) | (1L << SYMBOL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionPRKContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PRKParser.LPAR, 0); }
		public List<ExpressionPRKContext> expressionPRK() {
			return getRuleContexts(ExpressionPRKContext.class);
		}
		public ExpressionPRKContext expressionPRK(int i) {
			return getRuleContext(ExpressionPRKContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(PRKParser.RPAR, 0); }
		public List<TerminalNode> WS() { return getTokens(PRKParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PRKParser.WS, i);
		}
		public IntegerPRKContext integerPRK() {
			return getRuleContext(IntegerPRKContext.class,0);
		}
		public FloatPRKContext floatPRK() {
			return getRuleContext(FloatPRKContext.class,0);
		}
		public List<TerminalNode> HEXALPHA() { return getTokens(PRKParser.HEXALPHA); }
		public TerminalNode HEXALPHA(int i) {
			return getToken(PRKParser.HEXALPHA, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(PRKParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(PRKParser.ALPHA, i);
		}
		public List<TerminalNode> US() { return getTokens(PRKParser.US); }
		public TerminalNode US(int i) {
			return getToken(PRKParser.US, i);
		}
		public TerminalNode POW() { return getToken(PRKParser.POW, 0); }
		public TerminalNode SQR() { return getToken(PRKParser.SQR, 0); }
		public TerminalNode MUL() { return getToken(PRKParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PRKParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(PRKParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PRKParser.SUB, 0); }
		public ExpressionPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterExpressionPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitExpressionPRK(this);
		}
	}

	public final ExpressionPRKContext expressionPRK() throws RecognitionException {
		return expressionPRK(0);
	}

	private ExpressionPRKContext expressionPRK(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionPRKContext _localctx = new ExpressionPRKContext(_ctx, _parentState);
		ExpressionPRKContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expressionPRK, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(102);
				match(LPAR);
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(103);
						match(WS);
						}
						} 
					}
					setState(108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(109);
				expressionPRK(0);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(110);
					match(WS);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(118);
					match(WS);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				integerPRK();
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(125);
						match(WS);
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(131);
					match(WS);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				floatPRK();
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(138);
						match(WS);
						}
						} 
					}
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(144);
					match(WS);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(150);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(155);
						match(WS);
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionPRKContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionPRK);
						setState(163);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(164);
							match(WS);
							}
							}
							setState(169);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(170);
						_la = _input.LA(1);
						if ( !(_la==POW || _la==SQR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(174);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(171);
								match(WS);
								}
								} 
							}
							setState(176);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
						}
						setState(177);
						expressionPRK(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionPRKContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionPRK);
						setState(178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(179);
							match(WS);
							}
							}
							setState(184);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(185);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(186);
								match(WS);
								}
								} 
							}
							setState(191);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
						}
						setState(192);
						expressionPRK(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionPRKContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionPRK);
						setState(193);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(194);
							match(WS);
							}
							}
							setState(199);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(200);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(201);
								match(WS);
								}
								} 
							}
							setState(206);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
						}
						setState(207);
						expressionPRK(5);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentToVarPRKContext extends ParserRuleContext {
		public TerminalNode ASS() { return getToken(PRKParser.ASS, 0); }
		public ExpressionPRKContext expressionPRK() {
			return getRuleContext(ExpressionPRKContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(PRKParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PRKParser.WS, i);
		}
		public List<TerminalNode> HEXALPHA() { return getTokens(PRKParser.HEXALPHA); }
		public TerminalNode HEXALPHA(int i) {
			return getToken(PRKParser.HEXALPHA, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(PRKParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(PRKParser.ALPHA, i);
		}
		public List<TerminalNode> US() { return getTokens(PRKParser.US); }
		public TerminalNode US(int i) {
			return getToken(PRKParser.US, i);
		}
		public AssignmentToVarPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentToVarPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterAssignmentToVarPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitAssignmentToVarPRK(this);
		}
	}

	public final AssignmentToVarPRKContext assignmentToVarPRK() throws RecognitionException {
		AssignmentToVarPRKContext _localctx = new AssignmentToVarPRKContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentToVarPRK);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(213);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(219);
				match(WS);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(ASS);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					match(WS);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(232);
			expressionPRK(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationPRKContext extends ParserRuleContext {
		public DeclareBooleanPRKContext declareBooleanPRK() {
			return getRuleContext(DeclareBooleanPRKContext.class,0);
		}
		public DeclareIntegerPRKContext declareIntegerPRK() {
			return getRuleContext(DeclareIntegerPRKContext.class,0);
		}
		public DeclareFloatPRKContext declareFloatPRK() {
			return getRuleContext(DeclareFloatPRKContext.class,0);
		}
		public DeclareCharPRKContext declareCharPRK() {
			return getRuleContext(DeclareCharPRKContext.class,0);
		}
		public DeclareStringPRKContext declareStringPRK() {
			return getRuleContext(DeclareStringPRKContext.class,0);
		}
		public DeclarationPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterDeclarationPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitDeclarationPRK(this);
		}
	}

	public final DeclarationPRKContext declarationPRK() throws RecognitionException {
		DeclarationPRKContext _localctx = new DeclarationPRKContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationPRK);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				declareBooleanPRK();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				declareIntegerPRK();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				declareFloatPRK();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				declareCharPRK();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				declareStringPRK();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareBooleanPRKContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(PRKParser.BOOL, 0); }
		public TerminalNode ASS() { return getToken(PRKParser.ASS, 0); }
		public BooleanPRKContext booleanPRK() {
			return getRuleContext(BooleanPRKContext.class,0);
		}
		public TerminalNode NL() { return getToken(PRKParser.NL, 0); }
		public List<TerminalNode> WS() { return getTokens(PRKParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PRKParser.WS, i);
		}
		public List<TerminalNode> HEXALPHA() { return getTokens(PRKParser.HEXALPHA); }
		public TerminalNode HEXALPHA(int i) {
			return getToken(PRKParser.HEXALPHA, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(PRKParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(PRKParser.ALPHA, i);
		}
		public List<TerminalNode> US() { return getTokens(PRKParser.US); }
		public TerminalNode US(int i) {
			return getToken(PRKParser.US, i);
		}
		public DeclareBooleanPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareBooleanPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterDeclareBooleanPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitDeclareBooleanPRK(this);
		}
	}

	public final DeclareBooleanPRKContext declareBooleanPRK() throws RecognitionException {
		DeclareBooleanPRKContext _localctx = new DeclareBooleanPRKContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declareBooleanPRK);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(BOOL);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					match(WS);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(248);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(254);
				match(WS);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(ASS);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(261);
				match(WS);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			booleanPRK();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(268);
				match(WS);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareIntegerPRKContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PRKParser.INT, 0); }
		public TerminalNode ASS() { return getToken(PRKParser.ASS, 0); }
		public IntegerPRKContext integerPRK() {
			return getRuleContext(IntegerPRKContext.class,0);
		}
		public TerminalNode NL() { return getToken(PRKParser.NL, 0); }
		public List<TerminalNode> WS() { return getTokens(PRKParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PRKParser.WS, i);
		}
		public List<TerminalNode> HEXALPHA() { return getTokens(PRKParser.HEXALPHA); }
		public TerminalNode HEXALPHA(int i) {
			return getToken(PRKParser.HEXALPHA, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(PRKParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(PRKParser.ALPHA, i);
		}
		public List<TerminalNode> US() { return getTokens(PRKParser.US); }
		public TerminalNode US(int i) {
			return getToken(PRKParser.US, i);
		}
		public DeclareIntegerPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareIntegerPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterDeclareIntegerPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitDeclareIntegerPRK(this);
		}
	}

	public final DeclareIntegerPRKContext declareIntegerPRK() throws RecognitionException {
		DeclareIntegerPRKContext _localctx = new DeclareIntegerPRKContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declareIntegerPRK);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(INT);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					match(WS);
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(283);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(289);
				match(WS);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(ASS);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(296);
				match(WS);
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			integerPRK();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(303);
				match(WS);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareFloatPRKContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(PRKParser.FLOAT, 0); }
		public TerminalNode ASS() { return getToken(PRKParser.ASS, 0); }
		public FloatPRKContext floatPRK() {
			return getRuleContext(FloatPRKContext.class,0);
		}
		public TerminalNode NL() { return getToken(PRKParser.NL, 0); }
		public List<TerminalNode> WS() { return getTokens(PRKParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PRKParser.WS, i);
		}
		public List<TerminalNode> HEXALPHA() { return getTokens(PRKParser.HEXALPHA); }
		public TerminalNode HEXALPHA(int i) {
			return getToken(PRKParser.HEXALPHA, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(PRKParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(PRKParser.ALPHA, i);
		}
		public List<TerminalNode> US() { return getTokens(PRKParser.US); }
		public TerminalNode US(int i) {
			return getToken(PRKParser.US, i);
		}
		public DeclareFloatPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareFloatPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterDeclareFloatPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitDeclareFloatPRK(this);
		}
	}

	public final DeclareFloatPRKContext declareFloatPRK() throws RecognitionException {
		DeclareFloatPRKContext _localctx = new DeclareFloatPRKContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declareFloatPRK);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(FLOAT);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(WS);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(318);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(324);
				match(WS);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			match(ASS);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(331);
				match(WS);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			floatPRK();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(338);
				match(WS);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareCharPRKContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(PRKParser.CHAR, 0); }
		public TerminalNode ASS() { return getToken(PRKParser.ASS, 0); }
		public CharPRKContext charPRK() {
			return getRuleContext(CharPRKContext.class,0);
		}
		public TerminalNode NL() { return getToken(PRKParser.NL, 0); }
		public List<TerminalNode> WS() { return getTokens(PRKParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PRKParser.WS, i);
		}
		public List<TerminalNode> HEXALPHA() { return getTokens(PRKParser.HEXALPHA); }
		public TerminalNode HEXALPHA(int i) {
			return getToken(PRKParser.HEXALPHA, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(PRKParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(PRKParser.ALPHA, i);
		}
		public List<TerminalNode> US() { return getTokens(PRKParser.US); }
		public TerminalNode US(int i) {
			return getToken(PRKParser.US, i);
		}
		public DeclareCharPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareCharPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterDeclareCharPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitDeclareCharPRK(this);
		}
	}

	public final DeclareCharPRKContext declareCharPRK() throws RecognitionException {
		DeclareCharPRKContext _localctx = new DeclareCharPRKContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declareCharPRK);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(CHAR);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(347);
					match(WS);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(353);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(359);
				match(WS);
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			match(ASS);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(366);
				match(WS);
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			charPRK();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(373);
				match(WS);
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareStringPRKContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PRKParser.STRING, 0); }
		public TerminalNode ASS() { return getToken(PRKParser.ASS, 0); }
		public StringPRKContext stringPRK() {
			return getRuleContext(StringPRKContext.class,0);
		}
		public TerminalNode NL() { return getToken(PRKParser.NL, 0); }
		public List<TerminalNode> WS() { return getTokens(PRKParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PRKParser.WS, i);
		}
		public List<TerminalNode> HEXALPHA() { return getTokens(PRKParser.HEXALPHA); }
		public TerminalNode HEXALPHA(int i) {
			return getToken(PRKParser.HEXALPHA, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(PRKParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(PRKParser.ALPHA, i);
		}
		public List<TerminalNode> US() { return getTokens(PRKParser.US); }
		public TerminalNode US(int i) {
			return getToken(PRKParser.US, i);
		}
		public DeclareStringPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStringPRK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).enterDeclareStringPRK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PRKListener ) ((PRKListener)listener).exitDeclareStringPRK(this);
		}
	}

	public final DeclareStringPRKContext declareStringPRK() throws RecognitionException {
		DeclareStringPRKContext _localctx = new DeclareStringPRKContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declareStringPRK);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(STRING);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					match(WS);
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(388);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(394);
				match(WS);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			match(ASS);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(401);
				match(WS);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			stringPRK();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(408);
				match(WS);
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expressionPRK_sempred((ExpressionPRKContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionPRK_sempred(ExpressionPRKContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u01a1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001$\b\u0001\n\u0001"+
		"\f\u0001\'\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u00044\b\u0004\u0001\u0004\u0001\u0004\u0005\u00048\b\u0004"+
		"\n\u0004\f\u0004;\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004?\b\u0004"+
		"\u000b\u0004\f\u0004@\u0001\u0004\u0001\u0004\u0004\u0004E\b\u0004\u000b"+
		"\u0004\f\u0004F\u0003\u0004I\b\u0004\u0001\u0005\u0003\u0005L\b\u0005"+
		"\u0001\u0005\u0004\u0005O\b\u0005\u000b\u0005\f\u0005P\u0001\u0005\u0001"+
		"\u0005\u0004\u0005U\b\u0005\u000b\u0005\f\u0005V\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007_\b\u0007"+
		"\n\u0007\f\u0007b\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\bi\b\b\n\b\f\bl\t\b\u0001\b\u0001\b\u0005\bp\b\b\n\b\f\bs\t\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\bx\b\b\n\b\f\b{\t\b\u0001\b\u0001\b\u0005"+
		"\b\u007f\b\b\n\b\f\b\u0082\t\b\u0001\b\u0005\b\u0085\b\b\n\b\f\b\u0088"+
		"\t\b\u0001\b\u0001\b\u0005\b\u008c\b\b\n\b\f\b\u008f\t\b\u0001\b\u0005"+
		"\b\u0092\b\b\n\b\f\b\u0095\t\b\u0001\b\u0004\b\u0098\b\b\u000b\b\f\b\u0099"+
		"\u0001\b\u0005\b\u009d\b\b\n\b\f\b\u00a0\t\b\u0003\b\u00a2\b\b\u0001\b"+
		"\u0001\b\u0005\b\u00a6\b\b\n\b\f\b\u00a9\t\b\u0001\b\u0001\b\u0005\b\u00ad"+
		"\b\b\n\b\f\b\u00b0\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00b5\b\b\n\b\f"+
		"\b\u00b8\t\b\u0001\b\u0001\b\u0005\b\u00bc\b\b\n\b\f\b\u00bf\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00c4\b\b\n\b\f\b\u00c7\t\b\u0001\b\u0001\b"+
		"\u0005\b\u00cb\b\b\n\b\f\b\u00ce\t\b\u0001\b\u0005\b\u00d1\b\b\n\b\f\b"+
		"\u00d4\t\b\u0001\t\u0005\t\u00d7\b\t\n\t\f\t\u00da\t\t\u0001\t\u0005\t"+
		"\u00dd\b\t\n\t\f\t\u00e0\t\t\u0001\t\u0001\t\u0005\t\u00e4\b\t\n\t\f\t"+
		"\u00e7\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00f0\b\n\u0001\u000b\u0001\u000b\u0005\u000b\u00f4\b\u000b\n\u000b"+
		"\f\u000b\u00f7\t\u000b\u0001\u000b\u0005\u000b\u00fa\b\u000b\n\u000b\f"+
		"\u000b\u00fd\t\u000b\u0001\u000b\u0005\u000b\u0100\b\u000b\n\u000b\f\u000b"+
		"\u0103\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0107\b\u000b\n\u000b"+
		"\f\u000b\u010a\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u010e\b\u000b"+
		"\n\u000b\f\u000b\u0111\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0005\f\u0117\b\f\n\f\f\f\u011a\t\f\u0001\f\u0005\f\u011d\b\f\n\f\f\f"+
		"\u0120\t\f\u0001\f\u0005\f\u0123\b\f\n\f\f\f\u0126\t\f\u0001\f\u0001\f"+
		"\u0005\f\u012a\b\f\n\f\f\f\u012d\t\f\u0001\f\u0001\f\u0005\f\u0131\b\f"+
		"\n\f\f\f\u0134\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u013a\b\r\n"+
		"\r\f\r\u013d\t\r\u0001\r\u0005\r\u0140\b\r\n\r\f\r\u0143\t\r\u0001\r\u0005"+
		"\r\u0146\b\r\n\r\f\r\u0149\t\r\u0001\r\u0001\r\u0005\r\u014d\b\r\n\r\f"+
		"\r\u0150\t\r\u0001\r\u0001\r\u0005\r\u0154\b\r\n\r\f\r\u0157\t\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u015d\b\u000e\n\u000e\f"+
		"\u000e\u0160\t\u000e\u0001\u000e\u0005\u000e\u0163\b\u000e\n\u000e\f\u000e"+
		"\u0166\t\u000e\u0001\u000e\u0005\u000e\u0169\b\u000e\n\u000e\f\u000e\u016c"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0170\b\u000e\n\u000e\f\u000e"+
		"\u0173\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0177\b\u000e\n\u000e"+
		"\f\u000e\u017a\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0180\b\u000f\n\u000f\f\u000f\u0183\t\u000f\u0001\u000f\u0005"+
		"\u000f\u0186\b\u000f\n\u000f\f\u000f\u0189\t\u000f\u0001\u000f\u0005\u000f"+
		"\u018c\b\u000f\n\u000f\f\u000f\u018f\t\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0193\b\u000f\n\u000f\f\u000f\u0196\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u019a\b\u000f\n\u000f\f\u000f\u019d\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0000\u0001\u0010\u0010\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u000b\u0001"+
		"\u0000\u0019\u001a\u0001\u0000\u0004\u0005\u0001\u0000\u0003\u0005\u0001"+
		"\u0000\u0003\u0004\u0002\u0000\u0003\u0005\t\t\u0002\u0000\u0003\u0005"+
		"\t\n\u0002\u0000\u0003\u0005\t\u000f\u0002\u0000\t\n\r\r\u0001\u0000\u0017"+
		"\u0018\u0002\u0000\u0013\u0013\u0016\u0016\u0001\u0000\u0014\u0015\u01d3"+
		"\u0000 \u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004-"+
		"\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\bH\u0001\u0000"+
		"\u0000\u0000\nK\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e"+
		"\\\u0001\u0000\u0000\u0000\u0010\u00a1\u0001\u0000\u0000\u0000\u0012\u00d8"+
		"\u0001\u0000\u0000\u0000\u0014\u00ef\u0001\u0000\u0000\u0000\u0016\u00f1"+
		"\u0001\u0000\u0000\u0000\u0018\u0114\u0001\u0000\u0000\u0000\u001a\u0137"+
		"\u0001\u0000\u0000\u0000\u001c\u015a\u0001\u0000\u0000\u0000\u001e\u017d"+
		"\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000!\u0001\u0001\u0000"+
		"\u0000\u0000\"$\u0003\u0004\u0002\u0000#\"\u0001\u0000\u0000\u0000$\'"+
		"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\u0003\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(.\u0003"+
		"\u0014\n\u0000)*\u0003\u0012\t\u0000*+\u0005\u000e\u0000\u0000+.\u0001"+
		"\u0000\u0000\u0000,.\u0005\u000e\u0000\u0000-(\u0001\u0000\u0000\u0000"+
		"-)\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0005\u0001\u0000"+
		"\u0000\u0000/0\u0007\u0000\u0000\u00000\u0007\u0001\u0000\u0000\u0000"+
		"1I\u0005\u0003\u0000\u000024\u0005\u0006\u0000\u000032\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000059\u0007\u0001"+
		"\u0000\u000068\u0007\u0002\u0000\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":I\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0005\b\u0000\u0000"+
		"=?\u0007\u0003\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AI\u0001\u0000"+
		"\u0000\u0000BD\u0005\u0007\u0000\u0000CE\u0007\u0004\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000H1\u0001\u0000\u0000"+
		"\u0000H3\u0001\u0000\u0000\u0000H<\u0001\u0000\u0000\u0000HB\u0001\u0000"+
		"\u0000\u0000I\t\u0001\u0000\u0000\u0000JL\u0005\u0006\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000"+
		"MO\u0007\u0002\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RT\u0005\u000b\u0000\u0000SU\u0007\u0002\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0005\u0001"+
		"\u0000\u0000YZ\u0007\u0005\u0000\u0000Z[\u0005\u0001\u0000\u0000[\r\u0001"+
		"\u0000\u0000\u0000\\`\u0005\u0002\u0000\u0000]_\u0007\u0006\u0000\u0000"+
		"^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000cd\u0005\u0002\u0000\u0000d\u000f\u0001\u0000\u0000\u0000"+
		"ef\u0006\b\uffff\uffff\u0000fj\u0005\u0010\u0000\u0000gi\u0005\f\u0000"+
		"\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000mq\u0003\u0010\b\u0000np\u0005\f\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000tu\u0005\u0011\u0000\u0000u\u00a2\u0001\u0000\u0000\u0000vx\u0005"+
		"\f\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|\u0080\u0003\b\u0004\u0000}\u007f\u0005\f\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u00a2"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0085"+
		"\u0005\f\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008d\u0003\n\u0005\u0000\u008a\u008c\u0005\f"+
		"\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u00a2\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0092\u0005\f\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0098\u0007\u0007\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009e\u0001\u0000\u0000\u0000\u009b\u009d\u0005\f\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1e\u0001\u0000\u0000\u0000\u00a1y\u0001\u0000\u0000\u0000\u00a1\u0086"+
		"\u0001\u0000\u0000\u0000\u00a1\u0093\u0001\u0000\u0000\u0000\u00a2\u00d2"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a7\n\u0006\u0000\u0000\u00a4\u00a6\u0005"+
		"\f\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ae\u0007\b\u0000\u0000\u00ab\u00ad\u0005\f\u0000"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u00d1\u0003\u0010\b\u0007\u00b2\u00b6\n\u0005\u0000\u0000"+
		"\u00b3\u00b5\u0005\f\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bd\u0007\t\u0000\u0000\u00ba\u00bc"+
		"\u0005\f\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00d1\u0003\u0010\b\u0006\u00c1\u00c5\n\u0004"+
		"\u0000\u0000\u00c2\u00c4\u0005\f\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00cc\u0007\n\u0000\u0000"+
		"\u00c9\u00cb\u0005\f\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003\u0010\b\u0005\u00d0\u00a3"+
		"\u0001\u0000\u0000\u0000\u00d0\u00b2\u0001\u0000\u0000\u0000\u00d0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u0011"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d7"+
		"\u0007\u0007\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00de\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00dd\u0005\f\u0000\u0000\u00dc\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e5\u0005"+
		"\u0012\u0000\u0000\u00e2\u00e4\u0005\f\u0000\u0000\u00e3\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003\u0010"+
		"\b\u0000\u00e9\u0013\u0001\u0000\u0000\u0000\u00ea\u00f0\u0003\u0016\u000b"+
		"\u0000\u00eb\u00f0\u0003\u0018\f\u0000\u00ec\u00f0\u0003\u001a\r\u0000"+
		"\u00ed\u00f0\u0003\u001c\u000e\u0000\u00ee\u00f0\u0003\u001e\u000f\u0000"+
		"\u00ef\u00ea\u0001\u0000\u0000\u0000\u00ef\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u0015\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f5\u0005\u001b\u0000\u0000\u00f2\u00f4\u0005\f\u0000\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00fb\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fa\u0007\u0007\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u0101\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fe\u0100\u0005\f\u0000\u0000\u00ff\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0108"+
		"\u0005\u0012\u0000\u0000\u0105\u0107\u0005\f\u0000\u0000\u0106\u0105\u0001"+
		"\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010f\u0003"+
		"\u0006\u0003\u0000\u010c\u010e\u0005\f\u0000\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u000e"+
		"\u0000\u0000\u0113\u0017\u0001\u0000\u0000\u0000\u0114\u0118\u0005\u001c"+
		"\u0000\u0000\u0115\u0117\u0005\f\u0000\u0000\u0116\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011e\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011d\u0007\u0007\u0000"+
		"\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000"+
		"\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0124\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0121\u0123\u0005\f\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u012b\u0005\u0012\u0000\u0000"+
		"\u0128\u012a\u0005\f\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a"+
		"\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d"+
		"\u012b\u0001\u0000\u0000\u0000\u012e\u0132\u0003\b\u0004\u0000\u012f\u0131"+
		"\u0005\f\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0134\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0005\u000e\u0000\u0000\u0136\u0019\u0001"+
		"\u0000\u0000\u0000\u0137\u013b\u0005\u001d\u0000\u0000\u0138\u013a\u0005"+
		"\f\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000"+
		"\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u0141\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000"+
		"\u0000\u0000\u013e\u0140\u0007\u0007\u0000\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0147\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0146\u0005\f\u0000"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000"+
		"\u0000\u014a\u014e\u0005\u0012\u0000\u0000\u014b\u014d\u0005\f\u0000\u0000"+
		"\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000"+
		"\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000"+
		"\u0151\u0155\u0003\n\u0005\u0000\u0152\u0154\u0005\f\u0000\u0000\u0153"+
		"\u0152\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155"+
		"\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u0158\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0005\u000e\u0000\u0000\u0159\u001b\u0001\u0000\u0000\u0000\u015a"+
		"\u015e\u0005\u001e\u0000\u0000\u015b\u015d\u0005\f\u0000\u0000\u015c\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0164"+
		"\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0163"+
		"\u0007\u0007\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0166"+
		"\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165\u016a\u0001\u0000\u0000\u0000\u0166\u0164"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u0005\f\u0000\u0000\u0168\u0167\u0001"+
		"\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001"+
		"\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0171\u0005"+
		"\u0012\u0000\u0000\u016e\u0170\u0005\f\u0000\u0000\u016f\u016e\u0001\u0000"+
		"\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000"+
		"\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0178\u0003\f\u0006"+
		"\u0000\u0175\u0177\u0005\f\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000"+
		"\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u000e\u0000\u0000"+
		"\u017c\u001d\u0001\u0000\u0000\u0000\u017d\u0181\u0005\u001f\u0000\u0000"+
		"\u017e\u0180\u0005\f\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180"+
		"\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0187\u0001\u0000\u0000\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0184\u0186\u0007\u0007\u0000\u0000\u0185"+
		"\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187"+
		"\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u018d\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a"+
		"\u018c\u0005\f\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018f"+
		"\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0001\u0000\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u0190\u0194\u0005\u0012\u0000\u0000\u0191\u0193"+
		"\u0005\f\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0196\u0001"+
		"\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0194\u0001"+
		"\u0000\u0000\u0000\u0197\u019b\u0003\u000e\u0007\u0000\u0198\u019a\u0005"+
		"\f\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000"+
		"\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0005\u000e\u0000\u0000\u019f\u001f\u0001\u0000"+
		"\u0000\u0000:%-39@FHKPV`jqy\u0080\u0086\u008d\u0093\u0099\u009e\u00a1"+
		"\u00a7\u00ae\u00b6\u00bd\u00c5\u00cc\u00d0\u00d2\u00d8\u00de\u00e5\u00ef"+
		"\u00f5\u00fb\u0101\u0108\u010f\u0118\u011e\u0124\u012b\u0132\u013b\u0141"+
		"\u0147\u014e\u0155\u015e\u0164\u016a\u0171\u0178\u0181\u0187\u018d\u0194"+
		"\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}