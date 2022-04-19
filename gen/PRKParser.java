// Generated from C:/Users/Tomáš/Desktop/PRK/PRK\PRK.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitBooleanPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitIntegerPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitFloatPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitCharPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitStringPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitExpressionPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitAssignmentToVarPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclarationPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclareBooleanPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclareIntegerPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclareFloatPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclareCharPRK(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclareStringPRK(this);
			else return visitor.visitChildren(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u01a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\7\3&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\6"+
		"\3\6\5\6\66\n\6\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\6\3\6\6\6A\n\6\r\6\16"+
		"\6B\3\6\3\6\6\6G\n\6\r\6\16\6H\5\6K\n\6\3\7\5\7N\n\7\3\7\6\7Q\n\7\r\7"+
		"\16\7R\3\7\3\7\6\7W\n\7\r\7\16\7X\3\b\3\b\3\b\3\b\3\t\3\t\7\ta\n\t\f\t"+
		"\16\td\13\t\3\t\3\t\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\3\n\7\nr\n"+
		"\n\f\n\16\nu\13\n\3\n\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\3\n\7\n\u0081"+
		"\n\n\f\n\16\n\u0084\13\n\3\n\7\n\u0087\n\n\f\n\16\n\u008a\13\n\3\n\3\n"+
		"\7\n\u008e\n\n\f\n\16\n\u0091\13\n\3\n\7\n\u0094\n\n\f\n\16\n\u0097\13"+
		"\n\3\n\6\n\u009a\n\n\r\n\16\n\u009b\3\n\7\n\u009f\n\n\f\n\16\n\u00a2\13"+
		"\n\5\n\u00a4\n\n\3\n\3\n\7\n\u00a8\n\n\f\n\16\n\u00ab\13\n\3\n\3\n\7\n"+
		"\u00af\n\n\f\n\16\n\u00b2\13\n\3\n\3\n\3\n\7\n\u00b7\n\n\f\n\16\n\u00ba"+
		"\13\n\3\n\3\n\7\n\u00be\n\n\f\n\16\n\u00c1\13\n\3\n\3\n\3\n\7\n\u00c6"+
		"\n\n\f\n\16\n\u00c9\13\n\3\n\3\n\7\n\u00cd\n\n\f\n\16\n\u00d0\13\n\3\n"+
		"\7\n\u00d3\n\n\f\n\16\n\u00d6\13\n\3\13\7\13\u00d9\n\13\f\13\16\13\u00dc"+
		"\13\13\3\13\7\13\u00df\n\13\f\13\16\13\u00e2\13\13\3\13\3\13\7\13\u00e6"+
		"\n\13\f\13\16\13\u00e9\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00f2\n"+
		"\f\3\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\3\r\7\r\u00fc\n\r\f\r\16"+
		"\r\u00ff\13\r\3\r\7\r\u0102\n\r\f\r\16\r\u0105\13\r\3\r\3\r\7\r\u0109"+
		"\n\r\f\r\16\r\u010c\13\r\3\r\3\r\7\r\u0110\n\r\f\r\16\r\u0113\13\r\3\r"+
		"\3\r\3\16\3\16\7\16\u0119\n\16\f\16\16\16\u011c\13\16\3\16\7\16\u011f"+
		"\n\16\f\16\16\16\u0122\13\16\3\16\7\16\u0125\n\16\f\16\16\16\u0128\13"+
		"\16\3\16\3\16\7\16\u012c\n\16\f\16\16\16\u012f\13\16\3\16\3\16\7\16\u0133"+
		"\n\16\f\16\16\16\u0136\13\16\3\16\3\16\3\17\3\17\7\17\u013c\n\17\f\17"+
		"\16\17\u013f\13\17\3\17\7\17\u0142\n\17\f\17\16\17\u0145\13\17\3\17\7"+
		"\17\u0148\n\17\f\17\16\17\u014b\13\17\3\17\3\17\7\17\u014f\n\17\f\17\16"+
		"\17\u0152\13\17\3\17\3\17\7\17\u0156\n\17\f\17\16\17\u0159\13\17\3\17"+
		"\3\17\3\20\3\20\7\20\u015f\n\20\f\20\16\20\u0162\13\20\3\20\7\20\u0165"+
		"\n\20\f\20\16\20\u0168\13\20\3\20\7\20\u016b\n\20\f\20\16\20\u016e\13"+
		"\20\3\20\3\20\7\20\u0172\n\20\f\20\16\20\u0175\13\20\3\20\3\20\7\20\u0179"+
		"\n\20\f\20\16\20\u017c\13\20\3\20\3\20\3\21\3\21\7\21\u0182\n\21\f\21"+
		"\16\21\u0185\13\21\3\21\7\21\u0188\n\21\f\21\16\21\u018b\13\21\3\21\7"+
		"\21\u018e\n\21\f\21\16\21\u0191\13\21\3\21\3\21\7\21\u0195\n\21\f\21\16"+
		"\21\u0198\13\21\3\21\3\21\7\21\u019c\n\21\f\21\16\21\u019f\13\21\3\21"+
		"\3\21\3\21\2\3\22\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\r\3\2\33"+
		"\34\3\2\6\7\3\2\5\7\3\2\5\6\4\2\5\7\13\13\4\2\5\7\13\f\4\2\5\7\13\21\4"+
		"\2\13\f\17\17\3\2\31\32\4\2\25\25\30\30\3\2\26\27\2\u01d5\2\"\3\2\2\2"+
		"\4\'\3\2\2\2\6/\3\2\2\2\b\61\3\2\2\2\nJ\3\2\2\2\fM\3\2\2\2\16Z\3\2\2\2"+
		"\20^\3\2\2\2\22\u00a3\3\2\2\2\24\u00da\3\2\2\2\26\u00f1\3\2\2\2\30\u00f3"+
		"\3\2\2\2\32\u0116\3\2\2\2\34\u0139\3\2\2\2\36\u015c\3\2\2\2 \u017f\3\2"+
		"\2\2\"#\5\4\3\2#\3\3\2\2\2$&\5\6\4\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'"+
		"(\3\2\2\2(\5\3\2\2\2)\'\3\2\2\2*\60\5\26\f\2+,\5\24\13\2,-\7\20\2\2-\60"+
		"\3\2\2\2.\60\7\20\2\2/*\3\2\2\2/+\3\2\2\2/.\3\2\2\2\60\7\3\2\2\2\61\62"+
		"\t\2\2\2\62\t\3\2\2\2\63K\7\5\2\2\64\66\7\b\2\2\65\64\3\2\2\2\65\66\3"+
		"\2\2\2\66\67\3\2\2\2\67;\t\3\2\28:\t\4\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2"+
		"\2;<\3\2\2\2<K\3\2\2\2=;\3\2\2\2>@\7\n\2\2?A\t\5\2\2@?\3\2\2\2AB\3\2\2"+
		"\2B@\3\2\2\2BC\3\2\2\2CK\3\2\2\2DF\7\t\2\2EG\t\6\2\2FE\3\2\2\2GH\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2J\63\3\2\2\2J\65\3\2\2\2J>\3\2\2\2JD\3"+
		"\2\2\2K\13\3\2\2\2LN\7\b\2\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\t\4\2\2P"+
		"O\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\7\r\2\2UW\t\4\2\2"+
		"VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2Z[\7\3\2\2[\\\t\7\2"+
		"\2\\]\7\3\2\2]\17\3\2\2\2^b\7\4\2\2_a\t\b\2\2`_\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\4\2\2f\21\3\2\2\2gh\b\n\1\2h"+
		"l\7\22\2\2ik\7\16\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2"+
		"\2nl\3\2\2\2os\5\22\n\2pr\7\16\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2"+
		"\2\2tv\3\2\2\2us\3\2\2\2vw\7\23\2\2w\u00a4\3\2\2\2xz\7\16\2\2yx\3\2\2"+
		"\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0082\5\n\6\2\177"+
		"\u0081\7\16\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u00a4\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0087\7\16\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008f\5\f\7\2\u008c\u008e\7\16\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u00a4\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0094\7\16\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009a\t\t\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d"+
		"\u009f\7\16\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"g\3\2\2\2\u00a3{\3\2\2\2\u00a3\u0088\3\2\2\2\u00a3\u0095\3\2\2\2\u00a4"+
		"\u00d4\3\2\2\2\u00a5\u00a9\f\b\2\2\u00a6\u00a8\7\16\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b0\t\n\2\2\u00ad\u00af\7\16"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00d3\5\22"+
		"\n\t\u00b4\u00b8\f\7\2\2\u00b5\u00b7\7\16\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\t\13\2\2\u00bc\u00be\7\16\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00d3\5\22\n\b\u00c3"+
		"\u00c7\f\6\2\2\u00c4\u00c6\7\16\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00ce\t\f\2\2\u00cb\u00cd\7\16\2\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\5\22\n\7\u00d2\u00a5\3"+
		"\2\2\2\u00d2\u00b4\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\23\3\2\2\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00d9\t\t\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e0\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00df\7\16\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e7\7\24\2\2\u00e4\u00e6\7\16\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\5\22\n\2\u00eb\25\3\2\2\2\u00ec\u00f2\5\30"+
		"\r\2\u00ed\u00f2\5\32\16\2\u00ee\u00f2\5\34\17\2\u00ef\u00f2\5\36\20\2"+
		"\u00f0\u00f2\5 \21\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\27\3\2\2\2\u00f3"+
		"\u00f7\7\35\2\2\u00f4\u00f6\7\16\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fc\t\t\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0103\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0102\7\16\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3"+
		"\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u010a\7\24\2\2\u0107\u0109\7\16\2\2\u0108\u0107\3"+
		"\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0111\5\b\5\2\u010e\u0110\7\16"+
		"\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\20"+
		"\2\2\u0115\31\3\2\2\2\u0116\u011a\7\36\2\2\u0117\u0119\7\16\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u0120\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\t\t\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0126\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\7\16\2\2\u0124"+
		"\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012d\7\24\2\2\u012a"+
		"\u012c\7\16\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3"+
		"\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0134\5\n\6\2\u0131\u0133\7\16\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3"+
		"\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0137\u0138\7\20\2\2\u0138\33\3\2\2\2\u0139\u013d\7\37"+
		"\2\2\u013a\u013c\7\16\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0143\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0142\t\t\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0146\u0148\7\16\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u0150\7\24\2\2\u014d\u014f\7\16\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0157\5\f\7\2\u0154\u0156\7\16\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\20\2\2\u015b"+
		"\35\3\2\2\2\u015c\u0160\7 \2\2\u015d\u015f\7\16\2\2\u015e\u015d\3\2\2"+
		"\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0166"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0165\t\t\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016c\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0169\u016b\7\16\2\2\u016a\u0169\3\2\2\2\u016b"+
		"\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016f\u0173\7\24\2\2\u0170\u0172\7\16\2\2\u0171"+
		"\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u017a\5\16\b\2\u0177"+
		"\u0179\7\16\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3"+
		"\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u017e\7\20\2\2\u017e\37\3\2\2\2\u017f\u0183\7!\2\2\u0180\u0182\7\16\2"+
		"\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0189\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188\t\t\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018f\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\7\16\2\2\u018d"+
		"\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0196\7\24\2\2\u0193"+
		"\u0195\7\16\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3"+
		"\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019d\5\20\t\2\u019a\u019c\7\16\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3"+
		"\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f"+
		"\u019d\3\2\2\2\u01a0\u01a1\7\20\2\2\u01a1!\3\2\2\2<\'/\65;BHJMRXbls{\u0082"+
		"\u0088\u008f\u0095\u009b\u00a0\u00a3\u00a9\u00b0\u00b8\u00bf\u00c7\u00ce"+
		"\u00d2\u00d4\u00da\u00e0\u00e7\u00f1\u00f7\u00fd\u0103\u010a\u0111\u011a"+
		"\u0120\u0126\u012d\u0134\u013d\u0143\u0149\u0150\u0157\u0160\u0166\u016c"+
		"\u0173\u017a\u0183\u0189\u018f\u0196\u019d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}