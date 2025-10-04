package parser;// Generated from /Users/Ciaran/Documents/MSc/ProgrammingLanguageDesign/labs/lab04/src/parser/Cmm.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BUILTIN_TYPE=10, CHAR_CONSTANT=11, ID=12, REAL_CONSTANT=13, INT_CONSTANT=14, 
		OPEN_PAREN=15, CLOSE_PAREN=16, OPEN_BRACKET=17, CLOSE_BRACKET=18, OPEN_BRACE=19, 
		CLOSE_BRACE=20, PLUS=21, MINUS=22, MUL=23, DIV=24, MOD=25, AND=26, OR=27, 
		NOT=28, LT=29, GT=30, LE=31, GE=32, NE=33, EQ=34, MULTI_LINE_COMMENT=35, 
		SINGLE_LINE_COMMENT=36, WHITE_SPACE=37;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_function_declaration = 2, 
		RULE_variable_declaration = 3, RULE_type = 4, RULE_statement = 5, RULE_expression = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "function_declaration", "variable_declaration", 
			"type", "statement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'='", "'if'", "'else'", "'while'", "'read'", "'write'", 
			"'return'", null, null, null, null, null, "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", 
			"'<'", "'>'", "'<='", "'>='", "'!='", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "BUILTIN_TYPE", 
			"CHAR_CONSTANT", "ID", "REAL_CONSTANT", "INT_CONSTANT", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "LT", "GT", 
			"LE", "GE", "NE", "EQ", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", 
			"WHITE_SPACE"
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			declaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				function_declaration();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(CmmParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(CmmParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CmmParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CmmParser.CLOSE_BRACE, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			type();
			setState(21);
			match(ID);
			setState(22);
			match(OPEN_PAREN);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BUILTIN_TYPE) {
				{
				setState(23);
				type();
				setState(24);
				match(ID);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(25);
					match(T__0);
					setState(26);
					type();
					setState(27);
					match(ID);
					}
				}

				}
			}

			setState(33);
			match(CLOSE_PAREN);
			setState(34);
			match(OPEN_BRACE);
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BUILTIN_TYPE) {
					{
					{
					setState(35);
					variable_declaration();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4258768L) != 0)) {
					{
					{
					setState(41);
					statement();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(49);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			type();
			setState(52);
			match(ID);
			setState(53);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BUILTIN_TYPE() { return getToken(CmmParser.BUILTIN_TYPE, 0); }
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(CmmParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(CmmParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(CmmParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(CmmParser.CLOSE_BRACKET, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(BUILTIN_TYPE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACKET) {
				{
				{
				setState(56);
				match(OPEN_BRACKET);
				setState(57);
				match(INT_CONSTANT);
				setState(58);
				match(CLOSE_BRACKET);
				}
				}
				setState(63);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(CmmParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(CmmParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(CmmParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(CmmParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(CmmParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(CmmParser.CLOSE_BRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				expression(0);
				setState(65);
				match(T__2);
				setState(66);
				expression(0);
				setState(67);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(ID);
				setState(70);
				match(OPEN_PAREN);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4257792L) != 0)) {
					{
					setState(71);
					expression(0);
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(72);
						match(T__0);
						setState(73);
						expression(0);
						}
						}
						setState(78);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(81);
				match(CLOSE_PAREN);
				setState(82);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T__3);
				setState(84);
				match(OPEN_PAREN);
				setState(85);
				expression(0);
				setState(86);
				match(CLOSE_PAREN);
				setState(87);
				match(OPEN_BRACE);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4258768L) != 0)) {
					{
					{
					setState(88);
					statement();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				match(CLOSE_BRACE);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(95);
					match(T__4);
					setState(96);
					match(OPEN_BRACE);
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4258768L) != 0)) {
						{
						{
						setState(97);
						statement();
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(103);
					match(CLOSE_BRACE);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(T__5);
				setState(107);
				match(OPEN_PAREN);
				setState(108);
				expression(0);
				setState(109);
				match(CLOSE_PAREN);
				setState(110);
				match(OPEN_BRACE);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4258768L) != 0)) {
					{
					{
					setState(111);
					statement();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(CLOSE_BRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				match(T__6);
				setState(120);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(T__7);
				setState(122);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				match(T__8);
				setState(124);
				expression(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(CmmParser.OPEN_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(CmmParser.CLOSE_PAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(CmmParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(CmmParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(CmmParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(CmmParser.CLOSE_BRACKET, i);
		}
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode MUL() { return getToken(CmmParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CmmParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CmmParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
		public TerminalNode GT() { return getToken(CmmParser.GT, 0); }
		public TerminalNode LT() { return getToken(CmmParser.LT, 0); }
		public TerminalNode GE() { return getToken(CmmParser.GE, 0); }
		public TerminalNode LE() { return getToken(CmmParser.LE, 0); }
		public TerminalNode EQ() { return getToken(CmmParser.EQ, 0); }
		public TerminalNode NE() { return getToken(CmmParser.NE, 0); }
		public TerminalNode AND() { return getToken(CmmParser.AND, 0); }
		public TerminalNode OR() { return getToken(CmmParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(128);
				match(OPEN_PAREN);
				setState(129);
				expression(0);
				setState(130);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				{
				setState(132);
				match(OPEN_PAREN);
				setState(133);
				type();
				setState(134);
				match(CLOSE_PAREN);
				setState(135);
				expression(11);
				}
				break;
			case 3:
				{
				setState(137);
				match(ID);
				setState(142); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(138);
						match(OPEN_BRACKET);
						setState(139);
						expression(0);
						setState(140);
						match(CLOSE_BRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(144); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				setState(146);
				match(MINUS);
				setState(147);
				expression(9);
				}
				break;
			case 5:
				{
				setState(148);
				match(ID);
				}
				break;
			case 6:
				{
				setState(149);
				match(INT_CONSTANT);
				}
				break;
			case 7:
				{
				setState(150);
				match(REAL_CONSTANT);
				}
				break;
			case 8:
				{
				setState(151);
				match(CHAR_CONSTANT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(155);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(158);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(161);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(164);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(165);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u00ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u001e\b\u0002\u0003\u0002 \b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002\u0001"+
		"\u0002\u0005\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0003\u00020\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004<\b\u0004"+
		"\n\u0004\f\u0004?\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005K\b\u0005\n\u0005\f\u0005N\t\u0005\u0003\u0005P\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005Z\b\u0005\n\u0005\f\u0005]\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005c\b\u0005\n\u0005"+
		"\f\u0005f\t\u0005\u0001\u0005\u0003\u0005i\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005q\b\u0005"+
		"\n\u0005\f\u0005t\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005~\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u008f\b\u0006\u000b\u0006"+
		"\f\u0006\u0090\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0099\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00a7\b\u0006\n\u0006"+
		"\f\u0006\u00aa\t\u0006\u0001\u0006\u0000\u0001\f\u0007\u0000\u0002\u0004"+
		"\u0006\b\n\f\u0000\u0004\u0001\u0000\u0017\u0019\u0001\u0000\u0015\u0016"+
		"\u0001\u0000\u001d\"\u0001\u0000\u001a\u001b\u00c3\u0000\u000e\u0001\u0000"+
		"\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000"+
		"\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000"+
		"\n}\u0001\u0000\u0000\u0000\f\u0098\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0003\u0002\u0001\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0013"+
		"\u0003\u0006\u0003\u0000\u0011\u0013\u0003\u0004\u0002\u0000\u0012\u0010"+
		"\u0001\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0003"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0003\b\u0004\u0000\u0015\u0016\u0005"+
		"\f\u0000\u0000\u0016\u001f\u0005\u000f\u0000\u0000\u0017\u0018\u0003\b"+
		"\u0004\u0000\u0018\u001d\u0005\f\u0000\u0000\u0019\u001a\u0005\u0001\u0000"+
		"\u0000\u001a\u001b\u0003\b\u0004\u0000\u001b\u001c\u0005\f\u0000\u0000"+
		"\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u0019\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f"+
		"\u0017\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\"\u0005\u0010\u0000\u0000\"/\u0005\u0013\u0000\u0000"+
		"#%\u0003\u0006\u0003\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'0\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000)+\u0003\n\u0005\u0000*)\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/&\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u000012\u0005\u0014\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0003"+
		"\b\u0004\u000045\u0005\f\u0000\u000056\u0005\u0002\u0000\u00006\u0007"+
		"\u0001\u0000\u0000\u00007=\u0005\n\u0000\u000089\u0005\u0011\u0000\u0000"+
		"9:\u0005\u000e\u0000\u0000:<\u0005\u0012\u0000\u0000;8\u0001\u0000\u0000"+
		"\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>\t\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0003"+
		"\f\u0006\u0000AB\u0005\u0003\u0000\u0000BC\u0003\f\u0006\u0000CD\u0005"+
		"\u0002\u0000\u0000D~\u0001\u0000\u0000\u0000EF\u0005\f\u0000\u0000FO\u0005"+
		"\u000f\u0000\u0000GL\u0003\f\u0006\u0000HI\u0005\u0001\u0000\u0000IK\u0003"+
		"\f\u0006\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OG\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u0010\u0000\u0000R~\u0005\u0002"+
		"\u0000\u0000ST\u0005\u0004\u0000\u0000TU\u0005\u000f\u0000\u0000UV\u0003"+
		"\f\u0006\u0000VW\u0005\u0010\u0000\u0000W[\u0005\u0013\u0000\u0000XZ\u0003"+
		"\n\u0005\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^h\u0005\u0014\u0000\u0000_`\u0005\u0005\u0000"+
		"\u0000`d\u0005\u0013\u0000\u0000ac\u0003\n\u0005\u0000ba\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u0005"+
		"\u0014\u0000\u0000h_\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i~\u0001\u0000\u0000\u0000jk\u0005\u0006\u0000\u0000kl\u0005\u000f\u0000"+
		"\u0000lm\u0003\f\u0006\u0000mn\u0005\u0010\u0000\u0000nr\u0005\u0013\u0000"+
		"\u0000oq\u0003\n\u0005\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u0014\u0000\u0000v~\u0001"+
		"\u0000\u0000\u0000wx\u0005\u0007\u0000\u0000x~\u0003\f\u0006\u0000yz\u0005"+
		"\b\u0000\u0000z~\u0003\f\u0006\u0000{|\u0005\t\u0000\u0000|~\u0003\f\u0006"+
		"\u0000}@\u0001\u0000\u0000\u0000}E\u0001\u0000\u0000\u0000}S\u0001\u0000"+
		"\u0000\u0000}j\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000}y\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u000b\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0006\u0006\uffff\uffff\u0000\u0080\u0081\u0005\u000f"+
		"\u0000\u0000\u0081\u0082\u0003\f\u0006\u0000\u0082\u0083\u0005\u0010\u0000"+
		"\u0000\u0083\u0099\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u000f\u0000"+
		"\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086\u0087\u0005\u0010\u0000\u0000"+
		"\u0087\u0088\u0003\f\u0006\u000b\u0088\u0099\u0001\u0000\u0000\u0000\u0089"+
		"\u008e\u0005\f\u0000\u0000\u008a\u008b\u0005\u0011\u0000\u0000\u008b\u008c"+
		"\u0003\f\u0006\u0000\u008c\u008d\u0005\u0012\u0000\u0000\u008d\u008f\u0001"+
		"\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0099\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"\u0016\u0000\u0000\u0093\u0099\u0003\f\u0006\t\u0094\u0099\u0005\f\u0000"+
		"\u0000\u0095\u0099\u0005\u000e\u0000\u0000\u0096\u0099\u0005\r\u0000\u0000"+
		"\u0097\u0099\u0005\u000b\u0000\u0000\u0098\u007f\u0001\u0000\u0000\u0000"+
		"\u0098\u0084\u0001\u0000\u0000\u0000\u0098\u0089\u0001\u0000\u0000\u0000"+
		"\u0098\u0092\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000"+
		"\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u00a8\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\n\b\u0000\u0000\u009b\u009c\u0007\u0000\u0000\u0000\u009c"+
		"\u00a7\u0003\f\u0006\t\u009d\u009e\n\u0007\u0000\u0000\u009e\u009f\u0007"+
		"\u0001\u0000\u0000\u009f\u00a7\u0003\f\u0006\b\u00a0\u00a1\n\u0006\u0000"+
		"\u0000\u00a1\u00a2\u0007\u0002\u0000\u0000\u00a2\u00a7\u0003\f\u0006\u0007"+
		"\u00a3\u00a4\n\u0005\u0000\u0000\u00a4\u00a5\u0007\u0003\u0000\u0000\u00a5"+
		"\u00a7\u0003\f\u0006\u0006\u00a6\u009a\u0001\u0000\u0000\u0000\u00a6\u009d"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\r\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u0012\u0012\u001d"+
		"\u001f&,/=LO[dhr}\u0090\u0098\u00a6\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}