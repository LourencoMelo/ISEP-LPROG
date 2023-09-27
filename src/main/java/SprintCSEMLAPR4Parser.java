// Generated from C:/Users/soare_wi5nw81/Desktop/d/Desktop/Faculdade/2 ano/2 semestre/LPROG/lprog2021sprintC/src/main/java\SprintCSEMLAPR4.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SprintCSEMLAPR4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, STRING=30, DOUBLE=31, 
		INT=32, MAIS=33, IGUAL=34, MENOS=35, MUL=36, DIV=37, VIRG=38, DOISPONTOS=39, 
		ESPACO=40, WS=41, ENTER=42;
	public static final int
		RULE_inicio = 0, RULE_lerRapelCliente = 1, RULE_alterarRapelCliente = 2, 
		RULE_lerPrecoProduto = 3, RULE_alterarPrecoProduto = 4, RULE_calcularPrecoTotal = 5, 
		RULE_aplicarDescontoRapel = 6, RULE_enviarEmail = 7, RULE_reportarAnomaliaDeComunicacao = 8, 
		RULE_reportarAnomaliaNumEquipamento = 9, RULE_reportarAnomaliaNumaApp = 10, 
		RULE_requerCotacaoVendaPGrosso = 11, RULE_autAppDescFinanc = 12, RULE_alterarNibCliente = 13, 
		RULE_alterarResidenciaCliente = 14, RULE_alterarEstadoCivilCliente = 15, 
		RULE_atualHabilit = 16, RULE_marcaFerias = 17, RULE_justificaFalta = 18, 
		RULE_informaAusenciaFutura = 19, RULE_remetente = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "lerRapelCliente", "alterarRapelCliente", "lerPrecoProduto", 
			"alterarPrecoProduto", "calcularPrecoTotal", "aplicarDescontoRapel", 
			"enviarEmail", "reportarAnomaliaDeComunicacao", "reportarAnomaliaNumEquipamento", 
			"reportarAnomaliaNumaApp", "requerCotacaoVendaPGrosso", "autAppDescFinanc", 
			"alterarNibCliente", "alterarResidenciaCliente", "alterarEstadoCivilCliente", 
			"atualHabilit", "marcaFerias", "justificaFalta", "informaAusenciaFutura", 
			"remetente"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'lerRapelCliente('", "'.txt'", "'.xml'", "')'", "'alterarRapelCliente('", 
			"'lerPrecoProduto('", "'alterarPrecoProduto('", "'calcularPrecoTotal('", 
			"'aplicarDescontoRapel('", "'enviarEmail('", "'reportarAnomaliaDeComunicacao('", 
			"'.png'", "'.jpg'", "'.jpeg'", "'reportarAnomaliaNumEquipamento('", "'reportarAnomaliaNumaApp('", 
			"'requerCotacaoVendaPGrosso('", "'autAppDescFinanc('", "'0'", "'\u00C3\u0161nica'", 
			"'alterarNibCliente('", "'alterarResidenciaCliente('", "'alterarEstadoCivilCliente('", 
			"'atualizaHabilit('", "'marcaFerias('", "'justificaFalta('", "'informaAusenciaFutura('", 
			"'@'", "'.'", null, null, null, "'+'", "'='", "'-'", "'*'", "'/'", "','", 
			"':'", "' '", null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "DOUBLE", "INT", "MAIS", 
			"IGUAL", "MENOS", "MUL", "DIV", "VIRG", "DOISPONTOS", "ESPACO", "WS", 
			"ENTER"
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
	public String getGrammarFileName() { return "SprintCSEMLAPR4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SprintCSEMLAPR4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public LerRapelClienteContext lerRapelCliente() {
			return getRuleContext(LerRapelClienteContext.class,0);
		}
		public TerminalNode ENTER() { return getToken(SprintCSEMLAPR4Parser.ENTER, 0); }
		public AlterarRapelClienteContext alterarRapelCliente() {
			return getRuleContext(AlterarRapelClienteContext.class,0);
		}
		public LerPrecoProdutoContext lerPrecoProduto() {
			return getRuleContext(LerPrecoProdutoContext.class,0);
		}
		public AlterarPrecoProdutoContext alterarPrecoProduto() {
			return getRuleContext(AlterarPrecoProdutoContext.class,0);
		}
		public CalcularPrecoTotalContext calcularPrecoTotal() {
			return getRuleContext(CalcularPrecoTotalContext.class,0);
		}
		public AplicarDescontoRapelContext aplicarDescontoRapel() {
			return getRuleContext(AplicarDescontoRapelContext.class,0);
		}
		public EnviarEmailContext enviarEmail() {
			return getRuleContext(EnviarEmailContext.class,0);
		}
		public ReportarAnomaliaDeComunicacaoContext reportarAnomaliaDeComunicacao() {
			return getRuleContext(ReportarAnomaliaDeComunicacaoContext.class,0);
		}
		public ReportarAnomaliaNumEquipamentoContext reportarAnomaliaNumEquipamento() {
			return getRuleContext(ReportarAnomaliaNumEquipamentoContext.class,0);
		}
		public ReportarAnomaliaNumaAppContext reportarAnomaliaNumaApp() {
			return getRuleContext(ReportarAnomaliaNumaAppContext.class,0);
		}
		public RequerCotacaoVendaPGrossoContext requerCotacaoVendaPGrosso() {
			return getRuleContext(RequerCotacaoVendaPGrossoContext.class,0);
		}
		public AutAppDescFinancContext autAppDescFinanc() {
			return getRuleContext(AutAppDescFinancContext.class,0);
		}
		public AlterarNibClienteContext alterarNibCliente() {
			return getRuleContext(AlterarNibClienteContext.class,0);
		}
		public AlterarResidenciaClienteContext alterarResidenciaCliente() {
			return getRuleContext(AlterarResidenciaClienteContext.class,0);
		}
		public AlterarEstadoCivilClienteContext alterarEstadoCivilCliente() {
			return getRuleContext(AlterarEstadoCivilClienteContext.class,0);
		}
		public AtualHabilitContext atualHabilit() {
			return getRuleContext(AtualHabilitContext.class,0);
		}
		public MarcaFeriasContext marcaFerias() {
			return getRuleContext(MarcaFeriasContext.class,0);
		}
		public JustificaFaltaContext justificaFalta() {
			return getRuleContext(JustificaFaltaContext.class,0);
		}
		public InformaAusenciaFuturaContext informaAusenciaFutura() {
			return getRuleContext(InformaAusenciaFuturaContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		return inicio(0);
	}

	private InicioContext inicio(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InicioContext _localctx = new InicioContext(_ctx, _parentState);
		InicioContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_inicio, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(43);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(44);
						lerRapelCliente();
						setState(45);
						match(ENTER);
						}
						break;
					case 2:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(47);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(48);
						alterarRapelCliente();
						setState(49);
						match(ENTER);
						}
						break;
					case 3:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(51);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(52);
						lerPrecoProduto();
						setState(53);
						match(ENTER);
						}
						break;
					case 4:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(55);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(56);
						alterarPrecoProduto();
						setState(57);
						match(ENTER);
						}
						break;
					case 5:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(59);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(60);
						calcularPrecoTotal();
						setState(61);
						match(ENTER);
						}
						break;
					case 6:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(63);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(64);
						aplicarDescontoRapel();
						setState(65);
						match(ENTER);
						}
						break;
					case 7:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(67);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(68);
						enviarEmail();
						setState(69);
						match(ENTER);
						}
						break;
					case 8:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(71);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(72);
						reportarAnomaliaDeComunicacao();
						setState(73);
						match(ENTER);
						}
						break;
					case 9:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(75);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(76);
						reportarAnomaliaNumEquipamento();
						setState(77);
						match(ENTER);
						}
						break;
					case 10:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(79);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(80);
						reportarAnomaliaNumaApp();
						setState(81);
						match(ENTER);
						}
						break;
					case 11:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(83);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(84);
						requerCotacaoVendaPGrosso();
						setState(85);
						match(ENTER);
						}
						break;
					case 12:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(87);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(88);
						autAppDescFinanc();
						setState(89);
						match(ENTER);
						}
						break;
					case 13:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(91);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(92);
						alterarNibCliente();
						setState(93);
						match(ENTER);
						}
						break;
					case 14:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(95);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(96);
						alterarResidenciaCliente();
						setState(97);
						match(ENTER);
						}
						break;
					case 15:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(99);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(100);
						alterarEstadoCivilCliente();
						setState(101);
						match(ENTER);
						}
						break;
					case 16:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(103);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(104);
						atualHabilit();
						setState(105);
						match(ENTER);
						}
						break;
					case 17:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(107);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(108);
						marcaFerias();
						setState(109);
						match(ENTER);
						}
						break;
					case 18:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(111);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(112);
						justificaFalta();
						setState(113);
						match(ENTER);
						}
						break;
					case 19:
						{
						_localctx = new InicioContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inicio);
						setState(115);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(116);
						informaAusenciaFutura();
						setState(117);
						match(ENTER);
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class LerRapelClienteContext extends ParserRuleContext {
		public LerRapelClienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lerRapelCliente; }
	 
		public LerRapelClienteContext() { }
		public void copyFrom(LerRapelClienteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoLerRapelClienteContext extends LerRapelClienteContext {
		public Token fich;
		public Token tipo;
		public Token idCliente;
		public TerminalNode VIRG() { return getToken(SprintCSEMLAPR4Parser.VIRG, 0); }
		public TerminalNode STRING() { return getToken(SprintCSEMLAPR4Parser.STRING, 0); }
		public TerminalNode INT() { return getToken(SprintCSEMLAPR4Parser.INT, 0); }
		public MetodoLerRapelClienteContext(LerRapelClienteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoLerRapelCliente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoLerRapelCliente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoLerRapelCliente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LerRapelClienteContext lerRapelCliente() throws RecognitionException {
		LerRapelClienteContext _localctx = new LerRapelClienteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lerRapelCliente);
		int _la;
		try {
			_localctx = new MetodoLerRapelClienteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__0);
			setState(125);
			((MetodoLerRapelClienteContext)_localctx).fich = match(STRING);
			setState(126);
			((MetodoLerRapelClienteContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoLerRapelClienteContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			match(VIRG);
			setState(128);
			((MetodoLerRapelClienteContext)_localctx).idCliente = match(INT);
			setState(129);
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

	public static class AlterarRapelClienteContext extends ParserRuleContext {
		public AlterarRapelClienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterarRapelCliente; }
	 
		public AlterarRapelClienteContext() { }
		public void copyFrom(AlterarRapelClienteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoAlterarRapelClienteContext extends AlterarRapelClienteContext {
		public Token fich;
		public Token tipo;
		public Token idCliente;
		public Token novoRapel;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public TerminalNode STRING() { return getToken(SprintCSEMLAPR4Parser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public MetodoAlterarRapelClienteContext(AlterarRapelClienteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoAlterarRapelCliente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoAlterarRapelCliente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoAlterarRapelCliente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterarRapelClienteContext alterarRapelCliente() throws RecognitionException {
		AlterarRapelClienteContext _localctx = new AlterarRapelClienteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterarRapelCliente);
		int _la;
		try {
			_localctx = new MetodoAlterarRapelClienteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__4);
			setState(132);
			((MetodoAlterarRapelClienteContext)_localctx).fich = match(STRING);
			setState(133);
			((MetodoAlterarRapelClienteContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoAlterarRapelClienteContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			match(VIRG);
			setState(135);
			((MetodoAlterarRapelClienteContext)_localctx).idCliente = match(INT);
			setState(136);
			match(VIRG);
			setState(137);
			((MetodoAlterarRapelClienteContext)_localctx).novoRapel = match(INT);
			setState(138);
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

	public static class LerPrecoProdutoContext extends ParserRuleContext {
		public LerPrecoProdutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lerPrecoProduto; }
	 
		public LerPrecoProdutoContext() { }
		public void copyFrom(LerPrecoProdutoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoLerPrecoProdutoContext extends LerPrecoProdutoContext {
		public Token fich;
		public Token tipo;
		public Token idProduto;
		public TerminalNode VIRG() { return getToken(SprintCSEMLAPR4Parser.VIRG, 0); }
		public TerminalNode STRING() { return getToken(SprintCSEMLAPR4Parser.STRING, 0); }
		public TerminalNode INT() { return getToken(SprintCSEMLAPR4Parser.INT, 0); }
		public MetodoLerPrecoProdutoContext(LerPrecoProdutoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoLerPrecoProduto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoLerPrecoProduto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoLerPrecoProduto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LerPrecoProdutoContext lerPrecoProduto() throws RecognitionException {
		LerPrecoProdutoContext _localctx = new LerPrecoProdutoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lerPrecoProduto);
		int _la;
		try {
			_localctx = new MetodoLerPrecoProdutoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__5);
			setState(141);
			((MetodoLerPrecoProdutoContext)_localctx).fich = match(STRING);
			setState(142);
			((MetodoLerPrecoProdutoContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoLerPrecoProdutoContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			match(VIRG);
			setState(144);
			((MetodoLerPrecoProdutoContext)_localctx).idProduto = match(INT);
			setState(145);
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

	public static class AlterarPrecoProdutoContext extends ParserRuleContext {
		public AlterarPrecoProdutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterarPrecoProduto; }
	 
		public AlterarPrecoProdutoContext() { }
		public void copyFrom(AlterarPrecoProdutoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoAlterarPrecoProdutoContext extends AlterarPrecoProdutoContext {
		public Token fich;
		public Token tipo;
		public Token idProduto;
		public Token precoNovo;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public TerminalNode STRING() { return getToken(SprintCSEMLAPR4Parser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public MetodoAlterarPrecoProdutoContext(AlterarPrecoProdutoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoAlterarPrecoProduto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoAlterarPrecoProduto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoAlterarPrecoProduto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterarPrecoProdutoContext alterarPrecoProduto() throws RecognitionException {
		AlterarPrecoProdutoContext _localctx = new AlterarPrecoProdutoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alterarPrecoProduto);
		int _la;
		try {
			_localctx = new MetodoAlterarPrecoProdutoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__6);
			setState(148);
			((MetodoAlterarPrecoProdutoContext)_localctx).fich = match(STRING);
			setState(149);
			((MetodoAlterarPrecoProdutoContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoAlterarPrecoProdutoContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
			match(VIRG);
			setState(151);
			((MetodoAlterarPrecoProdutoContext)_localctx).idProduto = match(INT);
			setState(152);
			match(VIRG);
			setState(153);
			((MetodoAlterarPrecoProdutoContext)_localctx).precoNovo = match(INT);
			setState(154);
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

	public static class CalcularPrecoTotalContext extends ParserRuleContext {
		public CalcularPrecoTotalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcularPrecoTotal; }
	 
		public CalcularPrecoTotalContext() { }
		public void copyFrom(CalcularPrecoTotalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoCalcularPrecoTotalContext extends CalcularPrecoTotalContext {
		public Token fich;
		public Token tipo;
		public Token idProduto;
		public Token quatidadeProduto;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public TerminalNode STRING() { return getToken(SprintCSEMLAPR4Parser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public MetodoCalcularPrecoTotalContext(CalcularPrecoTotalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoCalcularPrecoTotal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoCalcularPrecoTotal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoCalcularPrecoTotal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcularPrecoTotalContext calcularPrecoTotal() throws RecognitionException {
		CalcularPrecoTotalContext _localctx = new CalcularPrecoTotalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_calcularPrecoTotal);
		int _la;
		try {
			_localctx = new MetodoCalcularPrecoTotalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__7);
			setState(157);
			((MetodoCalcularPrecoTotalContext)_localctx).fich = match(STRING);
			setState(158);
			((MetodoCalcularPrecoTotalContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoCalcularPrecoTotalContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(VIRG);
			setState(160);
			((MetodoCalcularPrecoTotalContext)_localctx).idProduto = match(INT);
			setState(161);
			match(VIRG);
			setState(162);
			((MetodoCalcularPrecoTotalContext)_localctx).quatidadeProduto = match(INT);
			setState(163);
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

	public static class AplicarDescontoRapelContext extends ParserRuleContext {
		public AplicarDescontoRapelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aplicarDescontoRapel; }
	 
		public AplicarDescontoRapelContext() { }
		public void copyFrom(AplicarDescontoRapelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoAplicarDescontoRapelContext extends AplicarDescontoRapelContext {
		public Token fich;
		public Token tipo;
		public Token idProduto;
		public Token quatidadeProduto;
		public Token fich2;
		public Token tipo2;
		public Token idCliente;
		public Token x;
		public Token y;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SprintCSEMLAPR4Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SprintCSEMLAPR4Parser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public MetodoAplicarDescontoRapelContext(AplicarDescontoRapelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoAplicarDescontoRapel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoAplicarDescontoRapel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoAplicarDescontoRapel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AplicarDescontoRapelContext aplicarDescontoRapel() throws RecognitionException {
		AplicarDescontoRapelContext _localctx = new AplicarDescontoRapelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_aplicarDescontoRapel);
		int _la;
		try {
			_localctx = new MetodoAplicarDescontoRapelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__8);
			setState(166);
			((MetodoAplicarDescontoRapelContext)_localctx).fich = match(STRING);
			setState(167);
			((MetodoAplicarDescontoRapelContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoAplicarDescontoRapelContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			match(VIRG);
			setState(169);
			((MetodoAplicarDescontoRapelContext)_localctx).idProduto = match(INT);
			setState(170);
			match(VIRG);
			setState(171);
			((MetodoAplicarDescontoRapelContext)_localctx).quatidadeProduto = match(INT);
			setState(172);
			match(VIRG);
			setState(173);
			((MetodoAplicarDescontoRapelContext)_localctx).fich2 = match(STRING);
			setState(174);
			((MetodoAplicarDescontoRapelContext)_localctx).tipo2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoAplicarDescontoRapelContext)_localctx).tipo2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(175);
			match(VIRG);
			setState(176);
			((MetodoAplicarDescontoRapelContext)_localctx).idCliente = match(INT);
			setState(177);
			match(VIRG);
			setState(178);
			((MetodoAplicarDescontoRapelContext)_localctx).x = match(INT);
			setState(179);
			match(VIRG);
			setState(180);
			((MetodoAplicarDescontoRapelContext)_localctx).y = match(INT);
			setState(181);
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

	public static class EnviarEmailContext extends ParserRuleContext {
		public EnviarEmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enviarEmail; }
	 
		public EnviarEmailContext() { }
		public void copyFrom(EnviarEmailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoEnviarEmailContext extends EnviarEmailContext {
		public RemetenteContext remet;
		public Token assunto;
		public Token mensagem;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public RemetenteContext remetente() {
			return getRuleContext(RemetenteContext.class,0);
		}
		public MetodoEnviarEmailContext(EnviarEmailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoEnviarEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoEnviarEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoEnviarEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnviarEmailContext enviarEmail() throws RecognitionException {
		EnviarEmailContext _localctx = new EnviarEmailContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enviarEmail);
		try {
			int _alt;
			_localctx = new MetodoEnviarEmailContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__9);
			setState(184);
			((MetodoEnviarEmailContext)_localctx).remet = remetente();
			setState(185);
			match(VIRG);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(186);
					((MetodoEnviarEmailContext)_localctx).assunto = matchWildcard();
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(192);
			match(VIRG);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(193);
					((MetodoEnviarEmailContext)_localctx).mensagem = matchWildcard();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(199);
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

	public static class ReportarAnomaliaDeComunicacaoContext extends ParserRuleContext {
		public ReportarAnomaliaDeComunicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reportarAnomaliaDeComunicacao; }
	 
		public ReportarAnomaliaDeComunicacaoContext() { }
		public void copyFrom(ReportarAnomaliaDeComunicacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoReportarAnomaliaDeComunicacaoContext extends ReportarAnomaliaDeComunicacaoContext {
		public Token tipoDeAnomalia;
		public Token tipoDeComunicacao;
		public Token descricao;
		public Token fotoProva;
		public Token tipo;
		public RemetenteContext remet;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SprintCSEMLAPR4Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SprintCSEMLAPR4Parser.STRING, i);
		}
		public RemetenteContext remetente() {
			return getRuleContext(RemetenteContext.class,0);
		}
		public MetodoReportarAnomaliaDeComunicacaoContext(ReportarAnomaliaDeComunicacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoReportarAnomaliaDeComunicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoReportarAnomaliaDeComunicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoReportarAnomaliaDeComunicacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportarAnomaliaDeComunicacaoContext reportarAnomaliaDeComunicacao() throws RecognitionException {
		ReportarAnomaliaDeComunicacaoContext _localctx = new ReportarAnomaliaDeComunicacaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_reportarAnomaliaDeComunicacao);
		int _la;
		try {
			_localctx = new MetodoReportarAnomaliaDeComunicacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__10);
			setState(202);
			((MetodoReportarAnomaliaDeComunicacaoContext)_localctx).tipoDeAnomalia = match(STRING);
			setState(203);
			match(VIRG);
			setState(204);
			((MetodoReportarAnomaliaDeComunicacaoContext)_localctx).tipoDeComunicacao = match(STRING);
			setState(205);
			match(VIRG);
			setState(206);
			((MetodoReportarAnomaliaDeComunicacaoContext)_localctx).descricao = match(STRING);
			setState(207);
			match(VIRG);
			setState(208);
			((MetodoReportarAnomaliaDeComunicacaoContext)_localctx).fotoProva = match(STRING);
			setState(209);
			((MetodoReportarAnomaliaDeComunicacaoContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
				((MetodoReportarAnomaliaDeComunicacaoContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
			match(VIRG);
			setState(211);
			((MetodoReportarAnomaliaDeComunicacaoContext)_localctx).remet = remetente();
			setState(212);
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

	public static class ReportarAnomaliaNumEquipamentoContext extends ParserRuleContext {
		public ReportarAnomaliaNumEquipamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reportarAnomaliaNumEquipamento; }
	 
		public ReportarAnomaliaNumEquipamentoContext() { }
		public void copyFrom(ReportarAnomaliaNumEquipamentoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoReportarAnomaliaNumEquipamentoContext extends ReportarAnomaliaNumEquipamentoContext {
		public Token tipoDeAnomalia;
		public Token tipoDeEquipamento;
		public Token descricao;
		public Token fotoProva;
		public Token tipo;
		public RemetenteContext remet;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SprintCSEMLAPR4Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SprintCSEMLAPR4Parser.STRING, i);
		}
		public RemetenteContext remetente() {
			return getRuleContext(RemetenteContext.class,0);
		}
		public MetodoReportarAnomaliaNumEquipamentoContext(ReportarAnomaliaNumEquipamentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoReportarAnomaliaNumEquipamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoReportarAnomaliaNumEquipamento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoReportarAnomaliaNumEquipamento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportarAnomaliaNumEquipamentoContext reportarAnomaliaNumEquipamento() throws RecognitionException {
		ReportarAnomaliaNumEquipamentoContext _localctx = new ReportarAnomaliaNumEquipamentoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reportarAnomaliaNumEquipamento);
		int _la;
		try {
			_localctx = new MetodoReportarAnomaliaNumEquipamentoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__14);
			setState(215);
			((MetodoReportarAnomaliaNumEquipamentoContext)_localctx).tipoDeAnomalia = match(STRING);
			setState(216);
			match(VIRG);
			setState(217);
			((MetodoReportarAnomaliaNumEquipamentoContext)_localctx).tipoDeEquipamento = match(STRING);
			setState(218);
			match(VIRG);
			setState(219);
			((MetodoReportarAnomaliaNumEquipamentoContext)_localctx).descricao = match(STRING);
			setState(220);
			match(VIRG);
			setState(221);
			((MetodoReportarAnomaliaNumEquipamentoContext)_localctx).fotoProva = match(STRING);
			setState(222);
			((MetodoReportarAnomaliaNumEquipamentoContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
				((MetodoReportarAnomaliaNumEquipamentoContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
			match(VIRG);
			setState(224);
			((MetodoReportarAnomaliaNumEquipamentoContext)_localctx).remet = remetente();
			setState(225);
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

	public static class ReportarAnomaliaNumaAppContext extends ParserRuleContext {
		public ReportarAnomaliaNumaAppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reportarAnomaliaNumaApp; }
	 
		public ReportarAnomaliaNumaAppContext() { }
		public void copyFrom(ReportarAnomaliaNumaAppContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoReportarAnomaliaNumaAppContext extends ReportarAnomaliaNumaAppContext {
		public Token tipoDeAnomalia;
		public Token tipoDeEquipamentoAndroidOrApple;
		public Token descricao;
		public Token fotoOuPrintProva;
		public Token tipo;
		public RemetenteContext remet;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SprintCSEMLAPR4Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SprintCSEMLAPR4Parser.STRING, i);
		}
		public RemetenteContext remetente() {
			return getRuleContext(RemetenteContext.class,0);
		}
		public MetodoReportarAnomaliaNumaAppContext(ReportarAnomaliaNumaAppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoReportarAnomaliaNumaApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoReportarAnomaliaNumaApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoReportarAnomaliaNumaApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportarAnomaliaNumaAppContext reportarAnomaliaNumaApp() throws RecognitionException {
		ReportarAnomaliaNumaAppContext _localctx = new ReportarAnomaliaNumaAppContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_reportarAnomaliaNumaApp);
		int _la;
		try {
			_localctx = new MetodoReportarAnomaliaNumaAppContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__15);
			setState(228);
			((MetodoReportarAnomaliaNumaAppContext)_localctx).tipoDeAnomalia = match(STRING);
			setState(229);
			match(VIRG);
			setState(230);
			((MetodoReportarAnomaliaNumaAppContext)_localctx).tipoDeEquipamentoAndroidOrApple = match(STRING);
			setState(231);
			match(VIRG);
			setState(232);
			((MetodoReportarAnomaliaNumaAppContext)_localctx).descricao = match(STRING);
			setState(233);
			match(VIRG);
			setState(234);
			((MetodoReportarAnomaliaNumaAppContext)_localctx).fotoOuPrintProva = match(STRING);
			setState(235);
			((MetodoReportarAnomaliaNumaAppContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
				((MetodoReportarAnomaliaNumaAppContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(236);
			match(VIRG);
			setState(237);
			((MetodoReportarAnomaliaNumaAppContext)_localctx).remet = remetente();
			setState(238);
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

	public static class RequerCotacaoVendaPGrossoContext extends ParserRuleContext {
		public RequerCotacaoVendaPGrossoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requerCotacaoVendaPGrosso; }
	 
		public RequerCotacaoVendaPGrossoContext() { }
		public void copyFrom(RequerCotacaoVendaPGrossoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoRequerCotacaoVendaPGrossoContext extends RequerCotacaoVendaPGrossoContext {
		public Token fich;
		public Token tipo;
		public Token codigoProduto;
		public Token quantidadePretendida;
		public Token tipoCliente;
		public RemetenteContext remet;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SprintCSEMLAPR4Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SprintCSEMLAPR4Parser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public RemetenteContext remetente() {
			return getRuleContext(RemetenteContext.class,0);
		}
		public MetodoRequerCotacaoVendaPGrossoContext(RequerCotacaoVendaPGrossoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoRequerCotacaoVendaPGrosso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoRequerCotacaoVendaPGrosso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoRequerCotacaoVendaPGrosso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequerCotacaoVendaPGrossoContext requerCotacaoVendaPGrosso() throws RecognitionException {
		RequerCotacaoVendaPGrossoContext _localctx = new RequerCotacaoVendaPGrossoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_requerCotacaoVendaPGrosso);
		int _la;
		try {
			_localctx = new MetodoRequerCotacaoVendaPGrossoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__16);
			setState(241);
			((MetodoRequerCotacaoVendaPGrossoContext)_localctx).fich = match(STRING);
			setState(242);
			((MetodoRequerCotacaoVendaPGrossoContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoRequerCotacaoVendaPGrossoContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(243);
			match(VIRG);
			setState(244);
			((MetodoRequerCotacaoVendaPGrossoContext)_localctx).codigoProduto = match(INT);
			setState(245);
			match(VIRG);
			setState(246);
			((MetodoRequerCotacaoVendaPGrossoContext)_localctx).quantidadePretendida = match(INT);
			setState(247);
			match(VIRG);
			setState(248);
			((MetodoRequerCotacaoVendaPGrossoContext)_localctx).tipoCliente = match(STRING);
			setState(249);
			match(VIRG);
			setState(250);
			((MetodoRequerCotacaoVendaPGrossoContext)_localctx).remet = remetente();
			setState(251);
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

	public static class AutAppDescFinancContext extends ParserRuleContext {
		public AutAppDescFinancContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autAppDescFinanc; }
	 
		public AutAppDescFinancContext() { }
		public void copyFrom(AutAppDescFinancContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoAutAppDescFinancContext extends AutAppDescFinancContext {
		public Token codigoClienteConsoantes;
		public Token codigoClienteNumeros;
		public Token nomeCliente;
		public Token tipoDesconto;
		public Token recorrencia;
		public Token valorDesconto;
		public Token idFatura;
		public Token dia;
		public Token mes;
		public Token ano;
		public Token fundamento;
		public RemetenteContext emailCliente;
		public Token percentagemDesconto;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(SprintCSEMLAPR4Parser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(SprintCSEMLAPR4Parser.DOISPONTOS, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SprintCSEMLAPR4Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SprintCSEMLAPR4Parser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public TerminalNode DOUBLE() { return getToken(SprintCSEMLAPR4Parser.DOUBLE, 0); }
		public RemetenteContext remetente() {
			return getRuleContext(RemetenteContext.class,0);
		}
		public MetodoAutAppDescFinancContext(AutAppDescFinancContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoAutAppDescFinanc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoAutAppDescFinanc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoAutAppDescFinanc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutAppDescFinancContext autAppDescFinanc() throws RecognitionException {
		AutAppDescFinancContext _localctx = new AutAppDescFinancContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_autAppDescFinanc);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new MetodoAutAppDescFinancContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__17);
				setState(254);
				((MetodoAutAppDescFinancContext)_localctx).codigoClienteConsoantes = match(STRING);
				setState(255);
				((MetodoAutAppDescFinancContext)_localctx).codigoClienteNumeros = match(INT);
				setState(256);
				match(VIRG);
				setState(257);
				((MetodoAutAppDescFinancContext)_localctx).nomeCliente = match(STRING);
				setState(258);
				match(VIRG);
				setState(259);
				((MetodoAutAppDescFinancContext)_localctx).tipoDesconto = match(STRING);
				setState(260);
				match(VIRG);
				setState(261);
				((MetodoAutAppDescFinancContext)_localctx).recorrencia = match(STRING);
				setState(262);
				match(VIRG);
				setState(263);
				match(T__18);
				setState(264);
				match(VIRG);
				setState(265);
				((MetodoAutAppDescFinancContext)_localctx).valorDesconto = match(DOUBLE);
				setState(266);
				match(VIRG);
				setState(267);
				((MetodoAutAppDescFinancContext)_localctx).idFatura = match(INT);
				setState(268);
				match(VIRG);
				setState(269);
				((MetodoAutAppDescFinancContext)_localctx).dia = match(INT);
				setState(270);
				match(DOISPONTOS);
				setState(271);
				((MetodoAutAppDescFinancContext)_localctx).mes = match(INT);
				setState(272);
				match(DOISPONTOS);
				setState(273);
				((MetodoAutAppDescFinancContext)_localctx).ano = match(INT);
				setState(274);
				match(VIRG);
				setState(275);
				((MetodoAutAppDescFinancContext)_localctx).fundamento = match(STRING);
				setState(276);
				match(VIRG);
				setState(277);
				((MetodoAutAppDescFinancContext)_localctx).emailCliente = remetente();
				setState(278);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new MetodoAutAppDescFinancContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(T__17);
				setState(281);
				((MetodoAutAppDescFinancContext)_localctx).codigoClienteConsoantes = match(STRING);
				setState(282);
				((MetodoAutAppDescFinancContext)_localctx).codigoClienteNumeros = match(INT);
				setState(283);
				match(VIRG);
				setState(284);
				((MetodoAutAppDescFinancContext)_localctx).nomeCliente = match(STRING);
				setState(285);
				match(VIRG);
				setState(286);
				((MetodoAutAppDescFinancContext)_localctx).tipoDesconto = match(STRING);
				setState(287);
				match(VIRG);
				setState(288);
				((MetodoAutAppDescFinancContext)_localctx).recorrencia = match(STRING);
				setState(289);
				match(VIRG);
				setState(290);
				((MetodoAutAppDescFinancContext)_localctx).percentagemDesconto = match(DOUBLE);
				setState(291);
				match(VIRG);
				setState(292);
				match(T__18);
				setState(293);
				match(VIRG);
				setState(294);
				((MetodoAutAppDescFinancContext)_localctx).idFatura = match(INT);
				setState(295);
				match(VIRG);
				setState(296);
				((MetodoAutAppDescFinancContext)_localctx).dia = match(INT);
				setState(297);
				match(DOISPONTOS);
				setState(298);
				((MetodoAutAppDescFinancContext)_localctx).mes = match(INT);
				setState(299);
				match(DOISPONTOS);
				setState(300);
				((MetodoAutAppDescFinancContext)_localctx).ano = match(INT);
				setState(301);
				match(VIRG);
				setState(302);
				((MetodoAutAppDescFinancContext)_localctx).fundamento = match(STRING);
				setState(303);
				match(VIRG);
				setState(304);
				((MetodoAutAppDescFinancContext)_localctx).emailCliente = remetente();
				setState(305);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new MetodoAutAppDescFinancContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(T__17);
				setState(308);
				((MetodoAutAppDescFinancContext)_localctx).codigoClienteConsoantes = match(STRING);
				setState(309);
				((MetodoAutAppDescFinancContext)_localctx).codigoClienteNumeros = match(INT);
				setState(310);
				match(VIRG);
				setState(311);
				((MetodoAutAppDescFinancContext)_localctx).nomeCliente = match(STRING);
				setState(312);
				match(VIRG);
				setState(313);
				((MetodoAutAppDescFinancContext)_localctx).tipoDesconto = match(STRING);
				setState(314);
				match(VIRG);
				setState(315);
				((MetodoAutAppDescFinancContext)_localctx).recorrencia = match(T__19);
				setState(316);
				match(VIRG);
				setState(317);
				((MetodoAutAppDescFinancContext)_localctx).percentagemDesconto = match(DOUBLE);
				setState(318);
				match(VIRG);
				setState(319);
				match(T__18);
				setState(320);
				match(VIRG);
				setState(321);
				((MetodoAutAppDescFinancContext)_localctx).idFatura = match(INT);
				setState(322);
				match(VIRG);
				setState(323);
				((MetodoAutAppDescFinancContext)_localctx).dia = match(INT);
				setState(324);
				match(DOISPONTOS);
				setState(325);
				((MetodoAutAppDescFinancContext)_localctx).mes = match(INT);
				setState(326);
				match(DOISPONTOS);
				setState(327);
				((MetodoAutAppDescFinancContext)_localctx).ano = match(INT);
				setState(328);
				match(VIRG);
				setState(329);
				((MetodoAutAppDescFinancContext)_localctx).fundamento = match(STRING);
				setState(330);
				match(VIRG);
				setState(331);
				((MetodoAutAppDescFinancContext)_localctx).emailCliente = remetente();
				setState(332);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new MetodoAutAppDescFinancContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(T__17);
				setState(335);
				((MetodoAutAppDescFinancContext)_localctx).codigoClienteConsoantes = match(STRING);
				setState(336);
				((MetodoAutAppDescFinancContext)_localctx).codigoClienteNumeros = match(INT);
				setState(337);
				match(VIRG);
				setState(338);
				((MetodoAutAppDescFinancContext)_localctx).nomeCliente = match(STRING);
				setState(339);
				match(VIRG);
				setState(340);
				((MetodoAutAppDescFinancContext)_localctx).tipoDesconto = match(STRING);
				setState(341);
				match(VIRG);
				setState(342);
				((MetodoAutAppDescFinancContext)_localctx).recorrencia = match(T__19);
				setState(343);
				match(VIRG);
				setState(344);
				match(T__18);
				setState(345);
				match(VIRG);
				setState(346);
				((MetodoAutAppDescFinancContext)_localctx).valorDesconto = match(DOUBLE);
				setState(347);
				match(VIRG);
				setState(348);
				((MetodoAutAppDescFinancContext)_localctx).idFatura = match(INT);
				setState(349);
				match(VIRG);
				setState(350);
				((MetodoAutAppDescFinancContext)_localctx).dia = match(INT);
				setState(351);
				match(DOISPONTOS);
				setState(352);
				((MetodoAutAppDescFinancContext)_localctx).mes = match(INT);
				setState(353);
				match(DOISPONTOS);
				setState(354);
				((MetodoAutAppDescFinancContext)_localctx).ano = match(INT);
				setState(355);
				match(VIRG);
				setState(356);
				((MetodoAutAppDescFinancContext)_localctx).fundamento = match(STRING);
				setState(357);
				match(VIRG);
				setState(358);
				((MetodoAutAppDescFinancContext)_localctx).emailCliente = remetente();
				setState(359);
				match(T__3);
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

	public static class AlterarNibClienteContext extends ParserRuleContext {
		public AlterarNibClienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterarNibCliente; }
	 
		public AlterarNibClienteContext() { }
		public void copyFrom(AlterarNibClienteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoAlterarNibClienteContext extends AlterarNibClienteContext {
		public Token fich;
		public Token tipo;
		public Token idCliente;
		public Token nibCliente;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public TerminalNode STRING() { return getToken(SprintCSEMLAPR4Parser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public MetodoAlterarNibClienteContext(AlterarNibClienteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoAlterarNibCliente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoAlterarNibCliente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoAlterarNibCliente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterarNibClienteContext alterarNibCliente() throws RecognitionException {
		AlterarNibClienteContext _localctx = new AlterarNibClienteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alterarNibCliente);
		int _la;
		try {
			_localctx = new MetodoAlterarNibClienteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__20);
			setState(364);
			((MetodoAlterarNibClienteContext)_localctx).fich = match(STRING);
			setState(365);
			((MetodoAlterarNibClienteContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoAlterarNibClienteContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(366);
			match(VIRG);
			setState(367);
			((MetodoAlterarNibClienteContext)_localctx).idCliente = match(INT);
			setState(368);
			match(VIRG);
			setState(369);
			((MetodoAlterarNibClienteContext)_localctx).nibCliente = match(INT);
			setState(370);
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

	public static class AlterarResidenciaClienteContext extends ParserRuleContext {
		public AlterarResidenciaClienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterarResidenciaCliente; }
	 
		public AlterarResidenciaClienteContext() { }
		public void copyFrom(AlterarResidenciaClienteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoAlterarResidenciaClienteContext extends AlterarResidenciaClienteContext {
		public Token fich;
		public Token tipo;
		public Token idCliente;
		public Token ruaNova;
		public Token doorNumber;
		public Token quatroPrimeirosDigitosCodPostal;
		public Token tresUltimosDigitosCodPostal;
		public Token concelho;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public TerminalNode MENOS() { return getToken(SprintCSEMLAPR4Parser.MENOS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SprintCSEMLAPR4Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SprintCSEMLAPR4Parser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public MetodoAlterarResidenciaClienteContext(AlterarResidenciaClienteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoAlterarResidenciaCliente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoAlterarResidenciaCliente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoAlterarResidenciaCliente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterarResidenciaClienteContext alterarResidenciaCliente() throws RecognitionException {
		AlterarResidenciaClienteContext _localctx = new AlterarResidenciaClienteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alterarResidenciaCliente);
		int _la;
		try {
			_localctx = new MetodoAlterarResidenciaClienteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__21);
			setState(373);
			((MetodoAlterarResidenciaClienteContext)_localctx).fich = match(STRING);
			setState(374);
			((MetodoAlterarResidenciaClienteContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoAlterarResidenciaClienteContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(375);
			match(VIRG);
			setState(376);
			((MetodoAlterarResidenciaClienteContext)_localctx).idCliente = match(INT);
			setState(377);
			match(VIRG);
			setState(378);
			((MetodoAlterarResidenciaClienteContext)_localctx).ruaNova = match(STRING);
			setState(379);
			match(VIRG);
			setState(380);
			((MetodoAlterarResidenciaClienteContext)_localctx).doorNumber = match(INT);
			setState(381);
			match(VIRG);
			setState(382);
			((MetodoAlterarResidenciaClienteContext)_localctx).quatroPrimeirosDigitosCodPostal = match(INT);
			setState(383);
			match(MENOS);
			setState(384);
			((MetodoAlterarResidenciaClienteContext)_localctx).tresUltimosDigitosCodPostal = match(INT);
			setState(385);
			match(VIRG);
			setState(386);
			((MetodoAlterarResidenciaClienteContext)_localctx).concelho = match(STRING);
			setState(387);
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

	public static class AlterarEstadoCivilClienteContext extends ParserRuleContext {
		public AlterarEstadoCivilClienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterarEstadoCivilCliente; }
	 
		public AlterarEstadoCivilClienteContext() { }
		public void copyFrom(AlterarEstadoCivilClienteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoAlterarEstadoCivilClienteContext extends AlterarEstadoCivilClienteContext {
		public Token fich;
		public Token tipo;
		public Token idCliente;
		public Token estadoCivil;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SprintCSEMLAPR4Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SprintCSEMLAPR4Parser.STRING, i);
		}
		public TerminalNode INT() { return getToken(SprintCSEMLAPR4Parser.INT, 0); }
		public MetodoAlterarEstadoCivilClienteContext(AlterarEstadoCivilClienteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoAlterarEstadoCivilCliente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoAlterarEstadoCivilCliente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoAlterarEstadoCivilCliente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterarEstadoCivilClienteContext alterarEstadoCivilCliente() throws RecognitionException {
		AlterarEstadoCivilClienteContext _localctx = new AlterarEstadoCivilClienteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alterarEstadoCivilCliente);
		int _la;
		try {
			_localctx = new MetodoAlterarEstadoCivilClienteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(T__22);
			setState(390);
			((MetodoAlterarEstadoCivilClienteContext)_localctx).fich = match(STRING);
			setState(391);
			((MetodoAlterarEstadoCivilClienteContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoAlterarEstadoCivilClienteContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(392);
			match(VIRG);
			setState(393);
			((MetodoAlterarEstadoCivilClienteContext)_localctx).idCliente = match(INT);
			setState(394);
			match(VIRG);
			setState(395);
			((MetodoAlterarEstadoCivilClienteContext)_localctx).estadoCivil = match(STRING);
			setState(396);
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

	public static class AtualHabilitContext extends ParserRuleContext {
		public AtualHabilitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atualHabilit; }
	 
		public AtualHabilitContext() { }
		public void copyFrom(AtualHabilitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoAtualHabilitContext extends AtualHabilitContext {
		public Token fich;
		public Token tipo;
		public Token idCliente;
		public Token habilit;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SprintCSEMLAPR4Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SprintCSEMLAPR4Parser.STRING, i);
		}
		public TerminalNode INT() { return getToken(SprintCSEMLAPR4Parser.INT, 0); }
		public MetodoAtualHabilitContext(AtualHabilitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoAtualHabilit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoAtualHabilit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoAtualHabilit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtualHabilitContext atualHabilit() throws RecognitionException {
		AtualHabilitContext _localctx = new AtualHabilitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atualHabilit);
		int _la;
		try {
			_localctx = new MetodoAtualHabilitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__23);
			setState(399);
			((MetodoAtualHabilitContext)_localctx).fich = match(STRING);
			setState(400);
			((MetodoAtualHabilitContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
				((MetodoAtualHabilitContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(401);
			match(VIRG);
			setState(402);
			((MetodoAtualHabilitContext)_localctx).idCliente = match(INT);
			setState(403);
			match(VIRG);
			setState(404);
			((MetodoAtualHabilitContext)_localctx).habilit = match(STRING);
			setState(405);
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

	public static class MarcaFeriasContext extends ParserRuleContext {
		public MarcaFeriasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marcaFerias; }
	 
		public MarcaFeriasContext() { }
		public void copyFrom(MarcaFeriasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoMarcaFeriasContext extends MarcaFeriasContext {
		public Token idCliente;
		public Token diaEntrada;
		public Token mesEntrada;
		public Token anoEntrada;
		public Token diaSaida;
		public Token mesSaida;
		public Token anoSaida;
		public RemetenteContext remet;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(SprintCSEMLAPR4Parser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(SprintCSEMLAPR4Parser.DOISPONTOS, i);
		}
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public RemetenteContext remetente() {
			return getRuleContext(RemetenteContext.class,0);
		}
		public MetodoMarcaFeriasContext(MarcaFeriasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoMarcaFerias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoMarcaFerias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoMarcaFerias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarcaFeriasContext marcaFerias() throws RecognitionException {
		MarcaFeriasContext _localctx = new MarcaFeriasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_marcaFerias);
		try {
			_localctx = new MetodoMarcaFeriasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(T__24);
			setState(408);
			((MetodoMarcaFeriasContext)_localctx).idCliente = match(INT);
			setState(409);
			match(VIRG);
			setState(410);
			((MetodoMarcaFeriasContext)_localctx).diaEntrada = match(INT);
			setState(411);
			match(DOISPONTOS);
			setState(412);
			((MetodoMarcaFeriasContext)_localctx).mesEntrada = match(INT);
			setState(413);
			match(DOISPONTOS);
			setState(414);
			((MetodoMarcaFeriasContext)_localctx).anoEntrada = match(INT);
			setState(415);
			match(VIRG);
			setState(416);
			((MetodoMarcaFeriasContext)_localctx).diaSaida = match(INT);
			setState(417);
			match(DOISPONTOS);
			setState(418);
			((MetodoMarcaFeriasContext)_localctx).mesSaida = match(INT);
			setState(419);
			match(DOISPONTOS);
			setState(420);
			((MetodoMarcaFeriasContext)_localctx).anoSaida = match(INT);
			setState(421);
			match(VIRG);
			setState(422);
			((MetodoMarcaFeriasContext)_localctx).remet = remetente();
			setState(423);
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

	public static class JustificaFaltaContext extends ParserRuleContext {
		public JustificaFaltaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justificaFalta; }
	 
		public JustificaFaltaContext() { }
		public void copyFrom(JustificaFaltaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoJustificaFaltaContext extends JustificaFaltaContext {
		public Token idCliente;
		public Token justificacao;
		public Token diaFalta;
		public Token mesFalta;
		public Token anoFalta;
		public RemetenteContext remet;
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(SprintCSEMLAPR4Parser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(SprintCSEMLAPR4Parser.DOISPONTOS, i);
		}
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public TerminalNode STRING() { return getToken(SprintCSEMLAPR4Parser.STRING, 0); }
		public RemetenteContext remetente() {
			return getRuleContext(RemetenteContext.class,0);
		}
		public MetodoJustificaFaltaContext(JustificaFaltaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoJustificaFalta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoJustificaFalta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoJustificaFalta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustificaFaltaContext justificaFalta() throws RecognitionException {
		JustificaFaltaContext _localctx = new JustificaFaltaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_justificaFalta);
		try {
			_localctx = new MetodoJustificaFaltaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(T__25);
			setState(426);
			((MetodoJustificaFaltaContext)_localctx).idCliente = match(INT);
			setState(427);
			match(VIRG);
			setState(428);
			((MetodoJustificaFaltaContext)_localctx).justificacao = match(STRING);
			setState(429);
			match(VIRG);
			setState(430);
			((MetodoJustificaFaltaContext)_localctx).diaFalta = match(INT);
			setState(431);
			match(DOISPONTOS);
			setState(432);
			((MetodoJustificaFaltaContext)_localctx).mesFalta = match(INT);
			setState(433);
			match(DOISPONTOS);
			setState(434);
			((MetodoJustificaFaltaContext)_localctx).anoFalta = match(INT);
			setState(435);
			match(VIRG);
			setState(436);
			((MetodoJustificaFaltaContext)_localctx).remet = remetente();
			setState(437);
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

	public static class InformaAusenciaFuturaContext extends ParserRuleContext {
		public InformaAusenciaFuturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informaAusenciaFutura; }
	 
		public InformaAusenciaFuturaContext() { }
		public void copyFrom(InformaAusenciaFuturaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoInformaAusenciaFuturaContext extends InformaAusenciaFuturaContext {
		public Token diaEntrada;
		public Token mesEntrada;
		public Token anoEntrada;
		public Token diaSaida;
		public Token mesSaida;
		public Token anoSaida;
		public Token tipoAusencia;
		public Token justificacao;
		public RemetenteContext remet;
		public List<TerminalNode> DOISPONTOS() { return getTokens(SprintCSEMLAPR4Parser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(SprintCSEMLAPR4Parser.DOISPONTOS, i);
		}
		public List<TerminalNode> VIRG() { return getTokens(SprintCSEMLAPR4Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(SprintCSEMLAPR4Parser.VIRG, i);
		}
		public List<TerminalNode> INT() { return getTokens(SprintCSEMLAPR4Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SprintCSEMLAPR4Parser.INT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SprintCSEMLAPR4Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SprintCSEMLAPR4Parser.STRING, i);
		}
		public RemetenteContext remetente() {
			return getRuleContext(RemetenteContext.class,0);
		}
		public MetodoInformaAusenciaFuturaContext(InformaAusenciaFuturaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoInformaAusenciaFutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoInformaAusenciaFutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoInformaAusenciaFutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InformaAusenciaFuturaContext informaAusenciaFutura() throws RecognitionException {
		InformaAusenciaFuturaContext _localctx = new InformaAusenciaFuturaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_informaAusenciaFutura);
		try {
			_localctx = new MetodoInformaAusenciaFuturaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__26);
			setState(440);
			((MetodoInformaAusenciaFuturaContext)_localctx).diaEntrada = match(INT);
			setState(441);
			match(DOISPONTOS);
			setState(442);
			((MetodoInformaAusenciaFuturaContext)_localctx).mesEntrada = match(INT);
			setState(443);
			match(DOISPONTOS);
			setState(444);
			((MetodoInformaAusenciaFuturaContext)_localctx).anoEntrada = match(INT);
			setState(445);
			match(VIRG);
			setState(446);
			((MetodoInformaAusenciaFuturaContext)_localctx).diaSaida = match(INT);
			setState(447);
			match(DOISPONTOS);
			setState(448);
			((MetodoInformaAusenciaFuturaContext)_localctx).mesSaida = match(INT);
			setState(449);
			match(DOISPONTOS);
			setState(450);
			((MetodoInformaAusenciaFuturaContext)_localctx).anoSaida = match(INT);
			setState(451);
			match(VIRG);
			setState(452);
			((MetodoInformaAusenciaFuturaContext)_localctx).tipoAusencia = match(STRING);
			setState(453);
			match(VIRG);
			setState(454);
			((MetodoInformaAusenciaFuturaContext)_localctx).justificacao = match(STRING);
			setState(455);
			match(VIRG);
			setState(456);
			((MetodoInformaAusenciaFuturaContext)_localctx).remet = remetente();
			setState(457);
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

	public static class RemetenteContext extends ParserRuleContext {
		public RemetenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remetente; }
	 
		public RemetenteContext() { }
		public void copyFrom(RemetenteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoRemetenteContext extends RemetenteContext {
		public Token left;
		public Token middle;
		public Token right;
		public MetodoRemetenteContext(RemetenteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).enterMetodoRemetente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SprintCSEMLAPR4Listener ) ((SprintCSEMLAPR4Listener)listener).exitMetodoRemetente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SprintCSEMLAPR4Visitor ) return ((SprintCSEMLAPR4Visitor<? extends T>)visitor).visitMetodoRemetente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemetenteContext remetente() throws RecognitionException {
		RemetenteContext _localctx = new RemetenteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_remetente);
		try {
			int _alt;
			_localctx = new MetodoRemetenteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(459);
					((MetodoRemetenteContext)_localctx).left = matchWildcard();
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(465);
			match(T__27);
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(466);
					((MetodoRemetenteContext)_localctx).middle = matchWildcard();
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(472);
			match(T__28);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(473);
					((MetodoRemetenteContext)_localctx).right = matchWildcard();
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return inicio_sempred((InicioContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean inicio_sempred(InicioContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u01e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2z\n\2\f\2\16\2}\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00be"+
		"\n\t\f\t\16\t\u00c1\13\t\3\t\3\t\7\t\u00c5\n\t\f\t\16\t\u00c8\13\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u016c\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\7\26\u01cf\n\26\f\26\16\26\u01d2\13\26\3\26\3\26\7\26\u01d6\n\26"+
		"\f\26\16\26\u01d9\13\26\3\26\3\26\7\26\u01dd\n\26\f\26\16\26\u01e0\13"+
		"\26\3\26\7\u00bf\u00c6\u01d0\u01d7\u01de\3\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\4\3\2\4\5\3\2\16\20\2\u01e7\2,\3\2\2\2\4~\3\2"+
		"\2\2\6\u0085\3\2\2\2\b\u008e\3\2\2\2\n\u0095\3\2\2\2\f\u009e\3\2\2\2\16"+
		"\u00a7\3\2\2\2\20\u00b9\3\2\2\2\22\u00cb\3\2\2\2\24\u00d8\3\2\2\2\26\u00e5"+
		"\3\2\2\2\30\u00f2\3\2\2\2\32\u016b\3\2\2\2\34\u016d\3\2\2\2\36\u0176\3"+
		"\2\2\2 \u0187\3\2\2\2\"\u0190\3\2\2\2$\u0199\3\2\2\2&\u01ab\3\2\2\2(\u01b9"+
		"\3\2\2\2*\u01d0\3\2\2\2,{\b\2\1\2-.\f\25\2\2./\5\4\3\2/\60\7,\2\2\60z"+
		"\3\2\2\2\61\62\f\24\2\2\62\63\5\6\4\2\63\64\7,\2\2\64z\3\2\2\2\65\66\f"+
		"\23\2\2\66\67\5\b\5\2\678\7,\2\28z\3\2\2\29:\f\22\2\2:;\5\n\6\2;<\7,\2"+
		"\2<z\3\2\2\2=>\f\21\2\2>?\5\f\7\2?@\7,\2\2@z\3\2\2\2AB\f\20\2\2BC\5\16"+
		"\b\2CD\7,\2\2Dz\3\2\2\2EF\f\17\2\2FG\5\20\t\2GH\7,\2\2Hz\3\2\2\2IJ\f\16"+
		"\2\2JK\5\22\n\2KL\7,\2\2Lz\3\2\2\2MN\f\r\2\2NO\5\24\13\2OP\7,\2\2Pz\3"+
		"\2\2\2QR\f\f\2\2RS\5\26\f\2ST\7,\2\2Tz\3\2\2\2UV\f\13\2\2VW\5\30\r\2W"+
		"X\7,\2\2Xz\3\2\2\2YZ\f\n\2\2Z[\5\32\16\2[\\\7,\2\2\\z\3\2\2\2]^\f\t\2"+
		"\2^_\5\34\17\2_`\7,\2\2`z\3\2\2\2ab\f\b\2\2bc\5\36\20\2cd\7,\2\2dz\3\2"+
		"\2\2ef\f\7\2\2fg\5 \21\2gh\7,\2\2hz\3\2\2\2ij\f\6\2\2jk\5\"\22\2kl\7,"+
		"\2\2lz\3\2\2\2mn\f\5\2\2no\5$\23\2op\7,\2\2pz\3\2\2\2qr\f\4\2\2rs\5&\24"+
		"\2st\7,\2\2tz\3\2\2\2uv\f\3\2\2vw\5(\25\2wx\7,\2\2xz\3\2\2\2y-\3\2\2\2"+
		"y\61\3\2\2\2y\65\3\2\2\2y9\3\2\2\2y=\3\2\2\2yA\3\2\2\2yE\3\2\2\2yI\3\2"+
		"\2\2yM\3\2\2\2yQ\3\2\2\2yU\3\2\2\2yY\3\2\2\2y]\3\2\2\2ya\3\2\2\2ye\3\2"+
		"\2\2yi\3\2\2\2ym\3\2\2\2yq\3\2\2\2yu\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2"+
		"\2\2|\3\3\2\2\2}{\3\2\2\2~\177\7\3\2\2\177\u0080\7 \2\2\u0080\u0081\t"+
		"\2\2\2\u0081\u0082\7(\2\2\u0082\u0083\7\"\2\2\u0083\u0084\7\6\2\2\u0084"+
		"\5\3\2\2\2\u0085\u0086\7\7\2\2\u0086\u0087\7 \2\2\u0087\u0088\t\2\2\2"+
		"\u0088\u0089\7(\2\2\u0089\u008a\7\"\2\2\u008a\u008b\7(\2\2\u008b\u008c"+
		"\7\"\2\2\u008c\u008d\7\6\2\2\u008d\7\3\2\2\2\u008e\u008f\7\b\2\2\u008f"+
		"\u0090\7 \2\2\u0090\u0091\t\2\2\2\u0091\u0092\7(\2\2\u0092\u0093\7\"\2"+
		"\2\u0093\u0094\7\6\2\2\u0094\t\3\2\2\2\u0095\u0096\7\t\2\2\u0096\u0097"+
		"\7 \2\2\u0097\u0098\t\2\2\2\u0098\u0099\7(\2\2\u0099\u009a\7\"\2\2\u009a"+
		"\u009b\7(\2\2\u009b\u009c\7\"\2\2\u009c\u009d\7\6\2\2\u009d\13\3\2\2\2"+
		"\u009e\u009f\7\n\2\2\u009f\u00a0\7 \2\2\u00a0\u00a1\t\2\2\2\u00a1\u00a2"+
		"\7(\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\7(\2\2\u00a4\u00a5\7\"\2\2\u00a5"+
		"\u00a6\7\6\2\2\u00a6\r\3\2\2\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\7 \2\2"+
		"\u00a9\u00aa\t\2\2\2\u00aa\u00ab\7(\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad"+
		"\7(\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7(\2\2\u00af\u00b0\7 \2\2\u00b0"+
		"\u00b1\t\2\2\2\u00b1\u00b2\7(\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7(\2"+
		"\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8"+
		"\7\6\2\2\u00b8\17\3\2\2\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb\5*\26\2\u00bb"+
		"\u00bf\7(\2\2\u00bc\u00be\13\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c6\7(\2\2\u00c3\u00c5\13\2\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca\21\3\2\2"+
		"\2\u00cb\u00cc\7\r\2\2\u00cc\u00cd\7 \2\2\u00cd\u00ce\7(\2\2\u00ce\u00cf"+
		"\7 \2\2\u00cf\u00d0\7(\2\2\u00d0\u00d1\7 \2\2\u00d1\u00d2\7(\2\2\u00d2"+
		"\u00d3\7 \2\2\u00d3\u00d4\t\3\2\2\u00d4\u00d5\7(\2\2\u00d5\u00d6\5*\26"+
		"\2\u00d6\u00d7\7\6\2\2\u00d7\23\3\2\2\2\u00d8\u00d9\7\21\2\2\u00d9\u00da"+
		"\7 \2\2\u00da\u00db\7(\2\2\u00db\u00dc\7 \2\2\u00dc\u00dd\7(\2\2\u00dd"+
		"\u00de\7 \2\2\u00de\u00df\7(\2\2\u00df\u00e0\7 \2\2\u00e0\u00e1\t\3\2"+
		"\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\5*\26\2\u00e3\u00e4\7\6\2\2\u00e4\25"+
		"\3\2\2\2\u00e5\u00e6\7\22\2\2\u00e6\u00e7\7 \2\2\u00e7\u00e8\7(\2\2\u00e8"+
		"\u00e9\7 \2\2\u00e9\u00ea\7(\2\2\u00ea\u00eb\7 \2\2\u00eb\u00ec\7(\2\2"+
		"\u00ec\u00ed\7 \2\2\u00ed\u00ee\t\3\2\2\u00ee\u00ef\7(\2\2\u00ef\u00f0"+
		"\5*\26\2\u00f0\u00f1\7\6\2\2\u00f1\27\3\2\2\2\u00f2\u00f3\7\23\2\2\u00f3"+
		"\u00f4\7 \2\2\u00f4\u00f5\t\2\2\2\u00f5\u00f6\7(\2\2\u00f6\u00f7\7\"\2"+
		"\2\u00f7\u00f8\7(\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\7(\2\2\u00fa\u00fb"+
		"\7 \2\2\u00fb\u00fc\7(\2\2\u00fc\u00fd\5*\26\2\u00fd\u00fe\7\6\2\2\u00fe"+
		"\31\3\2\2\2\u00ff\u0100\7\24\2\2\u0100\u0101\7 \2\2\u0101\u0102\7\"\2"+
		"\2\u0102\u0103\7(\2\2\u0103\u0104\7 \2\2\u0104\u0105\7(\2\2\u0105\u0106"+
		"\7 \2\2\u0106\u0107\7(\2\2\u0107\u0108\7 \2\2\u0108\u0109\7(\2\2\u0109"+
		"\u010a\7\25\2\2\u010a\u010b\7(\2\2\u010b\u010c\7!\2\2\u010c\u010d\7(\2"+
		"\2\u010d\u010e\7\"\2\2\u010e\u010f\7(\2\2\u010f\u0110\7\"\2\2\u0110\u0111"+
		"\7)\2\2\u0111\u0112\7\"\2\2\u0112\u0113\7)\2\2\u0113\u0114\7\"\2\2\u0114"+
		"\u0115\7(\2\2\u0115\u0116\7 \2\2\u0116\u0117\7(\2\2\u0117\u0118\5*\26"+
		"\2\u0118\u0119\7\6\2\2\u0119\u016c\3\2\2\2\u011a\u011b\7\24\2\2\u011b"+
		"\u011c\7 \2\2\u011c\u011d\7\"\2\2\u011d\u011e\7(\2\2\u011e\u011f\7 \2"+
		"\2\u011f\u0120\7(\2\2\u0120\u0121\7 \2\2\u0121\u0122\7(\2\2\u0122\u0123"+
		"\7 \2\2\u0123\u0124\7(\2\2\u0124\u0125\7!\2\2\u0125\u0126\7(\2\2\u0126"+
		"\u0127\7\25\2\2\u0127\u0128\7(\2\2\u0128\u0129\7\"\2\2\u0129\u012a\7("+
		"\2\2\u012a\u012b\7\"\2\2\u012b\u012c\7)\2\2\u012c\u012d\7\"\2\2\u012d"+
		"\u012e\7)\2\2\u012e\u012f\7\"\2\2\u012f\u0130\7(\2\2\u0130\u0131\7 \2"+
		"\2\u0131\u0132\7(\2\2\u0132\u0133\5*\26\2\u0133\u0134\7\6\2\2\u0134\u016c"+
		"\3\2\2\2\u0135\u0136\7\24\2\2\u0136\u0137\7 \2\2\u0137\u0138\7\"\2\2\u0138"+
		"\u0139\7(\2\2\u0139\u013a\7 \2\2\u013a\u013b\7(\2\2\u013b\u013c\7 \2\2"+
		"\u013c\u013d\7(\2\2\u013d\u013e\7\26\2\2\u013e\u013f\7(\2\2\u013f\u0140"+
		"\7!\2\2\u0140\u0141\7(\2\2\u0141\u0142\7\25\2\2\u0142\u0143\7(\2\2\u0143"+
		"\u0144\7\"\2\2\u0144\u0145\7(\2\2\u0145\u0146\7\"\2\2\u0146\u0147\7)\2"+
		"\2\u0147\u0148\7\"\2\2\u0148\u0149\7)\2\2\u0149\u014a\7\"\2\2\u014a\u014b"+
		"\7(\2\2\u014b\u014c\7 \2\2\u014c\u014d\7(\2\2\u014d\u014e\5*\26\2\u014e"+
		"\u014f\7\6\2\2\u014f\u016c\3\2\2\2\u0150\u0151\7\24\2\2\u0151\u0152\7"+
		" \2\2\u0152\u0153\7\"\2\2\u0153\u0154\7(\2\2\u0154\u0155\7 \2\2\u0155"+
		"\u0156\7(\2\2\u0156\u0157\7 \2\2\u0157\u0158\7(\2\2\u0158\u0159\7\26\2"+
		"\2\u0159\u015a\7(\2\2\u015a\u015b\7\25\2\2\u015b\u015c\7(\2\2\u015c\u015d"+
		"\7!\2\2\u015d\u015e\7(\2\2\u015e\u015f\7\"\2\2\u015f\u0160\7(\2\2\u0160"+
		"\u0161\7\"\2\2\u0161\u0162\7)\2\2\u0162\u0163\7\"\2\2\u0163\u0164\7)\2"+
		"\2\u0164\u0165\7\"\2\2\u0165\u0166\7(\2\2\u0166\u0167\7 \2\2\u0167\u0168"+
		"\7(\2\2\u0168\u0169\5*\26\2\u0169\u016a\7\6\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u00ff\3\2\2\2\u016b\u011a\3\2\2\2\u016b\u0135\3\2\2\2\u016b\u0150\3\2"+
		"\2\2\u016c\33\3\2\2\2\u016d\u016e\7\27\2\2\u016e\u016f\7 \2\2\u016f\u0170"+
		"\t\2\2\2\u0170\u0171\7(\2\2\u0171\u0172\7\"\2\2\u0172\u0173\7(\2\2\u0173"+
		"\u0174\7\"\2\2\u0174\u0175\7\6\2\2\u0175\35\3\2\2\2\u0176\u0177\7\30\2"+
		"\2\u0177\u0178\7 \2\2\u0178\u0179\t\2\2\2\u0179\u017a\7(\2\2\u017a\u017b"+
		"\7\"\2\2\u017b\u017c\7(\2\2\u017c\u017d\7 \2\2\u017d\u017e\7(\2\2\u017e"+
		"\u017f\7\"\2\2\u017f\u0180\7(\2\2\u0180\u0181\7\"\2\2\u0181\u0182\7%\2"+
		"\2\u0182\u0183\7\"\2\2\u0183\u0184\7(\2\2\u0184\u0185\7 \2\2\u0185\u0186"+
		"\7\6\2\2\u0186\37\3\2\2\2\u0187\u0188\7\31\2\2\u0188\u0189\7 \2\2\u0189"+
		"\u018a\t\2\2\2\u018a\u018b\7(\2\2\u018b\u018c\7\"\2\2\u018c\u018d\7(\2"+
		"\2\u018d\u018e\7 \2\2\u018e\u018f\7\6\2\2\u018f!\3\2\2\2\u0190\u0191\7"+
		"\32\2\2\u0191\u0192\7 \2\2\u0192\u0193\t\2\2\2\u0193\u0194\7(\2\2\u0194"+
		"\u0195\7\"\2\2\u0195\u0196\7(\2\2\u0196\u0197\7 \2\2\u0197\u0198\7\6\2"+
		"\2\u0198#\3\2\2\2\u0199\u019a\7\33\2\2\u019a\u019b\7\"\2\2\u019b\u019c"+
		"\7(\2\2\u019c\u019d\7\"\2\2\u019d\u019e\7)\2\2\u019e\u019f\7\"\2\2\u019f"+
		"\u01a0\7)\2\2\u01a0\u01a1\7\"\2\2\u01a1\u01a2\7(\2\2\u01a2\u01a3\7\"\2"+
		"\2\u01a3\u01a4\7)\2\2\u01a4\u01a5\7\"\2\2\u01a5\u01a6\7)\2\2\u01a6\u01a7"+
		"\7\"\2\2\u01a7\u01a8\7(\2\2\u01a8\u01a9\5*\26\2\u01a9\u01aa\7\6\2\2\u01aa"+
		"%\3\2\2\2\u01ab\u01ac\7\34\2\2\u01ac\u01ad\7\"\2\2\u01ad\u01ae\7(\2\2"+
		"\u01ae\u01af\7 \2\2\u01af\u01b0\7(\2\2\u01b0\u01b1\7\"\2\2\u01b1\u01b2"+
		"\7)\2\2\u01b2\u01b3\7\"\2\2\u01b3\u01b4\7)\2\2\u01b4\u01b5\7\"\2\2\u01b5"+
		"\u01b6\7(\2\2\u01b6\u01b7\5*\26\2\u01b7\u01b8\7\6\2\2\u01b8\'\3\2\2\2"+
		"\u01b9\u01ba\7\35\2\2\u01ba\u01bb\7\"\2\2\u01bb\u01bc\7)\2\2\u01bc\u01bd"+
		"\7\"\2\2\u01bd\u01be\7)\2\2\u01be\u01bf\7\"\2\2\u01bf\u01c0\7(\2\2\u01c0"+
		"\u01c1\7\"\2\2\u01c1\u01c2\7)\2\2\u01c2\u01c3\7\"\2\2\u01c3\u01c4\7)\2"+
		"\2\u01c4\u01c5\7\"\2\2\u01c5\u01c6\7(\2\2\u01c6\u01c7\7 \2\2\u01c7\u01c8"+
		"\7(\2\2\u01c8\u01c9\7 \2\2\u01c9\u01ca\7(\2\2\u01ca\u01cb\5*\26\2\u01cb"+
		"\u01cc\7\6\2\2\u01cc)\3\2\2\2\u01cd\u01cf\13\2\2\2\u01ce\u01cd\3\2\2\2"+
		"\u01cf\u01d2\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3"+
		"\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d7\7\36\2\2\u01d4\u01d6\13\2\2\2"+
		"\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d7\u01d5"+
		"\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01de\7\37\2\2"+
		"\u01db\u01dd\13\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01de\u01dc\3\2\2\2\u01df+\3\2\2\2\u01e0\u01de\3\2\2\2\ny{\u00bf"+
		"\u00c6\u016b\u01d0\u01d7\u01de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}