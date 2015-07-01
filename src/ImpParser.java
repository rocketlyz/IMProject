// Generated from F:/IdeaProjects/IMProject\Imp.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IF=15, THEN=16, ELSE=17, 
		DO=18, WHILE=19, AND=20, OR=21, NOR=22, TRUE=23, FALSE=24, ID=25, INT=26, 
		NEWLINE=27, WS=28;
	public static final int
		RULE_init = 0, RULE_comlist = 1, RULE_block = 2, RULE_com = 3, RULE_evalue = 4, 
		RULE_ifstmt = 5, RULE_whilestmt = 6, RULE_aexp = 7, RULE_addaexp = 8, 
		RULE_mulaexp = 9, RULE_aexpatom = 10, RULE_bexp = 11, RULE_orbexp = 12, 
		RULE_andbexp = 13, RULE_equalbexp = 14, RULE_bexpatom = 15, RULE_atom = 16;
	public static final String[] ruleNames = {
		"init", "comlist", "block", "com", "evalue", "ifstmt", "whilestmt", "aexp", 
		"addaexp", "mulaexp", "aexpatom", "bexp", "orbexp", "andbexp", "equalbexp", 
		"bexpatom", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "':='", "';'", "'+'", "'-'", "'*'", "'/'", "'('", 
		"')'", "'<'", "'<='", "'>'", "'='", "'if'", "'then'", "'else'", "'do'", 
		"'while'", "'&'", "'|'", "'~'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "IF", "THEN", "ELSE", "DO", "WHILE", "AND", "OR", "NOR", 
		"TRUE", "FALSE", "ID", "INT", "NEWLINE", "WS"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Imp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public ComlistContext comlist() {
			return getRuleContext(ComlistContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			comlist();
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

	public static class ComlistContext extends ParserRuleContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public ComlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterComlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitComlist(this);
		}
	}

	public final ComlistContext comlist() throws RecognitionException {
		ComlistContext _localctx = new ComlistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(36); 
				com();
				}
				}
				setState(41);
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

	public static class BlockContext extends ParserRuleContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			setState(53);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); 
				match(T__0);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(43); 
					com();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49); 
				match(T__1);
				}
				break;
			case EOF:
			case T__1:
			case IF:
			case ELSE:
			case WHILE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(50); 
					com();
					}
					break;
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

	public static class ComContext extends ParserRuleContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public EvalueContext evalue() {
			return getRuleContext(EvalueContext.class,0);
		}
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitCom(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_com);
		try {
			setState(58);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); 
				ifstmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); 
				whilestmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); 
				evalue();
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

	public static class EvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public EvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterEvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitEvalue(this);
		}
	}

	public final EvalueContext evalue() throws RecognitionException {
		EvalueContext _localctx = new EvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_evalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			match(ID);
			setState(61); 
			match(T__2);
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(62); 
				aexp();
				}
				break;
			case 2:
				{
				setState(63); 
				bexp();
				}
				break;
			}
			setState(66); 
			match(T__3);
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

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ImpParser.IF, 0); }
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ImpParser.THEN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ImpParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifstmt);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); 
				match(IF);
				setState(69); 
				bexp();
				setState(70); 
				match(THEN);
				setState(71); 
				block();
				setState(72); 
				match(ELSE);
				setState(73); 
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); 
				match(IF);
				setState(76); 
				bexp();
				setState(77); 
				match(THEN);
				setState(78); 
				block();
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

	public static class WhilestmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ImpParser.WHILE, 0); }
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public TerminalNode DO() { return getToken(ImpParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitWhilestmt(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			match(WHILE);
			setState(83); 
			bexp();
			setState(84); 
			match(DO);
			setState(85); 
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

	public static class AexpContext extends ParserRuleContext {
		public AddaexpContext addaexp() {
			return getRuleContext(AddaexpContext.class,0);
		}
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAexp(this);
		}
	}

	public final AexpContext aexp() throws RecognitionException {
		AexpContext _localctx = new AexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			addaexp();
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

	public static class AddaexpContext extends ParserRuleContext {
		public List<MulaexpContext> mulaexp() {
			return getRuleContexts(MulaexpContext.class);
		}
		public MulaexpContext mulaexp(int i) {
			return getRuleContext(MulaexpContext.class,i);
		}
		public AddaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAddaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAddaexp(this);
		}
	}

	public final AddaexpContext addaexp() throws RecognitionException {
		AddaexpContext _localctx = new AddaexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addaexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			mulaexp();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				{
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(91); 
				mulaexp();
				}
				}
				setState(96);
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

	public static class MulaexpContext extends ParserRuleContext {
		public List<AexpatomContext> aexpatom() {
			return getRuleContexts(AexpatomContext.class);
		}
		public AexpatomContext aexpatom(int i) {
			return getRuleContext(AexpatomContext.class,i);
		}
		public MulaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterMulaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitMulaexp(this);
		}
	}

	public final MulaexpContext mulaexp() throws RecognitionException {
		MulaexpContext _localctx = new MulaexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mulaexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			aexpatom();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(98);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(99); 
				aexpatom();
				}
				}
				setState(104);
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

	public static class AexpatomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ImpParser.INT, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public AddaexpContext addaexp() {
			return getRuleContext(AddaexpContext.class,0);
		}
		public AexpatomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpatom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAexpatom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAexpatom(this);
		}
	}

	public final AexpatomContext aexpatom() throws RecognitionException {
		AexpatomContext _localctx = new AexpatomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aexpatom);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); 
				match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); 
				match(ID);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); 
				match(T__8);
				setState(108); 
				addaexp();
				setState(109); 
				match(T__9);
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

	public static class BexpContext extends ParserRuleContext {
		public OrbexpContext orbexp() {
			return getRuleContext(OrbexpContext.class,0);
		}
		public BexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterBexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitBexp(this);
		}
	}

	public final BexpContext bexp() throws RecognitionException {
		BexpContext _localctx = new BexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			orbexp();
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

	public static class OrbexpContext extends ParserRuleContext {
		public List<AndbexpContext> andbexp() {
			return getRuleContexts(AndbexpContext.class);
		}
		public AndbexpContext andbexp(int i) {
			return getRuleContext(AndbexpContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ImpParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ImpParser.OR, i);
		}
		public OrbexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orbexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterOrbexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitOrbexp(this);
		}
	}

	public final OrbexpContext orbexp() throws RecognitionException {
		OrbexpContext _localctx = new OrbexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orbexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			andbexp();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(116); 
				match(OR);
				setState(117); 
				andbexp();
				}
				}
				setState(122);
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

	public static class AndbexpContext extends ParserRuleContext {
		public List<EqualbexpContext> equalbexp() {
			return getRuleContexts(EqualbexpContext.class);
		}
		public EqualbexpContext equalbexp(int i) {
			return getRuleContext(EqualbexpContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ImpParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ImpParser.AND, i);
		}
		public AndbexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andbexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAndbexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAndbexp(this);
		}
	}

	public final AndbexpContext andbexp() throws RecognitionException {
		AndbexpContext _localctx = new AndbexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_andbexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			equalbexp();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(124); 
				match(AND);
				setState(125); 
				equalbexp();
				}
				}
				setState(130);
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

	public static class EqualbexpContext extends ParserRuleContext {
		public List<AexpatomContext> aexpatom() {
			return getRuleContexts(AexpatomContext.class);
		}
		public AexpatomContext aexpatom(int i) {
			return getRuleContext(AexpatomContext.class,i);
		}
		public BexpatomContext bexpatom() {
			return getRuleContext(BexpatomContext.class,0);
		}
		public TerminalNode NOR() { return getToken(ImpParser.NOR, 0); }
		public EqualbexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalbexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterEqualbexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitEqualbexp(this);
		}
	}

	public final EqualbexpContext equalbexp() throws RecognitionException {
		EqualbexpContext _localctx = new EqualbexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equalbexp);
		int _la;
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); 
				aexpatom();
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(133); 
					aexpatom();
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				_la = _input.LA(1);
				if (_la==NOR) {
					{
					setState(138); 
					match(NOR);
					}
				}

				setState(141); 
				bexpatom();
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

	public static class BexpatomContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ImpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ImpParser.FALSE, 0); }
		public OrbexpContext orbexp() {
			return getRuleContext(OrbexpContext.class,0);
		}
		public BexpatomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpatom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterBexpatom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitBexpatom(this);
		}
	}

	public final BexpatomContext bexpatom() throws RecognitionException {
		BexpatomContext _localctx = new BexpatomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bexpatom);
		try {
			setState(150);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); 
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); 
				match(FALSE);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); 
				match(T__8);
				setState(147); 
				orbexp();
				setState(148); 
				match(T__9);
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

	public static class AtomContext extends ParserRuleContext {
		public AexpatomContext aexpatom() {
			return getRuleContext(AexpatomContext.class,0);
		}
		public BexpatomContext bexpatom() {
			return getRuleContext(BexpatomContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atom);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); 
				aexpatom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153); 
				bexpatom();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u009f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4"+
		"\3\4\3\4\5\4\66\n\4\5\48\n\4\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\5\6"+
		"C\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7S\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\13"+
		"\3\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fr\n"+
		"\f\3\r\3\r\3\16\3\16\3\16\7\16y\n\16\f\16\16\16|\13\16\3\17\3\17\3\17"+
		"\7\17\u0081\n\17\f\17\16\17\u0084\13\17\3\20\3\20\3\20\6\20\u0089\n\20"+
		"\r\20\16\20\u008a\3\20\5\20\u008e\n\20\3\20\5\20\u0091\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0099\n\21\3\22\3\22\5\22\u009d\n\22\3\22\2"+
		"\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\7\b\3\2\t\n\3"+
		"\2\r\20\u00a1\2$\3\2\2\2\4)\3\2\2\2\6\67\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2"+
		"\fR\3\2\2\2\16T\3\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24c\3\2\2\2\26q\3\2\2"+
		"\2\30s\3\2\2\2\32u\3\2\2\2\34}\3\2\2\2\36\u0090\3\2\2\2 \u0098\3\2\2\2"+
		"\"\u009c\3\2\2\2$%\5\4\3\2%\3\3\2\2\2&(\5\b\5\2\'&\3\2\2\2(+\3\2\2\2)"+
		"\'\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,\60\7\3\2\2-/\5\b\5\2.-\3\2"+
		"\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2"+
		"\638\7\4\2\2\64\66\5\b\5\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67"+
		",\3\2\2\2\67\65\3\2\2\28\7\3\2\2\29=\5\f\7\2:=\5\16\b\2;=\5\n\6\2<9\3"+
		"\2\2\2<:\3\2\2\2<;\3\2\2\2=\t\3\2\2\2>?\7\33\2\2?B\7\5\2\2@C\5\20\t\2"+
		"AC\5\30\r\2B@\3\2\2\2BA\3\2\2\2CD\3\2\2\2DE\7\6\2\2E\13\3\2\2\2FG\7\21"+
		"\2\2GH\5\30\r\2HI\7\22\2\2IJ\5\6\4\2JK\7\23\2\2KL\5\6\4\2LS\3\2\2\2MN"+
		"\7\21\2\2NO\5\30\r\2OP\7\22\2\2PQ\5\6\4\2QS\3\2\2\2RF\3\2\2\2RM\3\2\2"+
		"\2S\r\3\2\2\2TU\7\25\2\2UV\5\30\r\2VW\7\24\2\2WX\5\6\4\2X\17\3\2\2\2Y"+
		"Z\5\22\n\2Z\21\3\2\2\2[`\5\24\13\2\\]\t\2\2\2]_\5\24\13\2^\\\3\2\2\2_"+
		"b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\23\3\2\2\2b`\3\2\2\2ch\5\26\f\2de\t\3\2"+
		"\2eg\5\26\f\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\25\3\2\2\2jh\3"+
		"\2\2\2kr\7\34\2\2lr\7\33\2\2mn\7\13\2\2no\5\22\n\2op\7\f\2\2pr\3\2\2\2"+
		"qk\3\2\2\2ql\3\2\2\2qm\3\2\2\2r\27\3\2\2\2st\5\32\16\2t\31\3\2\2\2uz\5"+
		"\34\17\2vw\7\27\2\2wy\5\34\17\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{\33\3\2\2\2|z\3\2\2\2}\u0082\5\36\20\2~\177\7\26\2\2\177\u0081\5\36"+
		"\20\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\35\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0088\5\26\f\2\u0086"+
		"\u0087\t\4\2\2\u0087\u0089\5\26\f\2\u0088\u0086\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0091\3\2\2\2\u008c"+
		"\u008e\7\30\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0091\5 \21\2\u0090\u0085\3\2\2\2\u0090\u008d\3\2\2\2\u0091"+
		"\37\3\2\2\2\u0092\u0099\7\31\2\2\u0093\u0099\7\32\2\2\u0094\u0095\7\13"+
		"\2\2\u0095\u0096\5\32\16\2\u0096\u0097\7\f\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0099!\3\2\2\2"+
		"\u009a\u009d\5\26\f\2\u009b\u009d\5 \21\2\u009c\u009a\3\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d#\3\2\2\2\23)\60\65\67<BR`hqz\u0082\u008a\u008d\u0090\u0098"+
		"\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}