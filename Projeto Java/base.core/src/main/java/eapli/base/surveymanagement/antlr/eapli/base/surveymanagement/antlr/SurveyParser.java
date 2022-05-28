// Generated from C:/Users/Pedro Celestino/Desktop/2A2S/LAPR4/lei21_22_s4_2de_01/Projeto Java/base.core/src/main/java/eapli/base/surveymanagement/antlr\Survey.g4 by ANTLR 4.10.1
package eapli.base.surveymanagement.antlr.eapli.base.surveymanagement.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SurveyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MANDATORY=5, OPTIONAL=6, CONDITION_DEPENDENT=7, 
		FREE_TEXT=8, NUMERIC=9, SINGLE_CHOICE=10, SINGLE_CHOICE1=11, MULTIPLE_CHOICE=12, 
		MULTIPLE_CHOICE1=13, SORTING_OPTIONS=14, SCALING_OPTIONS=15, DECIMALS_ALLOWED=16, 
		NUMERO=17, PALAVRA=18, HIFEN=19, ESPACO=20, PONTO_FINAL=21, DOIS_PONTOS=22, 
		RETICENCIAS=23, VIRGULA=24, PONTO_INTERROGACAO=25, PONTO_EXCLAMACAO=26, 
		PARENTESIS_DIREITO=27, PARENTESIS_ESQUERDO=28, NEWLINE=29;
	public static final int
		RULE_start = 0, RULE_alfanumerico = 1, RULE_pontucao = 2, RULE_frase = 3, 
		RULE_regraIdQuestionario = 4, RULE_regraTitulo = 5, RULE_regraMensagem = 6, 
		RULE_regraId = 7, RULE_obrigatoriedade = 8, RULE_repetibilidade = 9, RULE_opcao = 10, 
		RULE_type = 11, RULE_regraPergunta = 12, RULE_pergunta = 13, RULE_seccao = 14, 
		RULE_questionario = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "alfanumerico", "pontucao", "frase", "regraIdQuestionario", 
			"regraTitulo", "regraMensagem", "regraId", "obrigatoriedade", "repetibilidade", 
			"opcao", "type", "regraPergunta", "pergunta", "seccao", "questionario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Scale: '", "'Type: '", "'Section Obligatoriness: '", "'Repeatability: '", 
			"'mandatory'", "'optional'", "'condition dependent'", "'Free-Text'", 
			"'Numeric'", "'Single-Choice'", "'Single-Choice with input value'", "'Multiple-Choice'", 
			"'Multiple-Choice with input value'", "'Sorting Options'", "'Scaling Options'", 
			"'Decimal numbers are allowed!'", null, null, "'-'", null, "'.'", "':'", 
			"'...'", "','", "'?'", "'!'", "')'", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "MANDATORY", "OPTIONAL", "CONDITION_DEPENDENT", 
			"FREE_TEXT", "NUMERIC", "SINGLE_CHOICE", "SINGLE_CHOICE1", "MULTIPLE_CHOICE", 
			"MULTIPLE_CHOICE1", "SORTING_OPTIONS", "SCALING_OPTIONS", "DECIMALS_ALLOWED", 
			"NUMERO", "PALAVRA", "HIFEN", "ESPACO", "PONTO_FINAL", "DOIS_PONTOS", 
			"RETICENCIAS", "VIRGULA", "PONTO_INTERROGACAO", "PONTO_EXCLAMACAO", "PARENTESIS_DIREITO", 
			"PARENTESIS_ESQUERDO", "NEWLINE"
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
	public String getGrammarFileName() { return "Survey.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SurveyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public QuestionarioContext questionario() {
			return getRuleContext(QuestionarioContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener) ((SurveyListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			questionario();
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

	public static class AlfanumericoContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(SurveyParser.PALAVRA, 0); }
		public TerminalNode NUMERO() { return getToken(SurveyParser.NUMERO, 0); }
		public AlfanumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfanumerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterAlfanumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitAlfanumerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitAlfanumerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlfanumericoContext alfanumerico() throws RecognitionException {
		AlfanumericoContext _localctx = new AlfanumericoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alfanumerico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==PALAVRA) ) {
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

	public static class PontucaoContext extends ParserRuleContext {
		public TerminalNode PONTO_FINAL() { return getToken(SurveyParser.PONTO_FINAL, 0); }
		public TerminalNode PONTO_INTERROGACAO() { return getToken(SurveyParser.PONTO_INTERROGACAO, 0); }
		public TerminalNode RETICENCIAS() { return getToken(SurveyParser.RETICENCIAS, 0); }
		public TerminalNode PONTO_EXCLAMACAO() { return getToken(SurveyParser.PONTO_EXCLAMACAO, 0); }
		public PontucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pontucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterPontucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitPontucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitPontucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PontucaoContext pontucao() throws RecognitionException {
		PontucaoContext _localctx = new PontucaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pontucao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PONTO_FINAL) | (1L << RETICENCIAS) | (1L << PONTO_INTERROGACAO) | (1L << PONTO_EXCLAMACAO))) != 0)) ) {
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

	public static class FraseContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(SurveyParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(SurveyParser.PALAVRA, i);
		}
		public List<TerminalNode> ESPACO() { return getTokens(SurveyParser.ESPACO); }
		public TerminalNode ESPACO(int i) {
			return getToken(SurveyParser.ESPACO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(SurveyParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SurveyParser.VIRGULA, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(SurveyParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(SurveyParser.NUMERO, i);
		}
		public FraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterFrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitFrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitFrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FraseContext frase() throws RecognitionException {
		FraseContext _localctx = new FraseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_frase);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(PALAVRA);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ESPACO || _la==VIRGULA) {
					{
					{
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VIRGULA) {
						{
						setState(39);
						match(VIRGULA);
						}
					}

					setState(42);
					match(ESPACO);
					setState(44); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(43);
						_la = _input.LA(1);
						if ( !(_la==NUMERO || _la==PALAVRA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(46); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NUMERO || _la==PALAVRA );
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					match(NUMERO);
					}
					}
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERO );
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ESPACO || _la==VIRGULA) {
					{
					{
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VIRGULA) {
						{
						setState(58);
						match(VIRGULA);
						}
					}

					setState(61);
					match(ESPACO);
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(62);
						_la = _input.LA(1);
						if ( !(_la==NUMERO || _la==PALAVRA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(65); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NUMERO || _la==PALAVRA );
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(PALAVRA);
				setState(73);
				match(VIRGULA);
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

	public static class RegraIdQuestionarioContext extends ParserRuleContext {
		public TerminalNode HIFEN() { return getToken(SurveyParser.HIFEN, 0); }
		public List<AlfanumericoContext> alfanumerico() {
			return getRuleContexts(AlfanumericoContext.class);
		}
		public AlfanumericoContext alfanumerico(int i) {
			return getRuleContext(AlfanumericoContext.class,i);
		}
		public RegraIdQuestionarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regraIdQuestionario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterRegraIdQuestionario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitRegraIdQuestionario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitRegraIdQuestionario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegraIdQuestionarioContext regraIdQuestionario() throws RecognitionException {
		RegraIdQuestionarioContext _localctx = new RegraIdQuestionarioContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_regraIdQuestionario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				alfanumerico();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERO || _la==PALAVRA );
			setState(81);
			match(HIFEN);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				alfanumerico();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERO || _la==PALAVRA );
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

	public static class RegraTituloContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SurveyParser.NEWLINE, 0); }
		public RegraTituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regraTitulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterRegraTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitRegraTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitRegraTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegraTituloContext regraTitulo() throws RecognitionException {
		RegraTituloContext _localctx = new RegraTituloContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_regraTitulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			frase();
			setState(88);
			match(NEWLINE);
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

	public static class RegraMensagemContext extends ParserRuleContext {
		public List<FraseContext> frase() {
			return getRuleContexts(FraseContext.class);
		}
		public FraseContext frase(int i) {
			return getRuleContext(FraseContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SurveyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SurveyParser.NEWLINE, i);
		}
		public List<PontucaoContext> pontucao() {
			return getRuleContexts(PontucaoContext.class);
		}
		public PontucaoContext pontucao(int i) {
			return getRuleContext(PontucaoContext.class,i);
		}
		public RegraMensagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regraMensagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterRegraMensagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitRegraMensagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitRegraMensagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegraMensagemContext regraMensagem() throws RecognitionException {
		RegraMensagemContext _localctx = new RegraMensagemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_regraMensagem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(90);
					frase();
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PONTO_FINAL) | (1L << RETICENCIAS) | (1L << PONTO_INTERROGACAO) | (1L << PONTO_EXCLAMACAO))) != 0)) {
						{
						setState(91);
						pontucao();
						}
					}

					setState(94);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class RegraIdContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(SurveyParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(SurveyParser.NUMERO, i);
		}
		public RegraIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regraId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterRegraId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitRegraId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitRegraId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegraIdContext regraId() throws RecognitionException {
		RegraIdContext _localctx = new RegraIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_regraId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				match(NUMERO);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERO );
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

	public static class ObrigatoriedadeContext extends ParserRuleContext {
		public TerminalNode MANDATORY() { return getToken(SurveyParser.MANDATORY, 0); }
		public TerminalNode OPTIONAL() { return getToken(SurveyParser.OPTIONAL, 0); }
		public TerminalNode CONDITION_DEPENDENT() { return getToken(SurveyParser.CONDITION_DEPENDENT, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(SurveyParser.DOIS_PONTOS, 0); }
		public TerminalNode ESPACO() { return getToken(SurveyParser.ESPACO, 0); }
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public ObrigatoriedadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obrigatoriedade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterObrigatoriedade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitObrigatoriedade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitObrigatoriedade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObrigatoriedadeContext obrigatoriedade() throws RecognitionException {
		ObrigatoriedadeContext _localctx = new ObrigatoriedadeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_obrigatoriedade);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MANDATORY:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(MANDATORY);
				}
				break;
			case OPTIONAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(OPTIONAL);
				}
				break;
			case CONDITION_DEPENDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(CONDITION_DEPENDENT);
				setState(108);
				match(DOIS_PONTOS);
				setState(109);
				match(ESPACO);
				setState(110);
				frase();
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

	public static class RepetibilidadeContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(SurveyParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(SurveyParser.NUMERO, i);
		}
		public RepetibilidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetibilidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterRepetibilidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitRepetibilidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitRepetibilidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetibilidadeContext repetibilidade() throws RecognitionException {
		RepetibilidadeContext _localctx = new RepetibilidadeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repetibilidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				match(NUMERO);
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERO );
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

	public static class OpcaoContext extends ParserRuleContext {
		public RegraIdContext regraId() {
			return getRuleContext(RegraIdContext.class,0);
		}
		public TerminalNode PARENTESIS_DIREITO() { return getToken(SurveyParser.PARENTESIS_DIREITO, 0); }
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SurveyParser.NEWLINE, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(SurveyParser.DOIS_PONTOS, 0); }
		public OpcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterOpcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitOpcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitOpcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcaoContext opcao() throws RecognitionException {
		OpcaoContext _localctx = new OpcaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			regraId();
			setState(119);
			match(PARENTESIS_DIREITO);
			setState(120);
			frase();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOIS_PONTOS) {
				{
				setState(121);
				match(DOIS_PONTOS);
				}
			}

			setState(124);
			match(NEWLINE);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode FREE_TEXT() { return getToken(SurveyParser.FREE_TEXT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SurveyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SurveyParser.NEWLINE, i);
		}
		public TerminalNode NUMERIC() { return getToken(SurveyParser.NUMERIC, 0); }
		public TerminalNode ESPACO() { return getToken(SurveyParser.ESPACO, 0); }
		public TerminalNode PARENTESIS_ESQUERDO() { return getToken(SurveyParser.PARENTESIS_ESQUERDO, 0); }
		public TerminalNode DECIMALS_ALLOWED() { return getToken(SurveyParser.DECIMALS_ALLOWED, 0); }
		public TerminalNode PARENTESIS_DIREITO() { return getToken(SurveyParser.PARENTESIS_DIREITO, 0); }
		public TerminalNode SINGLE_CHOICE() { return getToken(SurveyParser.SINGLE_CHOICE, 0); }
		public List<OpcaoContext> opcao() {
			return getRuleContexts(OpcaoContext.class);
		}
		public OpcaoContext opcao(int i) {
			return getRuleContext(OpcaoContext.class,i);
		}
		public TerminalNode MULTIPLE_CHOICE() { return getToken(SurveyParser.MULTIPLE_CHOICE, 0); }
		public TerminalNode SINGLE_CHOICE1() { return getToken(SurveyParser.SINGLE_CHOICE1, 0); }
		public TerminalNode MULTIPLE_CHOICE1() { return getToken(SurveyParser.MULTIPLE_CHOICE1, 0); }
		public TerminalNode SORTING_OPTIONS() { return getToken(SurveyParser.SORTING_OPTIONS, 0); }
		public TerminalNode SCALING_OPTIONS() { return getToken(SurveyParser.SCALING_OPTIONS, 0); }
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FREE_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(FREE_TEXT);
				setState(127);
				match(NEWLINE);
				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(NUMERIC);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESPACO) {
					{
					setState(129);
					match(ESPACO);
					setState(130);
					match(PARENTESIS_ESQUERDO);
					setState(131);
					match(DECIMALS_ALLOWED);
					setState(132);
					match(PARENTESIS_DIREITO);
					}
				}

				setState(135);
				match(NEWLINE);
				}
				break;
			case SINGLE_CHOICE:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(SINGLE_CHOICE);
				setState(137);
				match(NEWLINE);
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					opcao();
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERO );
				}
				break;
			case MULTIPLE_CHOICE:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(MULTIPLE_CHOICE);
				setState(144);
				match(NEWLINE);
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					opcao();
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERO );
				}
				break;
			case SINGLE_CHOICE1:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(SINGLE_CHOICE1);
				setState(151);
				match(NEWLINE);
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(152);
					opcao();
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERO );
				}
				break;
			case MULTIPLE_CHOICE1:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(MULTIPLE_CHOICE1);
				setState(158);
				match(NEWLINE);
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					opcao();
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERO );
				}
				break;
			case SORTING_OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				match(SORTING_OPTIONS);
				setState(165);
				match(NEWLINE);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					opcao();
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERO );
				}
				break;
			case SCALING_OPTIONS:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				match(SCALING_OPTIONS);
				setState(172);
				match(NEWLINE);
				setState(173);
				match(T__0);
				setState(174);
				frase();
				setState(175);
				match(NEWLINE);
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					opcao();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERO );
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

	public static class RegraPerguntaContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public TerminalNode PONTO_INTERROGACAO() { return getToken(SurveyParser.PONTO_INTERROGACAO, 0); }
		public TerminalNode NEWLINE() { return getToken(SurveyParser.NEWLINE, 0); }
		public RegraPerguntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regraPergunta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterRegraPergunta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitRegraPergunta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitRegraPergunta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegraPerguntaContext regraPergunta() throws RecognitionException {
		RegraPerguntaContext _localctx = new RegraPerguntaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_regraPergunta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			frase();
			setState(184);
			match(PONTO_INTERROGACAO);
			setState(185);
			match(NEWLINE);
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

	public static class PerguntaContext extends ParserRuleContext {
		public RegraIdContext regraId() {
			return getRuleContext(RegraIdContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SurveyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SurveyParser.NEWLINE, i);
		}
		public RegraPerguntaContext regraPergunta() {
			return getRuleContext(RegraPerguntaContext.class,0);
		}
		public TerminalNode PARENTESIS_ESQUERDO() { return getToken(SurveyParser.PARENTESIS_ESQUERDO, 0); }
		public ObrigatoriedadeContext obrigatoriedade() {
			return getRuleContext(ObrigatoriedadeContext.class,0);
		}
		public TerminalNode PARENTESIS_DIREITO() { return getToken(SurveyParser.PARENTESIS_DIREITO, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<RegraMensagemContext> regraMensagem() {
			return getRuleContexts(RegraMensagemContext.class);
		}
		public RegraMensagemContext regraMensagem(int i) {
			return getRuleContext(RegraMensagemContext.class,i);
		}
		public PerguntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pergunta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterPergunta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitPergunta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitPergunta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerguntaContext pergunta() throws RecognitionException {
		PerguntaContext _localctx = new PerguntaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pergunta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			regraId();
			setState(188);
			match(NEWLINE);
			setState(189);
			regraPergunta();
			setState(190);
			match(PARENTESIS_ESQUERDO);
			setState(191);
			obrigatoriedade();
			setState(192);
			match(PARENTESIS_DIREITO);
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(193);
				match(NEWLINE);
				setState(194);
				regraMensagem();
				}
				break;
			}
			setState(197);
			match(NEWLINE);
			setState(198);
			match(T__1);
			setState(199);
			type();
			setState(200);
			match(NEWLINE);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(201);
				regraMensagem();
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

	public static class SeccaoContext extends ParserRuleContext {
		public RegraIdContext regraId() {
			return getRuleContext(RegraIdContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SurveyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SurveyParser.NEWLINE, i);
		}
		public RegraTituloContext regraTitulo() {
			return getRuleContext(RegraTituloContext.class,0);
		}
		public ObrigatoriedadeContext obrigatoriedade() {
			return getRuleContext(ObrigatoriedadeContext.class,0);
		}
		public RegraMensagemContext regraMensagem() {
			return getRuleContext(RegraMensagemContext.class,0);
		}
		public RepetibilidadeContext repetibilidade() {
			return getRuleContext(RepetibilidadeContext.class,0);
		}
		public List<PerguntaContext> pergunta() {
			return getRuleContexts(PerguntaContext.class);
		}
		public PerguntaContext pergunta(int i) {
			return getRuleContext(PerguntaContext.class,i);
		}
		public SeccaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterSeccao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitSeccao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitSeccao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccaoContext seccao() throws RecognitionException {
		SeccaoContext _localctx = new SeccaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_seccao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			regraId();
			setState(205);
			match(NEWLINE);
			setState(206);
			regraTitulo();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO || _la==PALAVRA) {
				{
				setState(207);
				regraMensagem();
				}
			}

			setState(210);
			match(T__2);
			setState(211);
			obrigatoriedade();
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(212);
				match(NEWLINE);
				setState(213);
				match(T__3);
				setState(214);
				repetibilidade();
				}
				break;
			}
			setState(217);
			match(NEWLINE);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				pergunta();
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERO );
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

	public static class QuestionarioContext extends ParserRuleContext {
		public RegraIdQuestionarioContext regraIdQuestionario() {
			return getRuleContext(RegraIdQuestionarioContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SurveyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SurveyParser.NEWLINE, i);
		}
		public RegraTituloContext regraTitulo() {
			return getRuleContext(RegraTituloContext.class,0);
		}
		public List<RegraMensagemContext> regraMensagem() {
			return getRuleContexts(RegraMensagemContext.class);
		}
		public RegraMensagemContext regraMensagem(int i) {
			return getRuleContext(RegraMensagemContext.class,i);
		}
		public List<SeccaoContext> seccao() {
			return getRuleContexts(SeccaoContext.class);
		}
		public SeccaoContext seccao(int i) {
			return getRuleContext(SeccaoContext.class,i);
		}
		public QuestionarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).enterQuestionario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyListener ) ((SurveyListener)listener).exitQuestionario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyVisitor ) return ((SurveyVisitor<? extends T>)visitor).visitQuestionario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionarioContext questionario() throws RecognitionException {
		QuestionarioContext _localctx = new QuestionarioContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_questionario);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			regraIdQuestionario();
			setState(224);
			match(NEWLINE);
			setState(225);
			regraTitulo();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO || _la==PALAVRA) {
				{
				setState(226);
				regraMensagem();
				}
			}

			setState(231); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(229);
					match(NEWLINE);
					setState(230);
					seccao();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(235);
			match(NEWLINE);
			setState(236);
			match(NEWLINE);
			setState(237);
			regraMensagem();
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
		"\u0004\u0001\u001d\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003)\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003-\b\u0003\u000b\u0003\f\u0003.\u0005\u00031\b\u0003"+
		"\n\u0003\f\u00034\t\u0003\u0001\u0003\u0004\u00037\b\u0003\u000b\u0003"+
		"\f\u00038\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003@\b\u0003\u000b\u0003\f\u0003A\u0005\u0003D\b\u0003\n\u0003\f\u0003"+
		"G\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003K\b\u0003\u0001\u0004\u0004"+
		"\u0004N\b\u0004\u000b\u0004\f\u0004O\u0001\u0004\u0001\u0004\u0004\u0004"+
		"T\b\u0004\u000b\u0004\f\u0004U\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006]\b\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006a\b\u0006\u000b\u0006\f\u0006b\u0001\u0007\u0004\u0007f\b\u0007"+
		"\u000b\u0007\f\u0007g\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\bp\b\b\u0001\t\u0004\ts\b\t\u000b\t\f\tt\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n{\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0086"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u008c"+
		"\b\u000b\u000b\u000b\f\u000b\u008d\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u0093\b\u000b\u000b\u000b\f\u000b\u0094\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u009a\b\u000b\u000b\u000b\f\u000b\u009b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00a1\b\u000b\u000b\u000b"+
		"\f\u000b\u00a2\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00a8\b"+
		"\u000b\u000b\u000b\f\u000b\u00a9\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00b2\b\u000b\u000b\u000b\f"+
		"\u000b\u00b3\u0003\u000b\u00b6\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00c4\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00cb\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d1\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00d8\b\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00dc\b\u000e\u000b"+
		"\u000e\f\u000e\u00dd\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00e4\b\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00e8\b\u000f"+
		"\u000b\u000f\f\u000f\u00e9\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0002\u0001\u0000\u0011"+
		"\u0012\u0003\u0000\u0015\u0015\u0017\u0017\u0019\u001a\u0106\u0000 \u0001"+
		"\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004$\u0001\u0000"+
		"\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000"+
		"\nW\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000ee\u0001\u0000"+
		"\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000\u0000"+
		"\u0014v\u0001\u0000\u0000\u0000\u0016\u00b5\u0001\u0000\u0000\u0000\u0018"+
		"\u00b7\u0001\u0000\u0000\u0000\u001a\u00bb\u0001\u0000\u0000\u0000\u001c"+
		"\u00cc\u0001\u0000\u0000\u0000\u001e\u00df\u0001\u0000\u0000\u0000 !\u0003"+
		"\u001e\u000f\u0000!\u0001\u0001\u0000\u0000\u0000\"#\u0007\u0000\u0000"+
		"\u0000#\u0003\u0001\u0000\u0000\u0000$%\u0007\u0001\u0000\u0000%\u0005"+
		"\u0001\u0000\u0000\u0000&2\u0005\u0012\u0000\u0000\')\u0005\u0018\u0000"+
		"\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*,\u0005\u0014\u0000\u0000+-\u0007\u0000\u0000\u0000,+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000(\u0001\u0000\u0000"+
		"\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u00003K\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000057\u0005"+
		"\u0011\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009E\u0001\u0000\u0000"+
		"\u0000:<\u0005\u0018\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0005\u0014\u0000\u0000>@\u0007"+
		"\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000C;\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FK\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0012\u0000\u0000IK\u0005\u0018\u0000\u0000"+
		"J&\u0001\u0000\u0000\u0000J6\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000K\u0007\u0001\u0000\u0000\u0000LN\u0003\u0002\u0001\u0000ML\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0005\u0013\u0000"+
		"\u0000RT\u0003\u0002\u0001\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\t\u0001"+
		"\u0000\u0000\u0000WX\u0003\u0006\u0003\u0000XY\u0005\u001d\u0000\u0000"+
		"Y\u000b\u0001\u0000\u0000\u0000Z\\\u0003\u0006\u0003\u0000[]\u0003\u0004"+
		"\u0002\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0005\u001d\u0000\u0000_a\u0001\u0000\u0000\u0000"+
		"`Z\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\r\u0001\u0000\u0000\u0000df\u0005\u0011"+
		"\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u000f\u0001\u0000\u0000"+
		"\u0000ip\u0005\u0005\u0000\u0000jp\u0005\u0006\u0000\u0000kl\u0005\u0007"+
		"\u0000\u0000lm\u0005\u0016\u0000\u0000mn\u0005\u0014\u0000\u0000np\u0003"+
		"\u0006\u0003\u0000oi\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000"+
		"ok\u0001\u0000\u0000\u0000p\u0011\u0001\u0000\u0000\u0000qs\u0005\u0011"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0013\u0001\u0000\u0000"+
		"\u0000vw\u0003\u000e\u0007\u0000wx\u0005\u001b\u0000\u0000xz\u0003\u0006"+
		"\u0003\u0000y{\u0005\u0016\u0000\u0000zy\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u001d\u0000\u0000"+
		"}\u0015\u0001\u0000\u0000\u0000~\u007f\u0005\b\u0000\u0000\u007f\u00b6"+
		"\u0005\u001d\u0000\u0000\u0080\u0085\u0005\t\u0000\u0000\u0081\u0082\u0005"+
		"\u0014\u0000\u0000\u0082\u0083\u0005\u001c\u0000\u0000\u0083\u0084\u0005"+
		"\u0010\u0000\u0000\u0084\u0086\u0005\u001b\u0000\u0000\u0085\u0081\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u00b6\u0005\u001d\u0000\u0000\u0088\u0089\u0005"+
		"\n\u0000\u0000\u0089\u008b\u0005\u001d\u0000\u0000\u008a\u008c\u0003\u0014"+
		"\n\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u00b6\u0001\u0000\u0000\u0000\u008f\u0090\u0005\f\u0000\u0000"+
		"\u0090\u0092\u0005\u001d\u0000\u0000\u0091\u0093\u0003\u0014\n\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u00b6\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u000b\u0000\u0000\u0097"+
		"\u0099\u0005\u001d\u0000\u0000\u0098\u009a\u0003\u0014\n\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00b6"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005\r\u0000\u0000\u009e\u00a0\u0005"+
		"\u001d\u0000\u0000\u009f\u00a1\u0003\u0014\n\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00b6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\u000e\u0000\u0000\u00a5\u00a7\u0005\u001d"+
		"\u0000\u0000\u00a6\u00a8\u0003\u0014\n\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00b6\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005\u000f\u0000\u0000\u00ac\u00ad\u0005\u001d\u0000"+
		"\u0000\u00ad\u00ae\u0005\u0001\u0000\u0000\u00ae\u00af\u0003\u0006\u0003"+
		"\u0000\u00af\u00b1\u0005\u001d\u0000\u0000\u00b0\u00b2\u0003\u0014\n\u0000"+
		"\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5~\u0001\u0000\u0000\u0000\u00b5"+
		"\u0080\u0001\u0000\u0000\u0000\u00b5\u0088\u0001\u0000\u0000\u0000\u00b5"+
		"\u008f\u0001\u0000\u0000\u0000\u00b5\u0096\u0001\u0000\u0000\u0000\u00b5"+
		"\u009d\u0001\u0000\u0000\u0000\u00b5\u00a4\u0001\u0000\u0000\u0000\u00b5"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b6\u0017\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0003\u0006\u0003\u0000\u00b8\u00b9\u0005\u0019\u0000\u0000\u00b9"+
		"\u00ba\u0005\u001d\u0000\u0000\u00ba\u0019\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0003\u000e\u0007\u0000\u00bc\u00bd\u0005\u001d\u0000\u0000\u00bd"+
		"\u00be\u0003\u0018\f\u0000\u00be\u00bf\u0005\u001c\u0000\u0000\u00bf\u00c0"+
		"\u0003\u0010\b\u0000\u00c0\u00c3\u0005\u001b\u0000\u0000\u00c1\u00c2\u0005"+
		"\u001d\u0000\u0000\u00c2\u00c4\u0003\f\u0006\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005\u001d\u0000\u0000\u00c6\u00c7\u0005\u0002"+
		"\u0000\u0000\u00c7\u00c8\u0003\u0016\u000b\u0000\u00c8\u00ca\u0005\u001d"+
		"\u0000\u0000\u00c9\u00cb\u0003\f\u0006\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u001b\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0003\u000e\u0007\u0000\u00cd\u00ce\u0005\u001d\u0000"+
		"\u0000\u00ce\u00d0\u0003\n\u0005\u0000\u00cf\u00d1\u0003\f\u0006\u0000"+
		"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0003\u0000\u0000"+
		"\u00d3\u00d7\u0003\u0010\b\u0000\u00d4\u00d5\u0005\u001d\u0000\u0000\u00d5"+
		"\u00d6\u0005\u0004\u0000\u0000\u00d6\u00d8\u0003\u0012\t\u0000\u00d7\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00db\u0005\u001d\u0000\u0000\u00da\u00dc"+
		"\u0003\u001a\r\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u001d\u0001\u0000\u0000\u0000\u00df\u00e0\u0003"+
		"\b\u0004\u0000\u00e0\u00e1\u0005\u001d\u0000\u0000\u00e1\u00e3\u0003\n"+
		"\u0005\u0000\u00e2\u00e4\u0003\f\u0006\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005\u001d\u0000\u0000\u00e6\u00e8\u0003\u001c\u000e"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u001d\u0000"+
		"\u0000\u00ec\u00ed\u0005\u001d\u0000\u0000\u00ed\u00ee\u0003\f\u0006\u0000"+
		"\u00ee\u001f\u0001\u0000\u0000\u0000\u001f(.28;AEJOU\\bgotz\u0085\u008d"+
		"\u0094\u009b\u00a2\u00a9\u00b3\u00b5\u00c3\u00ca\u00d0\u00d7\u00dd\u00e3"+
		"\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}