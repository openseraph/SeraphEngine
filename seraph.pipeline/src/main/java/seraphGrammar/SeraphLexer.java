// Generated from SeraphLexer.g4 by ANTLR 4.9.2
package seraphGrammar;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SeraphLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPENB=1, CLOSEB=2, REGISTER=3, QUERY=4, STREAM=5, STARTING=6, WITH=7, 
		WINDOW=8, RANGE=9, EMIT=10, ON=11, ENTERING=12, EVERY=13, INTO=14, EXIT=15, 
		SNAPSHOT=16, EARLIEST=17, LATEST=18, FROM=19, KAFKA_TOPIC=20, DIGIT=21, 
		MONTH=22, DAY=23, YEAR=24, HOURS=25, MINUTES=26, SECONDS=27, ISO8601_DATETIME_UTC=28, 
		WORD=29, WS=30, WINDOW_RANGE_EVENTS=31, WINDOW_RANGE_EVENT=32, WINDOW_RANGE_INT=33, 
		WINDOW_RANGE_ISO8601DURATION=34, WINDOW_RANGE_WS=35, EMIT_RANGE_EVENTS=36, 
		EMIT_RANGE_EVENT=37, EMIT_RANGE_INT=38, EMIT_RANGE_ISO8601DURATION=39, 
		EMIT_RANGE_WS=40, CYPHER_QUERY=41;
	public static final int
		WINDOW_RANGE=1, EMIT_RANGE=2, CYPHER=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "WINDOW_RANGE", "EMIT_RANGE", "CYPHER"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPENB", "CLOSEB", "REGISTER", "QUERY", "STREAM", "STARTING", "WITH", 
			"WINDOW", "RANGE", "EMIT", "ON", "ENTERING", "EVERY", "INTO", "EXIT", 
			"SNAPSHOT", "EARLIEST", "LATEST", "FROM", "KAFKA_TOPIC", "DIGIT", "MONTH", 
			"DAY", "YEAR", "HOURS", "MINUTES", "SECONDS", "ISO8601_DATETIME_UTC", 
			"WORD", "WS", "WINDOW_RANGE_EVENTS", "WINDOW_RANGE_EVENT", "WINDOW_RANGE_INT", 
			"WINDOW_RANGE_ISO8601DURATION", "WINDOW_RANGE_WS", "EMIT_RANGE_EVENTS", 
			"EMIT_RANGE_EVENT", "EMIT_RANGE_INT", "EMIT_RANGE_ISO8601DURATION", "EMIT_RANGE_WS", 
			"CYPHER_QUERY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPENB", "CLOSEB", "REGISTER", "QUERY", "STREAM", "STARTING", "WITH", 
			"WINDOW", "RANGE", "EMIT", "ON", "ENTERING", "EVERY", "INTO", "EXIT", 
			"SNAPSHOT", "EARLIEST", "LATEST", "FROM", "KAFKA_TOPIC", "DIGIT", "MONTH", 
			"DAY", "YEAR", "HOURS", "MINUTES", "SECONDS", "ISO8601_DATETIME_UTC", 
			"WORD", "WS", "WINDOW_RANGE_EVENTS", "WINDOW_RANGE_EVENT", "WINDOW_RANGE_INT", 
			"WINDOW_RANGE_ISO8601DURATION", "WINDOW_RANGE_WS", "EMIT_RANGE_EVENTS", 
			"EMIT_RANGE_EVENT", "EMIT_RANGE_INT", "EMIT_RANGE_ISO8601DURATION", "EMIT_RANGE_WS", 
			"CYPHER_QUERY"
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


	public SeraphLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SeraphLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0195\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\7\36\u0103\n\36\f\36\16\36\u0106\13\36\3\37\6\37"+
		"\u0109\n\37\r\37\16\37\u010a\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3\"\6\"\u0121\n\"\r\"\16\"\u0122\3#\3#\3#\3#\5#\u0129"+
		"\n#\3#\3#\3#\5#\u012e\n#\3#\3#\3#\5#\u0133\n#\3#\3#\3#\3#\5#\u0139\n#"+
		"\3#\3#\3#\5#\u013e\n#\3#\3#\3#\5#\u0143\n#\3#\3#\3$\6$\u0148\n$\r$\16"+
		"$\u0149\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\6"+
		"\'\u0160\n\'\r\'\16\'\u0161\3(\3(\3(\3(\5(\u0168\n(\3(\3(\3(\5(\u016d"+
		"\n(\3(\3(\3(\5(\u0172\n(\3(\3(\3(\3(\5(\u0178\n(\3(\3(\3(\5(\u017d\n("+
		"\3(\3(\3(\5(\u0182\n(\3(\3(\3)\6)\u0187\n)\r)\16)\u0188\3)\3)\3*\6*\u018e"+
		"\n*\r*\16*\u018f\3*\3*\3*\3*\3\u018f\2+\6\3\b\4\n\5\f\6\16\7\20\b\22\t"+
		"\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60"+
		"\30\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+\6\2\3"+
		"\4\5\32\4\2TTtt\4\2GGgg\4\2IIii\4\2KKkk\4\2UUuu\4\2VVvv\4\2SSss\4\2WW"+
		"ww\4\2[[{{\4\2CCcc\4\2OOoo\4\2PPpp\4\2YYyy\4\2JJjj\4\2FFff\4\2QQqq\4\2"+
		"XXxx\4\2ZZzz\4\2RRrr\4\2NNnn\4\2HHhh\6\2**C\\c}\177\177\n\2*,.\60\62<"+
		"@@C]__aac\177\5\2\13\f\17\17\"\"\2\u01a4\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3"+
		"\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2"+
		"\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3"+
		"\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2"+
		"\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\2"+
		"8\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\3B\3\2\2\2\3D\3"+
		"\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\4L\3\2\2\2\4N\3\2\2\2\4P\3\2\2"+
		"\2\4R\3\2\2\2\4T\3\2\2\2\5V\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\n\\\3\2\2\2"+
		"\fe\3\2\2\2\16k\3\2\2\2\20r\3\2\2\2\22{\3\2\2\2\24\u0080\3\2\2\2\26\u0087"+
		"\3\2\2\2\30\u008f\3\2\2\2\32\u0094\3\2\2\2\34\u0097\3\2\2\2\36\u00a0\3"+
		"\2\2\2 \u00a8\3\2\2\2\"\u00ad\3\2\2\2$\u00b2\3\2\2\2&\u00bb\3\2\2\2(\u00c4"+
		"\3\2\2\2*\u00cb\3\2\2\2,\u00d0\3\2\2\2.\u00dd\3\2\2\2\60\u00df\3\2\2\2"+
		"\62\u00e2\3\2\2\2\64\u00e5\3\2\2\2\66\u00ea\3\2\2\28\u00ed\3\2\2\2:\u00f0"+
		"\3\2\2\2<\u00f3\3\2\2\2>\u0100\3\2\2\2@\u0108\3\2\2\2B\u010e\3\2\2\2D"+
		"\u0117\3\2\2\2F\u0120\3\2\2\2H\u0124\3\2\2\2J\u0147\3\2\2\2L\u014d\3\2"+
		"\2\2N\u0156\3\2\2\2P\u015f\3\2\2\2R\u0163\3\2\2\2T\u0186\3\2\2\2V\u018d"+
		"\3\2\2\2XY\7}\2\2Y\7\3\2\2\2Z[\7\177\2\2[\t\3\2\2\2\\]\t\2\2\2]^\t\3\2"+
		"\2^_\t\4\2\2_`\t\5\2\2`a\t\6\2\2ab\t\7\2\2bc\t\3\2\2cd\t\2\2\2d\13\3\2"+
		"\2\2ef\t\b\2\2fg\t\t\2\2gh\t\3\2\2hi\t\2\2\2ij\t\n\2\2j\r\3\2\2\2kl\t"+
		"\6\2\2lm\t\7\2\2mn\t\2\2\2no\t\3\2\2op\t\13\2\2pq\t\f\2\2q\17\3\2\2\2"+
		"rs\t\6\2\2st\t\7\2\2tu\t\13\2\2uv\t\2\2\2vw\t\7\2\2wx\t\5\2\2xy\t\r\2"+
		"\2yz\t\4\2\2z\21\3\2\2\2{|\t\16\2\2|}\t\5\2\2}~\t\7\2\2~\177\t\17\2\2"+
		"\177\23\3\2\2\2\u0080\u0081\t\16\2\2\u0081\u0082\t\5\2\2\u0082\u0083\t"+
		"\r\2\2\u0083\u0084\t\20\2\2\u0084\u0085\t\21\2\2\u0085\u0086\t\16\2\2"+
		"\u0086\25\3\2\2\2\u0087\u0088\t\2\2\2\u0088\u0089\t\13\2\2\u0089\u008a"+
		"\t\r\2\2\u008a\u008b\t\4\2\2\u008b\u008c\t\3\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\n\2\2\u008e\27\3\2\2\2\u008f\u0090\t\3\2\2\u0090\u0091\t\f\2"+
		"\2\u0091\u0092\t\5\2\2\u0092\u0093\t\7\2\2\u0093\31\3\2\2\2\u0094\u0095"+
		"\t\21\2\2\u0095\u0096\t\r\2\2\u0096\33\3\2\2\2\u0097\u0098\t\3\2\2\u0098"+
		"\u0099\t\r\2\2\u0099\u009a\t\7\2\2\u009a\u009b\t\3\2\2\u009b\u009c\t\2"+
		"\2\2\u009c\u009d\t\5\2\2\u009d\u009e\t\r\2\2\u009e\u009f\t\4\2\2\u009f"+
		"\35\3\2\2\2\u00a0\u00a1\t\3\2\2\u00a1\u00a2\t\22\2\2\u00a2\u00a3\t\3\2"+
		"\2\u00a3\u00a4\t\2\2\2\u00a4\u00a5\t\n\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\b\16\3\2\u00a7\37\3\2\2\2\u00a8\u00a9\t\5\2\2\u00a9\u00aa\t\r\2\2\u00aa"+
		"\u00ab\t\7\2\2\u00ab\u00ac\t\21\2\2\u00ac!\3\2\2\2\u00ad\u00ae\t\3\2\2"+
		"\u00ae\u00af\t\23\2\2\u00af\u00b0\t\5\2\2\u00b0\u00b1\t\7\2\2\u00b1#\3"+
		"\2\2\2\u00b2\u00b3\t\6\2\2\u00b3\u00b4\t\r\2\2\u00b4\u00b5\t\13\2\2\u00b5"+
		"\u00b6\t\24\2\2\u00b6\u00b7\t\6\2\2\u00b7\u00b8\t\17\2\2\u00b8\u00b9\t"+
		"\21\2\2\u00b9\u00ba\t\7\2\2\u00ba%\3\2\2\2\u00bb\u00bc\t\3\2\2\u00bc\u00bd"+
		"\t\13\2\2\u00bd\u00be\t\2\2\2\u00be\u00bf\t\25\2\2\u00bf\u00c0\t\5\2\2"+
		"\u00c0\u00c1\t\3\2\2\u00c1\u00c2\t\6\2\2\u00c2\u00c3\t\7\2\2\u00c3\'\3"+
		"\2\2\2\u00c4\u00c5\t\25\2\2\u00c5\u00c6\t\13\2\2\u00c6\u00c7\t\7\2\2\u00c7"+
		"\u00c8\t\3\2\2\u00c8\u00c9\t\6\2\2\u00c9\u00ca\t\7\2\2\u00ca)\3\2\2\2"+
		"\u00cb\u00cc\t\26\2\2\u00cc\u00cd\t\2\2\2\u00cd\u00ce\t\21\2\2\u00ce\u00cf"+
		"\t\f\2\2\u00cf+\3\2\2\2\u00d0\u00d1\7m\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7h\2\2\u00d3\u00d4\7m\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7<\2\2\u00d6"+
		"\u00d7\7\61\2\2\u00d7\u00d8\7\61\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\5"+
		">\36\2\u00da\u00db\7\61\2\2\u00db\u00dc\5>\36\2\u00dc-\3\2\2\2\u00dd\u00de"+
		"\4\62;\2\u00de/\3\2\2\2\u00df\u00e0\5.\26\2\u00e0\u00e1\5.\26\2\u00e1"+
		"\61\3\2\2\2\u00e2\u00e3\5.\26\2\u00e3\u00e4\5.\26\2\u00e4\63\3\2\2\2\u00e5"+
		"\u00e6\5.\26\2\u00e6\u00e7\5.\26\2\u00e7\u00e8\5.\26\2\u00e8\u00e9\5."+
		"\26\2\u00e9\65\3\2\2\2\u00ea\u00eb\5.\26\2\u00eb\u00ec\5.\26\2\u00ec\67"+
		"\3\2\2\2\u00ed\u00ee\5.\26\2\u00ee\u00ef\5.\26\2\u00ef9\3\2\2\2\u00f0"+
		"\u00f1\5.\26\2\u00f1\u00f2\5.\26\2\u00f2;\3\2\2\2\u00f3\u00f4\5\64\31"+
		"\2\u00f4\u00f5\7/\2\2\u00f5\u00f6\5\60\27\2\u00f6\u00f7\7/\2\2\u00f7\u00f8"+
		"\5\62\30\2\u00f8\u00f9\7V\2\2\u00f9\u00fa\5\66\32\2\u00fa\u00fb\7<\2\2"+
		"\u00fb\u00fc\58\33\2\u00fc\u00fd\7<\2\2\u00fd\u00fe\5:\34\2\u00fe\u00ff"+
		"\7\\\2\2\u00ff=\3\2\2\2\u0100\u0104\t\27\2\2\u0101\u0103\t\30\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105?\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\t\31\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\b\37\4\2\u010dA\3\2\2\2\u010e\u010f\t\3\2\2"+
		"\u010f\u0110\t\22\2\2\u0110\u0111\t\3\2\2\u0111\u0112\t\r\2\2\u0112\u0113"+
		"\t\7\2\2\u0113\u0114\t\6\2\2\u0114\u0115\3\2\2\2\u0115\u0116\b \5\2\u0116"+
		"C\3\2\2\2\u0117\u0118\t\3\2\2\u0118\u0119\t\22\2\2\u0119\u011a\t\3\2\2"+
		"\u011a\u011b\t\r\2\2\u011b\u011c\t\7\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\b!\5\2\u011eE\3\2\2\2\u011f\u0121\4\62;\2\u0120\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123G\3\2\2\2\u0124"+
		"\u0128\7R\2\2\u0125\u0126\5F\"\2\u0126\u0127\7[\2\2\u0127\u0129\3\2\2"+
		"\2\u0128\u0125\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012d\3\2\2\2\u012a\u012b"+
		"\5F\"\2\u012b\u012c\7O\2\2\u012c\u012e\3\2\2\2\u012d\u012a\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0132\3\2\2\2\u012f\u0130\5F\"\2\u0130\u0131\7F\2"+
		"\2\u0131\u0133\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0138\7V\2\2\u0135\u0136\5F\"\2\u0136\u0137\7J\2\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013d\3\2"+
		"\2\2\u013a\u013b\5F\"\2\u013b\u013c\7O\2\2\u013c\u013e\3\2\2\2\u013d\u013a"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0142\3\2\2\2\u013f\u0140\5F\"\2\u0140"+
		"\u0141\7U\2\2\u0141\u0143\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b#\5\2\u0145I\3\2\2\2\u0146\u0148"+
		"\t\31\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2"+
		"\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b$\4\2\u014cK\3\2"+
		"\2\2\u014d\u014e\t\3\2\2\u014e\u014f\t\22\2\2\u014f\u0150\t\3\2\2\u0150"+
		"\u0151\t\r\2\2\u0151\u0152\t\7\2\2\u0152\u0153\t\6\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\b%\6\2\u0155M\3\2\2\2\u0156\u0157\t\3\2\2\u0157\u0158"+
		"\t\22\2\2\u0158\u0159\t\3\2\2\u0159\u015a\t\r\2\2\u015a\u015b\t\7\2\2"+
		"\u015b\u015c\3\2\2\2\u015c\u015d\b&\6\2\u015dO\3\2\2\2\u015e\u0160\4\62"+
		";\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162Q\3\2\2\2\u0163\u0167\7R\2\2\u0164\u0165\5P\'\2\u0165"+
		"\u0166\7[\2\2\u0166\u0168\3\2\2\2\u0167\u0164\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u016c\3\2\2\2\u0169\u016a\5P\'\2\u016a\u016b\7O\2\2\u016b\u016d"+
		"\3\2\2\2\u016c\u0169\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0171\3\2\2\2\u016e"+
		"\u016f\5P\'\2\u016f\u0170\7F\2\2\u0170\u0172\3\2\2\2\u0171\u016e\3\2\2"+
		"\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0177\7V\2\2\u0174\u0175"+
		"\5P\'\2\u0175\u0176\7J\2\2\u0176\u0178\3\2\2\2\u0177\u0174\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017c\3\2\2\2\u0179\u017a\5P\'\2\u017a\u017b\7O\2"+
		"\2\u017b\u017d\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0181"+
		"\3\2\2\2\u017e\u017f\5P\'\2\u017f\u0180\7U\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017e\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\b("+
		"\6\2\u0184S\3\2\2\2\u0185\u0187\t\31\2\2\u0186\u0185\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\b)\4\2\u018bU\3\2\2\2\u018c\u018e\13\2\2\2\u018d\u018c\3\2\2\2"+
		"\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0192\7=\2\2\u0192\u0193\3\2\2\2\u0193\u0194\b*\6\2\u0194"+
		"W\3\2\2\2\31\2\3\4\5\u0104\u010a\u0122\u0128\u012d\u0132\u0138\u013d\u0142"+
		"\u0149\u0161\u0167\u016c\u0171\u0177\u017c\u0181\u0188\u018f\7\4\3\2\4"+
		"\4\2\b\2\2\4\5\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}