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
		DEC=1, ALG=2, TIPO=3, ATR=4, IGUAL=5, AP=6, FP=7, ESC=8, LER=9, ID=10, 
		NUM=11, OP_ARIT=12, OP_REL=13, WS=14, ErrorChar=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEC", "ALG", "TIPO", "ATR", "IGUAL", "AP", "FP", "ESC", "LER", "ID", 
			"NUM", "OP_ARIT", "OP_REL", "LETRA", "DIGITO", "WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARACOES'", "'ALGORITMO'", null, "'->'", "'='", "'('", "')'", 
			"'out'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEC", "ALG", "TIPO", "ATR", "IGUAL", "AP", "FP", "ESC", "LER", 
			"ID", "NUM", "OP_ARIT", "OP_REL", "WS", "ErrorChar"
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
		"\u0004\u0000\u000f\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002E\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\tZ\b\t\n\t\f\t]\t\t\u0001\n\u0004\n`"+
		"\b\n\u000b\n\f\na\u0001\n\u0001\n\u0004\nf\b\n\u000b\n\f\ng\u0003\nj\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\fw\b\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0005\u000f~\b\u000f\n\u000f\f\u000f\u0081\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000\u001d"+
		"\u0000\u001f\u000e!\u000f\u0001\u0000\u0005\u0003\u0000*+--//\u0002\u0000"+
		"<<>>\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u008e\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0001#\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000\u0005"+
		"D\u0001\u0000\u0000\u0000\u0007F\u0001\u0000\u0000\u0000\tI\u0001\u0000"+
		"\u0000\u0000\u000bK\u0001\u0000\u0000\u0000\rM\u0001\u0000\u0000\u0000"+
		"\u000fO\u0001\u0000\u0000\u0000\u0011S\u0001\u0000\u0000\u0000\u0013V"+
		"\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000\u0000\u0017k\u0001\u0000"+
		"\u0000\u0000\u0019v\u0001\u0000\u0000\u0000\u001bx\u0001\u0000\u0000\u0000"+
		"\u001dz\u0001\u0000\u0000\u0000\u001f\u007f\u0001\u0000\u0000\u0000!\u0084"+
		"\u0001\u0000\u0000\u0000#$\u0005D\u0000\u0000$%\u0005E\u0000\u0000%&\u0005"+
		"C\u0000\u0000&\'\u0005L\u0000\u0000\'(\u0005A\u0000\u0000()\u0005R\u0000"+
		"\u0000)*\u0005A\u0000\u0000*+\u0005C\u0000\u0000+,\u0005O\u0000\u0000"+
		",-\u0005E\u0000\u0000-.\u0005S\u0000\u0000.\u0002\u0001\u0000\u0000\u0000"+
		"/0\u0005A\u0000\u000001\u0005L\u0000\u000012\u0005G\u0000\u000023\u0005"+
		"O\u0000\u000034\u0005R\u0000\u000045\u0005I\u0000\u000056\u0005T\u0000"+
		"\u000067\u0005I\u0000\u000078\u0005M\u0000\u000089\u0005O\u0000\u0000"+
		"9\u0004\u0001\u0000\u0000\u0000:;\u0005z\u0000\u0000;<\u0005I\u0000\u0000"+
		"<=\u0005n\u0000\u0000=E\u0005t\u0000\u0000>?\u0005r\u0000\u0000?@\u0005"+
		"F\u0000\u0000@A\u0005l\u0000\u0000AB\u0005o\u0000\u0000BC\u0005a\u0000"+
		"\u0000CE\u0005t\u0000\u0000D:\u0001\u0000\u0000\u0000D>\u0001\u0000\u0000"+
		"\u0000E\u0006\u0001\u0000\u0000\u0000FG\u0005-\u0000\u0000GH\u0005>\u0000"+
		"\u0000H\b\u0001\u0000\u0000\u0000IJ\u0005=\u0000\u0000J\n\u0001\u0000"+
		"\u0000\u0000KL\u0005(\u0000\u0000L\f\u0001\u0000\u0000\u0000MN\u0005)"+
		"\u0000\u0000N\u000e\u0001\u0000\u0000\u0000OP\u0005o\u0000\u0000PQ\u0005"+
		"u\u0000\u0000QR\u0005t\u0000\u0000R\u0010\u0001\u0000\u0000\u0000ST\u0005"+
		"i\u0000\u0000TU\u0005n\u0000\u0000U\u0012\u0001\u0000\u0000\u0000V[\u0003"+
		"\u001b\r\u0000WZ\u0003\u001d\u000e\u0000XZ\u0003\u001b\r\u0000YW\u0001"+
		"\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0014\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0003\u001d\u000e\u0000_^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bi\u0001\u0000\u0000\u0000ce\u0005.\u0000\u0000"+
		"df\u0003\u001d\u000e\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000ic\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0016"+
		"\u0001\u0000\u0000\u0000kl\u0007\u0000\u0000\u0000l\u0018\u0001\u0000"+
		"\u0000\u0000mw\u0007\u0001\u0000\u0000no\u0005=\u0000\u0000ow\u0005=\u0000"+
		"\u0000pq\u0005>\u0000\u0000qw\u0005=\u0000\u0000rs\u0005=\u0000\u0000"+
		"sw\u0005<\u0000\u0000tu\u0005!\u0000\u0000uw\u0005=\u0000\u0000vm\u0001"+
		"\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000vp\u0001\u0000\u0000\u0000"+
		"vr\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w\u001a\u0001\u0000"+
		"\u0000\u0000xy\u0007\u0002\u0000\u0000y\u001c\u0001\u0000\u0000\u0000"+
		"z{\u0007\u0003\u0000\u0000{\u001e\u0001\u0000\u0000\u0000|~\u0007\u0004"+
		"\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0006\u000f\u0000\u0000\u0083 \u0001\u0000\u0000\u0000\u0084\u0085"+
		"\t\u0000\u0000\u0000\u0085\"\u0001\u0000\u0000\u0000\t\u0000DY[agiv\u007f"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}