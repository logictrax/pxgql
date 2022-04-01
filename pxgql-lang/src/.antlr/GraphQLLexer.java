// Generated from /Users/adam/Projects/pxgql/pxgql-lang/src/GraphQL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, NAME=51, STRING=52, 
		BLOCK_STRING=53, ID=54, FLOAT=55, INT=56, PUNCTUATOR=57, WS=58, COMMA=59, 
		LineComment=60, UNICODE_BOM=61, UTF8_BOM=62, UTF16_BOM=63, UTF32_BOM=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "NAME", "CHARACTER", "STRING", "BLOCK_STRING", "ID", "ESC", 
			"UNICODE", "HEX", "NONZERO_DIGIT", "DIGIT", "FRACTIONAL_PART", "EXPONENTIAL_PART", 
			"EXPONENT_INDICATOR", "SIGN", "NEGATIVE_SIGN", "FLOAT", "INT", "PUNCTUATOR", 
			"EXP", "WS", "COMMA", "LineComment", "UNICODE_BOM", "UTF8_BOM", "UTF16_BOM", 
			"UTF32_BOM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'query'", "'mutation'", "'subscription'", "'{'", "'}'", "'('", 
			"')'", "':'", "'...'", "'fragment'", "'on'", "'true'", "'false'", "'null'", 
			"'['", "']'", "'$'", "'='", "'!'", "'@'", "'schema'", "'extend'", "'scalar'", 
			"'type'", "'implements'", "'&'", "'interface'", "'union'", "'|'", "'enum'", 
			"'input'", "'directive'", "'QUERY'", "'MUTATION'", "'SUBSCRIPTION'", 
			"'FIELD'", "'FRAGMENT_DEFINITION'", "'FRAGMENT_SPREAD'", "'INLINE_FRAGMENT'", 
			"'SCHEMA'", "'SCALAR'", "'OBJECT'", "'FIELD_DEFINITION'", "'ARGUMENT_DEFINITION'", 
			"'INTERFACE'", "'UNION'", "'ENUM'", "'ENUM_VALUE'", "'INPUT_OBJECT'", 
			"'INPUT_FIELD_DEFINITION'", null, null, null, null, null, null, null, 
			null, "','", null, null, "'\uEFBBBF'", "'\uFEFF'", "'\u0000FEFF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NAME", "STRING", "BLOCK_STRING", "ID", "FLOAT", "INT", 
			"PUNCTUATOR", "WS", "COMMA", "LineComment", "UNICODE_BOM", "UTF8_BOM", 
			"UTF16_BOM", "UTF32_BOM"
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


	public GraphQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraphQL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u02a9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u0212\n\64"+
		"\f\64\16\64\u0215\13\64\3\65\3\65\5\65\u0219\n\65\3\66\3\66\7\66\u021d"+
		"\n\66\f\66\16\66\u0220\13\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\7\67\u0229"+
		"\n\67\f\67\16\67\u022c\13\67\3\67\3\67\3\67\3\67\38\38\39\39\39\59\u0237"+
		"\n9\3:\3:\3:\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\6>\u0247\n>\r>\16>\u0248"+
		"\3?\3?\5?\u024d\n?\3?\6?\u0250\n?\r?\16?\u0251\3@\3@\3A\3A\3B\3B\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0264\nC\3D\5D\u0267\nD\3D\3D\5D\u026b\n"+
		"D\3D\3D\7D\u026f\nD\fD\16D\u0272\13D\5D\u0274\nD\3E\3E\3E\3E\3E\5E\u027b"+
		"\nE\3F\3F\5F\u027f\nF\3F\3F\3G\6G\u0284\nG\rG\16G\u0285\3G\3G\3H\3H\3"+
		"H\3H\3I\3I\7I\u0290\nI\fI\16I\u0293\13I\3I\3I\3J\3J\3J\5J\u029a\nJ\3J"+
		"\3J\3K\3K\3K\3K\3L\3L\3M\3M\3M\3M\3M\3M\3\u022a\2N\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\66m\67o8q\2s\2u\2w\2y\2{"+
		"\2}\2\177\2\u0081\2\u0083\2\u00859\u0087:\u0089;\u008b\2\u008d<\u008f"+
		"=\u0091>\u0093?\u0095@\u0097A\u0099B\3\2\17\5\2C\\aac|\6\2\62;C\\aac|"+
		"\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\63;\3\2\62;\4\2GGgg\4"+
		"\2--//\5\2##&&*+\b\2<<??BB]]__}\177\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2"+
		"\u02b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008d\3\2"+
		"\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2"+
		"\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b\3\2\2\2\5\u00a1\3\2\2\2\7\u00aa"+
		"\3\2\2\2\t\u00b7\3\2\2\2\13\u00b9\3\2\2\2\r\u00bb\3\2\2\2\17\u00bd\3\2"+
		"\2\2\21\u00bf\3\2\2\2\23\u00c1\3\2\2\2\25\u00c5\3\2\2\2\27\u00ce\3\2\2"+
		"\2\31\u00d1\3\2\2\2\33\u00d6\3\2\2\2\35\u00dc\3\2\2\2\37\u00e1\3\2\2\2"+
		"!\u00e3\3\2\2\2#\u00e5\3\2\2\2%\u00e7\3\2\2\2\'\u00e9\3\2\2\2)\u00eb\3"+
		"\2\2\2+\u00ed\3\2\2\2-\u00f4\3\2\2\2/\u00fb\3\2\2\2\61\u0102\3\2\2\2\63"+
		"\u0107\3\2\2\2\65\u0112\3\2\2\2\67\u0114\3\2\2\29\u011e\3\2\2\2;\u0124"+
		"\3\2\2\2=\u0126\3\2\2\2?\u012b\3\2\2\2A\u0131\3\2\2\2C\u013b\3\2\2\2E"+
		"\u0141\3\2\2\2G\u014a\3\2\2\2I\u0157\3\2\2\2K\u015d\3\2\2\2M\u0171\3\2"+
		"\2\2O\u0181\3\2\2\2Q\u0191\3\2\2\2S\u0198\3\2\2\2U\u019f\3\2\2\2W\u01a6"+
		"\3\2\2\2Y\u01b7\3\2\2\2[\u01cb\3\2\2\2]\u01d5\3\2\2\2_\u01db\3\2\2\2a"+
		"\u01e0\3\2\2\2c\u01eb\3\2\2\2e\u01f8\3\2\2\2g\u020f\3\2\2\2i\u0218\3\2"+
		"\2\2k\u021a\3\2\2\2m\u0223\3\2\2\2o\u0231\3\2\2\2q\u0233\3\2\2\2s\u0238"+
		"\3\2\2\2u\u023e\3\2\2\2w\u0240\3\2\2\2y\u0242\3\2\2\2{\u0244\3\2\2\2}"+
		"\u024a\3\2\2\2\177\u0253\3\2\2\2\u0081\u0255\3\2\2\2\u0083\u0257\3\2\2"+
		"\2\u0085\u0263\3\2\2\2\u0087\u0273\3\2\2\2\u0089\u027a\3\2\2\2\u008b\u027c"+
		"\3\2\2\2\u008d\u0283\3\2\2\2\u008f\u0289\3\2\2\2\u0091\u028d\3\2\2\2\u0093"+
		"\u0299\3\2\2\2\u0095\u029d\3\2\2\2\u0097\u02a1\3\2\2\2\u0099\u02a3\3\2"+
		"\2\2\u009b\u009c\7s\2\2\u009c\u009d\7w\2\2\u009d\u009e\7g\2\2\u009e\u009f"+
		"\7t\2\2\u009f\u00a0\7{\2\2\u00a0\4\3\2\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3"+
		"\7w\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7p\2\2\u00a9\6\3\2\2\2\u00aa"+
		"\u00ab\7u\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7d\2\2\u00ad\u00ae\7u\2\2"+
		"\u00ae\u00af\7e\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2"+
		"\7r\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7q\2\2\u00b5"+
		"\u00b6\7p\2\2\u00b6\b\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8\n\3\2\2\2\u00b9"+
		"\u00ba\7\177\2\2\u00ba\f\3\2\2\2\u00bb\u00bc\7*\2\2\u00bc\16\3\2\2\2\u00bd"+
		"\u00be\7+\2\2\u00be\20\3\2\2\2\u00bf\u00c0\7<\2\2\u00c0\22\3\2\2\2\u00c1"+
		"\u00c2\7\60\2\2\u00c2\u00c3\7\60\2\2\u00c3\u00c4\7\60\2\2\u00c4\24\3\2"+
		"\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9"+
		"\7i\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7p\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\26\3\2\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7p\2\2\u00d0"+
		"\30\3\2\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7w\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\32\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7c\2\2\u00d8"+
		"\u00d9\7n\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7g\2\2\u00db\34\3\2\2\2\u00dc"+
		"\u00dd\7p\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7n\2\2"+
		"\u00e0\36\3\2\2\2\u00e1\u00e2\7]\2\2\u00e2 \3\2\2\2\u00e3\u00e4\7_\2\2"+
		"\u00e4\"\3\2\2\2\u00e5\u00e6\7&\2\2\u00e6$\3\2\2\2\u00e7\u00e8\7?\2\2"+
		"\u00e8&\3\2\2\2\u00e9\u00ea\7#\2\2\u00ea(\3\2\2\2\u00eb\u00ec\7B\2\2\u00ec"+
		"*\3\2\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7j\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7c\2\2\u00f3,\3\2\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7z\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7g\2\2"+
		"\u00f8\u00f9\7p\2\2\u00f9\u00fa\7f\2\2\u00fa.\3\2\2\2\u00fb\u00fc\7u\2"+
		"\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100"+
		"\7c\2\2\u0100\u0101\7t\2\2\u0101\60\3\2\2\2\u0102\u0103\7v\2\2\u0103\u0104"+
		"\7{\2\2\u0104\u0105\7r\2\2\u0105\u0106\7g\2\2\u0106\62\3\2\2\2\u0107\u0108"+
		"\7k\2\2\u0108\u0109\7o\2\2\u0109\u010a\7r\2\2\u010a\u010b\7n\2\2\u010b"+
		"\u010c\7g\2\2\u010c\u010d\7o\2\2\u010d\u010e\7g\2\2\u010e\u010f\7p\2\2"+
		"\u010f\u0110\7v\2\2\u0110\u0111\7u\2\2\u0111\64\3\2\2\2\u0112\u0113\7"+
		"(\2\2\u0113\66\3\2\2\2\u0114\u0115\7k\2\2\u0115\u0116\7p\2\2\u0116\u0117"+
		"\7v\2\2\u0117\u0118\7g\2\2\u0118\u0119\7t\2\2\u0119\u011a\7h\2\2\u011a"+
		"\u011b\7c\2\2\u011b\u011c\7e\2\2\u011c\u011d\7g\2\2\u011d8\3\2\2\2\u011e"+
		"\u011f\7w\2\2\u011f\u0120\7p\2\2\u0120\u0121\7k\2\2\u0121\u0122\7q\2\2"+
		"\u0122\u0123\7p\2\2\u0123:\3\2\2\2\u0124\u0125\7~\2\2\u0125<\3\2\2\2\u0126"+
		"\u0127\7g\2\2\u0127\u0128\7p\2\2\u0128\u0129\7w\2\2\u0129\u012a\7o\2\2"+
		"\u012a>\3\2\2\2\u012b\u012c\7k\2\2\u012c\u012d\7p\2\2\u012d\u012e\7r\2"+
		"\2\u012e\u012f\7w\2\2\u012f\u0130\7v\2\2\u0130@\3\2\2\2\u0131\u0132\7"+
		"f\2\2\u0132\u0133\7k\2\2\u0133\u0134\7t\2\2\u0134\u0135\7g\2\2\u0135\u0136"+
		"\7e\2\2\u0136\u0137\7v\2\2\u0137\u0138\7k\2\2\u0138\u0139\7x\2\2\u0139"+
		"\u013a\7g\2\2\u013aB\3\2\2\2\u013b\u013c\7S\2\2\u013c\u013d\7W\2\2\u013d"+
		"\u013e\7G\2\2\u013e\u013f\7T\2\2\u013f\u0140\7[\2\2\u0140D\3\2\2\2\u0141"+
		"\u0142\7O\2\2\u0142\u0143\7W\2\2\u0143\u0144\7V\2\2\u0144\u0145\7C\2\2"+
		"\u0145\u0146\7V\2\2\u0146\u0147\7K\2\2\u0147\u0148\7Q\2\2\u0148\u0149"+
		"\7P\2\2\u0149F\3\2\2\2\u014a\u014b\7U\2\2\u014b\u014c\7W\2\2\u014c\u014d"+
		"\7D\2\2\u014d\u014e\7U\2\2\u014e\u014f\7E\2\2\u014f\u0150\7T\2\2\u0150"+
		"\u0151\7K\2\2\u0151\u0152\7R\2\2\u0152\u0153\7V\2\2\u0153\u0154\7K\2\2"+
		"\u0154\u0155\7Q\2\2\u0155\u0156\7P\2\2\u0156H\3\2\2\2\u0157\u0158\7H\2"+
		"\2\u0158\u0159\7K\2\2\u0159\u015a\7G\2\2\u015a\u015b\7N\2\2\u015b\u015c"+
		"\7F\2\2\u015cJ\3\2\2\2\u015d\u015e\7H\2\2\u015e\u015f\7T\2\2\u015f\u0160"+
		"\7C\2\2\u0160\u0161\7I\2\2\u0161\u0162\7O\2\2\u0162\u0163\7G\2\2\u0163"+
		"\u0164\7P\2\2\u0164\u0165\7V\2\2\u0165\u0166\7a\2\2\u0166\u0167\7F\2\2"+
		"\u0167\u0168\7G\2\2\u0168\u0169\7H\2\2\u0169\u016a\7K\2\2\u016a\u016b"+
		"\7P\2\2\u016b\u016c\7K\2\2\u016c\u016d\7V\2\2\u016d\u016e\7K\2\2\u016e"+
		"\u016f\7Q\2\2\u016f\u0170\7P\2\2\u0170L\3\2\2\2\u0171\u0172\7H\2\2\u0172"+
		"\u0173\7T\2\2\u0173\u0174\7C\2\2\u0174\u0175\7I\2\2\u0175\u0176\7O\2\2"+
		"\u0176\u0177\7G\2\2\u0177\u0178\7P\2\2\u0178\u0179\7V\2\2\u0179\u017a"+
		"\7a\2\2\u017a\u017b\7U\2\2\u017b\u017c\7R\2\2\u017c\u017d\7T\2\2\u017d"+
		"\u017e\7G\2\2\u017e\u017f\7C\2\2\u017f\u0180\7F\2\2\u0180N\3\2\2\2\u0181"+
		"\u0182\7K\2\2\u0182\u0183\7P\2\2\u0183\u0184\7N\2\2\u0184\u0185\7K\2\2"+
		"\u0185\u0186\7P\2\2\u0186\u0187\7G\2\2\u0187\u0188\7a\2\2\u0188\u0189"+
		"\7H\2\2\u0189\u018a\7T\2\2\u018a\u018b\7C\2\2\u018b\u018c\7I\2\2\u018c"+
		"\u018d\7O\2\2\u018d\u018e\7G\2\2\u018e\u018f\7P\2\2\u018f\u0190\7V\2\2"+
		"\u0190P\3\2\2\2\u0191\u0192\7U\2\2\u0192\u0193\7E\2\2\u0193\u0194\7J\2"+
		"\2\u0194\u0195\7G\2\2\u0195\u0196\7O\2\2\u0196\u0197\7C\2\2\u0197R\3\2"+
		"\2\2\u0198\u0199\7U\2\2\u0199\u019a\7E\2\2\u019a\u019b\7C\2\2\u019b\u019c"+
		"\7N\2\2\u019c\u019d\7C\2\2\u019d\u019e\7T\2\2\u019eT\3\2\2\2\u019f\u01a0"+
		"\7Q\2\2\u01a0\u01a1\7D\2\2\u01a1\u01a2\7L\2\2\u01a2\u01a3\7G\2\2\u01a3"+
		"\u01a4\7E\2\2\u01a4\u01a5\7V\2\2\u01a5V\3\2\2\2\u01a6\u01a7\7H\2\2\u01a7"+
		"\u01a8\7K\2\2\u01a8\u01a9\7G\2\2\u01a9\u01aa\7N\2\2\u01aa\u01ab\7F\2\2"+
		"\u01ab\u01ac\7a\2\2\u01ac\u01ad\7F\2\2\u01ad\u01ae\7G\2\2\u01ae\u01af"+
		"\7H\2\2\u01af\u01b0\7K\2\2\u01b0\u01b1\7P\2\2\u01b1\u01b2\7K\2\2\u01b2"+
		"\u01b3\7V\2\2\u01b3\u01b4\7K\2\2\u01b4\u01b5\7Q\2\2\u01b5\u01b6\7P\2\2"+
		"\u01b6X\3\2\2\2\u01b7\u01b8\7C\2\2\u01b8\u01b9\7T\2\2\u01b9\u01ba\7I\2"+
		"\2\u01ba\u01bb\7W\2\2\u01bb\u01bc\7O\2\2\u01bc\u01bd\7G\2\2\u01bd\u01be"+
		"\7P\2\2\u01be\u01bf\7V\2\2\u01bf\u01c0\7a\2\2\u01c0\u01c1\7F\2\2\u01c1"+
		"\u01c2\7G\2\2\u01c2\u01c3\7H\2\2\u01c3\u01c4\7K\2\2\u01c4\u01c5\7P\2\2"+
		"\u01c5\u01c6\7K\2\2\u01c6\u01c7\7V\2\2\u01c7\u01c8\7K\2\2\u01c8\u01c9"+
		"\7Q\2\2\u01c9\u01ca\7P\2\2\u01caZ\3\2\2\2\u01cb\u01cc\7K\2\2\u01cc\u01cd"+
		"\7P\2\2\u01cd\u01ce\7V\2\2\u01ce\u01cf\7G\2\2\u01cf\u01d0\7T\2\2\u01d0"+
		"\u01d1\7H\2\2\u01d1\u01d2\7C\2\2\u01d2\u01d3\7E\2\2\u01d3\u01d4\7G\2\2"+
		"\u01d4\\\3\2\2\2\u01d5\u01d6\7W\2\2\u01d6\u01d7\7P\2\2\u01d7\u01d8\7K"+
		"\2\2\u01d8\u01d9\7Q\2\2\u01d9\u01da\7P\2\2\u01da^\3\2\2\2\u01db\u01dc"+
		"\7G\2\2\u01dc\u01dd\7P\2\2\u01dd\u01de\7W\2\2\u01de\u01df\7O\2\2\u01df"+
		"`\3\2\2\2\u01e0\u01e1\7G\2\2\u01e1\u01e2\7P\2\2\u01e2\u01e3\7W\2\2\u01e3"+
		"\u01e4\7O\2\2\u01e4\u01e5\7a\2\2\u01e5\u01e6\7X\2\2\u01e6\u01e7\7C\2\2"+
		"\u01e7\u01e8\7N\2\2\u01e8\u01e9\7W\2\2\u01e9\u01ea\7G\2\2\u01eab\3\2\2"+
		"\2\u01eb\u01ec\7K\2\2\u01ec\u01ed\7P\2\2\u01ed\u01ee\7R\2\2\u01ee\u01ef"+
		"\7W\2\2\u01ef\u01f0\7V\2\2\u01f0\u01f1\7a\2\2\u01f1\u01f2\7Q\2\2\u01f2"+
		"\u01f3\7D\2\2\u01f3\u01f4\7L\2\2\u01f4\u01f5\7G\2\2\u01f5\u01f6\7E\2\2"+
		"\u01f6\u01f7\7V\2\2\u01f7d\3\2\2\2\u01f8\u01f9\7K\2\2\u01f9\u01fa\7P\2"+
		"\2\u01fa\u01fb\7R\2\2\u01fb\u01fc\7W\2\2\u01fc\u01fd\7V\2\2\u01fd\u01fe"+
		"\7a\2\2\u01fe\u01ff\7H\2\2\u01ff\u0200\7K\2\2\u0200\u0201\7G\2\2\u0201"+
		"\u0202\7N\2\2\u0202\u0203\7F\2\2\u0203\u0204\7a\2\2\u0204\u0205\7F\2\2"+
		"\u0205\u0206\7G\2\2\u0206\u0207\7H\2\2\u0207\u0208\7K\2\2\u0208\u0209"+
		"\7P\2\2\u0209\u020a\7K\2\2\u020a\u020b\7V\2\2\u020b\u020c\7K\2\2\u020c"+
		"\u020d\7Q\2\2\u020d\u020e\7P\2\2\u020ef\3\2\2\2\u020f\u0213\t\2\2\2\u0210"+
		"\u0212\t\3\2\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0213\u0214\3\2\2\2\u0214h\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0219"+
		"\5q9\2\u0217\u0219\n\4\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219"+
		"j\3\2\2\2\u021a\u021e\7$\2\2\u021b\u021d\5i\65\2\u021c\u021b\3\2\2\2\u021d"+
		"\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2"+
		"\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7$\2\2\u0222l\3\2\2\2\u0223\u0224"+
		"\7$\2\2\u0224\u0225\7$\2\2\u0225\u0226\7$\2\2\u0226\u022a\3\2\2\2\u0227"+
		"\u0229\13\2\2\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u022b\3"+
		"\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d"+
		"\u022e\7$\2\2\u022e\u022f\7$\2\2\u022f\u0230\7$\2\2\u0230n\3\2\2\2\u0231"+
		"\u0232\5k\66\2\u0232p\3\2\2\2\u0233\u0236\7^\2\2\u0234\u0237\t\5\2\2\u0235"+
		"\u0237\5s:\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237r\3\2\2\2\u0238"+
		"\u0239\7w\2\2\u0239\u023a\5u;\2\u023a\u023b\5u;\2\u023b\u023c\5u;\2\u023c"+
		"\u023d\5u;\2\u023dt\3\2\2\2\u023e\u023f\t\6\2\2\u023fv\3\2\2\2\u0240\u0241"+
		"\t\7\2\2\u0241x\3\2\2\2\u0242\u0243\t\b\2\2\u0243z\3\2\2\2\u0244\u0246"+
		"\7\60\2\2\u0245\u0247\5y=\2\u0246\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249|\3\2\2\2\u024a\u024c\5\177@\2"+
		"\u024b\u024d\5\u0081A\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024f\3\2\2\2\u024e\u0250\5y=\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2\2"+
		"\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252~\3\2\2\2\u0253\u0254"+
		"\t\t\2\2\u0254\u0080\3\2\2\2\u0255\u0256\t\n\2\2\u0256\u0082\3\2\2\2\u0257"+
		"\u0258\7/\2\2\u0258\u0084\3\2\2\2\u0259\u025a\5\u0087D\2\u025a\u025b\5"+
		"{>\2\u025b\u0264\3\2\2\2\u025c\u025d\5\u0087D\2\u025d\u025e\5}?\2\u025e"+
		"\u0264\3\2\2\2\u025f\u0260\5\u0087D\2\u0260\u0261\5{>\2\u0261\u0262\5"+
		"}?\2\u0262\u0264\3\2\2\2\u0263\u0259\3\2\2\2\u0263\u025c\3\2\2\2\u0263"+
		"\u025f\3\2\2\2\u0264\u0086\3\2\2\2\u0265\u0267\5\u0083B\2\u0266\u0265"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0274\7\62\2\2"+
		"\u0269\u026b\5\u0083B\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u0270\5w<\2\u026d\u026f\5y=\2\u026e\u026d\3\2\2\2"+
		"\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0274"+
		"\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0266\3\2\2\2\u0273\u026a\3\2\2\2\u0274"+
		"\u0088\3\2\2\2\u0275\u027b\t\13\2\2\u0276\u0277\7\60\2\2\u0277\u0278\7"+
		"\60\2\2\u0278\u027b\7\60\2\2\u0279\u027b\t\f\2\2\u027a\u0275\3\2\2\2\u027a"+
		"\u0276\3\2\2\2\u027a\u0279\3\2\2\2\u027b\u008a\3\2\2\2\u027c\u027e\t\t"+
		"\2\2\u027d\u027f\t\n\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0281\5\u0087D\2\u0281\u008c\3\2\2\2\u0282\u0284"+
		"\t\r\2\2\u0283\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\bG\2\2\u0288\u008e\3\2"+
		"\2\2\u0289\u028a\7.\2\2\u028a\u028b\3\2\2\2\u028b\u028c\bH\2\2\u028c\u0090"+
		"\3\2\2\2\u028d\u0291\7%\2\2\u028e\u0290\n\16\2\2\u028f\u028e\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0294\u0295\bI\2\2\u0295\u0092\3\2\2\2\u0296"+
		"\u029a\5\u0095K\2\u0297\u029a\5\u0097L\2\u0298\u029a\5\u0099M\2\u0299"+
		"\u0296\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u029c\bJ\2\2\u029c\u0094\3\2\2\2\u029d\u029e\7\uefbd\2\2\u029e"+
		"\u029f\7D\2\2\u029f\u02a0\7H\2\2\u02a0\u0096\3\2\2\2\u02a1\u02a2\7\uff01"+
		"\2\2\u02a2\u0098\3\2\2\2\u02a3\u02a4\7\2\2\2\u02a4\u02a5\7H\2\2\u02a5"+
		"\u02a6\7G\2\2\u02a6\u02a7\7H\2\2\u02a7\u02a8\7H\2\2\u02a8\u009a\3\2\2"+
		"\2\25\2\u0213\u0218\u021e\u022a\u0236\u0248\u024c\u0251\u0263\u0266\u026a"+
		"\u0270\u0273\u027a\u027e\u0285\u0291\u0299\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}