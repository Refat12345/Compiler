// Generated from java-escape by ANTLR 4.11.1
package Compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class dartParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INITSTATE=1, TITLE=2, THEME=3, DEBUGSHOWMODE=4, ThemeData=5, PrimarySwatch=6, 
		SMALLER=7, BIGER=8, PLUS=9, MINUS=10, STAR=11, MOD=12, DEVIDE=13, SMALLER_OR_EQUAL=14, 
		BIGER_OR_EQUAL=15, PLUS_PLUS=16, MINUS_MINUS=17, SDOLLAR=18, SCAFFOLD=19, 
		Q_MARK=20, STATE=21, CREATSTATE=22, KEY=23, FULL=24, LESS=25, FOREACH=26, 
		FOR=27, TEXT=28, CHIS=29, OPEN_PR=30, CLOSE_PR=31, COLUMN=32, ROW=33, 
		FIT=34, BOXFIT=35, FILL=36, WS=37, EMIT=38, BLOC_PROVIDER=39, BLOC_CONSUMER=40, 
		LISTNER=41, BUILDER=42, CREATE=43, STATE1=44, NAVIGATOR=45, PUSH=46, MATERIAL_PAGE_ROUTE=47, 
		ON_LONG_PRESS=48, EXCLAMATION=49, TOOL_BAR_HEIGHT=50, FLEXIBLE_SPACE=51, 
		DOUBLE=52, INFINITY=53, COVER=54, CROSS_AXIS_ALIGNMENT_1=55, CROSS_AXIS_ALIGNMENT_2=56, 
		START=57, SPACER=58, FONT_SIZE=59, FONT_WEIGHT=60, FONT_WEIGHT1=61, W600=62, 
		STYLE=63, TEXT_STYLE=64, ASSET=65, IMAGE=66, APPBAR2=67, APPBAR=68, BACK=69, 
		MAIN=70, BODY=71, RUNAPP=72, LIST=73, BUILD=74, OVERRIDE=75, SETSTATE=76, 
		ONTAP=77, GestureDetector=78, WIDGET=79, BUILDCONTEXT=80, PADDING=81, 
		PADDING1=82, EDGE=83, ALL=84, VOID=85, TYPE=86, HEIGHT=87, WIDTH=88, BOOL_VAL=89, 
		SIZEDBOX=90, CONTAINER=91, CHILD=92, COLORS=93, COL=94, COLOR=95, D_DOT=96, 
		DOT=97, BORDER2=98, EXPANDED=99, CIRCULAR=100, BORDERRADIUS=101, DECORATION=102, 
		BD=103, LISTVIEW=104, SEPARATED=105, ItemBuilder=106, SeparatorBuilder=107, 
		ItemCount=108, Return=109, MAINAXIS=110, MAINAXIS1=111, CENTER=112, CONTEXT=113, 
		INDEX=114, EQUAL=115, NUM_VAL=116, SIMICOLON=117, COLON=118, OPEN_HEAD=119, 
		CLOSE_HEAD=120, OPEN_BODY=121, CLOSE_BODY=122, FINAL=123, CONST=124, VAR=125, 
		ASYNC=126, THIS=127, ABSTRACT=128, AS=129, SYNC=130, CLASS=131, WITH=132, 
		STATIC=133, DYNAMIC=134, EXTERNAL=135, GET=136, SET=137, OPERATOR=138, 
		SUPER=139, FACTORY=140, EXTENDS=141, IMPLEMENTS=142, ENUM=143, NULL=144, 
		THROW=145, NEW=146, AWAIT=147, DEFERRED=148, EXPORT=149, IMPORT=150, LIBRARY=151, 
		PART=152, TYPEDEF=153, IS=154, IF=155, ELSE=156, WHILE=157, IN=158, DO=159, 
		SWITCH=160, CASE=161, DEFAULT=162, RETHROW=163, TRY=164, ON=165, CATCH=166, 
		FINALLY=167, RETURN=168, BREAK=169, CONTINUE=170, YIELD=171, SHOW=172, 
		HIDE=173, OF=174, ASSERT=175, MATERIALAPP=176, HOME=177, STRING_VAL=178, 
		VAR_NAME=179, CHAR_VAL=180, STRING_OPEN=181, STRING_CLOSE=182, PRACET=183, 
		CLOSE_PRACET=184;
	public static final int
		RULE_prog = 0, RULE_file_syntax = 1, RULE_string_val = 2, RULE_emit = 3, 
		RULE_declear_var = 4, RULE_declear_vars = 5, RULE_object_value = 6, RULE_val = 7, 
		RULE_ifdart = 8, RULE_arguments = 9, RULE_arguments1 = 10, RULE_block = 11, 
		RULE_function = 12, RULE_object_cubit = 13, RULE_class_definition = 14, 
		RULE_constructor = 15, RULE_constructor1 = 16, RULE_constructor2 = 17, 
		RULE_class1 = 18, RULE_class2 = 19, RULE_class3 = 20, RULE_class4 = 21, 
		RULE_bloc_provider = 22, RULE_bloc_consumer = 23, RULE_listner = 24, RULE_builder = 25, 
		RULE_material_page_route = 26, RULE_navigator = 27, RULE_on_long_press = 28, 
		RULE_tool_bar_height = 29, RULE_flexible_space = 30, RULE_spacer = 31, 
		RULE_for = 32, RULE_operation = 33, RULE_flutter = 34, RULE_imporT = 35, 
		RULE_main = 36, RULE_runapp = 37, RULE_classs = 38, RULE_class_less = 39, 
		RULE_class_full = 40, RULE_class_full1 = 41, RULE_const = 42, RULE_state = 43, 
		RULE_class_full2 = 44, RULE_initstate = 45, RULE_build = 46, RULE_widget = 47, 
		RULE_child = 48, RULE_materialapp = 49, RULE_home = 50, RULE_title = 51, 
		RULE_theme = 52, RULE_debugshowmode = 53, RULE_column = 54, RULE_row = 55, 
		RULE_children = 56, RULE_text = 57, RULE_style = 58, RULE_image = 59, 
		RULE_image1 = 60, RULE_image2 = 61, RULE_scaffold = 62, RULE_appbar = 63, 
		RULE_body = 64, RULE_padding1 = 65, RULE_padding = 66, RULE_expanded = 67, 
		RULE_sizedbox = 68, RULE_hieght = 69, RULE_width = 70, RULE_listview = 71, 
		RULE_itb = 72, RULE_sb = 73, RULE_ic = 74, RULE_container = 75, RULE_bord_rad = 76, 
		RULE_color = 77, RULE_colors = 78, RULE_decoration = 79, RULE_list = 80, 
		RULE_object = 81, RULE_varible = 82, RULE_gestureDetector = 83, RULE_ontap = 84;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "file_syntax", "string_val", "emit", "declear_var", "declear_vars", 
			"object_value", "val", "ifdart", "arguments", "arguments1", "block", 
			"function", "object_cubit", "class_definition", "constructor", "constructor1", 
			"constructor2", "class1", "class2", "class3", "class4", "bloc_provider", 
			"bloc_consumer", "listner", "builder", "material_page_route", "navigator", 
			"on_long_press", "tool_bar_height", "flexible_space", "spacer", "for", 
			"operation", "flutter", "imporT", "main", "runapp", "classs", "class_less", 
			"class_full", "class_full1", "const", "state", "class_full2", "initstate", 
			"build", "widget", "child", "materialapp", "home", "title", "theme", 
			"debugshowmode", "column", "row", "children", "text", "style", "image", 
			"image1", "image2", "scaffold", "appbar", "body", "padding1", "padding", 
			"expanded", "sizedbox", "hieght", "width", "listview", "itb", "sb", "ic", 
			"container", "bord_rad", "color", "colors", "decoration", "list", "object", 
			"varible", "gestureDetector", "ontap"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'initState'", "'title'", "'theme'", "'debugShowCheckedModeBanner'", 
			"'ThemeData'", "'primarySwatch'", "'>'", "'<'", "'+'", "'-'", "'*'", 
			"'%'", "'/'", "'<='", "'>='", "'++'", "'--'", "'$'", "'Scaffold'", "'?'", 
			"'State'", "'createState'", "'key'", "'StatefulWidget '", "'StatelessWidget'", 
			"'forEach'", "'for'", "'Text'", "'children'", "'['", "']'", "'Column'", 
			"'Row'", "'fit:'", "'BoxFit'", "'fill'", null, "'emit'", "'BlocProvider'", 
			"'BlocConsumer'", "'listener'", "'builder'", "'create'", "'state'", "'Navigator'", 
			"'push'", "'MaterialPageRoute'", "'onLongPress'", "'!'", "'toolbarHeight'", 
			"'flexibleSpace'", "'double'", "'infinity'", "'cover'", "'crossAxisAlignment'", 
			"'CrossAxisAlignment'", "'start'", "'Spacer'", "'fontSize'", "'fontWeight'", 
			"'FontWeight'", "'w600'", "'style'", "'TextStyle'", "'asset'", null, 
			"'appBar'", "'AppBar'", "'backgroundColor'", "'main'", "'body'", "'runApp'", 
			"'List'", "'build'", "'@override'", "'setState'", "'onTap'", "'GestureDetector'", 
			"'Widget'", "'BuildContext'", "'Padding'", "'padding:'", "'EdgeInsets.'", 
			"'all'", "'void'", null, "'height'", "'width'", null, "'SizedBox'", "'Container'", 
			"'child'", "'Colors'", null, "'color'", "':'", "'.'", "'BorderRadius'", 
			"'Expanded'", "'circular'", "'borderRadius'", "'decoration'", "'BoxDecoration'", 
			"'ListView'", "'separated'", "'itemBuilder'", "'separatorBuilder'", "'itemCount'", 
			"'=>'", "'mainAxisAlignment:'", "'MainAxisAlignment'", "'center'", "'context'", 
			"'index'", "'='", null, "';'", "','", "'('", "')'", null, null, "'final'", 
			"'const'", "'var'", "'async'", "'this'", "'abstract'", "'as'", "'sync'", 
			"'class'", "'with'", "'static'", "'dynamic'", "'external'", "'get'", 
			"'set'", "'operator'", "'super'", "'factory'", "'extends'", "'implements'", 
			"'enum'", "'null'", "'throw'", "'new'", "'await'", "'deferred'", "'export'", 
			"'import'", "'library'", "'part'", "'typedef'", "'is'", "'if'", "'else'", 
			"'while'", "'in'", "'do'", "'switch'", "'case'", "'default'", "'rethrow'", 
			"'try'", "'on'", "'catch'", "'finally'", "'return'", "'break'", "'continue'", 
			"'yield'", "'show'", "'hide'", "'of'", "'assert'", "'MaterialApp'", "'home'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INITSTATE", "TITLE", "THEME", "DEBUGSHOWMODE", "ThemeData", "PrimarySwatch", 
			"SMALLER", "BIGER", "PLUS", "MINUS", "STAR", "MOD", "DEVIDE", "SMALLER_OR_EQUAL", 
			"BIGER_OR_EQUAL", "PLUS_PLUS", "MINUS_MINUS", "SDOLLAR", "SCAFFOLD", 
			"Q_MARK", "STATE", "CREATSTATE", "KEY", "FULL", "LESS", "FOREACH", "FOR", 
			"TEXT", "CHIS", "OPEN_PR", "CLOSE_PR", "COLUMN", "ROW", "FIT", "BOXFIT", 
			"FILL", "WS", "EMIT", "BLOC_PROVIDER", "BLOC_CONSUMER", "LISTNER", "BUILDER", 
			"CREATE", "STATE1", "NAVIGATOR", "PUSH", "MATERIAL_PAGE_ROUTE", "ON_LONG_PRESS", 
			"EXCLAMATION", "TOOL_BAR_HEIGHT", "FLEXIBLE_SPACE", "DOUBLE", "INFINITY", 
			"COVER", "CROSS_AXIS_ALIGNMENT_1", "CROSS_AXIS_ALIGNMENT_2", "START", 
			"SPACER", "FONT_SIZE", "FONT_WEIGHT", "FONT_WEIGHT1", "W600", "STYLE", 
			"TEXT_STYLE", "ASSET", "IMAGE", "APPBAR2", "APPBAR", "BACK", "MAIN", 
			"BODY", "RUNAPP", "LIST", "BUILD", "OVERRIDE", "SETSTATE", "ONTAP", "GestureDetector", 
			"WIDGET", "BUILDCONTEXT", "PADDING", "PADDING1", "EDGE", "ALL", "VOID", 
			"TYPE", "HEIGHT", "WIDTH", "BOOL_VAL", "SIZEDBOX", "CONTAINER", "CHILD", 
			"COLORS", "COL", "COLOR", "D_DOT", "DOT", "BORDER2", "EXPANDED", "CIRCULAR", 
			"BORDERRADIUS", "DECORATION", "BD", "LISTVIEW", "SEPARATED", "ItemBuilder", 
			"SeparatorBuilder", "ItemCount", "Return", "MAINAXIS", "MAINAXIS1", "CENTER", 
			"CONTEXT", "INDEX", "EQUAL", "NUM_VAL", "SIMICOLON", "COLON", "OPEN_HEAD", 
			"CLOSE_HEAD", "OPEN_BODY", "CLOSE_BODY", "FINAL", "CONST", "VAR", "ASYNC", 
			"THIS", "ABSTRACT", "AS", "SYNC", "CLASS", "WITH", "STATIC", "DYNAMIC", 
			"EXTERNAL", "GET", "SET", "OPERATOR", "SUPER", "FACTORY", "EXTENDS", 
			"IMPLEMENTS", "ENUM", "NULL", "THROW", "NEW", "AWAIT", "DEFERRED", "EXPORT", 
			"IMPORT", "LIBRARY", "PART", "TYPEDEF", "IS", "IF", "ELSE", "WHILE", 
			"IN", "DO", "SWITCH", "CASE", "DEFAULT", "RETHROW", "TRY", "ON", "CATCH", 
			"FINALLY", "RETURN", "BREAK", "CONTINUE", "YIELD", "SHOW", "HIDE", "OF", 
			"ASSERT", "MATERIALAPP", "HOME", "STRING_VAL", "VAR_NAME", "CHAR_VAL", 
			"STRING_OPEN", "STRING_CLOSE", "PRACET", "CLOSE_PRACET"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dartParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(dartParser.EOF, 0); }
		public List<File_syntaxContext> file_syntax() {
			return getRuleContexts(File_syntaxContext.class);
		}
		public File_syntaxContext file_syntax(int i) {
			return getRuleContext(File_syntaxContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(170);
					file_syntax();
					}
					break;
				case 2:
					{
					setState(171);
					function();
					}
					break;
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Q_MARK || _la==EMIT || _la==VOID || _la==TYPE || _la==VAR_NAME );
			setState(176);
			match(EOF);
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
	public static class File_syntaxContext extends ParserRuleContext {
		public Declear_varContext declear_var() {
			return getRuleContext(Declear_varContext.class,0);
		}
		public File_syntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFile_syntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFile_syntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFile_syntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_syntaxContext file_syntax() throws RecognitionException {
		File_syntaxContext _localctx = new File_syntaxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file_syntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			declear_var();
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
	public static class String_valContext extends ParserRuleContext {
		public TerminalNode STRING_VAL() { return getToken(dartParser.STRING_VAL, 0); }
		public String_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterString_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitString_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitString_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_valContext string_val() throws RecognitionException {
		String_valContext _localctx = new String_valContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_string_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(STRING_VAL);
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
	public static class EmitContext extends ParserRuleContext {
		public TerminalNode EMIT() { return getToken(dartParser.EMIT, 0); }
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public EmitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterEmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitEmit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitEmit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitContext emit() throws RecognitionException {
		EmitContext _localctx = new EmitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_emit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(EMIT);
			setState(183);
			match(OPEN_HEAD);
			setState(184);
			match(VAR_NAME);
			setState(185);
			match(OPEN_HEAD);
			setState(186);
			match(CLOSE_HEAD);
			setState(187);
			match(CLOSE_HEAD);
			setState(188);
			match(SIMICOLON);
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
	public static class Declear_varContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public TerminalNode TYPE() { return getToken(dartParser.TYPE, 0); }
		public TerminalNode Q_MARK() { return getToken(dartParser.Q_MARK, 0); }
		public TerminalNode EQUAL() { return getToken(dartParser.EQUAL, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public List<Declear_varsContext> declear_vars() {
			return getRuleContexts(Declear_varsContext.class);
		}
		public Declear_varsContext declear_vars(int i) {
			return getRuleContext(Declear_varsContext.class,i);
		}
		public EmitContext emit() {
			return getRuleContext(EmitContext.class,0);
		}
		public Declear_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declear_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclear_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclear_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclear_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declear_varContext declear_var() throws RecognitionException {
		Declear_varContext _localctx = new Declear_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declear_var);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_MARK:
			case TYPE:
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(190);
					match(TYPE);
					}
				}

				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q_MARK) {
					{
					setState(193);
					match(Q_MARK);
					}
				}

				setState(196);
				match(VAR_NAME);
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(197);
					match(EQUAL);
					setState(198);
					val();
					}
				}

				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(201);
					match(COLON);
					setState(202);
					declear_vars();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(SIMICOLON);
				}
				}
				break;
			case EMIT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(209);
				emit();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declear_varsContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(dartParser.EQUAL, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Declear_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declear_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclear_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclear_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclear_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declear_varsContext declear_vars() throws RecognitionException {
		Declear_varsContext _localctx = new Declear_varsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declear_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(VAR_NAME);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(213);
				match(EQUAL);
				setState(214);
				val();
				}
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
	public static class Object_valueContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(dartParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(dartParser.DOT, i);
		}
		public TerminalNode GET() { return getToken(dartParser.GET, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public List<TerminalNode> OPEN_PR() { return getTokens(dartParser.OPEN_PR); }
		public TerminalNode OPEN_PR(int i) {
			return getToken(dartParser.OPEN_PR, i);
		}
		public TerminalNode INDEX() { return getToken(dartParser.INDEX, 0); }
		public List<TerminalNode> CLOSE_PR() { return getTokens(dartParser.CLOSE_PR); }
		public TerminalNode CLOSE_PR(int i) {
			return getToken(dartParser.CLOSE_PR, i);
		}
		public String_valContext string_val() {
			return getRuleContext(String_valContext.class,0);
		}
		public Object_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterObject_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitObject_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitObject_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_valueContext object_value() throws RecognitionException {
		Object_valueContext _localctx = new Object_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_object_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(VAR_NAME);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(218);
				match(DOT);
				setState(219);
				match(GET);
				setState(220);
				match(OPEN_HEAD);
				setState(221);
				match(CONTEXT);
				setState(222);
				match(CLOSE_HEAD);
				setState(223);
				match(DOT);
				setState(224);
				match(VAR_NAME);
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PR) {
				{
				setState(227);
				match(OPEN_PR);
				setState(228);
				match(INDEX);
				setState(229);
				match(CLOSE_PR);
				setState(230);
				match(OPEN_PR);
				setState(231);
				string_val();
				setState(232);
				match(CLOSE_PR);
				}
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
	public static class ValContext extends ParserRuleContext {
		public String_valContext string_val() {
			return getRuleContext(String_valContext.class,0);
		}
		public TerminalNode NUM_VAL() { return getToken(dartParser.NUM_VAL, 0); }
		public TerminalNode BOOL_VAL() { return getToken(dartParser.BOOL_VAL, 0); }
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public Object_valueContext object_value() {
			return getRuleContext(Object_valueContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_val);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				string_val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(NUM_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(BOOL_VAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(VAR_NAME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				object_value();
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
	public static class IfdartContext extends ParserRuleContext {
		public List<TerminalNode> EQUAL() { return getTokens(dartParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(dartParser.EQUAL, i);
		}
		public String_valContext string_val() {
			return getRuleContext(String_valContext.class,0);
		}
		public TerminalNode Q_MARK() { return getToken(dartParser.Q_MARK, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(dartParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(dartParser.DOT, i);
		}
		public TerminalNode GET() { return getToken(dartParser.GET, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public IfdartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterIfdart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitIfdart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitIfdart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdartContext ifdart() throws RecognitionException {
		IfdartContext _localctx = new IfdartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifdart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(243);
				match(VAR_NAME);
				setState(244);
				match(DOT);
				setState(245);
				match(GET);
				setState(246);
				match(OPEN_HEAD);
				setState(247);
				match(CONTEXT);
				setState(248);
				match(CLOSE_HEAD);
				setState(249);
				match(DOT);
				setState(250);
				match(VAR_NAME);
				}
				break;
			case 2:
				{
				setState(251);
				match(VAR_NAME);
				}
				break;
			}
			setState(254);
			match(EQUAL);
			setState(255);
			match(EQUAL);
			setState(256);
			string_val();
			setState(257);
			match(Q_MARK);
			setState(258);
			widget();
			setState(259);
			match(D_DOT);
			setState(260);
			widget();
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
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode TYPE() { return getToken(dartParser.TYPE, 0); }
		public List<Arguments1Context> arguments1() {
			return getRuleContexts(Arguments1Context.class);
		}
		public Arguments1Context arguments1(int i) {
			return getRuleContext(Arguments1Context.class,i);
		}
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode INDEX() { return getToken(dartParser.INDEX, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(OPEN_HEAD);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(263);
				match(TYPE);
				}
			}

			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX || _la==VAR_NAME) {
				{
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==VAR_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(269);
				arguments1();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(CLOSE_HEAD);
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
	public static class Arguments1Context extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(dartParser.TYPE, 0); }
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public Arguments1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterArguments1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitArguments1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitArguments1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments1Context arguments1() throws RecognitionException {
		Arguments1Context _localctx = new Arguments1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_arguments1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(COLON);
			setState(278);
			match(TYPE);
			setState(279);
			match(VAR_NAME);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public List<Declear_varContext> declear_var() {
			return getRuleContexts(Declear_varContext.class);
		}
		public Declear_varContext declear_var(int i) {
			return getRuleContext(Declear_varContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(OPEN_BODY);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Q_MARK || _la==EMIT || _la==TYPE || _la==VAR_NAME) {
				{
				{
				setState(282);
				declear_var();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(CLOSE_BODY);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(dartParser.TYPE, 0); }
		public TerminalNode VOID() { return getToken(dartParser.VOID, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(291);
			match(VAR_NAME);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_HEAD) {
				{
				{
				setState(292);
				arguments();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			block();
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
	public static class Object_cubitContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(dartParser.STATIC, 0); }
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode GET() { return getToken(dartParser.GET, 0); }
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public List<TerminalNode> CONTEXT() { return getTokens(dartParser.CONTEXT); }
		public TerminalNode CONTEXT(int i) {
			return getToken(dartParser.CONTEXT, i);
		}
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public TerminalNode Return() { return getToken(dartParser.Return, 0); }
		public TerminalNode BLOC_PROVIDER() { return getToken(dartParser.BLOC_PROVIDER, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode OF() { return getToken(dartParser.OF, 0); }
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public Object_cubitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_cubit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterObject_cubit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitObject_cubit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitObject_cubit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_cubitContext object_cubit() throws RecognitionException {
		Object_cubitContext _localctx = new Object_cubitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_object_cubit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(STATIC);
			setState(301);
			match(VAR_NAME);
			setState(302);
			match(GET);
			setState(303);
			match(OPEN_HEAD);
			setState(304);
			match(CONTEXT);
			setState(305);
			match(CLOSE_HEAD);
			setState(306);
			match(Return);
			setState(307);
			match(BLOC_PROVIDER);
			setState(308);
			match(DOT);
			setState(309);
			match(OF);
			setState(310);
			match(OPEN_HEAD);
			setState(311);
			match(CONTEXT);
			setState(312);
			match(CLOSE_HEAD);
			setState(313);
			match(SIMICOLON);
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
	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dartParser.CLASS, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public TerminalNode EXTENDS() { return getToken(dartParser.EXTENDS, 0); }
		public TerminalNode BIGER() { return getToken(dartParser.BIGER, 0); }
		public TerminalNode SMALLER() { return getToken(dartParser.SMALLER, 0); }
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(CLASS);
			setState(316);
			match(VAR_NAME);
			setState(317);
			match(EXTENDS);
			setState(318);
			match(VAR_NAME);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIGER) {
				{
				setState(319);
				match(BIGER);
				setState(320);
				match(VAR_NAME);
				setState(321);
				match(SMALLER);
				}
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
	public static class ConstructorContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode SUPER() { return getToken(dartParser.SUPER, 0); }
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode THIS() { return getToken(dartParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode EQUAL() { return getToken(dartParser.EQUAL, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public Constructor1Context constructor1() {
			return getRuleContext(Constructor1Context.class,0);
		}
		public List<Constructor2Context> constructor2() {
			return getRuleContexts(Constructor2Context.class);
		}
		public Constructor2Context constructor2(int i) {
			return getRuleContext(Constructor2Context.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constructor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(VAR_NAME);
			setState(325);
			match(OPEN_HEAD);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BODY) {
				{
				setState(326);
				constructor1();
				}
			}

			setState(329);
			match(CLOSE_HEAD);
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_DOT:
				{
				setState(330);
				match(D_DOT);
				setState(331);
				match(SUPER);
				setState(332);
				match(OPEN_HEAD);
				setState(333);
				match(VAR_NAME);
				setState(334);
				match(OPEN_HEAD);
				setState(335);
				match(CLOSE_HEAD);
				setState(336);
				match(CLOSE_HEAD);
				setState(337);
				match(SIMICOLON);
				}
				break;
			case OPEN_BODY:
				{
				setState(338);
				match(OPEN_BODY);
				setState(339);
				match(THIS);
				setState(340);
				match(DOT);
				setState(341);
				match(VAR_NAME);
				setState(342);
				match(EQUAL);
				setState(343);
				match(VAR_NAME);
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(344);
						constructor2();
						}
						} 
					}
					setState(349);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(350);
				match(SIMICOLON);
				setState(351);
				match(CLOSE_BODY);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Constructor1Context extends ParserRuleContext {
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public Constructor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstructor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstructor1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstructor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor1Context constructor1() throws RecognitionException {
		Constructor1Context _localctx = new Constructor1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(OPEN_BODY);
			setState(355);
			match(VAR_NAME);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(356);
				match(COLON);
				setState(357);
				match(VAR_NAME);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(CLOSE_BODY);
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
	public static class Constructor2Context extends ParserRuleContext {
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public TerminalNode THIS() { return getToken(dartParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public TerminalNode EQUAL() { return getToken(dartParser.EQUAL, 0); }
		public Constructor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstructor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstructor2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstructor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor2Context constructor2() throws RecognitionException {
		Constructor2Context _localctx = new Constructor2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_constructor2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(SIMICOLON);
			setState(366);
			match(THIS);
			setState(367);
			match(DOT);
			setState(368);
			match(VAR_NAME);
			setState(369);
			match(EQUAL);
			setState(370);
			match(VAR_NAME);
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
	public static class Class1Context extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(dartParser.ABSTRACT, 0); }
		public TerminalNode CLASS() { return getToken(dartParser.CLASS, 0); }
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public Class1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class1Context class1() throws RecognitionException {
		Class1Context _localctx = new Class1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_class1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(ABSTRACT);
			setState(373);
			match(CLASS);
			setState(374);
			match(VAR_NAME);
			setState(375);
			match(OPEN_BODY);
			setState(376);
			match(CLOSE_BODY);
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
	public static class Class2Context extends ParserRuleContext {
		public List<ImporTContext> imporT() {
			return getRuleContexts(ImporTContext.class);
		}
		public ImporTContext imporT(int i) {
			return getRuleContext(ImporTContext.class,i);
		}
		public Class1Context class1() {
			return getRuleContext(Class1Context.class,0);
		}
		public List<Class3Context> class3() {
			return getRuleContexts(Class3Context.class);
		}
		public Class3Context class3(int i) {
			return getRuleContext(Class3Context.class,i);
		}
		public Class2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class2Context class2() throws RecognitionException {
		Class2Context _localctx = new Class2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_class2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(378);
				imporT();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(384);
				class1();
				}
			}

			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(387);
				class3();
				}
				}
				setState(392);
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
	public static class Class3Context extends ParserRuleContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public Object_cubitContext object_cubit() {
			return getRuleContext(Object_cubitContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<Class4Context> class4() {
			return getRuleContexts(Class4Context.class);
		}
		public Class4Context class4(int i) {
			return getRuleContext(Class4Context.class,i);
		}
		public Class3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class3Context class3() throws RecognitionException {
		Class3Context _localctx = new Class3Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_class3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			class_definition();
			setState(394);
			match(OPEN_BODY);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC || _la==VAR_NAME) {
				{
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR_NAME) {
					{
					setState(395);
					constructor();
					}
				}

				setState(398);
				object_cubit();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Q_MARK || _la==EMIT || (((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 12289L) != 0 || _la==VAR_NAME) {
					{
					{
					setState(399);
					class4();
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(407);
			match(CLOSE_BODY);
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
	public static class Class4Context extends ParserRuleContext {
		public Declear_varContext declear_var() {
			return getRuleContext(Declear_varContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Class4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class4Context class4() throws RecognitionException {
		Class4Context _localctx = new Class4Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_class4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(409);
				declear_var();
				}
				break;
			case 2:
				{
				setState(410);
				function();
				}
				break;
			case 3:
				{
				setState(411);
				list();
				}
				break;
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
	public static class Bloc_providerContext extends ParserRuleContext {
		public TerminalNode BLOC_PROVIDER() { return getToken(dartParser.BLOC_PROVIDER, 0); }
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public TerminalNode CREATE() { return getToken(dartParser.CREATE, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public TerminalNode Return() { return getToken(dartParser.Return, 0); }
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public Bloc_providerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc_provider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBloc_provider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBloc_provider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBloc_provider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloc_providerContext bloc_provider() throws RecognitionException {
		Bloc_providerContext _localctx = new Bloc_providerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bloc_provider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(BLOC_PROVIDER);
			setState(415);
			match(OPEN_HEAD);
			setState(416);
			match(CREATE);
			setState(417);
			match(D_DOT);
			setState(418);
			match(OPEN_HEAD);
			setState(419);
			match(CONTEXT);
			setState(420);
			match(CLOSE_HEAD);
			setState(421);
			match(Return);
			setState(422);
			match(VAR_NAME);
			setState(423);
			match(OPEN_HEAD);
			setState(424);
			match(CLOSE_HEAD);
			setState(425);
			match(COLON);
			setState(426);
			child();
			setState(427);
			match(CLOSE_HEAD);
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
	public static class Bloc_consumerContext extends ParserRuleContext {
		public TerminalNode BLOC_CONSUMER() { return getToken(dartParser.BLOC_CONSUMER, 0); }
		public TerminalNode BIGER() { return getToken(dartParser.BIGER, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public TerminalNode SMALLER() { return getToken(dartParser.SMALLER, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public ListnerContext listner() {
			return getRuleContext(ListnerContext.class,0);
		}
		public BuilderContext builder() {
			return getRuleContext(BuilderContext.class,0);
		}
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public Bloc_consumerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc_consumer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBloc_consumer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBloc_consumer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBloc_consumer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloc_consumerContext bloc_consumer() throws RecognitionException {
		Bloc_consumerContext _localctx = new Bloc_consumerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bloc_consumer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(BLOC_CONSUMER);
			setState(430);
			match(BIGER);
			setState(431);
			match(VAR_NAME);
			setState(432);
			match(COLON);
			setState(433);
			match(VAR_NAME);
			setState(434);
			match(SMALLER);
			setState(435);
			match(OPEN_HEAD);
			setState(436);
			listner();
			setState(437);
			match(COLON);
			setState(438);
			builder();
			setState(439);
			match(CLOSE_HEAD);
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
	public static class ListnerContext extends ParserRuleContext {
		public TerminalNode LISTNER() { return getToken(dartParser.LISTNER, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public TerminalNode STATE1() { return getToken(dartParser.STATE1, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public ListnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterListner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitListner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitListner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListnerContext listner() throws RecognitionException {
		ListnerContext _localctx = new ListnerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(LISTNER);
			setState(442);
			match(D_DOT);
			setState(443);
			match(OPEN_HEAD);
			setState(444);
			match(CONTEXT);
			setState(445);
			match(COLON);
			setState(446);
			match(STATE1);
			setState(447);
			match(CLOSE_HEAD);
			setState(448);
			match(OPEN_BODY);
			setState(449);
			match(CLOSE_BODY);
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
	public static class BuilderContext extends ParserRuleContext {
		public TerminalNode BUILDER() { return getToken(dartParser.BUILDER, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public TerminalNode STATE1() { return getToken(dartParser.STATE1, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode RETURN() { return getToken(dartParser.RETURN, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public BuilderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBuilder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBuilder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBuilder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuilderContext builder() throws RecognitionException {
		BuilderContext _localctx = new BuilderContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_builder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(BUILDER);
			setState(452);
			match(D_DOT);
			setState(453);
			match(OPEN_HEAD);
			setState(454);
			match(CONTEXT);
			setState(455);
			match(COLON);
			setState(456);
			match(STATE1);
			setState(457);
			match(CLOSE_HEAD);
			setState(458);
			match(OPEN_BODY);
			setState(459);
			match(RETURN);
			setState(460);
			widget();
			setState(461);
			match(SIMICOLON);
			setState(462);
			match(CLOSE_BODY);
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
	public static class Material_page_routeContext extends ParserRuleContext {
		public TerminalNode MATERIAL_PAGE_ROUTE() { return getToken(dartParser.MATERIAL_PAGE_ROUTE, 0); }
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public TerminalNode BUILDER() { return getToken(dartParser.BUILDER, 0); }
		public List<TerminalNode> D_DOT() { return getTokens(dartParser.D_DOT); }
		public TerminalNode D_DOT(int i) {
			return getToken(dartParser.D_DOT, i);
		}
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public TerminalNode Return() { return getToken(dartParser.Return, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public Material_page_routeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_material_page_route; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterMaterial_page_route(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitMaterial_page_route(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitMaterial_page_route(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Material_page_routeContext material_page_route() throws RecognitionException {
		Material_page_routeContext _localctx = new Material_page_routeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_material_page_route);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(MATERIAL_PAGE_ROUTE);
			setState(465);
			match(OPEN_HEAD);
			setState(466);
			match(BUILDER);
			setState(467);
			match(D_DOT);
			setState(468);
			match(OPEN_HEAD);
			setState(469);
			match(CONTEXT);
			setState(470);
			match(CLOSE_HEAD);
			setState(471);
			match(Return);
			setState(472);
			match(VAR_NAME);
			setState(473);
			match(OPEN_HEAD);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_NAME) {
				{
				setState(474);
				match(VAR_NAME);
				setState(475);
				match(D_DOT);
				setState(476);
				match(VAR_NAME);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(477);
					match(COLON);
					setState(478);
					match(VAR_NAME);
					setState(479);
					match(D_DOT);
					setState(480);
					match(VAR_NAME);
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(488);
			match(CLOSE_HEAD);
			setState(489);
			match(CLOSE_HEAD);
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
	public static class NavigatorContext extends ParserRuleContext {
		public TerminalNode NAVIGATOR() { return getToken(dartParser.NAVIGATOR, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode PUSH() { return getToken(dartParser.PUSH, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public Material_page_routeContext material_page_route() {
			return getRuleContext(Material_page_routeContext.class,0);
		}
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public NavigatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterNavigator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitNavigator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitNavigator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigatorContext navigator() throws RecognitionException {
		NavigatorContext _localctx = new NavigatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_navigator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(NAVIGATOR);
			setState(492);
			match(DOT);
			setState(493);
			match(PUSH);
			setState(494);
			match(OPEN_HEAD);
			setState(495);
			match(CONTEXT);
			setState(496);
			match(COLON);
			setState(497);
			material_page_route();
			setState(498);
			match(CLOSE_HEAD);
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
	public static class On_long_pressContext extends ParserRuleContext {
		public TerminalNode ON_LONG_PRESS() { return getToken(dartParser.ON_LONG_PRESS, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public List<Declear_varContext> declear_var() {
			return getRuleContexts(Declear_varContext.class);
		}
		public Declear_varContext declear_var(int i) {
			return getRuleContext(Declear_varContext.class,i);
		}
		public NavigatorContext navigator() {
			return getRuleContext(NavigatorContext.class,0);
		}
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public On_long_pressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_long_press; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOn_long_press(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOn_long_press(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOn_long_press(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_long_pressContext on_long_press() throws RecognitionException {
		On_long_pressContext _localctx = new On_long_pressContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_on_long_press);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(ON_LONG_PRESS);
			setState(501);
			match(D_DOT);
			setState(502);
			match(OPEN_HEAD);
			setState(503);
			match(CLOSE_HEAD);
			setState(504);
			match(OPEN_BODY);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Q_MARK || _la==EMIT || _la==TYPE || _la==VAR_NAME) {
				{
				{
				setState(505);
				declear_var();
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAVIGATOR) {
				{
				setState(511);
				navigator();
				setState(512);
				match(SIMICOLON);
				}
			}

			setState(516);
			match(CLOSE_BODY);
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
	public static class Tool_bar_heightContext extends ParserRuleContext {
		public TerminalNode TOOL_BAR_HEIGHT() { return getToken(dartParser.TOOL_BAR_HEIGHT, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode NUM_VAL() { return getToken(dartParser.NUM_VAL, 0); }
		public Tool_bar_heightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tool_bar_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterTool_bar_height(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitTool_bar_height(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitTool_bar_height(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tool_bar_heightContext tool_bar_height() throws RecognitionException {
		Tool_bar_heightContext _localctx = new Tool_bar_heightContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tool_bar_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(TOOL_BAR_HEIGHT);
			setState(519);
			match(D_DOT);
			setState(520);
			match(NUM_VAL);
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
	public static class Flexible_spaceContext extends ParserRuleContext {
		public TerminalNode FLEXIBLE_SPACE() { return getToken(dartParser.FLEXIBLE_SPACE, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public Flexible_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flexible_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFlexible_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFlexible_space(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFlexible_space(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flexible_spaceContext flexible_space() throws RecognitionException {
		Flexible_spaceContext _localctx = new Flexible_spaceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_flexible_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(FLEXIBLE_SPACE);
			setState(523);
			match(D_DOT);
			setState(524);
			widget();
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
	public static class SpacerContext extends ParserRuleContext {
		public TerminalNode SPACER() { return getToken(dartParser.SPACER, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public SpacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterSpacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitSpacer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitSpacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpacerContext spacer() throws RecognitionException {
		SpacerContext _localctx = new SpacerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_spacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(SPACER);
			setState(527);
			match(OPEN_HEAD);
			setState(528);
			match(CLOSE_HEAD);
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(dartParser.FOR, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode TYPE() { return getToken(dartParser.TYPE, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public TerminalNode EQUAL() { return getToken(dartParser.EQUAL, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> SIMICOLON() { return getTokens(dartParser.SIMICOLON); }
		public TerminalNode SIMICOLON(int i) {
			return getToken(dartParser.SIMICOLON, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public Declear_varContext declear_var() {
			return getRuleContext(Declear_varContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(FOR);
			setState(531);
			match(OPEN_HEAD);
			setState(532);
			match(TYPE);
			setState(533);
			match(VAR_NAME);
			setState(534);
			match(EQUAL);
			setState(535);
			val();
			setState(536);
			match(SIMICOLON);
			setState(537);
			match(VAR_NAME);
			setState(538);
			operation();
			setState(539);
			val();
			setState(540);
			match(SIMICOLON);
			setState(541);
			match(VAR_NAME);
			setState(542);
			operation();
			setState(543);
			match(CLOSE_HEAD);
			setState(544);
			match(OPEN_BODY);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Q_MARK || _la==EMIT || _la==TYPE || _la==VAR_NAME) {
				{
				setState(545);
				declear_var();
				}
			}

			setState(548);
			match(CLOSE_BODY);
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
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode BIGER() { return getToken(dartParser.BIGER, 0); }
		public TerminalNode SMALLER() { return getToken(dartParser.SMALLER, 0); }
		public TerminalNode PLUS() { return getToken(dartParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(dartParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(dartParser.STAR, 0); }
		public TerminalNode MOD() { return getToken(dartParser.MOD, 0); }
		public TerminalNode DEVIDE() { return getToken(dartParser.DEVIDE, 0); }
		public TerminalNode SMALLER_OR_EQUAL() { return getToken(dartParser.SMALLER_OR_EQUAL, 0); }
		public TerminalNode BIGER_OR_EQUAL() { return getToken(dartParser.BIGER_OR_EQUAL, 0); }
		public TerminalNode PLUS_PLUS() { return getToken(dartParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(dartParser.MINUS_MINUS, 0); }
		public TerminalNode SDOLLAR() { return getToken(dartParser.SDOLLAR, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 524160L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlutterContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ImporTContext> imporT() {
			return getRuleContexts(ImporTContext.class);
		}
		public ImporTContext imporT(int i) {
			return getRuleContext(ImporTContext.class,i);
		}
		public List<ClasssContext> classs() {
			return getRuleContexts(ClasssContext.class);
		}
		public ClasssContext classs(int i) {
			return getRuleContext(ClasssContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public FlutterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flutter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFlutter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFlutter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFlutter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlutterContext flutter() throws RecognitionException {
		FlutterContext _localctx = new FlutterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_flutter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(552);
				imporT();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			main();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==IMPORT) {
				{
				{
				setState(559);
				classs();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LIST) {
				{
				{
				setState(565);
				list();
				}
				}
				setState(570);
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
	public static class ImporTContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(dartParser.IMPORT, 0); }
		public String_valContext string_val() {
			return getRuleContext(String_valContext.class,0);
		}
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public ImporTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imporT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterImporT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitImporT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitImporT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImporTContext imporT() throws RecognitionException {
		ImporTContext _localctx = new ImporTContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_imporT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(IMPORT);
			setState(572);
			string_val();
			setState(573);
			match(SIMICOLON);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(dartParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(dartParser.MAIN, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public RunappContext runapp() {
			return getRuleContext(RunappContext.class,0);
		}
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(VOID);
			setState(576);
			match(MAIN);
			setState(577);
			match(OPEN_HEAD);
			setState(578);
			match(CLOSE_HEAD);
			setState(579);
			match(OPEN_BODY);
			setState(580);
			runapp();
			setState(581);
			match(CLOSE_BODY);
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
	public static class RunappContext extends ParserRuleContext {
		public TerminalNode RUNAPP() { return getToken(dartParser.RUNAPP, 0); }
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public RunappContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runapp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterRunapp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitRunapp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitRunapp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunappContext runapp() throws RecognitionException {
		RunappContext _localctx = new RunappContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_runapp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(RUNAPP);
			setState(584);
			match(OPEN_HEAD);
			setState(585);
			match(VAR_NAME);
			setState(586);
			match(OPEN_HEAD);
			setState(587);
			match(CLOSE_HEAD);
			setState(588);
			match(CLOSE_HEAD);
			setState(589);
			match(SIMICOLON);
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
	public static class ClasssContext extends ParserRuleContext {
		public Class_lessContext class_less() {
			return getRuleContext(Class_lessContext.class,0);
		}
		public Class_fullContext class_full() {
			return getRuleContext(Class_fullContext.class,0);
		}
		public List<ImporTContext> imporT() {
			return getRuleContexts(ImporTContext.class);
		}
		public ImporTContext imporT(int i) {
			return getRuleContext(ImporTContext.class,i);
		}
		public ClasssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClasss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClasss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClasss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasssContext classs() throws RecognitionException {
		ClasssContext _localctx = new ClasssContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(591);
				imporT();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(597);
				class_less();
				}
				break;
			case 2:
				{
				setState(598);
				class_full();
				}
				break;
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
	public static class Class_lessContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dartParser.CLASS, 0); }
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode EXTENDS() { return getToken(dartParser.EXTENDS, 0); }
		public TerminalNode LESS() { return getToken(dartParser.LESS, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode OVERRIDE() { return getToken(dartParser.OVERRIDE, 0); }
		public BuildContext build() {
			return getRuleContext(BuildContext.class,0);
		}
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public List<Class4Context> class4() {
			return getRuleContexts(Class4Context.class);
		}
		public Class4Context class4(int i) {
			return getRuleContext(Class4Context.class,i);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Class_lessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass_less(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass_less(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass_less(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_lessContext class_less() throws RecognitionException {
		Class_lessContext _localctx = new Class_lessContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_class_less);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(CLASS);
			setState(602);
			match(VAR_NAME);
			setState(603);
			match(EXTENDS);
			setState(604);
			match(LESS);
			setState(605);
			match(OPEN_BODY);
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(606);
					class4();
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_NAME) {
				{
				setState(612);
				constructor();
				}
			}

			setState(615);
			match(OVERRIDE);
			setState(616);
			build();
			setState(617);
			match(CLOSE_BODY);
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
	public static class Class_fullContext extends ParserRuleContext {
		public Class_full1Context class_full1() {
			return getRuleContext(Class_full1Context.class,0);
		}
		public Class_full2Context class_full2() {
			return getRuleContext(Class_full2Context.class,0);
		}
		public Class_fullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_full; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass_full(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass_full(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass_full(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_fullContext class_full() throws RecognitionException {
		Class_fullContext _localctx = new Class_fullContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_class_full);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			class_full1();
			setState(620);
			class_full2();
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
	public static class Class_full1Context extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dartParser.CLASS, 0); }
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode EXTENDS() { return getToken(dartParser.EXTENDS, 0); }
		public TerminalNode FULL() { return getToken(dartParser.FULL, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode OVERRIDE() { return getToken(dartParser.OVERRIDE, 0); }
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public Class_full1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_full1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass_full1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass_full1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass_full1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_full1Context class_full1() throws RecognitionException {
		Class_full1Context _localctx = new Class_full1Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_class_full1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(CLASS);
			setState(623);
			match(VAR_NAME);
			setState(624);
			match(EXTENDS);
			setState(625);
			match(FULL);
			setState(626);
			match(OPEN_BODY);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(627);
				const_();
				}
			}

			setState(630);
			match(OVERRIDE);
			setState(631);
			state();
			setState(632);
			match(CLOSE_BODY);
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
	public static class ConstContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(dartParser.CONST, 0); }
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public List<TerminalNode> KEY() { return getTokens(dartParser.KEY); }
		public TerminalNode KEY(int i) {
			return getToken(dartParser.KEY, i);
		}
		public TerminalNode Q_MARK() { return getToken(dartParser.Q_MARK, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public List<TerminalNode> D_DOT() { return getTokens(dartParser.D_DOT); }
		public TerminalNode D_DOT(int i) {
			return getToken(dartParser.D_DOT, i);
		}
		public TerminalNode SUPER() { return getToken(dartParser.SUPER, 0); }
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(CONST);
			setState(635);
			match(VAR_NAME);
			setState(636);
			match(OPEN_HEAD);
			setState(637);
			match(OPEN_BODY);
			setState(638);
			match(KEY);
			setState(639);
			match(Q_MARK);
			setState(640);
			match(KEY);
			setState(641);
			match(CLOSE_BODY);
			setState(642);
			match(CLOSE_HEAD);
			setState(643);
			match(D_DOT);
			setState(644);
			match(SUPER);
			setState(645);
			match(OPEN_HEAD);
			setState(646);
			match(KEY);
			setState(647);
			match(D_DOT);
			setState(648);
			match(KEY);
			setState(649);
			match(CLOSE_HEAD);
			setState(650);
			match(SIMICOLON);
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
	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(dartParser.STATE, 0); }
		public TerminalNode BIGER() { return getToken(dartParser.BIGER, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public TerminalNode SMALLER() { return getToken(dartParser.SMALLER, 0); }
		public TerminalNode CREATSTATE() { return getToken(dartParser.CREATSTATE, 0); }
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public TerminalNode Return() { return getToken(dartParser.Return, 0); }
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(STATE);
			setState(653);
			match(BIGER);
			setState(654);
			match(VAR_NAME);
			setState(655);
			match(SMALLER);
			setState(656);
			match(CREATSTATE);
			setState(657);
			match(OPEN_HEAD);
			setState(658);
			match(CLOSE_HEAD);
			setState(659);
			match(Return);
			setState(660);
			match(VAR_NAME);
			setState(661);
			match(OPEN_HEAD);
			setState(662);
			match(CLOSE_HEAD);
			setState(663);
			match(SIMICOLON);
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
	public static class Class_full2Context extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dartParser.CLASS, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public TerminalNode EXTENDS() { return getToken(dartParser.EXTENDS, 0); }
		public TerminalNode STATE() { return getToken(dartParser.STATE, 0); }
		public TerminalNode BIGER() { return getToken(dartParser.BIGER, 0); }
		public TerminalNode SMALLER() { return getToken(dartParser.SMALLER, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public List<TerminalNode> OVERRIDE() { return getTokens(dartParser.OVERRIDE); }
		public TerminalNode OVERRIDE(int i) {
			return getToken(dartParser.OVERRIDE, i);
		}
		public InitstateContext initstate() {
			return getRuleContext(InitstateContext.class,0);
		}
		public BuildContext build() {
			return getRuleContext(BuildContext.class,0);
		}
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public List<Declear_varContext> declear_var() {
			return getRuleContexts(Declear_varContext.class);
		}
		public Declear_varContext declear_var(int i) {
			return getRuleContext(Declear_varContext.class,i);
		}
		public Class_full2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_full2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass_full2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass_full2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass_full2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_full2Context class_full2() throws RecognitionException {
		Class_full2Context _localctx = new Class_full2Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_class_full2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(CLASS);
			setState(666);
			match(VAR_NAME);
			setState(667);
			match(EXTENDS);
			setState(668);
			match(STATE);
			setState(669);
			match(BIGER);
			setState(670);
			match(VAR_NAME);
			setState(671);
			match(SMALLER);
			setState(672);
			match(OPEN_BODY);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Q_MARK || _la==EMIT || _la==TYPE || _la==VAR_NAME) {
				{
				{
				setState(673);
				declear_var();
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			match(OVERRIDE);
			setState(680);
			initstate();
			setState(681);
			match(OVERRIDE);
			setState(682);
			build();
			setState(683);
			match(CLOSE_BODY);
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
	public static class InitstateContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(dartParser.VOID, 0); }
		public List<TerminalNode> INITSTATE() { return getTokens(dartParser.INITSTATE); }
		public TerminalNode INITSTATE(int i) {
			return getToken(dartParser.INITSTATE, i);
		}
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode SUPER() { return getToken(dartParser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public InitstateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initstate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterInitstate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitInitstate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitInitstate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitstateContext initstate() throws RecognitionException {
		InitstateContext _localctx = new InitstateContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_initstate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(VOID);
			setState(686);
			match(INITSTATE);
			setState(687);
			match(OPEN_HEAD);
			setState(688);
			match(CLOSE_HEAD);
			setState(689);
			match(OPEN_BODY);
			setState(690);
			match(SUPER);
			setState(691);
			match(DOT);
			setState(692);
			match(INITSTATE);
			setState(693);
			match(OPEN_HEAD);
			setState(694);
			match(CLOSE_HEAD);
			setState(695);
			match(SIMICOLON);
			setState(696);
			match(CLOSE_BODY);
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
	public static class BuildContext extends ParserRuleContext {
		public TerminalNode WIDGET() { return getToken(dartParser.WIDGET, 0); }
		public TerminalNode BUILD() { return getToken(dartParser.BUILD, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode BUILDCONTEXT() { return getToken(dartParser.BUILDCONTEXT, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public TerminalNode RETURN() { return getToken(dartParser.RETURN, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public BuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBuild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBuild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBuild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildContext build() throws RecognitionException {
		BuildContext _localctx = new BuildContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_build);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(WIDGET);
			setState(699);
			match(BUILD);
			setState(700);
			match(OPEN_HEAD);
			setState(701);
			match(BUILDCONTEXT);
			setState(702);
			match(CONTEXT);
			setState(703);
			match(CLOSE_HEAD);
			setState(704);
			match(OPEN_BODY);
			setState(705);
			match(RETURN);
			setState(706);
			widget();
			setState(707);
			match(SIMICOLON);
			setState(708);
			match(CLOSE_BODY);
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
	public static class WidgetContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public MaterialappContext materialapp() {
			return getRuleContext(MaterialappContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public ListviewContext listview() {
			return getRuleContext(ListviewContext.class,0);
		}
		public ExpandedContext expanded() {
			return getRuleContext(ExpandedContext.class,0);
		}
		public GestureDetectorContext gestureDetector() {
			return getRuleContext(GestureDetectorContext.class,0);
		}
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public SizedboxContext sizedbox() {
			return getRuleContext(SizedboxContext.class,0);
		}
		public Bloc_consumerContext bloc_consumer() {
			return getRuleContext(Bloc_consumerContext.class,0);
		}
		public Bloc_providerContext bloc_provider() {
			return getRuleContext(Bloc_providerContext.class,0);
		}
		public Material_page_routeContext material_page_route() {
			return getRuleContext(Material_page_routeContext.class,0);
		}
		public SpacerContext spacer() {
			return getRuleContext(SpacerContext.class,0);
		}
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_widget);
		try {
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				text();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				image();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				column();
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
				row();
				}
				break;
			case SCAFFOLD:
				enterOuterAlt(_localctx, 5);
				{
				setState(714);
				scaffold();
				}
				break;
			case MATERIALAPP:
				enterOuterAlt(_localctx, 6);
				{
				setState(715);
				materialapp();
				}
				break;
			case CONTAINER:
				enterOuterAlt(_localctx, 7);
				{
				setState(716);
				container();
				}
				break;
			case LISTVIEW:
				enterOuterAlt(_localctx, 8);
				{
				setState(717);
				listview();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 9);
				{
				setState(718);
				expanded();
				}
				break;
			case GestureDetector:
				enterOuterAlt(_localctx, 10);
				{
				setState(719);
				gestureDetector();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 11);
				{
				setState(720);
				padding();
				}
				break;
			case SIZEDBOX:
				enterOuterAlt(_localctx, 12);
				{
				setState(721);
				sizedbox();
				}
				break;
			case BLOC_CONSUMER:
				enterOuterAlt(_localctx, 13);
				{
				setState(722);
				bloc_consumer();
				}
				break;
			case BLOC_PROVIDER:
				enterOuterAlt(_localctx, 14);
				{
				setState(723);
				bloc_provider();
				}
				break;
			case MATERIAL_PAGE_ROUTE:
				enterOuterAlt(_localctx, 15);
				{
				setState(724);
				material_page_route();
				}
				break;
			case SPACER:
				enterOuterAlt(_localctx, 16);
				{
				setState(725);
				spacer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChildContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(dartParser.CHILD, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(CHILD);
			setState(729);
			match(D_DOT);
			setState(730);
			widget();
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
	public static class MaterialappContext extends ParserRuleContext {
		public TerminalNode MATERIALAPP() { return getToken(dartParser.MATERIALAPP, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public HomeContext home() {
			return getRuleContext(HomeContext.class,0);
		}
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public ThemeContext theme() {
			return getRuleContext(ThemeContext.class,0);
		}
		public DebugshowmodeContext debugshowmode() {
			return getRuleContext(DebugshowmodeContext.class,0);
		}
		public MaterialappContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialapp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterMaterialapp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitMaterialapp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitMaterialapp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialappContext materialapp() throws RecognitionException {
		MaterialappContext _localctx = new MaterialappContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_materialapp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(MATERIALAPP);
			setState(733);
			match(OPEN_HEAD);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TITLE) {
				{
				setState(734);
				title();
				setState(735);
				match(COLON);
				}
			}

			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEME) {
				{
				setState(739);
				theme();
				setState(740);
				match(COLON);
				}
			}

			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEBUGSHOWMODE) {
				{
				setState(744);
				debugshowmode();
				setState(745);
				match(COLON);
				}
			}

			setState(749);
			home();
			setState(750);
			match(CLOSE_HEAD);
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
	public static class HomeContext extends ParserRuleContext {
		public TerminalNode HOME() { return getToken(dartParser.HOME, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public HomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterHome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitHome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitHome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HomeContext home() throws RecognitionException {
		HomeContext _localctx = new HomeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_home);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(HOME);
			setState(753);
			match(D_DOT);
			setState(754);
			match(VAR_NAME);
			setState(755);
			match(OPEN_HEAD);
			setState(756);
			match(CLOSE_HEAD);
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
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(dartParser.TITLE, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public String_valContext string_val() {
			return getRuleContext(String_valContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(TITLE);
			setState(759);
			match(D_DOT);
			setState(760);
			string_val();
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
	public static class ThemeContext extends ParserRuleContext {
		public TerminalNode THEME() { return getToken(dartParser.THEME, 0); }
		public List<TerminalNode> D_DOT() { return getTokens(dartParser.D_DOT); }
		public TerminalNode D_DOT(int i) {
			return getToken(dartParser.D_DOT, i);
		}
		public TerminalNode ThemeData() { return getToken(dartParser.ThemeData, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode PrimarySwatch() { return getToken(dartParser.PrimarySwatch, 0); }
		public ColorsContext colors() {
			return getRuleContext(ColorsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public ThemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterTheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitTheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitTheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemeContext theme() throws RecognitionException {
		ThemeContext _localctx = new ThemeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(THEME);
			setState(763);
			match(D_DOT);
			setState(764);
			match(ThemeData);
			setState(765);
			match(OPEN_HEAD);
			setState(766);
			match(PrimarySwatch);
			setState(767);
			match(D_DOT);
			setState(768);
			colors();
			setState(769);
			match(COLON);
			setState(770);
			match(CLOSE_HEAD);
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
	public static class DebugshowmodeContext extends ParserRuleContext {
		public TerminalNode DEBUGSHOWMODE() { return getToken(dartParser.DEBUGSHOWMODE, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode BOOL_VAL() { return getToken(dartParser.BOOL_VAL, 0); }
		public DebugshowmodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugshowmode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDebugshowmode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDebugshowmode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDebugshowmode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugshowmodeContext debugshowmode() throws RecognitionException {
		DebugshowmodeContext _localctx = new DebugshowmodeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_debugshowmode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(DEBUGSHOWMODE);
			setState(773);
			match(D_DOT);
			setState(774);
			match(BOOL_VAL);
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
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(dartParser.COLUMN, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode MAINAXIS() { return getToken(dartParser.MAINAXIS, 0); }
		public TerminalNode MAINAXIS1() { return getToken(dartParser.MAINAXIS1, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode CENTER() { return getToken(dartParser.CENTER, 0); }
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public TerminalNode CROSS_AXIS_ALIGNMENT_1() { return getToken(dartParser.CROSS_AXIS_ALIGNMENT_1, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode CROSS_AXIS_ALIGNMENT_2() { return getToken(dartParser.CROSS_AXIS_ALIGNMENT_2, 0); }
		public TerminalNode START() { return getToken(dartParser.START, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(COLUMN);
			setState(777);
			match(OPEN_HEAD);
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAINAXIS:
				{
				setState(778);
				match(MAINAXIS);
				setState(779);
				match(MAINAXIS1);
				setState(780);
				match(DOT);
				setState(781);
				match(CENTER);
				setState(782);
				match(COLON);
				}
				break;
			case CROSS_AXIS_ALIGNMENT_1:
				{
				setState(783);
				match(CROSS_AXIS_ALIGNMENT_1);
				setState(784);
				match(D_DOT);
				setState(785);
				match(CROSS_AXIS_ALIGNMENT_2);
				setState(786);
				match(DOT);
				setState(787);
				match(START);
				setState(788);
				match(COLON);
				}
				break;
			case CHIS:
				break;
			default:
				break;
			}
			setState(791);
			children();
			setState(792);
			match(CLOSE_HEAD);
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
	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(dartParser.ROW, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(ROW);
			setState(795);
			match(OPEN_HEAD);
			setState(796);
			children();
			setState(797);
			match(CLOSE_HEAD);
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
	public static class ChildrenContext extends ParserRuleContext {
		public TerminalNode CHIS() { return getToken(dartParser.CHIS, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode OPEN_PR() { return getToken(dartParser.OPEN_PR, 0); }
		public TerminalNode CLOSE_PR() { return getToken(dartParser.CLOSE_PR, 0); }
		public List<IfdartContext> ifdart() {
			return getRuleContexts(IfdartContext.class);
		}
		public IfdartContext ifdart(int i) {
			return getRuleContext(IfdartContext.class,i);
		}
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public ChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenContext children() throws RecognitionException {
		ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_children);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(CHIS);
			setState(800);
			match(D_DOT);
			setState(801);
			match(OPEN_PR);
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR_NAME) {
					{
					setState(802);
					ifdart();
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COLON) {
						{
						{
						setState(803);
						match(COLON);
						setState(804);
						widget();
						setState(805);
						match(COLON);
						setState(806);
						ifdart();
						}
						}
						setState(812);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 2:
				{
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 288372776061370368L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 283518210049L) != 0 || _la==MATERIALAPP) {
					{
					setState(815);
					widget();
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COLON) {
						{
						{
						setState(816);
						match(COLON);
						setState(817);
						widget();
						}
						}
						setState(822);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			}
			setState(827);
			match(CLOSE_PR);
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
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(dartParser.TEXT, 0); }
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public String_valContext string_val() {
			return getRuleContext(String_valContext.class,0);
		}
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(dartParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(dartParser.DOT, i);
		}
		public TerminalNode GET() { return getToken(dartParser.GET, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode EXCLAMATION() { return getToken(dartParser.EXCLAMATION, 0); }
		public List<TerminalNode> OPEN_PR() { return getTokens(dartParser.OPEN_PR); }
		public TerminalNode OPEN_PR(int i) {
			return getToken(dartParser.OPEN_PR, i);
		}
		public TerminalNode INDEX() { return getToken(dartParser.INDEX, 0); }
		public List<TerminalNode> CLOSE_PR() { return getTokens(dartParser.CLOSE_PR); }
		public TerminalNode CLOSE_PR(int i) {
			return getToken(dartParser.CLOSE_PR, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(TEXT);
			setState(830);
			match(OPEN_HEAD);
			{
			setState(854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_VAL:
				{
				setState(831);
				string_val();
				}
				break;
			case VAR_NAME:
				{
				setState(839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(832);
					match(VAR_NAME);
					setState(833);
					match(DOT);
					setState(834);
					match(GET);
					setState(835);
					match(OPEN_HEAD);
					setState(836);
					match(CONTEXT);
					setState(837);
					match(CLOSE_HEAD);
					setState(838);
					match(DOT);
					}
					break;
				}
				setState(841);
				match(VAR_NAME);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCLAMATION) {
					{
					setState(842);
					match(EXCLAMATION);
					}
				}

				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PR) {
					{
					setState(845);
					match(OPEN_PR);
					setState(846);
					match(INDEX);
					setState(847);
					match(CLOSE_PR);
					setState(848);
					match(OPEN_PR);
					setState(849);
					string_val();
					setState(850);
					match(CLOSE_PR);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(856);
				match(COLON);
				setState(857);
				style();
				}
			}

			}
			setState(860);
			match(CLOSE_HEAD);
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
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(dartParser.STYLE, 0); }
		public List<TerminalNode> D_DOT() { return getTokens(dartParser.D_DOT); }
		public TerminalNode D_DOT(int i) {
			return getToken(dartParser.D_DOT, i);
		}
		public TerminalNode TEXT_STYLE() { return getToken(dartParser.TEXT_STYLE, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode FONT_WEIGHT() { return getToken(dartParser.FONT_WEIGHT, 0); }
		public TerminalNode FONT_WEIGHT1() { return getToken(dartParser.FONT_WEIGHT1, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode W600() { return getToken(dartParser.W600, 0); }
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public TerminalNode FONT_SIZE() { return getToken(dartParser.FONT_SIZE, 0); }
		public TerminalNode NUM_VAL() { return getToken(dartParser.NUM_VAL, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(STYLE);
			setState(863);
			match(D_DOT);
			setState(864);
			match(TEXT_STYLE);
			setState(865);
			match(OPEN_HEAD);
			setState(866);
			match(FONT_WEIGHT);
			setState(867);
			match(D_DOT);
			setState(868);
			match(FONT_WEIGHT1);
			setState(869);
			match(DOT);
			setState(870);
			match(W600);
			setState(871);
			match(COLON);
			setState(872);
			match(FONT_SIZE);
			setState(873);
			match(D_DOT);
			setState(874);
			match(NUM_VAL);
			setState(875);
			match(CLOSE_HEAD);
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
	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(dartParser.IMAGE, 0); }
		public TerminalNode ASSET() { return getToken(dartParser.ASSET, 0); }
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public String_valContext string_val() {
			return getRuleContext(String_valContext.class,0);
		}
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(dartParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(dartParser.DOT, i);
		}
		public TerminalNode GET() { return getToken(dartParser.GET, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public Image1Context image1() {
			return getRuleContext(Image1Context.class,0);
		}
		public List<TerminalNode> OPEN_PR() { return getTokens(dartParser.OPEN_PR); }
		public TerminalNode OPEN_PR(int i) {
			return getToken(dartParser.OPEN_PR, i);
		}
		public TerminalNode INDEX() { return getToken(dartParser.INDEX, 0); }
		public List<TerminalNode> CLOSE_PR() { return getTokens(dartParser.CLOSE_PR); }
		public TerminalNode CLOSE_PR(int i) {
			return getToken(dartParser.CLOSE_PR, i);
		}
		public Image2Context image2() {
			return getRuleContext(Image2Context.class,0);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(IMAGE);
			setState(878);
			match(ASSET);
			setState(879);
			match(OPEN_HEAD);
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(880);
				string_val();
				}
				break;
			case 2:
				{
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(881);
					match(OPEN_HEAD);
					setState(882);
					match(VAR_NAME);
					setState(883);
					match(CLOSE_HEAD);
					}
					break;
				case 2:
					{
					setState(884);
					match(VAR_NAME);
					setState(885);
					match(OPEN_PR);
					setState(886);
					match(INDEX);
					setState(887);
					match(CLOSE_PR);
					setState(888);
					match(OPEN_PR);
					setState(889);
					string_val();
					setState(890);
					match(CLOSE_PR);
					}
					break;
				case 3:
					{
					setState(892);
					image2();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(895);
				match(VAR_NAME);
				setState(896);
				match(DOT);
				setState(897);
				match(GET);
				setState(898);
				match(OPEN_HEAD);
				setState(899);
				match(CONTEXT);
				setState(900);
				match(CLOSE_HEAD);
				setState(901);
				match(DOT);
				setState(902);
				match(VAR_NAME);
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PR) {
					{
					setState(903);
					match(OPEN_PR);
					setState(904);
					match(INDEX);
					setState(905);
					match(CLOSE_PR);
					setState(906);
					match(OPEN_PR);
					setState(907);
					string_val();
					setState(908);
					match(CLOSE_PR);
					}
				}

				}
				break;
			}
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(914);
				image1();
				}
			}

			setState(917);
			match(CLOSE_HEAD);
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
	public static class Image1Context extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public TerminalNode FIT() { return getToken(dartParser.FIT, 0); }
		public TerminalNode BOXFIT() { return getToken(dartParser.BOXFIT, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode FILL() { return getToken(dartParser.FILL, 0); }
		public TerminalNode COVER() { return getToken(dartParser.COVER, 0); }
		public Image1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterImage1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitImage1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitImage1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Image1Context image1() throws RecognitionException {
		Image1Context _localctx = new Image1Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_image1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(COLON);
			setState(920);
			match(FIT);
			setState(921);
			match(BOXFIT);
			setState(922);
			match(DOT);
			setState(923);
			_la = _input.LA(1);
			if ( !(_la==FILL || _la==COVER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Image2Context extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode EXCLAMATION() { return getToken(dartParser.EXCLAMATION, 0); }
		public Image2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterImage2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitImage2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitImage2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Image2Context image2() throws RecognitionException {
		Image2Context _localctx = new Image2Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_image2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(VAR_NAME);
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATION) {
				{
				setState(926);
				match(EXCLAMATION);
				}
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
	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode SCAFFOLD() { return getToken(dartParser.SCAFFOLD, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public AppbarContext appbar() {
			return getRuleContext(AppbarContext.class,0);
		}
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitScaffold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(SCAFFOLD);
			setState(930);
			match(OPEN_HEAD);
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPBAR2) {
				{
				setState(931);
				appbar();
				setState(932);
				match(COLON);
				}
			}

			setState(936);
			body();
			setState(937);
			match(CLOSE_HEAD);
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
	public static class AppbarContext extends ParserRuleContext {
		public TerminalNode APPBAR2() { return getToken(dartParser.APPBAR2, 0); }
		public List<TerminalNode> D_DOT() { return getTokens(dartParser.D_DOT); }
		public TerminalNode D_DOT(int i) {
			return getToken(dartParser.D_DOT, i);
		}
		public TerminalNode APPBAR() { return getToken(dartParser.APPBAR, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode BACK() { return getToken(dartParser.BACK, 0); }
		public ColorsContext colors() {
			return getRuleContext(ColorsContext.class,0);
		}
		public Tool_bar_heightContext tool_bar_height() {
			return getRuleContext(Tool_bar_heightContext.class,0);
		}
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public Flexible_spaceContext flexible_space() {
			return getRuleContext(Flexible_spaceContext.class,0);
		}
		public AppbarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appbar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterAppbar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitAppbar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitAppbar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppbarContext appbar() throws RecognitionException {
		AppbarContext _localctx = new AppbarContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_appbar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(APPBAR2);
			setState(940);
			match(D_DOT);
			setState(941);
			match(APPBAR);
			setState(942);
			match(OPEN_HEAD);
			setState(950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACK:
				{
				setState(943);
				match(BACK);
				setState(944);
				match(D_DOT);
				setState(945);
				colors();
				}
				break;
			case TOOL_BAR_HEIGHT:
				{
				setState(946);
				tool_bar_height();
				setState(947);
				match(COLON);
				setState(948);
				flexible_space();
				}
				break;
			case CLOSE_HEAD:
				break;
			default:
				break;
			}
			setState(952);
			match(CLOSE_HEAD);
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
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(dartParser.BODY, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(BODY);
			setState(955);
			match(D_DOT);
			setState(956);
			widget();
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
	public static class Padding1Context extends ParserRuleContext {
		public TerminalNode PADDING1() { return getToken(dartParser.PADDING1, 0); }
		public TerminalNode EDGE() { return getToken(dartParser.EDGE, 0); }
		public TerminalNode ALL() { return getToken(dartParser.ALL, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode NUM_VAL() { return getToken(dartParser.NUM_VAL, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public Padding1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterPadding1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitPadding1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitPadding1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Padding1Context padding1() throws RecognitionException {
		Padding1Context _localctx = new Padding1Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_padding1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(PADDING1);
			setState(959);
			match(EDGE);
			setState(960);
			match(ALL);
			setState(961);
			match(OPEN_HEAD);
			setState(962);
			match(NUM_VAL);
			setState(963);
			match(CLOSE_HEAD);
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
	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode PADDING() { return getToken(dartParser.PADDING, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public Padding1Context padding1() {
			return getRuleContext(Padding1Context.class,0);
		}
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public PaddingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterPadding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitPadding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitPadding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingContext padding() throws RecognitionException {
		PaddingContext _localctx = new PaddingContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(PADDING);
			setState(966);
			match(OPEN_HEAD);
			setState(967);
			padding1();
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(968);
				match(COLON);
				setState(969);
				child();
				}
			}

			setState(972);
			match(CLOSE_HEAD);
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
	public static class ExpandedContext extends ParserRuleContext {
		public TerminalNode EXPANDED() { return getToken(dartParser.EXPANDED, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public ExpandedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expanded; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExpanded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExpanded(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExpanded(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedContext expanded() throws RecognitionException {
		ExpandedContext _localctx = new ExpandedContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_expanded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(EXPANDED);
			setState(975);
			match(OPEN_HEAD);
			setState(976);
			child();
			setState(977);
			match(CLOSE_HEAD);
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
	public static class SizedboxContext extends ParserRuleContext {
		public TerminalNode SIZEDBOX() { return getToken(dartParser.SIZEDBOX, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public HieghtContext hieght() {
			return getRuleContext(HieghtContext.class,0);
		}
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public SizedboxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizedbox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterSizedbox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitSizedbox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitSizedbox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizedboxContext sizedbox() throws RecognitionException {
		SizedboxContext _localctx = new SizedboxContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_sizedbox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(SIZEDBOX);
			setState(980);
			match(OPEN_HEAD);
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				{
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HEIGHT) {
					{
					setState(981);
					hieght();
					setState(982);
					match(COLON);
					}
				}

				{
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WIDTH) {
					{
					setState(986);
					width();
					}
				}

				}
				}
				}
				break;
			case 2:
				{
				{
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WIDTH) {
					{
					setState(989);
					width();
					setState(990);
					match(COLON);
					}
				}

				{
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HEIGHT) {
					{
					setState(994);
					hieght();
					}
				}

				}
				}
				}
				break;
			}
			setState(999);
			match(CLOSE_HEAD);
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
	public static class HieghtContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(dartParser.HEIGHT, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode NUM_VAL() { return getToken(dartParser.NUM_VAL, 0); }
		public HieghtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hieght; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterHieght(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitHieght(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitHieght(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HieghtContext hieght() throws RecognitionException {
		HieghtContext _localctx = new HieghtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_hieght);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(HEIGHT);
			setState(1002);
			match(D_DOT);
			setState(1003);
			match(NUM_VAL);
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
	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(dartParser.WIDTH, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode NUM_VAL() { return getToken(dartParser.NUM_VAL, 0); }
		public TerminalNode DOUBLE() { return getToken(dartParser.DOUBLE, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode INFINITY() { return getToken(dartParser.INFINITY, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(WIDTH);
			setState(1006);
			match(D_DOT);
			setState(1011);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_VAL:
				{
				setState(1007);
				match(NUM_VAL);
				}
				break;
			case DOUBLE:
				{
				setState(1008);
				match(DOUBLE);
				setState(1009);
				match(DOT);
				setState(1010);
				match(INFINITY);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ListviewContext extends ParserRuleContext {
		public TerminalNode LISTVIEW() { return getToken(dartParser.LISTVIEW, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode SEPARATED() { return getToken(dartParser.SEPARATED, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public ItbContext itb() {
			return getRuleContext(ItbContext.class,0);
		}
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public SbContext sb() {
			return getRuleContext(SbContext.class,0);
		}
		public IcContext ic() {
			return getRuleContext(IcContext.class,0);
		}
		public ListviewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listview; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterListview(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitListview(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitListview(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListviewContext listview() throws RecognitionException {
		ListviewContext _localctx = new ListviewContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_listview);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(LISTVIEW);
			setState(1014);
			match(DOT);
			setState(1015);
			match(SEPARATED);
			setState(1016);
			match(OPEN_HEAD);
			{
			setState(1017);
			itb();
			setState(1018);
			widget();
			setState(1019);
			match(COLON);
			setState(1020);
			sb();
			setState(1021);
			widget();
			setState(1022);
			match(COLON);
			setState(1023);
			ic();
			}
			setState(1025);
			match(CLOSE_HEAD);
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
	public static class ItbContext extends ParserRuleContext {
		public TerminalNode ItemBuilder() { return getToken(dartParser.ItemBuilder, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public TerminalNode INDEX() { return getToken(dartParser.INDEX, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode Return() { return getToken(dartParser.Return, 0); }
		public ItbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterItb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitItb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitItb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItbContext itb() throws RecognitionException {
		ItbContext _localctx = new ItbContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_itb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(ItemBuilder);
			setState(1028);
			match(D_DOT);
			setState(1029);
			match(OPEN_HEAD);
			setState(1030);
			match(CONTEXT);
			setState(1031);
			match(COLON);
			setState(1032);
			match(INDEX);
			setState(1033);
			match(CLOSE_HEAD);
			setState(1034);
			match(Return);
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
	public static class SbContext extends ParserRuleContext {
		public TerminalNode SeparatorBuilder() { return getToken(dartParser.SeparatorBuilder, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public TerminalNode INDEX() { return getToken(dartParser.INDEX, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public TerminalNode Return() { return getToken(dartParser.Return, 0); }
		public SbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterSb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitSb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitSb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SbContext sb() throws RecognitionException {
		SbContext _localctx = new SbContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_sb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(SeparatorBuilder);
			setState(1037);
			match(D_DOT);
			setState(1038);
			match(OPEN_HEAD);
			setState(1039);
			match(CONTEXT);
			setState(1040);
			match(COLON);
			setState(1041);
			match(INDEX);
			setState(1042);
			match(CLOSE_HEAD);
			setState(1043);
			match(Return);
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
	public static class IcContext extends ParserRuleContext {
		public TerminalNode ItemCount() { return getToken(dartParser.ItemCount, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode NUM_VAL() { return getToken(dartParser.NUM_VAL, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(dartParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(dartParser.DOT, i);
		}
		public TerminalNode GET() { return getToken(dartParser.GET, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public IcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterIc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitIc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitIc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IcContext ic() throws RecognitionException {
		IcContext _localctx = new IcContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ic);
		try {
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045);
				match(ItemCount);
				setState(1046);
				match(D_DOT);
				setState(1047);
				match(NUM_VAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				match(ItemCount);
				setState(1049);
				match(D_DOT);
				setState(1050);
				match(VAR_NAME);
				setState(1051);
				match(DOT);
				setState(1052);
				match(VAR_NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1053);
				match(ItemCount);
				setState(1054);
				match(D_DOT);
				setState(1055);
				match(VAR_NAME);
				setState(1056);
				match(DOT);
				setState(1057);
				match(GET);
				setState(1058);
				match(OPEN_HEAD);
				setState(1059);
				match(CONTEXT);
				setState(1060);
				match(CLOSE_HEAD);
				setState(1061);
				match(DOT);
				setState(1062);
				match(VAR_NAME);
				setState(1063);
				match(DOT);
				setState(1064);
				match(VAR_NAME);
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
	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER() { return getToken(dartParser.CONTAINER, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public Padding1Context padding1() {
			return getRuleContext(Padding1Context.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public DecorationContext decoration() {
			return getRuleContext(DecorationContext.class,0);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(CONTAINER);
			setState(1068);
			match(OPEN_HEAD);
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADDING1) {
				{
				setState(1069);
				padding1();
				setState(1070);
				match(COLON);
				}
			}

			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WIDTH) {
				{
				setState(1074);
				width();
				setState(1075);
				match(COLON);
				}
			}

			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(1079);
				child();
				}
			}

			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1082);
				match(COLON);
				}
			}

			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECORATION) {
				{
				setState(1085);
				decoration();
				}
			}

			setState(1088);
			match(CLOSE_HEAD);
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
	public static class Bord_radContext extends ParserRuleContext {
		public TerminalNode BORDERRADIUS() { return getToken(dartParser.BORDERRADIUS, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode BORDER2() { return getToken(dartParser.BORDER2, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode CIRCULAR() { return getToken(dartParser.CIRCULAR, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode NUM_VAL() { return getToken(dartParser.NUM_VAL, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public Bord_radContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bord_rad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBord_rad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBord_rad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBord_rad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bord_radContext bord_rad() throws RecognitionException {
		Bord_radContext _localctx = new Bord_radContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_bord_rad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(BORDERRADIUS);
			setState(1091);
			match(D_DOT);
			setState(1092);
			match(BORDER2);
			setState(1093);
			match(DOT);
			setState(1094);
			match(CIRCULAR);
			setState(1095);
			match(OPEN_HEAD);
			setState(1096);
			match(NUM_VAL);
			setState(1097);
			match(CLOSE_HEAD);
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
	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(dartParser.COLOR, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public ColorsContext colors() {
			return getRuleContext(ColorsContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(COLOR);
			setState(1100);
			match(D_DOT);
			setState(1101);
			colors();
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
	public static class ColorsContext extends ParserRuleContext {
		public TerminalNode COLORS() { return getToken(dartParser.COLORS, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode COL() { return getToken(dartParser.COL, 0); }
		public ColorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterColors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitColors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitColors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorsContext colors() throws RecognitionException {
		ColorsContext _localctx = new ColorsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_colors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(COLORS);
			setState(1104);
			match(DOT);
			setState(1105);
			match(COL);
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
	public static class DecorationContext extends ParserRuleContext {
		public TerminalNode DECORATION() { return getToken(dartParser.DECORATION, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public TerminalNode BD() { return getToken(dartParser.BD, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public List<TerminalNode> WS() { return getTokens(dartParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(dartParser.WS, i);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public Bord_radContext bord_rad() {
			return getRuleContext(Bord_radContext.class,0);
		}
		public TerminalNode COLON() { return getToken(dartParser.COLON, 0); }
		public DecorationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDecoration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDecoration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDecoration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecorationContext decoration() throws RecognitionException {
		DecorationContext _localctx = new DecorationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_decoration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(DECORATION);
			setState(1108);
			match(D_DOT);
			setState(1109);
			match(BD);
			setState(1110);
			match(OPEN_HEAD);
			setState(1114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1111);
					match(WS);
					}
					} 
				}
				setState(1116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(1117);
				color();
				}
				break;
			case 2:
				{
				{
				setState(1118);
				color();
				setState(1119);
				match(COLON);
				setState(1120);
				bord_rad();
				}
				}
				break;
			case 3:
				{
				setState(1122);
				bord_rad();
				}
				break;
			}
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(1125);
				match(WS);
				}
				}
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1131);
			match(CLOSE_HEAD);
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(dartParser.LIST, 0); }
		public TerminalNode VAR_NAME() { return getToken(dartParser.VAR_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(dartParser.EQUAL, 0); }
		public TerminalNode OPEN_PR() { return getToken(dartParser.OPEN_PR, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public TerminalNode CLOSE_PR() { return getToken(dartParser.CLOSE_PR, 0); }
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(LIST);
			setState(1134);
			match(VAR_NAME);
			setState(1135);
			match(EQUAL);
			setState(1136);
			match(OPEN_PR);
			setState(1137);
			object();
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(1138);
				match(COLON);
				setState(1139);
				object();
				}
				}
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1145);
			match(CLOSE_PR);
			setState(1146);
			match(SIMICOLON);
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public List<VaribleContext> varible() {
			return getRuleContexts(VaribleContext.class);
		}
		public VaribleContext varible(int i) {
			return getRuleContext(VaribleContext.class,i);
		}
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(OPEN_BODY);
			setState(1149);
			varible();
			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(1150);
				match(COLON);
				setState(1151);
				varible();
				}
				}
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1157);
			match(CLOSE_BODY);
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
	public static class VaribleContext extends ParserRuleContext {
		public List<String_valContext> string_val() {
			return getRuleContexts(String_valContext.class);
		}
		public String_valContext string_val(int i) {
			return getRuleContext(String_valContext.class,i);
		}
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public VaribleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterVarible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitVarible(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitVarible(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaribleContext varible() throws RecognitionException {
		VaribleContext _localctx = new VaribleContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_varible);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			string_val();
			setState(1160);
			match(D_DOT);
			setState(1161);
			string_val();
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
	public static class GestureDetectorContext extends ParserRuleContext {
		public TerminalNode GestureDetector() { return getToken(dartParser.GestureDetector, 0); }
		public TerminalNode OPEN_HEAD() { return getToken(dartParser.OPEN_HEAD, 0); }
		public On_long_pressContext on_long_press() {
			return getRuleContext(On_long_pressContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(dartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(dartParser.COLON, i);
		}
		public OntapContext ontap() {
			return getRuleContext(OntapContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CLOSE_HEAD() { return getToken(dartParser.CLOSE_HEAD, 0); }
		public GestureDetectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gestureDetector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterGestureDetector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitGestureDetector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitGestureDetector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GestureDetectorContext gestureDetector() throws RecognitionException {
		GestureDetectorContext _localctx = new GestureDetectorContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_gestureDetector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			match(GestureDetector);
			setState(1164);
			match(OPEN_HEAD);
			setState(1165);
			on_long_press();
			setState(1166);
			match(COLON);
			setState(1167);
			ontap();
			setState(1168);
			match(COLON);
			setState(1169);
			child();
			setState(1170);
			match(CLOSE_HEAD);
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
	public static class OntapContext extends ParserRuleContext {
		public TerminalNode ONTAP() { return getToken(dartParser.ONTAP, 0); }
		public TerminalNode D_DOT() { return getToken(dartParser.D_DOT, 0); }
		public List<TerminalNode> OPEN_HEAD() { return getTokens(dartParser.OPEN_HEAD); }
		public TerminalNode OPEN_HEAD(int i) {
			return getToken(dartParser.OPEN_HEAD, i);
		}
		public List<TerminalNode> CLOSE_HEAD() { return getTokens(dartParser.CLOSE_HEAD); }
		public TerminalNode CLOSE_HEAD(int i) {
			return getToken(dartParser.CLOSE_HEAD, i);
		}
		public TerminalNode OPEN_BODY() { return getToken(dartParser.OPEN_BODY, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(dartParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(dartParser.VAR_NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(dartParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(dartParser.DOT, i);
		}
		public TerminalNode GET() { return getToken(dartParser.GET, 0); }
		public TerminalNode CONTEXT() { return getToken(dartParser.CONTEXT, 0); }
		public TerminalNode INDEX() { return getToken(dartParser.INDEX, 0); }
		public TerminalNode SIMICOLON() { return getToken(dartParser.SIMICOLON, 0); }
		public TerminalNode CLOSE_BODY() { return getToken(dartParser.CLOSE_BODY, 0); }
		public OntapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOntap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOntap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOntap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OntapContext ontap() throws RecognitionException {
		OntapContext _localctx = new OntapContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_ontap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(ONTAP);
			setState(1173);
			match(D_DOT);
			setState(1174);
			match(OPEN_HEAD);
			setState(1175);
			match(CLOSE_HEAD);
			setState(1176);
			match(OPEN_BODY);
			setState(1177);
			match(VAR_NAME);
			setState(1178);
			match(DOT);
			setState(1179);
			match(GET);
			setState(1180);
			match(OPEN_HEAD);
			setState(1181);
			match(CONTEXT);
			setState(1182);
			match(CLOSE_HEAD);
			setState(1183);
			match(DOT);
			setState(1184);
			match(VAR_NAME);
			setState(1185);
			match(OPEN_HEAD);
			setState(1186);
			match(INDEX);
			setState(1187);
			match(CLOSE_HEAD);
			setState(1188);
			match(SIMICOLON);
			setState(1189);
			match(CLOSE_BODY);
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
		"\u0004\u0001\u00b8\u04a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0001\u0000\u0001\u0000\u0004\u0000\u00ad\b\u0000\u000b\u0000\f\u0000"+
		"\u00ae\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004\u00c0\b\u0004\u0001"+
		"\u0004\u0003\u0004\u00c3\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00c8\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00cc\b\u0004"+
		"\n\u0004\f\u0004\u00cf\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00d3"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d8\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00e2\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00eb\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00f2\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00fd\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u0109\b\t\u0001"+
		"\t\u0003\t\u010c\b\t\u0001\t\u0005\t\u010f\b\t\n\t\f\t\u0112\t\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u011c\b\u000b\n\u000b\f\u000b\u011f\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0126\b\f\n\f\f\f\u0129\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0143\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0148\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u015a"+
		"\b\u000f\n\u000f\f\u000f\u015d\t\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0161\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0167\b\u0010\n\u0010\f\u0010\u016a\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0005\u0013\u017c\b\u0013\n\u0013\f\u0013\u017f\t\u0013"+
		"\u0001\u0013\u0003\u0013\u0182\b\u0013\u0001\u0013\u0005\u0013\u0185\b"+
		"\u0013\n\u0013\f\u0013\u0188\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u018d\b\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0191\b"+
		"\u0014\n\u0014\f\u0014\u0194\t\u0014\u0003\u0014\u0196\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u019d\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u01e2\b\u001a\n\u001a\f\u001a\u01e5\t\u001a\u0003"+
		"\u001a\u01e7\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u01fb\b\u001c\n\u001c\f\u001c\u01fe\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0203\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0223\b \u0001"+
		" \u0001 \u0001!\u0001!\u0001\"\u0005\"\u022a\b\"\n\"\f\"\u022d\t\"\u0001"+
		"\"\u0001\"\u0005\"\u0231\b\"\n\"\f\"\u0234\t\"\u0001\"\u0005\"\u0237\b"+
		"\"\n\"\f\"\u023a\t\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0005&\u0251\b&\n&\f&\u0254\t&\u0001&\u0001"+
		"&\u0003&\u0258\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005"+
		"\'\u0260\b\'\n\'\f\'\u0263\t\'\u0001\'\u0003\'\u0266\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0275\b)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u02a3\b,\n,"+
		"\f,\u02a6\t,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u02d7"+
		"\b/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u0003"+
		"1\u02e2\b1\u00011\u00011\u00011\u00031\u02e7\b1\u00011\u00011\u00011\u0003"+
		"1\u02ec\b1\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00036\u0316\b6\u00016\u00016\u00016\u00017\u00017\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00058\u0329\b8\n8\f8\u032c\t8\u00038\u032e\b8\u00018\u00018\u00018"+
		"\u00058\u0333\b8\n8\f8\u0336\t8\u00038\u0338\b8\u00038\u033a\b8\u0001"+
		"8\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00039\u0348\b9\u00019\u00019\u00039\u034c\b9\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u0355\b9\u00039\u0357\b9\u00019\u0001"+
		"9\u00039\u035b\b9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u037e\b;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u038f\b;\u0003;\u0391\b;\u0001;\u0003;\u0394\b"+
		";\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0003=\u03a0\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u03a7\b>\u0001"+
		">\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0003?\u03b7\b?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0003B\u03cb\bB\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u03d9\bD\u0001"+
		"D\u0003D\u03dc\bD\u0001D\u0001D\u0001D\u0003D\u03e1\bD\u0001D\u0003D\u03e4"+
		"\bD\u0003D\u03e6\bD\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0003F\u03f4\bF\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u042a"+
		"\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u0431\bK\u0001K\u0001K\u0001"+
		"K\u0003K\u0436\bK\u0001K\u0003K\u0439\bK\u0001K\u0003K\u043c\bK\u0001"+
		"K\u0003K\u043f\bK\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001"+
		"N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0005O\u0459\bO\nO\fO\u045c"+
		"\tO\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u0464\bO\u0001O\u0005"+
		"O\u0467\bO\nO\fO\u046a\tO\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0005P\u0475\bP\nP\fP\u0478\tP\u0001P\u0001P\u0001P\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0005Q\u0481\bQ\nQ\fQ\u0484\tQ\u0001Q\u0001Q\u0001"+
		"R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0001T\u0001T\u0000\u0000U\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u0000\u0004\u0002\u0000rr\u00b3\u00b3\u0001\u0000UV\u0001\u0000"+
		"\u0007\u0012\u0002\u0000$$66\u04bf\u0000\u00ac\u0001\u0000\u0000\u0000"+
		"\u0002\u00b2\u0001\u0000\u0000\u0000\u0004\u00b4\u0001\u0000\u0000\u0000"+
		"\u0006\u00b6\u0001\u0000\u0000\u0000\b\u00d2\u0001\u0000\u0000\u0000\n"+
		"\u00d4\u0001\u0000\u0000\u0000\f\u00d9\u0001\u0000\u0000\u0000\u000e\u00f1"+
		"\u0001\u0000\u0000\u0000\u0010\u00fc\u0001\u0000\u0000\u0000\u0012\u0106"+
		"\u0001\u0000\u0000\u0000\u0014\u0115\u0001\u0000\u0000\u0000\u0016\u0119"+
		"\u0001\u0000\u0000\u0000\u0018\u0122\u0001\u0000\u0000\u0000\u001a\u012c"+
		"\u0001\u0000\u0000\u0000\u001c\u013b\u0001\u0000\u0000\u0000\u001e\u0144"+
		"\u0001\u0000\u0000\u0000 \u0162\u0001\u0000\u0000\u0000\"\u016d\u0001"+
		"\u0000\u0000\u0000$\u0174\u0001\u0000\u0000\u0000&\u017d\u0001\u0000\u0000"+
		"\u0000(\u0189\u0001\u0000\u0000\u0000*\u019c\u0001\u0000\u0000\u0000,"+
		"\u019e\u0001\u0000\u0000\u0000.\u01ad\u0001\u0000\u0000\u00000\u01b9\u0001"+
		"\u0000\u0000\u00002\u01c3\u0001\u0000\u0000\u00004\u01d0\u0001\u0000\u0000"+
		"\u00006\u01eb\u0001\u0000\u0000\u00008\u01f4\u0001\u0000\u0000\u0000:"+
		"\u0206\u0001\u0000\u0000\u0000<\u020a\u0001\u0000\u0000\u0000>\u020e\u0001"+
		"\u0000\u0000\u0000@\u0212\u0001\u0000\u0000\u0000B\u0226\u0001\u0000\u0000"+
		"\u0000D\u022b\u0001\u0000\u0000\u0000F\u023b\u0001\u0000\u0000\u0000H"+
		"\u023f\u0001\u0000\u0000\u0000J\u0247\u0001\u0000\u0000\u0000L\u0252\u0001"+
		"\u0000\u0000\u0000N\u0259\u0001\u0000\u0000\u0000P\u026b\u0001\u0000\u0000"+
		"\u0000R\u026e\u0001\u0000\u0000\u0000T\u027a\u0001\u0000\u0000\u0000V"+
		"\u028c\u0001\u0000\u0000\u0000X\u0299\u0001\u0000\u0000\u0000Z\u02ad\u0001"+
		"\u0000\u0000\u0000\\\u02ba\u0001\u0000\u0000\u0000^\u02d6\u0001\u0000"+
		"\u0000\u0000`\u02d8\u0001\u0000\u0000\u0000b\u02dc\u0001\u0000\u0000\u0000"+
		"d\u02f0\u0001\u0000\u0000\u0000f\u02f6\u0001\u0000\u0000\u0000h\u02fa"+
		"\u0001\u0000\u0000\u0000j\u0304\u0001\u0000\u0000\u0000l\u0308\u0001\u0000"+
		"\u0000\u0000n\u031a\u0001\u0000\u0000\u0000p\u031f\u0001\u0000\u0000\u0000"+
		"r\u033d\u0001\u0000\u0000\u0000t\u035e\u0001\u0000\u0000\u0000v\u036d"+
		"\u0001\u0000\u0000\u0000x\u0397\u0001\u0000\u0000\u0000z\u039d\u0001\u0000"+
		"\u0000\u0000|\u03a1\u0001\u0000\u0000\u0000~\u03ab\u0001\u0000\u0000\u0000"+
		"\u0080\u03ba\u0001\u0000\u0000\u0000\u0082\u03be\u0001\u0000\u0000\u0000"+
		"\u0084\u03c5\u0001\u0000\u0000\u0000\u0086\u03ce\u0001\u0000\u0000\u0000"+
		"\u0088\u03d3\u0001\u0000\u0000\u0000\u008a\u03e9\u0001\u0000\u0000\u0000"+
		"\u008c\u03ed\u0001\u0000\u0000\u0000\u008e\u03f5\u0001\u0000\u0000\u0000"+
		"\u0090\u0403\u0001\u0000\u0000\u0000\u0092\u040c\u0001\u0000\u0000\u0000"+
		"\u0094\u0429\u0001\u0000\u0000\u0000\u0096\u042b\u0001\u0000\u0000\u0000"+
		"\u0098\u0442\u0001\u0000\u0000\u0000\u009a\u044b\u0001\u0000\u0000\u0000"+
		"\u009c\u044f\u0001\u0000\u0000\u0000\u009e\u0453\u0001\u0000\u0000\u0000"+
		"\u00a0\u046d\u0001\u0000\u0000\u0000\u00a2\u047c\u0001\u0000\u0000\u0000"+
		"\u00a4\u0487\u0001\u0000\u0000\u0000\u00a6\u048b\u0001\u0000\u0000\u0000"+
		"\u00a8\u0494\u0001\u0000\u0000\u0000\u00aa\u00ad\u0003\u0002\u0001\u0000"+
		"\u00ab\u00ad\u0003\u0018\f\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0000\u0000\u0001\u00b1"+
		"\u0001\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\b\u0004\u0000\u00b3\u0003"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u00b2\u0000\u0000\u00b5\u0005"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005&\u0000\u0000\u00b7\u00b8\u0005"+
		"w\u0000\u0000\u00b8\u00b9\u0005\u00b3\u0000\u0000\u00b9\u00ba\u0005w\u0000"+
		"\u0000\u00ba\u00bb\u0005x\u0000\u0000\u00bb\u00bc\u0005x\u0000\u0000\u00bc"+
		"\u00bd\u0005u\u0000\u0000\u00bd\u0007\u0001\u0000\u0000\u0000\u00be\u00c0"+
		"\u0005V\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005"+
		"\u0014\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7\u0005"+
		"\u00b3\u0000\u0000\u00c5\u00c6\u0005s\u0000\u0000\u00c6\u00c8\u0003\u000e"+
		"\u0007\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cd\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005v\u0000"+
		"\u0000\u00ca\u00cc\u0003\n\u0005\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0005u\u0000\u0000\u00d1"+
		"\u00d3\u0003\u0006\u0003\u0000\u00d2\u00bf\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\t\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0005\u00b3\u0000\u0000\u00d5\u00d6\u0005s\u0000\u0000\u00d6\u00d8\u0003"+
		"\u000e\u0007\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u000b\u0001\u0000\u0000\u0000\u00d9\u00e1\u0005"+
		"\u00b3\u0000\u0000\u00da\u00db\u0005a\u0000\u0000\u00db\u00dc\u0005\u0088"+
		"\u0000\u0000\u00dc\u00dd\u0005w\u0000\u0000\u00dd\u00de\u0005q\u0000\u0000"+
		"\u00de\u00df\u0005x\u0000\u0000\u00df\u00e0\u0005a\u0000\u0000\u00e0\u00e2"+
		"\u0005\u00b3\u0000\u0000\u00e1\u00da\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00ea\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u001e\u0000\u0000\u00e4\u00e5\u0005r\u0000\u0000\u00e5\u00e6\u0005"+
		"\u001f\u0000\u0000\u00e6\u00e7\u0005\u001e\u0000\u0000\u00e7\u00e8\u0003"+
		"\u0004\u0002\u0000\u00e8\u00e9\u0005\u001f\u0000\u0000\u00e9\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e3\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\r\u0001\u0000\u0000\u0000\u00ec\u00f2\u0003\u0004"+
		"\u0002\u0000\u00ed\u00f2\u0005t\u0000\u0000\u00ee\u00f2\u0005Y\u0000\u0000"+
		"\u00ef\u00f2\u0005\u00b3\u0000\u0000\u00f0\u00f2\u0003\f\u0006\u0000\u00f1"+
		"\u00ec\u0001\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u000f\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005\u00b3\u0000\u0000\u00f4\u00f5\u0005a\u0000\u0000\u00f5\u00f6"+
		"\u0005\u0088\u0000\u0000\u00f6\u00f7\u0005w\u0000\u0000\u00f7\u00f8\u0005"+
		"q\u0000\u0000\u00f8\u00f9\u0005x\u0000\u0000\u00f9\u00fa\u0005a\u0000"+
		"\u0000\u00fa\u00fd\u0005\u00b3\u0000\u0000\u00fb\u00fd\u0005\u00b3\u0000"+
		"\u0000\u00fc\u00f3\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005s\u0000\u0000"+
		"\u00ff\u0100\u0005s\u0000\u0000\u0100\u0101\u0003\u0004\u0002\u0000\u0101"+
		"\u0102\u0005\u0014\u0000\u0000\u0102\u0103\u0003^/\u0000\u0103\u0104\u0005"+
		"`\u0000\u0000\u0104\u0105\u0003^/\u0000\u0105\u0011\u0001\u0000\u0000"+
		"\u0000\u0106\u0108\u0005w\u0000\u0000\u0107\u0109\u0005V\u0000\u0000\u0108"+
		"\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u010b\u0001\u0000\u0000\u0000\u010a\u010c\u0007\u0000\u0000\u0000\u010b"+
		"\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u0110\u0001\u0000\u0000\u0000\u010d\u010f\u0003\u0014\n\u0000\u010e\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0005x\u0000\u0000\u0114\u0013\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"v\u0000\u0000\u0116\u0117\u0005V\u0000\u0000\u0117\u0118\u0005\u00b3\u0000"+
		"\u0000\u0118\u0015\u0001\u0000\u0000\u0000\u0119\u011d\u0005y\u0000\u0000"+
		"\u011a\u011c\u0003\b\u0004\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005z\u0000\u0000\u0121\u0017"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0007\u0001\u0000\u0000\u0123\u0127"+
		"\u0005\u00b3\u0000\u0000\u0124\u0126\u0003\u0012\t\u0000\u0125\u0124\u0001"+
		"\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0003"+
		"\u0016\u000b\u0000\u012b\u0019\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"\u0085\u0000\u0000\u012d\u012e\u0005\u00b3\u0000\u0000\u012e\u012f\u0005"+
		"\u0088\u0000\u0000\u012f\u0130\u0005w\u0000\u0000\u0130\u0131\u0005q\u0000"+
		"\u0000\u0131\u0132\u0005x\u0000\u0000\u0132\u0133\u0005m\u0000\u0000\u0133"+
		"\u0134\u0005\'\u0000\u0000\u0134\u0135\u0005a\u0000\u0000\u0135\u0136"+
		"\u0005\u00ae\u0000\u0000\u0136\u0137\u0005w\u0000\u0000\u0137\u0138\u0005"+
		"q\u0000\u0000\u0138\u0139\u0005x\u0000\u0000\u0139\u013a\u0005u\u0000"+
		"\u0000\u013a\u001b\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0083\u0000"+
		"\u0000\u013c\u013d\u0005\u00b3\u0000\u0000\u013d\u013e\u0005\u008d\u0000"+
		"\u0000\u013e\u0142\u0005\u00b3\u0000\u0000\u013f\u0140\u0005\b\u0000\u0000"+
		"\u0140\u0141\u0005\u00b3\u0000\u0000\u0141\u0143\u0005\u0007\u0000\u0000"+
		"\u0142\u013f\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000"+
		"\u0143\u001d\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u00b3\u0000\u0000"+
		"\u0145\u0147\u0005w\u0000\u0000\u0146\u0148\u0003 \u0010\u0000\u0147\u0146"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0001\u0000\u0000\u0000\u0149\u0160\u0005x\u0000\u0000\u014a\u014b\u0005"+
		"`\u0000\u0000\u014b\u014c\u0005\u008b\u0000\u0000\u014c\u014d\u0005w\u0000"+
		"\u0000\u014d\u014e\u0005\u00b3\u0000\u0000\u014e\u014f\u0005w\u0000\u0000"+
		"\u014f\u0150\u0005x\u0000\u0000\u0150\u0151\u0005x\u0000\u0000\u0151\u0161"+
		"\u0005u\u0000\u0000\u0152\u0153\u0005y\u0000\u0000\u0153\u0154\u0005\u007f"+
		"\u0000\u0000\u0154\u0155\u0005a\u0000\u0000\u0155\u0156\u0005\u00b3\u0000"+
		"\u0000\u0156\u0157\u0005s\u0000\u0000\u0157\u015b\u0005\u00b3\u0000\u0000"+
		"\u0158\u015a\u0003\"\u0011\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a"+
		"\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0005u\u0000\u0000\u015f\u0161"+
		"\u0005z\u0000\u0000\u0160\u014a\u0001\u0000\u0000\u0000\u0160\u0152\u0001"+
		"\u0000\u0000\u0000\u0161\u001f\u0001\u0000\u0000\u0000\u0162\u0163\u0005"+
		"y\u0000\u0000\u0163\u0168\u0005\u00b3\u0000\u0000\u0164\u0165\u0005v\u0000"+
		"\u0000\u0165\u0167\u0005\u00b3\u0000\u0000\u0166\u0164\u0001\u0000\u0000"+
		"\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000"+
		"\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016c\u0005z\u0000\u0000"+
		"\u016c!\u0001\u0000\u0000\u0000\u016d\u016e\u0005u\u0000\u0000\u016e\u016f"+
		"\u0005\u007f\u0000\u0000\u016f\u0170\u0005a\u0000\u0000\u0170\u0171\u0005"+
		"\u00b3\u0000\u0000\u0171\u0172\u0005s\u0000\u0000\u0172\u0173\u0005\u00b3"+
		"\u0000\u0000\u0173#\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0080\u0000"+
		"\u0000\u0175\u0176\u0005\u0083\u0000\u0000\u0176\u0177\u0005\u00b3\u0000"+
		"\u0000\u0177\u0178\u0005y\u0000\u0000\u0178\u0179\u0005z\u0000\u0000\u0179"+
		"%\u0001\u0000\u0000\u0000\u017a\u017c\u0003F#\u0000\u017b\u017a\u0001"+
		"\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0181\u0001"+
		"\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0182\u0003"+
		"$\u0012\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0186\u0001\u0000\u0000\u0000\u0183\u0185\u0003(\u0014"+
		"\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000\u0000"+
		"\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\'\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0003\u001c\u000e\u0000\u018a\u0195\u0005y\u0000\u0000\u018b"+
		"\u018d\u0003\u001e\u000f\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		"\u0192\u0003\u001a\r\u0000\u018f\u0191\u0003*\u0015\u0000\u0190\u018f"+
		"\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0196"+
		"\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u018c"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0005z\u0000\u0000\u0198)\u0001\u0000"+
		"\u0000\u0000\u0199\u019d\u0003\b\u0004\u0000\u019a\u019d\u0003\u0018\f"+
		"\u0000\u019b\u019d\u0003\u00a0P\u0000\u019c\u0199\u0001\u0000\u0000\u0000"+
		"\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000"+
		"\u019d+\u0001\u0000\u0000\u0000\u019e\u019f\u0005\'\u0000\u0000\u019f"+
		"\u01a0\u0005w\u0000\u0000\u01a0\u01a1\u0005+\u0000\u0000\u01a1\u01a2\u0005"+
		"`\u0000\u0000\u01a2\u01a3\u0005w\u0000\u0000\u01a3\u01a4\u0005q\u0000"+
		"\u0000\u01a4\u01a5\u0005x\u0000\u0000\u01a5\u01a6\u0005m\u0000\u0000\u01a6"+
		"\u01a7\u0005\u00b3\u0000\u0000\u01a7\u01a8\u0005w\u0000\u0000\u01a8\u01a9"+
		"\u0005x\u0000\u0000\u01a9\u01aa\u0005v\u0000\u0000\u01aa\u01ab\u0003`"+
		"0\u0000\u01ab\u01ac\u0005x\u0000\u0000\u01ac-\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0005(\u0000\u0000\u01ae\u01af\u0005\b\u0000\u0000\u01af"+
		"\u01b0\u0005\u00b3\u0000\u0000\u01b0\u01b1\u0005v\u0000\u0000\u01b1\u01b2"+
		"\u0005\u00b3\u0000\u0000\u01b2\u01b3\u0005\u0007\u0000\u0000\u01b3\u01b4"+
		"\u0005w\u0000\u0000\u01b4\u01b5\u00030\u0018\u0000\u01b5\u01b6\u0005v"+
		"\u0000\u0000\u01b6\u01b7\u00032\u0019\u0000\u01b7\u01b8\u0005x\u0000\u0000"+
		"\u01b8/\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005)\u0000\u0000\u01ba\u01bb"+
		"\u0005`\u0000\u0000\u01bb\u01bc\u0005w\u0000\u0000\u01bc\u01bd\u0005q"+
		"\u0000\u0000\u01bd\u01be\u0005v\u0000\u0000\u01be\u01bf\u0005,\u0000\u0000"+
		"\u01bf\u01c0\u0005x\u0000\u0000\u01c0\u01c1\u0005y\u0000\u0000\u01c1\u01c2"+
		"\u0005z\u0000\u0000\u01c21\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005*"+
		"\u0000\u0000\u01c4\u01c5\u0005`\u0000\u0000\u01c5\u01c6\u0005w\u0000\u0000"+
		"\u01c6\u01c7\u0005q\u0000\u0000\u01c7\u01c8\u0005v\u0000\u0000\u01c8\u01c9"+
		"\u0005,\u0000\u0000\u01c9\u01ca\u0005x\u0000\u0000\u01ca\u01cb\u0005y"+
		"\u0000\u0000\u01cb\u01cc\u0005\u00a8\u0000\u0000\u01cc\u01cd\u0003^/\u0000"+
		"\u01cd\u01ce\u0005u\u0000\u0000\u01ce\u01cf\u0005z\u0000\u0000\u01cf3"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005/\u0000\u0000\u01d1\u01d2\u0005"+
		"w\u0000\u0000\u01d2\u01d3\u0005*\u0000\u0000\u01d3\u01d4\u0005`\u0000"+
		"\u0000\u01d4\u01d5\u0005w\u0000\u0000\u01d5\u01d6\u0005q\u0000\u0000\u01d6"+
		"\u01d7\u0005x\u0000\u0000\u01d7\u01d8\u0005m\u0000\u0000\u01d8\u01d9\u0005"+
		"\u00b3\u0000\u0000\u01d9\u01e6\u0005w\u0000\u0000\u01da\u01db\u0005\u00b3"+
		"\u0000\u0000\u01db\u01dc\u0005`\u0000\u0000\u01dc\u01e3\u0005\u00b3\u0000"+
		"\u0000\u01dd\u01de\u0005v\u0000\u0000\u01de\u01df\u0005\u00b3\u0000\u0000"+
		"\u01df\u01e0\u0005`\u0000\u0000\u01e0\u01e2\u0005\u00b3\u0000\u0000\u01e1"+
		"\u01dd\u0001\u0000\u0000\u0000\u01e2\u01e5\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e6"+
		"\u01da\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005x\u0000\u0000\u01e9\u01ea"+
		"\u0005x\u0000\u0000\u01ea5\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005-"+
		"\u0000\u0000\u01ec\u01ed\u0005a\u0000\u0000\u01ed\u01ee\u0005.\u0000\u0000"+
		"\u01ee\u01ef\u0005w\u0000\u0000\u01ef\u01f0\u0005q\u0000\u0000\u01f0\u01f1"+
		"\u0005v\u0000\u0000\u01f1\u01f2\u00034\u001a\u0000\u01f2\u01f3\u0005x"+
		"\u0000\u0000\u01f37\u0001\u0000\u0000\u0000\u01f4\u01f5\u00050\u0000\u0000"+
		"\u01f5\u01f6\u0005`\u0000\u0000\u01f6\u01f7\u0005w\u0000\u0000\u01f7\u01f8"+
		"\u0005x\u0000\u0000\u01f8\u01fc\u0005y\u0000\u0000\u01f9\u01fb\u0003\b"+
		"\u0004\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fd\u0202\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u00036\u001b\u0000\u0200\u0201\u0005u\u0000\u0000"+
		"\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01ff\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0005z\u0000\u0000\u02059\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u00052\u0000\u0000\u0207\u0208\u0005`\u0000\u0000\u0208\u0209\u0005t"+
		"\u0000\u0000\u0209;\u0001\u0000\u0000\u0000\u020a\u020b\u00053\u0000\u0000"+
		"\u020b\u020c\u0005`\u0000\u0000\u020c\u020d\u0003^/\u0000\u020d=\u0001"+
		"\u0000\u0000\u0000\u020e\u020f\u0005:\u0000\u0000\u020f\u0210\u0005w\u0000"+
		"\u0000\u0210\u0211\u0005x\u0000\u0000\u0211?\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0005\u001b\u0000\u0000\u0213\u0214\u0005w\u0000\u0000\u0214\u0215"+
		"\u0005V\u0000\u0000\u0215\u0216\u0005\u00b3\u0000\u0000\u0216\u0217\u0005"+
		"s\u0000\u0000\u0217\u0218\u0003\u000e\u0007\u0000\u0218\u0219\u0005u\u0000"+
		"\u0000\u0219\u021a\u0005\u00b3\u0000\u0000\u021a\u021b\u0003B!\u0000\u021b"+
		"\u021c\u0003\u000e\u0007\u0000\u021c\u021d\u0005u\u0000\u0000\u021d\u021e"+
		"\u0005\u00b3\u0000\u0000\u021e\u021f\u0003B!\u0000\u021f\u0220\u0005x"+
		"\u0000\u0000\u0220\u0222\u0005y\u0000\u0000\u0221\u0223\u0003\b\u0004"+
		"\u0000\u0222\u0221\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0225\u0005z\u0000\u0000"+
		"\u0225A\u0001\u0000\u0000\u0000\u0226\u0227\u0007\u0002\u0000\u0000\u0227"+
		"C\u0001\u0000\u0000\u0000\u0228\u022a\u0003F#\u0000\u0229\u0228\u0001"+
		"\u0000\u0000\u0000\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u0229\u0001"+
		"\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022e\u0001"+
		"\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0232\u0003"+
		"H$\u0000\u022f\u0231\u0003L&\u0000\u0230\u022f\u0001\u0000\u0000\u0000"+
		"\u0231\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0238\u0001\u0000\u0000\u0000"+
		"\u0234\u0232\u0001\u0000\u0000\u0000\u0235\u0237\u0003\u00a0P\u0000\u0236"+
		"\u0235\u0001\u0000\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238"+
		"\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239"+
		"E\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023c"+
		"\u0005\u0096\u0000\u0000\u023c\u023d\u0003\u0004\u0002\u0000\u023d\u023e"+
		"\u0005u\u0000\u0000\u023eG\u0001\u0000\u0000\u0000\u023f\u0240\u0005U"+
		"\u0000\u0000\u0240\u0241\u0005F\u0000\u0000\u0241\u0242\u0005w\u0000\u0000"+
		"\u0242\u0243\u0005x\u0000\u0000\u0243\u0244\u0005y\u0000\u0000\u0244\u0245"+
		"\u0003J%\u0000\u0245\u0246\u0005z\u0000\u0000\u0246I\u0001\u0000\u0000"+
		"\u0000\u0247\u0248\u0005H\u0000\u0000\u0248\u0249\u0005w\u0000\u0000\u0249"+
		"\u024a\u0005\u00b3\u0000\u0000\u024a\u024b\u0005w\u0000\u0000\u024b\u024c"+
		"\u0005x\u0000\u0000\u024c\u024d\u0005x\u0000\u0000\u024d\u024e\u0005u"+
		"\u0000\u0000\u024eK\u0001\u0000\u0000\u0000\u024f\u0251\u0003F#\u0000"+
		"\u0250\u024f\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000"+
		"\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000"+
		"\u0253\u0257\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000"+
		"\u0255\u0258\u0003N\'\u0000\u0256\u0258\u0003P(\u0000\u0257\u0255\u0001"+
		"\u0000\u0000\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0258M\u0001\u0000"+
		"\u0000\u0000\u0259\u025a\u0005\u0083\u0000\u0000\u025a\u025b\u0005\u00b3"+
		"\u0000\u0000\u025b\u025c\u0005\u008d\u0000\u0000\u025c\u025d\u0005\u0019"+
		"\u0000\u0000\u025d\u0261\u0005y\u0000\u0000\u025e\u0260\u0003*\u0015\u0000"+
		"\u025f\u025e\u0001\u0000\u0000\u0000\u0260\u0263\u0001\u0000\u0000\u0000"+
		"\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000"+
		"\u0262\u0265\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000"+
		"\u0264\u0266\u0003\u001e\u000f\u0000\u0265\u0264\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000"+
		"\u0267\u0268\u0005K\u0000\u0000\u0268\u0269\u0003\\.\u0000\u0269\u026a"+
		"\u0005z\u0000\u0000\u026aO\u0001\u0000\u0000\u0000\u026b\u026c\u0003R"+
		")\u0000\u026c\u026d\u0003X,\u0000\u026dQ\u0001\u0000\u0000\u0000\u026e"+
		"\u026f\u0005\u0083\u0000\u0000\u026f\u0270\u0005\u00b3\u0000\u0000\u0270"+
		"\u0271\u0005\u008d\u0000\u0000\u0271\u0272\u0005\u0018\u0000\u0000\u0272"+
		"\u0274\u0005y\u0000\u0000\u0273\u0275\u0003T*\u0000\u0274\u0273\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0001"+
		"\u0000\u0000\u0000\u0276\u0277\u0005K\u0000\u0000\u0277\u0278\u0003V+"+
		"\u0000\u0278\u0279\u0005z\u0000\u0000\u0279S\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0005|\u0000\u0000\u027b\u027c\u0005\u00b3\u0000\u0000\u027c\u027d"+
		"\u0005w\u0000\u0000\u027d\u027e\u0005y\u0000\u0000\u027e\u027f\u0005\u0017"+
		"\u0000\u0000\u027f\u0280\u0005\u0014\u0000\u0000\u0280\u0281\u0005\u0017"+
		"\u0000\u0000\u0281\u0282\u0005z\u0000\u0000\u0282\u0283\u0005x\u0000\u0000"+
		"\u0283\u0284\u0005`\u0000\u0000\u0284\u0285\u0005\u008b\u0000\u0000\u0285"+
		"\u0286\u0005w\u0000\u0000\u0286\u0287\u0005\u0017\u0000\u0000\u0287\u0288"+
		"\u0005`\u0000\u0000\u0288\u0289\u0005\u0017\u0000\u0000\u0289\u028a\u0005"+
		"x\u0000\u0000\u028a\u028b\u0005u\u0000\u0000\u028bU\u0001\u0000\u0000"+
		"\u0000\u028c\u028d\u0005\u0015\u0000\u0000\u028d\u028e\u0005\b\u0000\u0000"+
		"\u028e\u028f\u0005\u00b3\u0000\u0000\u028f\u0290\u0005\u0007\u0000\u0000"+
		"\u0290\u0291\u0005\u0016\u0000\u0000\u0291\u0292\u0005w\u0000\u0000\u0292"+
		"\u0293\u0005x\u0000\u0000\u0293\u0294\u0005m\u0000\u0000\u0294\u0295\u0005"+
		"\u00b3\u0000\u0000\u0295\u0296\u0005w\u0000\u0000\u0296\u0297\u0005x\u0000"+
		"\u0000\u0297\u0298\u0005u\u0000\u0000\u0298W\u0001\u0000\u0000\u0000\u0299"+
		"\u029a\u0005\u0083\u0000\u0000\u029a\u029b\u0005\u00b3\u0000\u0000\u029b"+
		"\u029c\u0005\u008d\u0000\u0000\u029c\u029d\u0005\u0015\u0000\u0000\u029d"+
		"\u029e\u0005\b\u0000\u0000\u029e\u029f\u0005\u00b3\u0000\u0000\u029f\u02a0"+
		"\u0005\u0007\u0000\u0000\u02a0\u02a4\u0005y\u0000\u0000\u02a1\u02a3\u0003"+
		"\b\u0004\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a7\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a8\u0005K\u0000\u0000\u02a8\u02a9\u0003Z-\u0000"+
		"\u02a9\u02aa\u0005K\u0000\u0000\u02aa\u02ab\u0003\\.\u0000\u02ab\u02ac"+
		"\u0005z\u0000\u0000\u02acY\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005U"+
		"\u0000\u0000\u02ae\u02af\u0005\u0001\u0000\u0000\u02af\u02b0\u0005w\u0000"+
		"\u0000\u02b0\u02b1\u0005x\u0000\u0000\u02b1\u02b2\u0005y\u0000\u0000\u02b2"+
		"\u02b3\u0005\u008b\u0000\u0000\u02b3\u02b4\u0005a\u0000\u0000\u02b4\u02b5"+
		"\u0005\u0001\u0000\u0000\u02b5\u02b6\u0005w\u0000\u0000\u02b6\u02b7\u0005"+
		"x\u0000\u0000\u02b7\u02b8\u0005u\u0000\u0000\u02b8\u02b9\u0005z\u0000"+
		"\u0000\u02b9[\u0001\u0000\u0000\u0000\u02ba\u02bb\u0005O\u0000\u0000\u02bb"+
		"\u02bc\u0005J\u0000\u0000\u02bc\u02bd\u0005w\u0000\u0000\u02bd\u02be\u0005"+
		"P\u0000\u0000\u02be\u02bf\u0005q\u0000\u0000\u02bf\u02c0\u0005x\u0000"+
		"\u0000\u02c0\u02c1\u0005y\u0000\u0000\u02c1\u02c2\u0005\u00a8\u0000\u0000"+
		"\u02c2\u02c3\u0003^/\u0000\u02c3\u02c4\u0005u\u0000\u0000\u02c4\u02c5"+
		"\u0005z\u0000\u0000\u02c5]\u0001\u0000\u0000\u0000\u02c6\u02d7\u0003r"+
		"9\u0000\u02c7\u02d7\u0003v;\u0000\u02c8\u02d7\u0003l6\u0000\u02c9\u02d7"+
		"\u0003n7\u0000\u02ca\u02d7\u0003|>\u0000\u02cb\u02d7\u0003b1\u0000\u02cc"+
		"\u02d7\u0003\u0096K\u0000\u02cd\u02d7\u0003\u008eG\u0000\u02ce\u02d7\u0003"+
		"\u0086C\u0000\u02cf\u02d7\u0003\u00a6S\u0000\u02d0\u02d7\u0003\u0084B"+
		"\u0000\u02d1\u02d7\u0003\u0088D\u0000\u02d2\u02d7\u0003.\u0017\u0000\u02d3"+
		"\u02d7\u0003,\u0016\u0000\u02d4\u02d7\u00034\u001a\u0000\u02d5\u02d7\u0003"+
		">\u001f\u0000\u02d6\u02c6\u0001\u0000\u0000\u0000\u02d6\u02c7\u0001\u0000"+
		"\u0000\u0000\u02d6\u02c8\u0001\u0000\u0000\u0000\u02d6\u02c9\u0001\u0000"+
		"\u0000\u0000\u02d6\u02ca\u0001\u0000\u0000\u0000\u02d6\u02cb\u0001\u0000"+
		"\u0000\u0000\u02d6\u02cc\u0001\u0000\u0000\u0000\u02d6\u02cd\u0001\u0000"+
		"\u0000\u0000\u02d6\u02ce\u0001\u0000\u0000\u0000\u02d6\u02cf\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d0\u0001\u0000\u0000\u0000\u02d6\u02d1\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d2\u0001\u0000\u0000\u0000\u02d6\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d7_\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005\\\u0000"+
		"\u0000\u02d9\u02da\u0005`\u0000\u0000\u02da\u02db\u0003^/\u0000\u02db"+
		"a\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005\u00b0\u0000\u0000\u02dd\u02e1"+
		"\u0005w\u0000\u0000\u02de\u02df\u0003f3\u0000\u02df\u02e0\u0005v\u0000"+
		"\u0000\u02e0\u02e2\u0001\u0000\u0000\u0000\u02e1\u02de\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e4\u0003h4\u0000\u02e4\u02e5\u0005v\u0000\u0000\u02e5"+
		"\u02e7\u0001\u0000\u0000\u0000\u02e6\u02e3\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e7\u0001\u0000\u0000\u0000\u02e7\u02eb\u0001\u0000\u0000\u0000\u02e8"+
		"\u02e9\u0003j5\u0000\u02e9\u02ea\u0005v\u0000\u0000\u02ea\u02ec\u0001"+
		"\u0000\u0000\u0000\u02eb\u02e8\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ee\u0003"+
		"d2\u0000\u02ee\u02ef\u0005x\u0000\u0000\u02efc\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0005\u00b1\u0000\u0000\u02f1\u02f2\u0005`\u0000\u0000\u02f2"+
		"\u02f3\u0005\u00b3\u0000\u0000\u02f3\u02f4\u0005w\u0000\u0000\u02f4\u02f5"+
		"\u0005x\u0000\u0000\u02f5e\u0001\u0000\u0000\u0000\u02f6\u02f7\u0005\u0002"+
		"\u0000\u0000\u02f7\u02f8\u0005`\u0000\u0000\u02f8\u02f9\u0003\u0004\u0002"+
		"\u0000\u02f9g\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005\u0003\u0000\u0000"+
		"\u02fb\u02fc\u0005`\u0000\u0000\u02fc\u02fd\u0005\u0005\u0000\u0000\u02fd"+
		"\u02fe\u0005w\u0000\u0000\u02fe\u02ff\u0005\u0006\u0000\u0000\u02ff\u0300"+
		"\u0005`\u0000\u0000\u0300\u0301\u0003\u009cN\u0000\u0301\u0302\u0005v"+
		"\u0000\u0000\u0302\u0303\u0005x\u0000\u0000\u0303i\u0001\u0000\u0000\u0000"+
		"\u0304\u0305\u0005\u0004\u0000\u0000\u0305\u0306\u0005`\u0000\u0000\u0306"+
		"\u0307\u0005Y\u0000\u0000\u0307k\u0001\u0000\u0000\u0000\u0308\u0309\u0005"+
		" \u0000\u0000\u0309\u0315\u0005w\u0000\u0000\u030a\u030b\u0005n\u0000"+
		"\u0000\u030b\u030c\u0005o\u0000\u0000\u030c\u030d\u0005a\u0000\u0000\u030d"+
		"\u030e\u0005p\u0000\u0000\u030e\u0316\u0005v\u0000\u0000\u030f\u0310\u0005"+
		"7\u0000\u0000\u0310\u0311\u0005`\u0000\u0000\u0311\u0312\u00058\u0000"+
		"\u0000\u0312\u0313\u0005a\u0000\u0000\u0313\u0314\u00059\u0000\u0000\u0314"+
		"\u0316\u0005v\u0000\u0000\u0315\u030a\u0001\u0000\u0000\u0000\u0315\u030f"+
		"\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0317"+
		"\u0001\u0000\u0000\u0000\u0317\u0318\u0003p8\u0000\u0318\u0319\u0005x"+
		"\u0000\u0000\u0319m\u0001\u0000\u0000\u0000\u031a\u031b\u0005!\u0000\u0000"+
		"\u031b\u031c\u0005w\u0000\u0000\u031c\u031d\u0003p8\u0000\u031d\u031e"+
		"\u0005x\u0000\u0000\u031eo\u0001\u0000\u0000\u0000\u031f\u0320\u0005\u001d"+
		"\u0000\u0000\u0320\u0321\u0005`\u0000\u0000\u0321\u0339\u0005\u001e\u0000"+
		"\u0000\u0322\u032a\u0003\u0010\b\u0000\u0323\u0324\u0005v\u0000\u0000"+
		"\u0324\u0325\u0003^/\u0000\u0325\u0326\u0005v\u0000\u0000\u0326\u0327"+
		"\u0003\u0010\b\u0000\u0327\u0329\u0001\u0000\u0000\u0000\u0328\u0323\u0001"+
		"\u0000\u0000\u0000\u0329\u032c\u0001\u0000\u0000\u0000\u032a\u0328\u0001"+
		"\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032e\u0001"+
		"\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032d\u0322\u0001"+
		"\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u033a\u0001"+
		"\u0000\u0000\u0000\u032f\u0334\u0003^/\u0000\u0330\u0331\u0005v\u0000"+
		"\u0000\u0331\u0333\u0003^/\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0333"+
		"\u0336\u0001\u0000\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0334"+
		"\u0335\u0001\u0000\u0000\u0000\u0335\u0338\u0001\u0000\u0000\u0000\u0336"+
		"\u0334\u0001\u0000\u0000\u0000\u0337\u032f\u0001\u0000\u0000\u0000\u0337"+
		"\u0338\u0001\u0000\u0000\u0000\u0338\u033a\u0001\u0000\u0000\u0000\u0339"+
		"\u032d\u0001\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u033a"+
		"\u033b\u0001\u0000\u0000\u0000\u033b\u033c\u0005\u001f\u0000\u0000\u033c"+
		"q\u0001\u0000\u0000\u0000\u033d\u033e\u0005\u001c\u0000\u0000\u033e\u0356"+
		"\u0005w\u0000\u0000\u033f\u0357\u0003\u0004\u0002\u0000\u0340\u0341\u0005"+
		"\u00b3\u0000\u0000\u0341\u0342\u0005a\u0000\u0000\u0342\u0343\u0005\u0088"+
		"\u0000\u0000\u0343\u0344\u0005w\u0000\u0000\u0344\u0345\u0005q\u0000\u0000"+
		"\u0345\u0346\u0005x\u0000\u0000\u0346\u0348\u0005a\u0000\u0000\u0347\u0340"+
		"\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348\u0349"+
		"\u0001\u0000\u0000\u0000\u0349\u034b\u0005\u00b3\u0000\u0000\u034a\u034c"+
		"\u00051\u0000\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034b\u034c\u0001"+
		"\u0000\u0000\u0000\u034c\u0354\u0001\u0000\u0000\u0000\u034d\u034e\u0005"+
		"\u001e\u0000\u0000\u034e\u034f\u0005r\u0000\u0000\u034f\u0350\u0005\u001f"+
		"\u0000\u0000\u0350\u0351\u0005\u001e\u0000\u0000\u0351\u0352\u0003\u0004"+
		"\u0002\u0000\u0352\u0353\u0005\u001f\u0000\u0000\u0353\u0355\u0001\u0000"+
		"\u0000\u0000\u0354\u034d\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000"+
		"\u0000\u0000\u0355\u0357\u0001\u0000\u0000\u0000\u0356\u033f\u0001\u0000"+
		"\u0000\u0000\u0356\u0347\u0001\u0000\u0000\u0000\u0357\u035a\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u0005v\u0000\u0000\u0359\u035b\u0003t:\u0000"+
		"\u035a\u0358\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000"+
		"\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u035d\u0005x\u0000\u0000\u035d"+
		"s\u0001\u0000\u0000\u0000\u035e\u035f\u0005?\u0000\u0000\u035f\u0360\u0005"+
		"`\u0000\u0000\u0360\u0361\u0005@\u0000\u0000\u0361\u0362\u0005w\u0000"+
		"\u0000\u0362\u0363\u0005<\u0000\u0000\u0363\u0364\u0005`\u0000\u0000\u0364"+
		"\u0365\u0005=\u0000\u0000\u0365\u0366\u0005a\u0000\u0000\u0366\u0367\u0005"+
		">\u0000\u0000\u0367\u0368\u0005v\u0000\u0000\u0368\u0369\u0005;\u0000"+
		"\u0000\u0369\u036a\u0005`\u0000\u0000\u036a\u036b\u0005t\u0000\u0000\u036b"+
		"\u036c\u0005x\u0000\u0000\u036cu\u0001\u0000\u0000\u0000\u036d\u036e\u0005"+
		"B\u0000\u0000\u036e\u036f\u0005A\u0000\u0000\u036f\u0390\u0005w\u0000"+
		"\u0000\u0370\u0391\u0003\u0004\u0002\u0000\u0371\u0372\u0005w\u0000\u0000"+
		"\u0372\u0373\u0005\u00b3\u0000\u0000\u0373\u037e\u0005x\u0000\u0000\u0374"+
		"\u0375\u0005\u00b3\u0000\u0000\u0375\u0376\u0005\u001e\u0000\u0000\u0376"+
		"\u0377\u0005r\u0000\u0000\u0377\u0378\u0005\u001f\u0000\u0000\u0378\u0379"+
		"\u0005\u001e\u0000\u0000\u0379\u037a\u0003\u0004\u0002\u0000\u037a\u037b"+
		"\u0005\u001f\u0000\u0000\u037b\u037e\u0001\u0000\u0000\u0000\u037c\u037e"+
		"\u0003z=\u0000\u037d\u0371\u0001\u0000\u0000\u0000\u037d\u0374\u0001\u0000"+
		"\u0000\u0000\u037d\u037c\u0001\u0000\u0000\u0000\u037e\u0391\u0001\u0000"+
		"\u0000\u0000\u037f\u0380\u0005\u00b3\u0000\u0000\u0380\u0381\u0005a\u0000"+
		"\u0000\u0381\u0382\u0005\u0088\u0000\u0000\u0382\u0383\u0005w\u0000\u0000"+
		"\u0383\u0384\u0005q\u0000\u0000\u0384\u0385\u0005x\u0000\u0000\u0385\u0386"+
		"\u0005a\u0000\u0000\u0386\u038e\u0005\u00b3\u0000\u0000\u0387\u0388\u0005"+
		"\u001e\u0000\u0000\u0388\u0389\u0005r\u0000\u0000\u0389\u038a\u0005\u001f"+
		"\u0000\u0000\u038a\u038b\u0005\u001e\u0000\u0000\u038b\u038c\u0003\u0004"+
		"\u0002\u0000\u038c\u038d\u0005\u001f\u0000\u0000\u038d\u038f\u0001\u0000"+
		"\u0000\u0000\u038e\u0387\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000"+
		"\u0000\u0000\u038f\u0391\u0001\u0000\u0000\u0000\u0390\u0370\u0001\u0000"+
		"\u0000\u0000\u0390\u037d\u0001\u0000\u0000\u0000\u0390\u037f\u0001\u0000"+
		"\u0000\u0000\u0391\u0393\u0001\u0000\u0000\u0000\u0392\u0394\u0003x<\u0000"+
		"\u0393\u0392\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000"+
		"\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0396\u0005x\u0000\u0000\u0396"+
		"w\u0001\u0000\u0000\u0000\u0397\u0398\u0005v\u0000\u0000\u0398\u0399\u0005"+
		"\"\u0000\u0000\u0399\u039a\u0005#\u0000\u0000\u039a\u039b\u0005a\u0000"+
		"\u0000\u039b\u039c\u0007\u0003\u0000\u0000\u039cy\u0001\u0000\u0000\u0000"+
		"\u039d\u039f\u0005\u00b3\u0000\u0000\u039e\u03a0\u00051\u0000\u0000\u039f"+
		"\u039e\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0"+
		"{\u0001\u0000\u0000\u0000\u03a1\u03a2\u0005\u0013\u0000\u0000\u03a2\u03a6"+
		"\u0005w\u0000\u0000\u03a3\u03a4\u0003~?\u0000\u03a4\u03a5\u0005v\u0000"+
		"\u0000\u03a5\u03a7\u0001\u0000\u0000\u0000\u03a6\u03a3\u0001\u0000\u0000"+
		"\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000"+
		"\u0000\u03a8\u03a9\u0003\u0080@\u0000\u03a9\u03aa\u0005x\u0000\u0000\u03aa"+
		"}\u0001\u0000\u0000\u0000\u03ab\u03ac\u0005C\u0000\u0000\u03ac\u03ad\u0005"+
		"`\u0000\u0000\u03ad\u03ae\u0005D\u0000\u0000\u03ae\u03b6\u0005w\u0000"+
		"\u0000\u03af\u03b0\u0005E\u0000\u0000\u03b0\u03b1\u0005`\u0000\u0000\u03b1"+
		"\u03b7\u0003\u009cN\u0000\u03b2\u03b3\u0003:\u001d\u0000\u03b3\u03b4\u0005"+
		"v\u0000\u0000\u03b4\u03b5\u0003<\u001e\u0000\u03b5\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b6\u03af\u0001\u0000\u0000\u0000\u03b6\u03b2\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b9\u0005x\u0000\u0000\u03b9\u007f\u0001\u0000\u0000\u0000"+
		"\u03ba\u03bb\u0005G\u0000\u0000\u03bb\u03bc\u0005`\u0000\u0000\u03bc\u03bd"+
		"\u0003^/\u0000\u03bd\u0081\u0001\u0000\u0000\u0000\u03be\u03bf\u0005R"+
		"\u0000\u0000\u03bf\u03c0\u0005S\u0000\u0000\u03c0\u03c1\u0005T\u0000\u0000"+
		"\u03c1\u03c2\u0005w\u0000\u0000\u03c2\u03c3\u0005t\u0000\u0000\u03c3\u03c4"+
		"\u0005x\u0000\u0000\u03c4\u0083\u0001\u0000\u0000\u0000\u03c5\u03c6\u0005"+
		"Q\u0000\u0000\u03c6\u03c7\u0005w\u0000\u0000\u03c7\u03ca\u0003\u0082A"+
		"\u0000\u03c8\u03c9\u0005v\u0000\u0000\u03c9\u03cb\u0003`0\u0000\u03ca"+
		"\u03c8\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000\u03cb"+
		"\u03cc\u0001\u0000\u0000\u0000\u03cc\u03cd\u0005x\u0000\u0000\u03cd\u0085"+
		"\u0001\u0000\u0000\u0000\u03ce\u03cf\u0005c\u0000\u0000\u03cf\u03d0\u0005"+
		"w\u0000\u0000\u03d0\u03d1\u0003`0\u0000\u03d1\u03d2\u0005x\u0000\u0000"+
		"\u03d2\u0087\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005Z\u0000\u0000\u03d4"+
		"\u03e5\u0005w\u0000\u0000\u03d5\u03d6\u0003\u008aE\u0000\u03d6\u03d7\u0005"+
		"v\u0000\u0000\u03d7\u03d9\u0001\u0000\u0000\u0000\u03d8\u03d5\u0001\u0000"+
		"\u0000\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9\u03db\u0001\u0000"+
		"\u0000\u0000\u03da\u03dc\u0003\u008cF\u0000\u03db\u03da\u0001\u0000\u0000"+
		"\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03e6\u0001\u0000\u0000"+
		"\u0000\u03dd\u03de\u0003\u008cF\u0000\u03de\u03df\u0005v\u0000\u0000\u03df"+
		"\u03e1\u0001\u0000\u0000\u0000\u03e0\u03dd\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e3\u0001\u0000\u0000\u0000\u03e2"+
		"\u03e4\u0003\u008aE\u0000\u03e3\u03e2\u0001\u0000\u0000\u0000\u03e3\u03e4"+
		"\u0001\u0000\u0000\u0000\u03e4\u03e6\u0001\u0000\u0000\u0000\u03e5\u03d8"+
		"\u0001\u0000\u0000\u0000\u03e5\u03e0\u0001\u0000\u0000\u0000\u03e5\u03e6"+
		"\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7\u03e8"+
		"\u0005x\u0000\u0000\u03e8\u0089\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005"+
		"W\u0000\u0000\u03ea\u03eb\u0005`\u0000\u0000\u03eb\u03ec\u0005t\u0000"+
		"\u0000\u03ec\u008b\u0001\u0000\u0000\u0000\u03ed\u03ee\u0005X\u0000\u0000"+
		"\u03ee\u03f3\u0005`\u0000\u0000\u03ef\u03f4\u0005t\u0000\u0000\u03f0\u03f1"+
		"\u00054\u0000\u0000\u03f1\u03f2\u0005a\u0000\u0000\u03f2\u03f4\u00055"+
		"\u0000\u0000\u03f3\u03ef\u0001\u0000\u0000\u0000\u03f3\u03f0\u0001\u0000"+
		"\u0000\u0000\u03f4\u008d\u0001\u0000\u0000\u0000\u03f5\u03f6\u0005h\u0000"+
		"\u0000\u03f6\u03f7\u0005a\u0000\u0000\u03f7\u03f8\u0005i\u0000\u0000\u03f8"+
		"\u03f9\u0005w\u0000\u0000\u03f9\u03fa\u0003\u0090H\u0000\u03fa\u03fb\u0003"+
		"^/\u0000\u03fb\u03fc\u0005v\u0000\u0000\u03fc\u03fd\u0003\u0092I\u0000"+
		"\u03fd\u03fe\u0003^/\u0000\u03fe\u03ff\u0005v\u0000\u0000\u03ff\u0400"+
		"\u0003\u0094J\u0000\u0400\u0401\u0001\u0000\u0000\u0000\u0401\u0402\u0005"+
		"x\u0000\u0000\u0402\u008f\u0001\u0000\u0000\u0000\u0403\u0404\u0005j\u0000"+
		"\u0000\u0404\u0405\u0005`\u0000\u0000\u0405\u0406\u0005w\u0000\u0000\u0406"+
		"\u0407\u0005q\u0000\u0000\u0407\u0408\u0005v\u0000\u0000\u0408\u0409\u0005"+
		"r\u0000\u0000\u0409\u040a\u0005x\u0000\u0000\u040a\u040b\u0005m\u0000"+
		"\u0000\u040b\u0091\u0001\u0000\u0000\u0000\u040c\u040d\u0005k\u0000\u0000"+
		"\u040d\u040e\u0005`\u0000\u0000\u040e\u040f\u0005w\u0000\u0000\u040f\u0410"+
		"\u0005q\u0000\u0000\u0410\u0411\u0005v\u0000\u0000\u0411\u0412\u0005r"+
		"\u0000\u0000\u0412\u0413\u0005x\u0000\u0000\u0413\u0414\u0005m\u0000\u0000"+
		"\u0414\u0093\u0001\u0000\u0000\u0000\u0415\u0416\u0005l\u0000\u0000\u0416"+
		"\u0417\u0005`\u0000\u0000\u0417\u042a\u0005t\u0000\u0000\u0418\u0419\u0005"+
		"l\u0000\u0000\u0419\u041a\u0005`\u0000\u0000\u041a\u041b\u0005\u00b3\u0000"+
		"\u0000\u041b\u041c\u0005a\u0000\u0000\u041c\u042a\u0005\u00b3\u0000\u0000"+
		"\u041d\u041e\u0005l\u0000\u0000\u041e\u041f\u0005`\u0000\u0000\u041f\u0420"+
		"\u0005\u00b3\u0000\u0000\u0420\u0421\u0005a\u0000\u0000\u0421\u0422\u0005"+
		"\u0088\u0000\u0000\u0422\u0423\u0005w\u0000\u0000\u0423\u0424\u0005q\u0000"+
		"\u0000\u0424\u0425\u0005x\u0000\u0000\u0425\u0426\u0005a\u0000\u0000\u0426"+
		"\u0427\u0005\u00b3\u0000\u0000\u0427\u0428\u0005a\u0000\u0000\u0428\u042a"+
		"\u0005\u00b3\u0000\u0000\u0429\u0415\u0001\u0000\u0000\u0000\u0429\u0418"+
		"\u0001\u0000\u0000\u0000\u0429\u041d\u0001\u0000\u0000\u0000\u042a\u0095"+
		"\u0001\u0000\u0000\u0000\u042b\u042c\u0005[\u0000\u0000\u042c\u0430\u0005"+
		"w\u0000\u0000\u042d\u042e\u0003\u0082A\u0000\u042e\u042f\u0005v\u0000"+
		"\u0000\u042f\u0431\u0001\u0000\u0000\u0000\u0430\u042d\u0001\u0000\u0000"+
		"\u0000\u0430\u0431\u0001\u0000\u0000\u0000\u0431\u0435\u0001\u0000\u0000"+
		"\u0000\u0432\u0433\u0003\u008cF\u0000\u0433\u0434\u0005v\u0000\u0000\u0434"+
		"\u0436\u0001\u0000\u0000\u0000\u0435\u0432\u0001\u0000\u0000\u0000\u0435"+
		"\u0436\u0001\u0000\u0000\u0000\u0436\u0438\u0001\u0000\u0000\u0000\u0437"+
		"\u0439\u0003`0\u0000\u0438\u0437\u0001\u0000\u0000\u0000\u0438\u0439\u0001"+
		"\u0000\u0000\u0000\u0439\u043b\u0001\u0000\u0000\u0000\u043a\u043c\u0005"+
		"v\u0000\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043b\u043c\u0001\u0000"+
		"\u0000\u0000\u043c\u043e\u0001\u0000\u0000\u0000\u043d\u043f\u0003\u009e"+
		"O\u0000\u043e\u043d\u0001\u0000\u0000\u0000\u043e\u043f\u0001\u0000\u0000"+
		"\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u0441\u0005x\u0000\u0000"+
		"\u0441\u0097\u0001\u0000\u0000\u0000\u0442\u0443\u0005e\u0000\u0000\u0443"+
		"\u0444\u0005`\u0000\u0000\u0444\u0445\u0005b\u0000\u0000\u0445\u0446\u0005"+
		"a\u0000\u0000\u0446\u0447\u0005d\u0000\u0000\u0447\u0448\u0005w\u0000"+
		"\u0000\u0448\u0449\u0005t\u0000\u0000\u0449\u044a\u0005x\u0000\u0000\u044a"+
		"\u0099\u0001\u0000\u0000\u0000\u044b\u044c\u0005_\u0000\u0000\u044c\u044d"+
		"\u0005`\u0000\u0000\u044d\u044e\u0003\u009cN\u0000\u044e\u009b\u0001\u0000"+
		"\u0000\u0000\u044f\u0450\u0005]\u0000\u0000\u0450\u0451\u0005a\u0000\u0000"+
		"\u0451\u0452\u0005^\u0000\u0000\u0452\u009d\u0001\u0000\u0000\u0000\u0453"+
		"\u0454\u0005f\u0000\u0000\u0454\u0455\u0005`\u0000\u0000\u0455\u0456\u0005"+
		"g\u0000\u0000\u0456\u045a\u0005w\u0000\u0000\u0457\u0459\u0005%\u0000"+
		"\u0000\u0458\u0457\u0001\u0000\u0000\u0000\u0459\u045c\u0001\u0000\u0000"+
		"\u0000\u045a\u0458\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000"+
		"\u0000\u045b\u0463\u0001\u0000\u0000\u0000\u045c\u045a\u0001\u0000\u0000"+
		"\u0000\u045d\u0464\u0003\u009aM\u0000\u045e\u045f\u0003\u009aM\u0000\u045f"+
		"\u0460\u0005v\u0000\u0000\u0460\u0461\u0003\u0098L\u0000\u0461\u0464\u0001"+
		"\u0000\u0000\u0000\u0462\u0464\u0003\u0098L\u0000\u0463\u045d\u0001\u0000"+
		"\u0000\u0000\u0463\u045e\u0001\u0000\u0000\u0000\u0463\u0462\u0001\u0000"+
		"\u0000\u0000\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u0468\u0001\u0000"+
		"\u0000\u0000\u0465\u0467\u0005%\u0000\u0000\u0466\u0465\u0001\u0000\u0000"+
		"\u0000\u0467\u046a\u0001\u0000\u0000\u0000\u0468\u0466\u0001\u0000\u0000"+
		"\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u046b\u0001\u0000\u0000"+
		"\u0000\u046a\u0468\u0001\u0000\u0000\u0000\u046b\u046c\u0005x\u0000\u0000"+
		"\u046c\u009f\u0001\u0000\u0000\u0000\u046d\u046e\u0005I\u0000\u0000\u046e"+
		"\u046f\u0005\u00b3\u0000\u0000\u046f\u0470\u0005s\u0000\u0000\u0470\u0471"+
		"\u0005\u001e\u0000\u0000\u0471\u0476\u0003\u00a2Q\u0000\u0472\u0473\u0005"+
		"v\u0000\u0000\u0473\u0475\u0003\u00a2Q\u0000\u0474\u0472\u0001\u0000\u0000"+
		"\u0000\u0475\u0478\u0001\u0000\u0000\u0000\u0476\u0474\u0001\u0000\u0000"+
		"\u0000\u0476\u0477\u0001\u0000\u0000\u0000\u0477\u0479\u0001\u0000\u0000"+
		"\u0000\u0478\u0476\u0001\u0000\u0000\u0000\u0479\u047a\u0005\u001f\u0000"+
		"\u0000\u047a\u047b\u0005u\u0000\u0000\u047b\u00a1\u0001\u0000\u0000\u0000"+
		"\u047c\u047d\u0005y\u0000\u0000\u047d\u0482\u0003\u00a4R\u0000\u047e\u047f"+
		"\u0005v\u0000\u0000\u047f\u0481\u0003\u00a4R\u0000\u0480\u047e\u0001\u0000"+
		"\u0000\u0000\u0481\u0484\u0001\u0000\u0000\u0000\u0482\u0480\u0001\u0000"+
		"\u0000\u0000\u0482\u0483\u0001\u0000\u0000\u0000\u0483\u0485\u0001\u0000"+
		"\u0000\u0000\u0484\u0482\u0001\u0000\u0000\u0000\u0485\u0486\u0005z\u0000"+
		"\u0000\u0486\u00a3\u0001\u0000\u0000\u0000\u0487\u0488\u0003\u0004\u0002"+
		"\u0000\u0488\u0489\u0005`\u0000\u0000\u0489\u048a\u0003\u0004\u0002\u0000"+
		"\u048a\u00a5\u0001\u0000\u0000\u0000\u048b\u048c\u0005N\u0000\u0000\u048c"+
		"\u048d\u0005w\u0000\u0000\u048d\u048e\u00038\u001c\u0000\u048e\u048f\u0005"+
		"v\u0000\u0000\u048f\u0490\u0003\u00a8T\u0000\u0490\u0491\u0005v\u0000"+
		"\u0000\u0491\u0492\u0003`0\u0000\u0492\u0493\u0005x\u0000\u0000\u0493"+
		"\u00a7\u0001\u0000\u0000\u0000\u0494\u0495\u0005M\u0000\u0000\u0495\u0496"+
		"\u0005`\u0000\u0000\u0496\u0497\u0005w\u0000\u0000\u0497\u0498\u0005x"+
		"\u0000\u0000\u0498\u0499\u0005y\u0000\u0000\u0499\u049a\u0005\u00b3\u0000"+
		"\u0000\u049a\u049b\u0005a\u0000\u0000\u049b\u049c\u0005\u0088\u0000\u0000"+
		"\u049c\u049d\u0005w\u0000\u0000\u049d\u049e\u0005q\u0000\u0000\u049e\u049f"+
		"\u0005x\u0000\u0000\u049f\u04a0\u0005a\u0000\u0000\u04a0\u04a1\u0005\u00b3"+
		"\u0000\u0000\u04a1\u04a2\u0005w\u0000\u0000\u04a2\u04a3\u0005r\u0000\u0000"+
		"\u04a3\u04a4\u0005x\u0000\u0000\u04a4\u04a5\u0005u\u0000\u0000\u04a5\u04a6"+
		"\u0005z\u0000\u0000\u04a6\u00a9\u0001\u0000\u0000\u0000S\u00ac\u00ae\u00bf"+
		"\u00c2\u00c7\u00cd\u00d2\u00d7\u00e1\u00ea\u00f1\u00fc\u0108\u010b\u0110"+
		"\u011d\u0127\u0142\u0147\u015b\u0160\u0168\u017d\u0181\u0186\u018c\u0192"+
		"\u0195\u019c\u01e3\u01e6\u01fc\u0202\u0222\u022b\u0232\u0238\u0252\u0257"+
		"\u0261\u0265\u0274\u02a4\u02d6\u02e1\u02e6\u02eb\u0315\u032a\u032d\u0334"+
		"\u0337\u0339\u0347\u034b\u0354\u0356\u035a\u037d\u038e\u0390\u0393\u039f"+
		"\u03a6\u03b6\u03ca\u03d8\u03db\u03e0\u03e3\u03e5\u03f3\u0429\u0430\u0435"+
		"\u0438\u043b\u043e\u045a\u0463\u0468\u0476\u0482";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}