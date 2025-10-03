// Generated from /Users/Ciaran/Documents/MSc/ProgrammingLanguageDesign/labs/lab03/src/parser/Cmm.g4 by ANTLR 4.13.2
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
		CHAR_CONSTANT=1, ID=2, REAL_CONSTANT=3, INT_CONSTANT=4, MULTI_LINE_COMMENT=5, 
		SINGLE_LINE_COMMENT=6, WHITE_SPACE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CHAR_CONSTANT", "SAFE_CHAR", "ESCAPE_SEQUENCE", "ID", "REAL_CONSTANT", 
			"INT_CONSTANT", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "WHITE_SPACE"
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
		"\u0004\u0000\u0007\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u0017\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002 \b\u0002\u000b\u0002"+
		"\f\u0002!\u0003\u0002$\b\u0002\u0001\u0003\u0004\u0003\'\b\u0003\u000b"+
		"\u0003\f\u0003(\u0001\u0003\u0005\u0003,\b\u0003\n\u0003\f\u0003/\t\u0003"+
		"\u0001\u0004\u0005\u00042\b\u0004\n\u0004\f\u00045\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u00049\b\u0004\n\u0004\f\u0004<\t\u0004\u0001\u0004"+
		"\u0005\u0004?\b\u0004\n\u0004\f\u0004B\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004M\b\u0004\u0001\u0004\u0004\u0004P\b\u0004\u000b\u0004\f\u0004"+
		"Q\u0001\u0004\u0005\u0004U\b\u0004\n\u0004\f\u0004X\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0004\u0004\u0004_\b\u0004\u000b"+
		"\u0004\f\u0004`\u0003\u0004c\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005h\b\u0005\n\u0005\f\u0005k\t\u0005\u0003\u0005m\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006s\b\u0006\n\u0006"+
		"\f\u0006v\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0081"+
		"\b\u0007\n\u0007\f\u0007\u0084\t\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0004\b\u0089\b\b\u000b\b\f\b\u008a\u0001\b\u0001\b\u0001t\u0000\t\u0001"+
		"\u0001\u0003\u0000\u0005\u0000\u0007\u0002\t\u0003\u000b\u0004\r\u0005"+
		"\u000f\u0006\u0011\u0007\u0001\u0000\t\u0004\u0000\n\n\r\r\'\'\\\\\u0004"+
		"\u0000\'\'\\\\nntt\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__a"+
		"z\u0002\u0000EEee\u0001\u000019\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r"+
		"\r  \u00a0\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000\u0000"+
		"\u0003\u001a\u0001\u0000\u0000\u0000\u0005\u001c\u0001\u0000\u0000\u0000"+
		"\u0007&\u0001\u0000\u0000\u0000\tb\u0001\u0000\u0000\u0000\u000bl\u0001"+
		"\u0000\u0000\u0000\rn\u0001\u0000\u0000\u0000\u000f|\u0001\u0000\u0000"+
		"\u0000\u0011\u0088\u0001\u0000\u0000\u0000\u0013\u0016\u0005\'\u0000\u0000"+
		"\u0014\u0017\u0003\u0003\u0001\u0000\u0015\u0017\u0003\u0005\u0002\u0000"+
		"\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0005\'\u0000\u0000\u0019"+
		"\u0002\u0001\u0000\u0000\u0000\u001a\u001b\b\u0000\u0000\u0000\u001b\u0004"+
		"\u0001\u0000\u0000\u0000\u001c#\u0005\\\u0000\u0000\u001d$\u0007\u0001"+
		"\u0000\u0000\u001e \u0007\u0002\u0000\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#\u001d\u0001\u0000\u0000"+
		"\u0000#\u001f\u0001\u0000\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%"+
		"\'\u0007\u0003\u0000\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)-\u0001\u0000"+
		"\u0000\u0000*,\u0007\u0004\u0000\u0000+*\u0001\u0000\u0000\u0000,/\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".\b\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000002\u0007\u0002\u0000"+
		"\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u00006:\u0005.\u0000\u000079\u0007\u0002\u0000\u000087\u0001"+
		"\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;c\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000=?\u0007\u0002\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CG\u0005.\u0000\u0000DF\u0007"+
		"\u0002\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JL\u0007\u0005\u0000\u0000KM\u0005-\u0000"+
		"\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000"+
		"\u0000\u0000NP\u0007\u0002\u0000\u0000ON\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"Rc\u0001\u0000\u0000\u0000SU\u0007\u0002\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y[\u0007"+
		"\u0005\u0000\u0000Z\\\u0005-\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\"+
		"\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]_\u0007\u0002\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b3\u0001"+
		"\u0000\u0000\u0000b@\u0001\u0000\u0000\u0000bV\u0001\u0000\u0000\u0000"+
		"c\n\u0001\u0000\u0000\u0000dm\u00050\u0000\u0000ei\u0007\u0006\u0000\u0000"+
		"fh\u0007\u0002\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jm\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000ld\u0001\u0000\u0000\u0000le\u0001"+
		"\u0000\u0000\u0000m\f\u0001\u0000\u0000\u0000no\u0005/\u0000\u0000op\u0005"+
		"*\u0000\u0000pt\u0001\u0000\u0000\u0000qs\t\u0000\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000wx\u0005*\u0000\u0000xy\u0005/\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0006\u0006\u0000\u0000{\u000e\u0001\u0000\u0000\u0000|}\u0005/\u0000"+
		"\u0000}~\u0005/\u0000\u0000~\u0082\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\b\u0007\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0006\u0007\u0000\u0000\u0086\u0010\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0007\b\u0000\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0006\b\u0000\u0000\u008d\u0012\u0001\u0000\u0000"+
		"\u0000\u0015\u0000\u0016!#(-3:@GLQV[`bilt\u0082\u008a\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}