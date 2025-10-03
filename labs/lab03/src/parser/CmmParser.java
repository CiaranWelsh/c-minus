// Generated from /Users/Ciaran/Documents/MSc/ProgrammingLanguageDesign/labs/lab03/src/parser/Cmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHAR_CONSTANT=1, ID=2, REAL_CONSTANT=3, INT_CONSTANT=4, MULTI_LINE_COMMENT=5, 
		SINGLE_LINE_COMMENT=6, WHITE_SPACE=7;
	public static final int
		RULE_program = 0, RULE_comment = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHAR_CONSTANT", "ID", "REAL_CONSTANT", "INT_CONSTANT", "MULTI_LINE_COMMENT", 
			"SINGLE_LINE_COMMENT", "WHITE_SPACE"
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
		public List<TerminalNode> CHAR_CONSTANT() { return getTokens(CmmParser.CHAR_CONSTANT); }
		public TerminalNode CHAR_CONSTANT(int i) {
			return getToken(CmmParser.CHAR_CONSTANT, i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<TerminalNode> REAL_CONSTANT() { return getTokens(CmmParser.REAL_CONSTANT); }
		public TerminalNode REAL_CONSTANT(int i) {
			return getToken(CmmParser.REAL_CONSTANT, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(9);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR_CONSTANT:
					{
					setState(4);
					match(CHAR_CONSTANT);
					}
					break;
				case ID:
					{
					setState(5);
					match(ID);
					}
					break;
				case REAL_CONSTANT:
					{
					setState(6);
					match(REAL_CONSTANT);
					}
					break;
				case INT_CONSTANT:
					{
					setState(7);
					match(INT_CONSTANT);
					}
					break;
				case MULTI_LINE_COMMENT:
				case SINGLE_LINE_COMMENT:
					{
					setState(8);
					comment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 126L) != 0) );
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(CmmParser.SINGLE_LINE_COMMENT, 0); }
		public TerminalNode MULTI_LINE_COMMENT() { return getToken(CmmParser.MULTI_LINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_la = _input.LA(1);
			if ( !(_la==MULTI_LINE_COMMENT || _la==SINGLE_LINE_COMMENT) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0007\u0010\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"\n\b\u0000\u000b\u0000\f\u0000\u000b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0000\u0000\u0002\u0000\u0002\u0000\u0001\u0001\u0000\u0005\u0006\u0012"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0002\r\u0001\u0000\u0000\u0000\u0004"+
		"\n\u0005\u0001\u0000\u0000\u0005\n\u0005\u0002\u0000\u0000\u0006\n\u0005"+
		"\u0003\u0000\u0000\u0007\n\u0005\u0004\u0000\u0000\b\n\u0003\u0002\u0001"+
		"\u0000\t\u0004\u0001\u0000\u0000\u0000\t\u0005\u0001\u0000\u0000\u0000"+
		"\t\u0006\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\t\b\u0001"+
		"\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000"+
		"\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u0001\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0007\u0000\u0000\u0000\u000e\u0003\u0001\u0000\u0000\u0000"+
		"\u0002\t\u000b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}