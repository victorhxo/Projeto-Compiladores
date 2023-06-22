// Generated from Gramatica.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEC=1, ALG=2, TIPO=3, ATR=4, IGUAL=5, SE=6, SENAO=7, ENTAO=8, ENQUANTO=9, 
		AP=10, FP=11, ESC=12, LER=13, ID=14, NUM=15, OP_ARIT=16, OP_REL=17, WS=18, 
		ErrorChar=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEC", "ALG", "TIPO", "ATR", "IGUAL", "SE", "SENAO", "ENTAO", "ENQUANTO", 
			"AP", "FP", "ESC", "LER", "ID", "NUM", "OP_ARIT", "OP_REL", "LETRA", 
			"DIGITO", "WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARACOES'", "'ALGORITMO'", null, "'->'", "'='", "'SE'", "'SENAO'", 
			"'ENTAO'", "'ENQWHILE'", "'('", "')'", "'out'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEC", "ALG", "TIPO", "ATR", "IGUAL", "SE", "SENAO", "ENTAO", "ENQUANTO", 
			"AP", "FP", "ESC", "LER", "ID", "NUM", "OP_ARIT", "OP_REL", "WS", "ErrorChar"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\u0004\u0000\u0013\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\ry"+
		"\b\r\n\r\f\r|\t\r\u0001\u000e\u0004\u000e\u007f\b\u000e\u000b\u000e\f"+
		"\u000e\u0080\u0001\u000e\u0001\u000e\u0004\u000e\u0085\b\u000e\u000b\u000e"+
		"\f\u000e\u0086\u0003\u000e\u0089\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0096\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0005\u0013\u009d\b\u0013\n"+
		"\u0013\f\u0013\u00a0\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0000%\u0000\'"+
		"\u0012)\u0013\u0001\u0000\u0005\u0003\u0000*+--//\u0002\u0000<<>>\u0002"+
		"\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u00ad\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001"+
		"+\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u0005K\u0001"+
		"\u0000\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\tP\u0001\u0000\u0000"+
		"\u0000\u000bR\u0001\u0000\u0000\u0000\rU\u0001\u0000\u0000\u0000\u000f"+
		"[\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000\u0013j\u0001"+
		"\u0000\u0000\u0000\u0015l\u0001\u0000\u0000\u0000\u0017n\u0001\u0000\u0000"+
		"\u0000\u0019r\u0001\u0000\u0000\u0000\u001bu\u0001\u0000\u0000\u0000\u001d"+
		"~\u0001\u0000\u0000\u0000\u001f\u008a\u0001\u0000\u0000\u0000!\u0095\u0001"+
		"\u0000\u0000\u0000#\u0097\u0001\u0000\u0000\u0000%\u0099\u0001\u0000\u0000"+
		"\u0000\'\u009e\u0001\u0000\u0000\u0000)\u00a3\u0001\u0000\u0000\u0000"+
		"+,\u0005D\u0000\u0000,-\u0005E\u0000\u0000-.\u0005C\u0000\u0000./\u0005"+
		"L\u0000\u0000/0\u0005A\u0000\u000001\u0005R\u0000\u000012\u0005A\u0000"+
		"\u000023\u0005C\u0000\u000034\u0005O\u0000\u000045\u0005E\u0000\u0000"+
		"56\u0005S\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005A\u0000\u0000"+
		"89\u0005L\u0000\u00009:\u0005G\u0000\u0000:;\u0005O\u0000\u0000;<\u0005"+
		"R\u0000\u0000<=\u0005I\u0000\u0000=>\u0005T\u0000\u0000>?\u0005M\u0000"+
		"\u0000?@\u0005O\u0000\u0000@\u0004\u0001\u0000\u0000\u0000AB\u0005z\u0000"+
		"\u0000BC\u0005I\u0000\u0000CD\u0005n\u0000\u0000DL\u0005t\u0000\u0000"+
		"EF\u0005r\u0000\u0000FG\u0005F\u0000\u0000GH\u0005l\u0000\u0000HI\u0005"+
		"o\u0000\u0000IJ\u0005a\u0000\u0000JL\u0005t\u0000\u0000KA\u0001\u0000"+
		"\u0000\u0000KE\u0001\u0000\u0000\u0000L\u0006\u0001\u0000\u0000\u0000"+
		"MN\u0005-\u0000\u0000NO\u0005>\u0000\u0000O\b\u0001\u0000\u0000\u0000"+
		"PQ\u0005=\u0000\u0000Q\n\u0001\u0000\u0000\u0000RS\u0005S\u0000\u0000"+
		"ST\u0005E\u0000\u0000T\f\u0001\u0000\u0000\u0000UV\u0005S\u0000\u0000"+
		"VW\u0005E\u0000\u0000WX\u0005N\u0000\u0000XY\u0005A\u0000\u0000YZ\u0005"+
		"O\u0000\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0005E\u0000\u0000\\]"+
		"\u0005N\u0000\u0000]^\u0005T\u0000\u0000^_\u0005A\u0000\u0000_`\u0005"+
		"O\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ab\u0005E\u0000\u0000bc\u0005"+
		"N\u0000\u0000cd\u0005Q\u0000\u0000de\u0005W\u0000\u0000ef\u0005H\u0000"+
		"\u0000fg\u0005I\u0000\u0000gh\u0005L\u0000\u0000hi\u0005E\u0000\u0000"+
		"i\u0012\u0001\u0000\u0000\u0000jk\u0005(\u0000\u0000k\u0014\u0001\u0000"+
		"\u0000\u0000lm\u0005)\u0000\u0000m\u0016\u0001\u0000\u0000\u0000no\u0005"+
		"o\u0000\u0000op\u0005u\u0000\u0000pq\u0005t\u0000\u0000q\u0018\u0001\u0000"+
		"\u0000\u0000rs\u0005i\u0000\u0000st\u0005n\u0000\u0000t\u001a\u0001\u0000"+
		"\u0000\u0000uz\u0003#\u0011\u0000vy\u0003%\u0012\u0000wy\u0003#\u0011"+
		"\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u001c"+
		"\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0003%\u0012"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0088"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0005.\u0000\u0000\u0083\u0085\u0003"+
		"%\u0012\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0082\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u001e\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0007\u0000\u0000\u0000\u008b \u0001\u0000\u0000"+
		"\u0000\u008c\u0096\u0007\u0001\u0000\u0000\u008d\u008e\u0005=\u0000\u0000"+
		"\u008e\u0096\u0005=\u0000\u0000\u008f\u0090\u0005>\u0000\u0000\u0090\u0096"+
		"\u0005=\u0000\u0000\u0091\u0092\u0005=\u0000\u0000\u0092\u0096\u0005<"+
		"\u0000\u0000\u0093\u0094\u0005!\u0000\u0000\u0094\u0096\u0005=\u0000\u0000"+
		"\u0095\u008c\u0001\u0000\u0000\u0000\u0095\u008d\u0001\u0000\u0000\u0000"+
		"\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0091\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0096\"\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0007\u0002\u0000\u0000\u0098$\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0007\u0003\u0000\u0000\u009a&\u0001\u0000\u0000\u0000\u009b\u009d\u0007"+
		"\u0004\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0006\u0013\u0000\u0000\u00a2(\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\t\u0000\u0000\u0000\u00a4*\u0001\u0000\u0000"+
		"\u0000\t\u0000Kxz\u0080\u0086\u0088\u0095\u009e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}