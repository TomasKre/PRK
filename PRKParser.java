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
		HEXALPHA=9, ALPHA=10, DOT=11, US=12, NL=13, SYMBOL=14, LPAR=15, RPAR=16, 
		ASS=17, MUL=18, ADD=19, SUB=20, DIV=21, POW=22, SQR=23, TRUE=24, FALSE=25, 
		BOOL=26, INT=27, FLOAT=28, CHAR=29, STRING=30, WS=31, ERROR=32;
	public static final int
		RULE_syntax = 0, RULE_line = 1, RULE_booleanPRK = 2, RULE_integerPRK = 3, 
		RULE_floatPRK = 4, RULE_charPRK = 5, RULE_stringPRK = 6, RULE_expressionPRK = 7, 
		RULE_assignmentToVarPRK = 8, RULE_declarationPRK = 9, RULE_declareBooleanPRK = 10, 
		RULE_declareIntegerPRK = 11, RULE_declareFloatPRK = 12, RULE_declareCharPRK = 13, 
		RULE_declareStringPRK = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"syntax", "line", "booleanPRK", "integerPRK", "floatPRK", "charPRK", 
			"stringPRK", "expressionPRK", "assignmentToVarPRK", "declarationPRK", 
			"declareBooleanPRK", "declareIntegerPRK", "declareFloatPRK", "declareCharPRK", 
			"declareStringPRK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'''", "'\"'", "'0'", "'1'", null, null, "'\\u0111\\u017A\\u2026\\u00B0'", 
			"'\\u0111\\u017A\\u2026\\u00B1'", null, null, "'.'", "'_'", null, null, 
			"'\\u00E2\\u2013\\u00B6'", "'\\u00E2\\u2014\\u20AC'", "'\\u00E2\\u00AC\\u2026'", 
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
			"HEXALPHA", "ALPHA", "DOT", "US", "NL", "SYMBOL", "LPAR", "RPAR", "ASS", 
			"MUL", "ADD", "SUB", "DIV", "POW", "SQR", "TRUE", "FALSE", "BOOL", "INT", 
			"FLOAT", "CHAR", "STRING", "WS", "ERROR"
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
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_syntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US) | (1L << NL) | (1L << ASS) | (1L << BOOL) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				{
				setState(30);
				line();
				}
				}
				setState(35);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				declarationPRK();
				}
				break;
			case HEXALPHA:
			case ALPHA:
			case US:
			case ASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				assignmentToVarPRK();
				setState(38);
				match(NL);
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitBooleanPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanPRKContext booleanPRK() throws RecognitionException {
		BooleanPRKContext _localctx = new BooleanPRKContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleanPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitIntegerPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerPRKContext integerPRK() throws RecognitionException {
		IntegerPRKContext _localctx = new IntegerPRKContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integerPRK);
		int _la;
		try {
			int _alt;
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(ZERO);
				}
				break;
			case ONE:
			case NONZERO:
			case SIGN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(46);
					match(SIGN);
					}
				}

				setState(49);
				_la = _input.LA(1);
				if ( !(_la==ONE || _la==NONZERO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(50);
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
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				}
				break;
			case BINPREFIX:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(BINPREFIX);
				setState(58); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(57);
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
					setState(60); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case HEXAPREFIX:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(HEXAPREFIX);
				setState(64); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(63);
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
					setState(66); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitFloatPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatPRKContext floatPRK() throws RecognitionException {
		FloatPRKContext _localctx = new FloatPRKContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatPRK);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(70);
				match(SIGN);
				}
			}

			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
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
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO))) != 0) );
			setState(78);
			match(DOT);
			setState(80); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(79);
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
				setState(82); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitCharPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharPRKContext charPRK() throws RecognitionException {
		CharPRKContext _localctx = new CharPRKContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_charPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO) | (1L << HEXALPHA) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitStringPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringPRKContext stringPRK() throws RecognitionException {
		StringPRKContext _localctx = new StringPRKContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__1);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO) | (1L << HEXALPHA) | (1L << ALPHA) | (1L << DOT) | (1L << US) | (1L << NL) | (1L << SYMBOL) | (1L << WS))) != 0)) {
				{
				{
				setState(89);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << NONZERO) | (1L << HEXALPHA) | (1L << ALPHA) | (1L << DOT) | (1L << US) | (1L << NL) | (1L << SYMBOL) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
		public ExpressionPRKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPRK; }
	 
		public ExpressionPRKContext() { }
		public void copyFrom(ExpressionPRKContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatContext extends ExpressionPRKContext {
		public FloatPRKContext floatPRK() {
			return getRuleContext(FloatPRKContext.class,0);
		}
		public FloatContext(ExpressionPRKContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExpressionPRKContext {
		public Token lp;
		public Token rp;
		public ExpressionPRKContext expressionPRK() {
			return getRuleContext(ExpressionPRKContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PRKParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PRKParser.RPAR, 0); }
		public ParenthesisContext(ExpressionPRKContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressionPRKContext {
		public Token op;
		public List<ExpressionPRKContext> expressionPRK() {
			return getRuleContexts(ExpressionPRKContext.class);
		}
		public ExpressionPRKContext expressionPRK(int i) {
			return getRuleContext(ExpressionPRKContext.class,i);
		}
		public TerminalNode MUL() { return getToken(PRKParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PRKParser.DIV, 0); }
		public MulDivContext(ExpressionPRKContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExpressionPRKContext {
		public Token op;
		public List<ExpressionPRKContext> expressionPRK() {
			return getRuleContexts(ExpressionPRKContext.class);
		}
		public ExpressionPRKContext expressionPRK(int i) {
			return getRuleContext(ExpressionPRKContext.class,i);
		}
		public TerminalNode ADD() { return getToken(PRKParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PRKParser.SUB, 0); }
		public AddSubContext(ExpressionPRKContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowSqrContext extends ExpressionPRKContext {
		public Token op;
		public List<ExpressionPRKContext> expressionPRK() {
			return getRuleContexts(ExpressionPRKContext.class);
		}
		public ExpressionPRKContext expressionPRK(int i) {
			return getRuleContext(ExpressionPRKContext.class,i);
		}
		public TerminalNode POW() { return getToken(PRKParser.POW, 0); }
		public TerminalNode SQR() { return getToken(PRKParser.SQR, 0); }
		public PowSqrContext(ExpressionPRKContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitPowSqr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionPRKContext {
		public IntegerPRKContext integerPRK() {
			return getRuleContext(IntegerPRKContext.class,0);
		}
		public IntContext(ExpressionPRKContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameContext extends ExpressionPRKContext {
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
		public NameContext(ExpressionPRKContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitName(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expressionPRK, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98);
				((ParenthesisContext)_localctx).lp = match(LPAR);
				setState(99);
				expressionPRK(0);
				setState(100);
				((ParenthesisContext)_localctx).rp = match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				integerPRK();
				}
				break;
			case 3:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				floatPRK();
				}
				break;
			case 4:
				{
				_localctx = new NameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(104);
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
					setState(107); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowSqrContext(new ExpressionPRKContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionPRK);
						setState(111);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(112);
						((PowSqrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POW || _la==SQR) ) {
							((PowSqrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expressionPRK(7);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExpressionPRKContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionPRK);
						setState(114);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(115);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expressionPRK(6);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExpressionPRKContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionPRK);
						setState(117);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(118);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						expressionPRK(5);
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitAssignmentToVarPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentToVarPRKContext assignmentToVarPRK() throws RecognitionException {
		AssignmentToVarPRKContext _localctx = new AssignmentToVarPRKContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentToVarPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(125);
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
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(ASS);
			setState(132);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclarationPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationPRKContext declarationPRK() throws RecognitionException {
		DeclarationPRKContext _localctx = new DeclarationPRKContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarationPRK);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				declareBooleanPRK();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				declareIntegerPRK();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				declareFloatPRK();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				declareCharPRK();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclareBooleanPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareBooleanPRKContext declareBooleanPRK() throws RecognitionException {
		DeclareBooleanPRKContext _localctx = new DeclareBooleanPRKContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declareBooleanPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(BOOL);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(142);
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
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(ASS);
			setState(149);
			booleanPRK();
			setState(150);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclareIntegerPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareIntegerPRKContext declareIntegerPRK() throws RecognitionException {
		DeclareIntegerPRKContext _localctx = new DeclareIntegerPRKContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declareIntegerPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(INT);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(153);
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
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(ASS);
			setState(160);
			integerPRK();
			setState(161);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclareFloatPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareFloatPRKContext declareFloatPRK() throws RecognitionException {
		DeclareFloatPRKContext _localctx = new DeclareFloatPRKContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declareFloatPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(FLOAT);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(164);
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
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(ASS);
			setState(171);
			floatPRK();
			setState(172);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclareCharPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareCharPRKContext declareCharPRK() throws RecognitionException {
		DeclareCharPRKContext _localctx = new DeclareCharPRKContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declareCharPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CHAR);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(175);
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
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(ASS);
			setState(182);
			charPRK();
			setState(183);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PRKVisitor ) return ((PRKVisitor<? extends T>)visitor).visitDeclareStringPRK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareStringPRKContext declareStringPRK() throws RecognitionException {
		DeclareStringPRKContext _localctx = new DeclareStringPRKContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declareStringPRK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(STRING);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXALPHA) | (1L << ALPHA) | (1L << US))) != 0)) {
				{
				{
				setState(186);
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
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(ASS);
			setState(193);
			stringPRK();
			setState(194);
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
		case 7:
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
		"\u0004\u0001 \u00c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u00030\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003;\b\u0003\u000b\u0003\f\u0003<\u0001\u0003\u0001\u0003\u0004"+
		"\u0003A\b\u0003\u000b\u0003\f\u0003B\u0003\u0003E\b\u0003\u0001\u0004"+
		"\u0003\u0004H\b\u0004\u0001\u0004\u0004\u0004K\b\u0004\u000b\u0004\f\u0004"+
		"L\u0001\u0004\u0001\u0004\u0004\u0004Q\b\u0004\u000b\u0004\f\u0004R\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005"+
		"\u0006[\b\u0006\n\u0006\f\u0006^\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007j\b\u0007\u000b\u0007\f\u0007k\u0003\u0007"+
		"n\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007y\b\u0007"+
		"\n\u0007\f\u0007|\t\u0007\u0001\b\u0005\b\u007f\b\b\n\b\f\b\u0082\t\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u008c\b\t\u0001\n\u0001\n\u0005\n\u0090\b\n\n\n\f\n\u0093\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u009b\b"+
		"\u000b\n\u000b\f\u000b\u009e\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0005\f\u00a6\b\f\n\f\f\f\u00a9\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u00b1\b\r\n\r\f\r\u00b4"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00bc\b\u000e\n\u000e\f\u000e\u00bf\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0000\u0001\u000e\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u000b"+
		"\u0001\u0000\u0018\u0019\u0001\u0000\u0004\u0005\u0001\u0000\u0003\u0005"+
		"\u0001\u0000\u0003\u0004\u0002\u0000\u0003\u0005\t\t\u0002\u0000\u0003"+
		"\u0005\t\n\u0003\u0000\u0003\u0005\t\u000e\u001f\u001f\u0002\u0000\t\n"+
		"\f\f\u0001\u0000\u0016\u0017\u0002\u0000\u0012\u0012\u0015\u0015\u0001"+
		"\u0000\u0013\u0014\u00d4\u0000!\u0001\u0000\u0000\u0000\u0002)\u0001\u0000"+
		"\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000"+
		"\bG\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000\u0000\fX\u0001\u0000"+
		"\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000"+
		"\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014\u008d\u0001\u0000\u0000"+
		"\u0000\u0016\u0098\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000"+
		"\u0000\u001a\u00ae\u0001\u0000\u0000\u0000\u001c\u00b9\u0001\u0000\u0000"+
		"\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"\u0001\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$*\u0003\u0012\t\u0000%&\u0003\u0010\b\u0000&\'\u0005\r\u0000\u0000\'"+
		"*\u0001\u0000\u0000\u0000(*\u0005\r\u0000\u0000)$\u0001\u0000\u0000\u0000"+
		")%\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001\u0000"+
		"\u0000\u0000+,\u0007\u0000\u0000\u0000,\u0005\u0001\u0000\u0000\u0000"+
		"-E\u0005\u0003\u0000\u0000.0\u0005\u0006\u0000\u0000/.\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000015\u0007\u0001"+
		"\u0000\u000024\u0007\u0002\u0000\u000032\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6E\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u00008:\u0005\b\u0000\u0000"+
		"9;\u0007\u0003\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=E\u0001\u0000"+
		"\u0000\u0000>@\u0005\u0007\u0000\u0000?A\u0007\u0004\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000D-\u0001\u0000\u0000"+
		"\u0000D/\u0001\u0000\u0000\u0000D8\u0001\u0000\u0000\u0000D>\u0001\u0000"+
		"\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FH\u0005\u0006\u0000\u0000"+
		"GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000IK\u0007\u0002\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NP\u0005\u000b\u0000\u0000OQ\u0007\u0002\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000S\t\u0001\u0000\u0000\u0000TU\u0005\u0001"+
		"\u0000\u0000UV\u0007\u0005\u0000\u0000VW\u0005\u0001\u0000\u0000W\u000b"+
		"\u0001\u0000\u0000\u0000X\\\u0005\u0002\u0000\u0000Y[\u0007\u0006\u0000"+
		"\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_`\u0005\u0002\u0000\u0000`\r\u0001\u0000\u0000\u0000"+
		"ab\u0006\u0007\uffff\uffff\u0000bc\u0005\u000f\u0000\u0000cd\u0003\u000e"+
		"\u0007\u0000de\u0005\u0010\u0000\u0000en\u0001\u0000\u0000\u0000fn\u0003"+
		"\u0006\u0003\u0000gn\u0003\b\u0004\u0000hj\u0007\u0007\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000ma\u0001\u0000\u0000"+
		"\u0000mf\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000mi\u0001\u0000"+
		"\u0000\u0000nz\u0001\u0000\u0000\u0000op\n\u0006\u0000\u0000pq\u0007\b"+
		"\u0000\u0000qy\u0003\u000e\u0007\u0007rs\n\u0005\u0000\u0000st\u0007\t"+
		"\u0000\u0000ty\u0003\u000e\u0007\u0006uv\n\u0004\u0000\u0000vw\u0007\n"+
		"\u0000\u0000wy\u0003\u000e\u0007\u0005xo\u0001\u0000\u0000\u0000xr\u0001"+
		"\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u000f\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0007\u0007\u0000\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\u0011\u0000\u0000\u0084\u0085\u0003\u000e\u0007\u0000\u0085\u0011"+
		"\u0001\u0000\u0000\u0000\u0086\u008c\u0003\u0014\n\u0000\u0087\u008c\u0003"+
		"\u0016\u000b\u0000\u0088\u008c\u0003\u0018\f\u0000\u0089\u008c\u0003\u001a"+
		"\r\u0000\u008a\u008c\u0003\u001c\u000e\u0000\u008b\u0086\u0001\u0000\u0000"+
		"\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u0091\u0005\u001a\u0000"+
		"\u0000\u008e\u0090\u0007\u0007\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0011\u0000"+
		"\u0000\u0095\u0096\u0003\u0004\u0002\u0000\u0096\u0097\u0005\r\u0000\u0000"+
		"\u0097\u0015\u0001\u0000\u0000\u0000\u0098\u009c\u0005\u001b\u0000\u0000"+
		"\u0099\u009b\u0007\u0007\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0011\u0000\u0000"+
		"\u00a0\u00a1\u0003\u0006\u0003\u0000\u00a1\u00a2\u0005\r\u0000\u0000\u00a2"+
		"\u0017\u0001\u0000\u0000\u0000\u00a3\u00a7\u0005\u001c\u0000\u0000\u00a4"+
		"\u00a6\u0007\u0007\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0011\u0000\u0000\u00ab"+
		"\u00ac\u0003\b\u0004\u0000\u00ac\u00ad\u0005\r\u0000\u0000\u00ad\u0019"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b2\u0005\u001d\u0000\u0000\u00af\u00b1"+
		"\u0007\u0007\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0011\u0000\u0000\u00b6\u00b7"+
		"\u0003\n\u0005\u0000\u00b7\u00b8\u0005\r\u0000\u0000\u00b8\u001b\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bd\u0005\u001e\u0000\u0000\u00ba\u00bc\u0007"+
		"\u0007\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005\u0011\u0000\u0000\u00c1\u00c2\u0003"+
		"\f\u0006\u0000\u00c2\u00c3\u0005\r\u0000\u0000\u00c3\u001d\u0001\u0000"+
		"\u0000\u0000\u0016!)/5<BDGLR\\kmxz\u0080\u008b\u0091\u009c\u00a7\u00b2"+
		"\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}