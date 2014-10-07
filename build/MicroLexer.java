// Generated from Micro.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, END=3, FUNCTION=4, READ=5, WRITE=6, IF=7, ELSE=8, 
		ENDIF=9, WHILE=10, ENDWHILE=11, RETURN=12, INT=13, VOID=14, STRING=15, 
		FLOAT=16, ASSIGNMENT=17, ADD=18, SUBTRACT=19, MULTIPLY=20, DIVIDE=21, 
		EQUAL=22, NEQUAL=23, LTHAN=24, GTHAN=25, LTHANEQ=26, GTHANEQ=27, LPAREN=28, 
		RPAREN=29, SEMI=30, COMMA=31, IDENTIFIER=32, FLOATLITERAL=33, INTLITERAL=34, 
		STRINGLITERAL=35, COMMENT=36, WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "BEGIN", "END", "FUNCTION", "READ", "WRITE", "IF", "ELSE", 
		"ENDIF", "WHILE", "ENDWHILE", "RETURN", "INT", "VOID", "STRING", "FLOAT", 
		"ASSIGNMENT", "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "EQUAL", "NEQUAL", 
		"LTHAN", "GTHAN", "LTHANEQ", "GTHANEQ", "LPAREN", "RPAREN", "SEMI", "COMMA", 
		"IDENTIFIER", "FLOATLITERAL", "INTLITERAL", "STRINGLITERAL", "COMMENT", 
		"WS"
	};


	public MicroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0102\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\7!\u00d2"+
		"\n!\f!\16!\u00d5\13!\3\"\7\"\u00d8\n\"\f\"\16\"\u00db\13\"\3\"\3\"\6\""+
		"\u00df\n\"\r\"\16\"\u00e0\3#\6#\u00e4\n#\r#\16#\u00e5\3$\3$\7$\u00ea\n"+
		"$\f$\16$\u00ed\13$\3$\3$\3%\3%\3%\3%\7%\u00f5\n%\f%\16%\u00f8\13%\3%\3"+
		"%\3&\6&\u00fd\n&\r&\16&\u00fe\3&\3&\4\u00d9\u00eb\2\'\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'\3\2\b\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2$$))\4\2\f\f\17\17\5\2\13\f"+
		"\17\17\"\"\u0108\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5U\3\2\2\2\7[\3\2"+
		"\2\2\t_\3\2\2\2\13h\3\2\2\2\rm\3\2\2\2\17s\3\2\2\2\21v\3\2\2\2\23{\3\2"+
		"\2\2\25\u0081\3\2\2\2\27\u0087\3\2\2\2\31\u0090\3\2\2\2\33\u0097\3\2\2"+
		"\2\35\u009b\3\2\2\2\37\u00a0\3\2\2\2!\u00a7\3\2\2\2#\u00ad\3\2\2\2%\u00b0"+
		"\3\2\2\2\'\u00b2\3\2\2\2)\u00b4\3\2\2\2+\u00b6\3\2\2\2-\u00b8\3\2\2\2"+
		"/\u00ba\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2\65\u00c1\3\2\2\2\67"+
		"\u00c4\3\2\2\29\u00c7\3\2\2\2;\u00c9\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2"+
		"\2\2A\u00cf\3\2\2\2C\u00d9\3\2\2\2E\u00e3\3\2\2\2G\u00e7\3\2\2\2I\u00f0"+
		"\3\2\2\2K\u00fc\3\2\2\2MN\7R\2\2NO\7T\2\2OP\7Q\2\2PQ\7I\2\2QR\7T\2\2R"+
		"S\7C\2\2ST\7O\2\2T\4\3\2\2\2UV\7D\2\2VW\7G\2\2WX\7I\2\2XY\7K\2\2YZ\7P"+
		"\2\2Z\6\3\2\2\2[\\\7G\2\2\\]\7P\2\2]^\7F\2\2^\b\3\2\2\2_`\7H\2\2`a\7W"+
		"\2\2ab\7P\2\2bc\7E\2\2cd\7V\2\2de\7K\2\2ef\7Q\2\2fg\7P\2\2g\n\3\2\2\2"+
		"hi\7T\2\2ij\7G\2\2jk\7C\2\2kl\7F\2\2l\f\3\2\2\2mn\7Y\2\2no\7T\2\2op\7"+
		"K\2\2pq\7V\2\2qr\7G\2\2r\16\3\2\2\2st\7K\2\2tu\7H\2\2u\20\3\2\2\2vw\7"+
		"G\2\2wx\7N\2\2xy\7U\2\2yz\7G\2\2z\22\3\2\2\2{|\7G\2\2|}\7P\2\2}~\7F\2"+
		"\2~\177\7K\2\2\177\u0080\7H\2\2\u0080\24\3\2\2\2\u0081\u0082\7Y\2\2\u0082"+
		"\u0083\7J\2\2\u0083\u0084\7K\2\2\u0084\u0085\7N\2\2\u0085\u0086\7G\2\2"+
		"\u0086\26\3\2\2\2\u0087\u0088\7G\2\2\u0088\u0089\7P\2\2\u0089\u008a\7"+
		"F\2\2\u008a\u008b\7Y\2\2\u008b\u008c\7J\2\2\u008c\u008d\7K\2\2\u008d\u008e"+
		"\7N\2\2\u008e\u008f\7G\2\2\u008f\30\3\2\2\2\u0090\u0091\7T\2\2\u0091\u0092"+
		"\7G\2\2\u0092\u0093\7V\2\2\u0093\u0094\7W\2\2\u0094\u0095\7T\2\2\u0095"+
		"\u0096\7P\2\2\u0096\32\3\2\2\2\u0097\u0098\7K\2\2\u0098\u0099\7P\2\2\u0099"+
		"\u009a\7V\2\2\u009a\34\3\2\2\2\u009b\u009c\7X\2\2\u009c\u009d\7Q\2\2\u009d"+
		"\u009e\7K\2\2\u009e\u009f\7F\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7U\2\2\u00a1"+
		"\u00a2\7V\2\2\u00a2\u00a3\7T\2\2\u00a3\u00a4\7K\2\2\u00a4\u00a5\7P\2\2"+
		"\u00a5\u00a6\7I\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7H\2\2\u00a8\u00a9\7N\2"+
		"\2\u00a9\u00aa\7Q\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\7V\2\2\u00ac\"\3"+
		"\2\2\2\u00ad\u00ae\7<\2\2\u00ae\u00af\7?\2\2\u00af$\3\2\2\2\u00b0\u00b1"+
		"\7-\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7"+
		",\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7"+
		"?\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bc\7?\2\2\u00bc\60\3"+
		"\2\2\2\u00bd\u00be\7>\2\2\u00be\62\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0\64"+
		"\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7?\2\2\u00c3\66\3\2\2\2\u00c4"+
		"\u00c5\7@\2\2\u00c5\u00c6\7?\2\2\u00c68\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8"+
		":\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca<\3\2\2\2\u00cb\u00cc\7=\2\2\u00cc>"+
		"\3\2\2\2\u00cd\u00ce\7.\2\2\u00ce@\3\2\2\2\u00cf\u00d3\t\2\2\2\u00d0\u00d2"+
		"\t\3\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4B\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\t\4\2\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00da\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\7\60\2\2"+
		"\u00dd\u00df\t\4\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1D\3\2\2\2\u00e2\u00e4\t\4\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6F\3\2\2\2\u00e7\u00eb\7$\2\2\u00e8\u00ea\n\5\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7$\2\2\u00efH\3\2\2\2\u00f0"+
		"\u00f1\7/\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5\n\6\2"+
		"\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\b%\2\2\u00fa"+
		"J\3\2\2\2\u00fb\u00fd\t\7\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\b&\2\2\u0101L\3\2\2\2\n\2\u00d3\u00d9\u00e0\u00e5\u00eb\u00f6\u00fe\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}