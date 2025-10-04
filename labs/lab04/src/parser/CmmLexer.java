// Generated from /Users/Ciaran/Documents/MSc/ProgrammingLanguageDesign/labs/lab04/src/parser/Cmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, CHAR_CONSTANT=9, 
		ID=10, REAL_CONSTANT=11, INT_CONSTANT=12, MULTI_LINE_COMMENT=13, SINGLE_LINE_COMMENT=14, 
		WHITE_SPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "CHAR_CONSTANT", 
			"SAFE_CHAR", "ESCAPE_SEQUENCE", "ID", "REAL_CONSTANT", "INT_CONSTANT", 
			"MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "WHITE_SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'-'", "'*'", "'/'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "CHAR_CONSTANT", 
			"ID", "REAL_CONSTANT", "INT_CONSTANT", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", 
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

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
		"\u0004\u0000\u000f\u00ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b7\b\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004\n@\b\n\u000b\n"+
		"\f\nA\u0003\nD\b\n\u0001\u000b\u0004\u000bG\b\u000b\u000b\u000b\f\u000b"+
		"H\u0001\u000b\u0005\u000bL\b\u000b\n\u000b\f\u000bO\t\u000b\u0001\f\u0005"+
		"\fR\b\f\n\f\f\fU\t\f\u0001\f\u0001\f\u0005\fY\b\f\n\f\f\f\\\t\f\u0001"+
		"\f\u0005\f_\b\f\n\f\f\fb\t\f\u0001\f\u0001\f\u0005\ff\b\f\n\f\f\fi\t\f"+
		"\u0001\f\u0001\f\u0003\fm\b\f\u0001\f\u0004\fp\b\f\u000b\f\f\fq\u0001"+
		"\f\u0005\fu\b\f\n\f\f\fx\t\f\u0001\f\u0001\f\u0003\f|\b\f\u0001\f\u0004"+
		"\f\u007f\b\f\u000b\f\f\f\u0080\u0003\f\u0083\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0088\b\r\n\r\f\r\u008b\t\r\u0003\r\u008d\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0093\b\u000e\n\u000e\f\u000e"+
		"\u0096\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00a1\b\u000f"+
		"\n\u000f\f\u000f\u00a4\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004"+
		"\u0010\u00a9\b\u0010\u000b\u0010\f\u0010\u00aa\u0001\u0010\u0001\u0010"+
		"\u0001\u0094\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\u0000\u0015\u0000\u0017"+
		"\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e!\u000f\u0001\u0000\t\u0004"+
		"\u0000\n\n\r\r\'\'\\\\\u0004\u0000\'\'\\\\nntt\u0001\u000009\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0002\u0000EEee\u0001\u000019\u0002\u0000\n"+
		"\n\r\r\u0003\u0000\t\n\r\r  \u00c0\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000"+
		"\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000"+
		"\u0000\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b"+
		"-\u0001\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000\u000f1\u0001\u0000"+
		"\u0000\u0000\u00113\u0001\u0000\u0000\u0000\u0013:\u0001\u0000\u0000\u0000"+
		"\u0015<\u0001\u0000\u0000\u0000\u0017F\u0001\u0000\u0000\u0000\u0019\u0082"+
		"\u0001\u0000\u0000\u0000\u001b\u008c\u0001\u0000\u0000\u0000\u001d\u008e"+
		"\u0001\u0000\u0000\u0000\u001f\u009c\u0001\u0000\u0000\u0000!\u00a8\u0001"+
		"\u0000\u0000\u0000#$\u0005(\u0000\u0000$\u0002\u0001\u0000\u0000\u0000"+
		"%&\u0005)\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005[\u0000\u0000"+
		"(\u0006\u0001\u0000\u0000\u0000)*\u0005]\u0000\u0000*\b\u0001\u0000\u0000"+
		"\u0000+,\u0005-\u0000\u0000,\n\u0001\u0000\u0000\u0000-.\u0005*\u0000"+
		"\u0000.\f\u0001\u0000\u0000\u0000/0\u0005/\u0000\u00000\u000e\u0001\u0000"+
		"\u0000\u000012\u0005+\u0000\u00002\u0010\u0001\u0000\u0000\u000036\u0005"+
		"\'\u0000\u000047\u0003\u0013\t\u000057\u0003\u0015\n\u000064\u0001\u0000"+
		"\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005"+
		"\'\u0000\u00009\u0012\u0001\u0000\u0000\u0000:;\b\u0000\u0000\u0000;\u0014"+
		"\u0001\u0000\u0000\u0000<C\u0005\\\u0000\u0000=D\u0007\u0001\u0000\u0000"+
		">@\u0007\u0002\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000"+
		"\u0000\u0000C=\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000D\u0016"+
		"\u0001\u0000\u0000\u0000EG\u0007\u0003\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IM\u0001\u0000\u0000\u0000JL\u0007\u0004\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0018\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PR\u0007\u0002\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VZ\u0005.\u0000\u0000"+
		"WY\u0007\u0002\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0083\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0007\u0002\u0000\u0000"+
		"^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000cg\u0005.\u0000\u0000df\u0007\u0002\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"jl\u0007\u0005\u0000\u0000km\u0005-\u0000\u0000lk\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000np\u0007\u0002\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0083\u0001\u0000\u0000\u0000"+
		"su\u0007\u0002\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000y{\u0007\u0005\u0000\u0000z|\u0005"+
		"-\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001"+
		"\u0000\u0000\u0000}\u007f\u0007\u0002\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082S\u0001\u0000\u0000\u0000\u0082`\u0001\u0000\u0000\u0000\u0082v"+
		"\u0001\u0000\u0000\u0000\u0083\u001a\u0001\u0000\u0000\u0000\u0084\u008d"+
		"\u00050\u0000\u0000\u0085\u0089\u0007\u0006\u0000\u0000\u0086\u0088\u0007"+
		"\u0002\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u0084\u0001\u0000\u0000\u0000\u008c\u0085\u0001"+
		"\u0000\u0000\u0000\u008d\u001c\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"/\u0000\u0000\u008f\u0090\u0005*\u0000\u0000\u0090\u0094\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\t\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005*\u0000\u0000\u0098"+
		"\u0099\u0005/\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0006\u000e\u0000\u0000\u009b\u001e\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005/\u0000\u0000\u009d\u009e\u0005/\u0000\u0000\u009e\u00a2\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\b\u0007\u0000\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0006\u000f\u0000"+
		"\u0000\u00a6 \u0001\u0000\u0000\u0000\u00a7\u00a9\u0007\b\u0000\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u0010\u0000\u0000"+
		"\u00ad\"\u0001\u0000\u0000\u0000\u0015\u00006ACHMSZ`glqv{\u0080\u0082"+
		"\u0089\u008c\u0094\u00a2\u00aa\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}