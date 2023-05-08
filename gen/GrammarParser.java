// Generated from C:/Users/sisin/IdeaProjects/PJP/projekt_PJP/pjp_BIJ0013/src/main/java\Grammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DATOVY_TYP=14, STREDNIK=15, MINUS=16, 
		MODULO=17, SPOJENI_RETEZCU=18, RELACNI_OPERATORY_POROVNANI=19, LOGICKEANDOR=20, 
		LOGICKENOT=21, PRIRAZENI=22, FLOAT=23, INT=24, BOOLEAN=25, VARIABLE=26, 
		STRINGSPECIAL=27, STRINGFIRSTPART=28, STRING=29, COMMENT=30, WS=31;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_firstRule = 2, RULE_condition = 3, 
		RULE_promenne = 4, RULE_datovyTyp = 5, RULE_expression = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "firstRule", "condition", "promenne", "datovyTyp", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", "','", "'write'", "'if'", "'('", "')'", "'{'", "'}'", 
			"'else'", "'while'", "'+'", "'*'", "'/'", null, "';'", "'-'", "'%'", 
			"'.'", null, null, "'!'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "DATOVY_TYP", "STREDNIK", "MINUS", "MODULO", "SPOJENI_RETEZCU", 
			"RELACNI_OPERATORY_POROVNANI", "LOGICKEANDOR", "LOGICKENOT", "PRIRAZENI", 
			"FLOAT", "INT", "BOOLEAN", "VARIABLE", "STRINGSPECIAL", "STRINGFIRSTPART", 
			"STRING", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProg(this);
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
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				stat();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__9) | (1L << DATOVY_TYP) | (1L << LOGICKENOT) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << VARIABLE) | (1L << STRINGSPECIAL) | (1L << STRINGFIRSTPART) | (1L << STRING) | (1L << COMMENT))) != 0) );
			setState(19);
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

	public static class StatContext extends ParserRuleContext {
		public FirstRuleContext firstRule() {
			return getRuleContext(FirstRuleContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__4:
			case DATOVY_TYP:
			case LOGICKENOT:
			case FLOAT:
			case INT:
			case BOOLEAN:
			case VARIABLE:
			case STRINGSPECIAL:
			case STRINGFIRSTPART:
			case STRING:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				firstRule();
				}
				break;
			case T__3:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				condition();
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

	public static class FirstRuleContext extends ParserRuleContext {
		public FirstRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstRule; }
	 
		public FirstRuleContext() { }
		public void copyFrom(FirstRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteVisitorContext extends FirstRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STREDNIK() { return getTokens(GrammarParser.STREDNIK); }
		public TerminalNode STREDNIK(int i) {
			return getToken(GrammarParser.STREDNIK, i);
		}
		public WriteVisitorContext(FirstRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWriteVisitor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWriteVisitor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWriteVisitor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitCommentContext extends FirstRuleContext {
		public TerminalNode COMMENT() { return getToken(GrammarParser.COMMENT, 0); }
		public VisitCommentContext(FirstRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisitComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisitComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadVisitorContext extends FirstRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(GrammarParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(GrammarParser.VARIABLE, i);
		}
		public List<TerminalNode> STREDNIK() { return getTokens(GrammarParser.STREDNIK); }
		public TerminalNode STREDNIK(int i) {
			return getToken(GrammarParser.STREDNIK, i);
		}
		public ReadVisitorContext(FirstRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReadVisitor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReadVisitor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReadVisitor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisiterPromenneContext extends FirstRuleContext {
		public PromenneContext promenne() {
			return getRuleContext(PromenneContext.class,0);
		}
		public List<TerminalNode> STREDNIK() { return getTokens(GrammarParser.STREDNIK); }
		public TerminalNode STREDNIK(int i) {
			return getToken(GrammarParser.STREDNIK, i);
		}
		public VisiterPromenneContext(FirstRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterPromenne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterPromenne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterPromenne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsaContext extends FirstRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> STREDNIK() { return getTokens(GrammarParser.STREDNIK); }
		public TerminalNode STREDNIK(int i) {
			return getToken(GrammarParser.STREDNIK, i);
		}
		public AsaContext(FirstRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAsa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAsa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAsa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstRuleContext firstRule() throws RecognitionException {
		FirstRuleContext _localctx = new FirstRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_firstRule);
		int _la;
		try {
			int _alt;
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ReadVisitorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__0);
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(26);
						match(VARIABLE);
						setState(27);
						match(T__1);
						}
						} 
					}
					setState(32);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(33);
				match(VARIABLE);
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					match(STREDNIK);
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STREDNIK );
				}
				break;
			case 2:
				_localctx = new WriteVisitorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__2);
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(40);
					expression(0);
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(41);
						match(T__1);
						}
					}

					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LOGICKENOT) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << VARIABLE) | (1L << STRINGSPECIAL) | (1L << STRINGFIRSTPART) | (1L << STRING))) != 0) );
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(48);
					match(STREDNIK);
					}
					}
					setState(51); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STREDNIK );
				}
				break;
			case 3:
				_localctx = new VisiterPromenneContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				promenne();
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					match(STREDNIK);
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STREDNIK );
				}
				break;
			case 4:
				_localctx = new AsaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				expression(0);
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(60);
					match(STREDNIK);
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STREDNIK );
				}
				break;
			case 5:
				_localctx = new VisitCommentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(COMMENT);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockVisitorContext extends ConditionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FirstRuleContext> firstRule() {
			return getRuleContexts(FirstRuleContext.class);
		}
		public FirstRuleContext firstRule(int i) {
			return getRuleContext(FirstRuleContext.class,i);
		}
		public BlockVisitorContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlockVisitor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlockVisitor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlockVisitor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfVisitorContext extends ConditionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FirstRuleContext> firstRule() {
			return getRuleContexts(FirstRuleContext.class);
		}
		public FirstRuleContext firstRule(int i) {
			return getRuleContext(FirstRuleContext.class,i);
		}
		public IfVisitorContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfVisitor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfVisitor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfVisitor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileBlockContext extends ConditionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FirstRuleContext> firstRule() {
			return getRuleContexts(FirstRuleContext.class);
		}
		public FirstRuleContext firstRule(int i) {
			return getRuleContext(FirstRuleContext.class,i);
		}
		public WhileBlockContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		int _la;
		try {
			int _alt;
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new BlockVisitorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__3);
				setState(69);
				match(T__4);
				setState(70);
				expression(0);
				setState(71);
				match(T__5);
				setState(72);
				match(T__6);
				setState(73);
				firstRule();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << DATOVY_TYP) | (1L << LOGICKENOT) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << VARIABLE) | (1L << STRINGSPECIAL) | (1L << STRINGFIRSTPART) | (1L << STRING) | (1L << COMMENT))) != 0)) {
					{
					{
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(74);
						match(T__1);
						}
					}

					setState(77);
					firstRule();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new IfVisitorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__3);
				setState(86);
				match(T__4);
				setState(87);
				expression(0);
				setState(88);
				match(T__5);
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						firstRule();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(95);
					match(T__8);
					setState(99);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(96);
							firstRule();
							}
							} 
						}
						setState(101);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					}
				}

				}
				break;
			case 3:
				_localctx = new WhileBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(T__9);
				setState(105);
				match(T__4);
				setState(106);
				expression(0);
				setState(107);
				match(T__5);
				setState(108);
				match(T__6);
				setState(109);
				firstRule();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << DATOVY_TYP) | (1L << LOGICKENOT) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << VARIABLE) | (1L << STRINGSPECIAL) | (1L << STRINGFIRSTPART) | (1L << STRING) | (1L << COMMENT))) != 0)) {
					{
					{
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(110);
						match(T__1);
						}
					}

					setState(113);
					firstRule();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(T__7);
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

	public static class PromenneContext extends ParserRuleContext {
		public PromenneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_promenne; }
	 
		public PromenneContext() { }
		public void copyFrom(PromenneContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InicializacePromenneContext extends PromenneContext {
		public Token op;
		public List<TerminalNode> VARIABLE() { return getTokens(GrammarParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(GrammarParser.VARIABLE, i);
		}
		public List<TerminalNode> PRIRAZENI() { return getTokens(GrammarParser.PRIRAZENI); }
		public TerminalNode PRIRAZENI(int i) {
			return getToken(GrammarParser.PRIRAZENI, i);
		}
		public List<DatovyTypContext> datovyTyp() {
			return getRuleContexts(DatovyTypContext.class);
		}
		public DatovyTypContext datovyTyp(int i) {
			return getRuleContext(DatovyTypContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(GrammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(GrammarParser.MINUS, i);
		}
		public InicializacePromenneContext(PromenneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInicializacePromenne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInicializacePromenne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInicializacePromenne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeklaracePromenneContext extends PromenneContext {
		public TerminalNode DATOVY_TYP() { return getToken(GrammarParser.DATOVY_TYP, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(GrammarParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(GrammarParser.VARIABLE, i);
		}
		public TerminalNode PRIRAZENI() { return getToken(GrammarParser.PRIRAZENI, 0); }
		public List<DatovyTypContext> datovyTyp() {
			return getRuleContexts(DatovyTypContext.class);
		}
		public DatovyTypContext datovyTyp(int i) {
			return getRuleContext(DatovyTypContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(GrammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(GrammarParser.MINUS, i);
		}
		public DeklaracePromenneContext(PromenneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeklaracePromenne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeklaracePromenne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeklaracePromenne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PromenneContext promenne() throws RecognitionException {
		PromenneContext _localctx = new PromenneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_promenne);
		int _la;
		try {
			int _alt;
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATOVY_TYP:
				_localctx = new DeklaracePromenneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(DATOVY_TYP);
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124);
						match(VARIABLE);
						setState(125);
						match(T__1);
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(131);
				match(VARIABLE);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIRAZENI) {
					{
					setState(132);
					match(PRIRAZENI);
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
						{
						{
						setState(133);
						datovyTyp();
						setState(135);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(134);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << MINUS))) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						}
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case VARIABLE:
				_localctx = new InicializacePromenneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(VARIABLE);
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(145);
						match(PRIRAZENI);
						setState(146);
						match(VARIABLE);
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(152);
				match(PRIRAZENI);
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MINUS:
					case FLOAT:
					case INT:
					case BOOLEAN:
					case STRING:
						{
						setState(153);
						datovyTyp();
						}
						break;
					case VARIABLE:
						{
						setState(154);
						match(VARIABLE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(157);
						((InicializacePromenneContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << MINUS))) != 0)) ) {
							((InicializacePromenneContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << VARIABLE) | (1L << STRING))) != 0) );
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

	public static class DatovyTypContext extends ParserRuleContext {
		public DatovyTypContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datovyTyp; }
	 
		public DatovyTypContext() { }
		public void copyFrom(DatovyTypContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VisitPromennaBooleanContext extends DatovyTypContext {
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public VisitPromennaBooleanContext(DatovyTypContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisitPromennaBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisitPromennaBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisitPromennaBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitPromennaFloatContext extends DatovyTypContext {
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public VisitPromennaFloatContext(DatovyTypContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisitPromennaFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisitPromennaFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisitPromennaFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitPromennaStringContext extends DatovyTypContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public VisitPromennaStringContext(DatovyTypContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisitPromennaString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisitPromennaString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisitPromennaString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitPromennaIntContext extends DatovyTypContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public VisitPromennaIntContext(DatovyTypContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisitPromennaInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisitPromennaInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisitPromennaInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisiterSubExprContext extends DatovyTypContext {
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public DatovyTypContext datovyTyp() {
			return getRuleContext(DatovyTypContext.class,0);
		}
		public VisiterSubExprContext(DatovyTypContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatovyTypContext datovyTyp() throws RecognitionException {
		DatovyTypContext _localctx = new DatovyTypContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_datovyTyp);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				_localctx = new VisitPromennaFloatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(FLOAT);
				}
				break;
			case INT:
				_localctx = new VisitPromennaIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(INT);
				}
				break;
			case BOOLEAN:
				_localctx = new VisitPromennaBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(BOOLEAN);
				}
				break;
			case STRING:
				_localctx = new VisitPromennaStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(STRING);
				}
				break;
			case MINUS:
				_localctx = new VisiterSubExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(MINUS);
				setState(171);
				datovyTyp();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VisiterIntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public VisiterIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MODULO() { return getToken(GrammarParser.MODULO, 0); }
		public TerminalNode SPOJENI_RETEZCU() { return getToken(GrammarParser.SPOJENI_RETEZCU, 0); }
		public BContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisiterBooleanContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public VisiterBooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitZavorkyContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VisitZavorkyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisitZavorky(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisitZavorky(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisitZavorky(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisiterPromennaContext extends ExpressionContext {
		public TerminalNode VARIABLE() { return getToken(GrammarParser.VARIABLE, 0); }
		public VisiterPromennaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterPromenna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterPromenna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterPromenna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisiterPlusMinusSpojeniContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode SPOJENI_RETEZCU() { return getToken(GrammarParser.SPOJENI_RETEZCU, 0); }
		public VisiterPlusMinusSpojeniContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterPlusMinusSpojeni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterPlusMinusSpojeni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterPlusMinusSpojeni(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitRelacniOperatoryContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RELACNI_OPERATORY_POROVNANI() { return getToken(GrammarParser.RELACNI_OPERATORY_POROVNANI, 0); }
		public VisitRelacniOperatoryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisitRelacniOperatory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisitRelacniOperatory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisitRelacniOperatory(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitAndOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICKEANDOR() { return getToken(GrammarParser.LOGICKEANDOR, 0); }
		public VisitAndOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisitAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisitAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisiterFloatContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public VisiterFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisiterPrvniCastContext extends ExpressionContext {
		public TerminalNode STRINGFIRSTPART() { return getToken(GrammarParser.STRINGFIRSTPART, 0); }
		public VisiterPrvniCastContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterPrvniCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterPrvniCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterPrvniCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisiterKratDelenoModuloContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MODULO() { return getToken(GrammarParser.MODULO, 0); }
		public VisiterKratDelenoModuloContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterKratDelenoModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterKratDelenoModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterKratDelenoModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisiterNazevContext extends ExpressionContext {
		public TerminalNode STRINGSPECIAL() { return getToken(GrammarParser.STRINGSPECIAL, 0); }
		public VisiterNazevContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterNazev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterNazev(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterNazev(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisiterStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public VisiterStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisiterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisiterString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisiterString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitLogickeNotContext extends ExpressionContext {
		public TerminalNode LOGICKENOT() { return getToken(GrammarParser.LOGICKENOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VisitLogickeNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVisitLogickeNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVisitLogickeNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVisitLogickeNot(this);
			else return visitor.visitChildren(this);
		}
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
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGSPECIAL:
				{
				_localctx = new VisiterNazevContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(175);
				match(STRINGSPECIAL);
				}
				break;
			case STRINGFIRSTPART:
				{
				_localctx = new VisiterPrvniCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(STRINGFIRSTPART);
				}
				break;
			case STRING:
				{
				_localctx = new VisiterStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(STRING);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VisiterPromennaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(VARIABLE);
				}
				break;
			case FLOAT:
				{
				_localctx = new VisiterFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(FLOAT);
				}
				break;
			case INT:
				{
				_localctx = new VisiterIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(INT);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new VisiterBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(BOOLEAN);
				}
				break;
			case T__4:
				{
				_localctx = new VisitZavorkyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(T__4);
				setState(183);
				expression(0);
				setState(184);
				match(T__5);
				}
				break;
			case LOGICKENOT:
				{
				_localctx = new VisitLogickeNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(LOGICKENOT);
				setState(187);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new VisiterPlusMinusSpojeniContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(191);
						((VisiterPlusMinusSpojeniContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << MINUS) | (1L << SPOJENI_RETEZCU))) != 0)) ) {
							((VisiterPlusMinusSpojeniContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new VisiterKratDelenoModuloContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(194);
						((VisiterKratDelenoModuloContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << MODULO))) != 0)) ) {
							((VisiterKratDelenoModuloContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new BContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(197);
						match(MODULO);
						}
						setState(198);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new VisitRelacniOperatoryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(200);
						match(RELACNI_OPERATORY_POROVNANI);
						}
						setState(201);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new VisitAndOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(203);
						match(LOGICKEANDOR);
						}
						setState(204);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new BContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(206);
						match(SPOJENI_RETEZCU);
						}
						setState(207);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00d6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000"+
		"\u0010\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u001d\b\u0002\n\u0002\f\u0002 \t\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002$\b\u0002\u000b\u0002\f\u0002%\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002+\b\u0002\u0004\u0002-\b\u0002\u000b\u0002"+
		"\f\u0002.\u0001\u0002\u0004\u00022\b\u0002\u000b\u0002\f\u00023\u0001"+
		"\u0002\u0001\u0002\u0004\u00028\b\u0002\u000b\u0002\f\u00029\u0001\u0002"+
		"\u0001\u0002\u0004\u0002>\b\u0002\u000b\u0002\f\u0002?\u0001\u0002\u0003"+
		"\u0002C\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0003\u0005"+
		"\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003[\b"+
		"\u0003\n\u0003\f\u0003^\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003b\b"+
		"\u0003\n\u0003\f\u0003e\t\u0003\u0003\u0003g\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003p\b\u0003\u0001\u0003\u0005\u0003s\b\u0003\n\u0003\f\u0003v\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003z\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u007f\b\u0004\n\u0004\f\u0004\u0082\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0088\b\u0004\u0005"+
		"\u0004\u008a\b\u0004\n\u0004\f\u0004\u008d\t\u0004\u0003\u0004\u008f\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0094\b\u0004\n"+
		"\u0004\f\u0004\u0097\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u009c\b\u0004\u0001\u0004\u0003\u0004\u009f\b\u0004\u0004\u0004"+
		"\u00a1\b\u0004\u000b\u0004\f\u0004\u00a2\u0003\u0004\u00a5\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00ad\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00bd\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00d1\b\u0006\n\u0006\f\u0006\u00d4\t\u0006\u0001\u0006\u0000\u0001"+
		"\f\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0003\u0002\u0000\u000b\r"+
		"\u0010\u0010\u0003\u0000\u000b\u000b\u0010\u0010\u0012\u0012\u0002\u0000"+
		"\f\r\u0011\u0011\u00ff\u0000\u000f\u0001\u0000\u0000\u0000\u0002\u0017"+
		"\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006y\u0001\u0000"+
		"\u0000\u0000\b\u00a4\u0001\u0000\u0000\u0000\n\u00ac\u0001\u0000\u0000"+
		"\u0000\f\u00bc\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000"+
		"\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000"+
		"\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0000\u0000\u0001"+
		"\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0018\u0003\u0004\u0002\u0000"+
		"\u0016\u0018\u0003\u0006\u0003\u0000\u0017\u0015\u0001\u0000\u0000\u0000"+
		"\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000"+
		"\u0019\u001e\u0005\u0001\u0000\u0000\u001a\u001b\u0005\u001a\u0000\u0000"+
		"\u001b\u001d\u0005\u0002\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000!#\u0005\u001a\u0000\u0000\"$\u0005\u000f\u0000\u0000"+
		"#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&C\u0001\u0000\u0000\u0000\',\u0005\u0003"+
		"\u0000\u0000(*\u0003\f\u0006\u0000)+\u0005\u0002\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,(\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u000002\u0005\u000f\u0000"+
		"\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u00004C\u0001\u0000\u0000\u000057\u0003"+
		"\b\u0004\u000068\u0005\u000f\u0000\u000076\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":C\u0001\u0000\u0000\u0000;=\u0003\f\u0006\u0000<>\u0005\u000f\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000AC\u0005\u001e"+
		"\u0000\u0000B\u0019\u0001\u0000\u0000\u0000B\'\u0001\u0000\u0000\u0000"+
		"B5\u0001\u0000\u0000\u0000B;\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\u0004\u0000\u0000EF\u0005"+
		"\u0005\u0000\u0000FG\u0003\f\u0006\u0000GH\u0005\u0006\u0000\u0000HI\u0005"+
		"\u0007\u0000\u0000IP\u0003\u0004\u0002\u0000JL\u0005\u0002\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MO\u0003\u0004\u0002\u0000NK\u0001\u0000\u0000\u0000OR\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\b\u0000\u0000Tz\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0004\u0000\u0000VW\u0005\u0005\u0000\u0000"+
		"WX\u0003\f\u0006\u0000X\\\u0005\u0006\u0000\u0000Y[\u0003\u0004\u0002"+
		"\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]f\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_c\u0005\t\u0000\u0000`b\u0003\u0004\u0002\u0000a`\u0001"+
		"\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000f_\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gz\u0001\u0000"+
		"\u0000\u0000hi\u0005\n\u0000\u0000ij\u0005\u0005\u0000\u0000jk\u0003\f"+
		"\u0006\u0000kl\u0005\u0006\u0000\u0000lm\u0005\u0007\u0000\u0000mt\u0003"+
		"\u0004\u0002\u0000np\u0005\u0002\u0000\u0000on\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0003\u0004\u0002"+
		"\u0000ro\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000wx\u0005\b\u0000\u0000xz\u0001\u0000\u0000\u0000yD\u0001"+
		"\u0000\u0000\u0000yU\u0001\u0000\u0000\u0000yh\u0001\u0000\u0000\u0000"+
		"z\u0007\u0001\u0000\u0000\u0000{\u0080\u0005\u000e\u0000\u0000|}\u0005"+
		"\u001a\u0000\u0000}\u007f\u0005\u0002\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u008e\u0005\u001a\u0000\u0000"+
		"\u0084\u008b\u0005\u0016\u0000\u0000\u0085\u0087\u0003\n\u0005\u0000\u0086"+
		"\u0088\u0007\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u0085\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e"+
		"\u0084\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u00a5\u0001\u0000\u0000\u0000\u0090\u0095\u0005\u001a\u0000\u0000\u0091"+
		"\u0092\u0005\u0016\u0000\u0000\u0092\u0094\u0005\u001a\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u00a0\u0005\u0016\u0000\u0000\u0099\u009c\u0003\n\u0005\u0000\u009a\u009c"+
		"\u0005\u001a\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0007\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009b"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a4{\u0001\u0000\u0000\u0000\u00a4\u0090\u0001"+
		"\u0000\u0000\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00ad\u0005\u0017"+
		"\u0000\u0000\u00a7\u00ad\u0005\u0018\u0000\u0000\u00a8\u00ad\u0005\u0019"+
		"\u0000\u0000\u00a9\u00ad\u0005\u001d\u0000\u0000\u00aa\u00ab\u0005\u0010"+
		"\u0000\u0000\u00ab\u00ad\u0003\n\u0005\u0000\u00ac\u00a6\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u000b\u0001\u0000\u0000\u0000\u00ae\u00af\u0006\u0006\uffff"+
		"\uffff\u0000\u00af\u00bd\u0005\u001b\u0000\u0000\u00b0\u00bd\u0005\u001c"+
		"\u0000\u0000\u00b1\u00bd\u0005\u001d\u0000\u0000\u00b2\u00bd\u0005\u001a"+
		"\u0000\u0000\u00b3\u00bd\u0005\u0017\u0000\u0000\u00b4\u00bd\u0005\u0018"+
		"\u0000\u0000\u00b5\u00bd\u0005\u0019\u0000\u0000\u00b6\u00b7\u0005\u0005"+
		"\u0000\u0000\u00b7\u00b8\u0003\f\u0006\u0000\u00b8\u00b9\u0005\u0006\u0000"+
		"\u0000\u00b9\u00bd\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0015\u0000"+
		"\u0000\u00bb\u00bd\u0003\f\u0006\u0001\u00bc\u00ae\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b0\u0001\u0000\u0000\u0000\u00bc\u00b1\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b2\u0001\u0000\u0000\u0000\u00bc\u00b3\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc\u00b5\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bd\u00d2\u0001\u0000\u0000\u0000\u00be\u00bf\n\b\u0000\u0000\u00bf"+
		"\u00c0\u0007\u0001\u0000\u0000\u00c0\u00d1\u0003\f\u0006\t\u00c1\u00c2"+
		"\n\u0007\u0000\u0000\u00c2\u00c3\u0007\u0002\u0000\u0000\u00c3\u00d1\u0003"+
		"\f\u0006\b\u00c4\u00c5\n\u0006\u0000\u0000\u00c5\u00c6\u0005\u0011\u0000"+
		"\u0000\u00c6\u00d1\u0003\f\u0006\u0007\u00c7\u00c8\n\u0005\u0000\u0000"+
		"\u00c8\u00c9\u0005\u0013\u0000\u0000\u00c9\u00d1\u0003\f\u0006\u0006\u00ca"+
		"\u00cb\n\u0004\u0000\u0000\u00cb\u00cc\u0005\u0014\u0000\u0000\u00cc\u00d1"+
		"\u0003\f\u0006\u0005\u00cd\u00ce\n\u0003\u0000\u0000\u00ce\u00cf\u0005"+
		"\u0012\u0000\u0000\u00cf\u00d1\u0003\f\u0006\u0004\u00d0\u00be\u0001\u0000"+
		"\u0000\u0000\u00d0\u00c1\u0001\u0000\u0000\u0000\u00d0\u00c4\u0001\u0000"+
		"\u0000\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\r\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u001f\u0011\u0017\u001e%*.39?BKP\\cfoty\u0080\u0087\u008b\u008e"+
		"\u0095\u009b\u009e\u00a2\u00a4\u00ac\u00bc\u00d0\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}