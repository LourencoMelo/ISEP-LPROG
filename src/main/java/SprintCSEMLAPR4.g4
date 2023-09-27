grammar SprintCSEMLAPR4;

@parse::header{
import java.util.*;
import java.lang.*;
import java.io.*;
}

inicio: //SERVICOS
        | inicio lerRapelCliente ENTER
        | inicio alterarRapelCliente ENTER
        | inicio lerPrecoProduto ENTER
        | inicio alterarPrecoProduto ENTER
        | inicio calcularPrecoTotal ENTER
        | inicio aplicarDescontoRapel ENTER
        | inicio enviarEmail ENTER
        //ERRO FALHA
        | inicio reportarAnomaliaDeComunicacao ENTER
        | inicio reportarAnomaliaNumEquipamento ENTER
        | inicio reportarAnomaliaNumaApp ENTER
        //COTACOES E DESCONTOS
        | inicio requerCotacaoVendaPGrosso ENTER
        | inicio autAppDescFinanc ENTER
        //RECURSOS HUMANOS - DADOS PESSOAIS
        | inicio alterarNibCliente ENTER
        | inicio alterarResidenciaCliente ENTER
        | inicio alterarEstadoCivilCliente ENTER
        | inicio atualHabilit ENTER
        //RECURSOS HUMANOS - FERIAS E JUSTIFICACOES
        | inicio marcaFerias ENTER
        | inicio justificaFalta ENTER
        | inicio informaAusenciaFutura ENTER
        ;

lerRapelCliente:
         'lerRapelCliente('fich=STRING tipo=('.txt'|'.xml') VIRG idCliente=INT')' #metodoLerRapelCliente
;//100% correct

alterarRapelCliente:
         'alterarRapelCliente('fich=STRING tipo=('.txt'|'.xml') VIRG idCliente=INT VIRG novoRapel=INT')' #metodoAlterarRapelCliente
;//100% correct

lerPrecoProduto:
         'lerPrecoProduto('fich=STRING tipo=('.txt'|'.xml') VIRG idProduto=INT')' #metodoLerPrecoProduto
;//100% correct

alterarPrecoProduto:
         'alterarPrecoProduto('fich=STRING tipo=('.txt'|'.xml') VIRG idProduto=INT VIRG precoNovo=INT')' #metodoAlterarPrecoProduto
;//100% correct

calcularPrecoTotal:
         'calcularPrecoTotal('fich=STRING tipo=('.txt'|'.xml') VIRG idProduto=INT VIRG quatidadeProduto=INT')' #metodoCalcularPrecoTotal
;//100% correct

aplicarDescontoRapel:
         'aplicarDescontoRapel('fich=STRING tipo=('.txt'|'.xml') VIRG idProduto=INT VIRG quatidadeProduto=INT VIRG fich2=STRING tipo2=('.txt'|'.xml') VIRG idCliente=INT VIRG x=INT VIRG y=INT')' #metodoAplicarDescontoRapel //100% correct
;//100% correct

enviarEmail:
         'enviarEmail('remet=remetente VIRG assunto=.*? VIRG mensagem=.*?')' #metodoEnviarEmail //100% correct
;//100% correct

reportarAnomaliaDeComunicacao:
         'reportarAnomaliaDeComunicacao('tipoDeAnomalia=STRING VIRG tipoDeComunicacao=STRING VIRG descricao=STRING VIRG fotoProva=STRING tipo=('.png'|'.jpg'|'.jpeg') VIRG remet=remetente')' #metodoReportarAnomaliaDeComunicacao //100% correct
;//100% correct

reportarAnomaliaNumEquipamento:
         'reportarAnomaliaNumEquipamento('tipoDeAnomalia=STRING VIRG tipoDeEquipamento=STRING VIRG descricao=STRING VIRG fotoProva=STRING tipo=('.png'|'.jpg'|'.jpeg') VIRG remet=remetente')' #metodoReportarAnomaliaNumEquipamento //100% correct
;//100% correct

reportarAnomaliaNumaApp:
         'reportarAnomaliaNumaApp('tipoDeAnomalia=STRING VIRG tipoDeEquipamentoAndroidOrApple=STRING VIRG descricao=STRING VIRG fotoOuPrintProva=STRING tipo=('.png'|'.jpg'|'.jpeg') VIRG remet=remetente')' #metodoReportarAnomaliaNumaApp //100% correct
;//100% correct

requerCotacaoVendaPGrosso:
         'requerCotacaoVendaPGrosso('fich=STRING tipo=('.txt'|'.xml') VIRG codigoProduto=INT VIRG quantidadePretendida=INT VIRG tipoCliente=STRING VIRG remet=remetente')' #metodoRequerCotacaoVendaPGrosso
;//100% correct

autAppDescFinanc:
        'autAppDescFinanc('codigoClienteConsoantes=STRING codigoClienteNumeros=INT VIRG nomeCliente=STRING VIRG tipoDesconto=STRING VIRG recorrencia=STRING VIRG '0' VIRG valorDesconto=DOUBLE VIRG idFatura=INT VIRG dia=INT DOISPONTOS mes=INT DOISPONTOS ano=INT VIRG fundamento=STRING VIRG emailCliente=remetente')' #metodoAutAppDescFinanc
        | 'autAppDescFinanc('codigoClienteConsoantes=STRING codigoClienteNumeros=INT VIRG nomeCliente=STRING VIRG tipoDesconto=STRING VIRG recorrencia=STRING VIRG percentagemDesconto=DOUBLE VIRG '0' VIRG idFatura=INT VIRG dia=INT DOISPONTOS mes=INT DOISPONTOS ano=INT VIRG fundamento=STRING VIRG emailCliente=remetente')' #metodoAutAppDescFinanc
        | 'autAppDescFinanc('codigoClienteConsoantes=STRING codigoClienteNumeros=INT VIRG nomeCliente=STRING VIRG tipoDesconto=STRING VIRG recorrencia='Única' VIRG percentagemDesconto=DOUBLE VIRG '0' VIRG idFatura=INT VIRG dia=INT DOISPONTOS mes=INT DOISPONTOS ano=INT VIRG fundamento=STRING VIRG emailCliente=remetente')' #metodoAutAppDescFinanc
        | 'autAppDescFinanc('codigoClienteConsoantes=STRING codigoClienteNumeros=INT VIRG nomeCliente=STRING VIRG tipoDesconto=STRING VIRG recorrencia='Única' VIRG '0' VIRG valorDesconto=DOUBLE VIRG idFatura=INT VIRG dia=INT DOISPONTOS mes=INT DOISPONTOS ano=INT VIRG fundamento=STRING VIRG emailCliente=remetente')' #metodoAutAppDescFinanc
;//100% correct

alterarNibCliente:
         'alterarNibCliente('fich=STRING tipo=('.txt'|'.xml') VIRG idCliente=INT VIRG nibCliente=INT')' #metodoAlterarNibCliente
;//100% correct

alterarResidenciaCliente:
         'alterarResidenciaCliente('fich=STRING tipo=('.txt'|'.xml') VIRG idCliente=INT VIRG ruaNova=STRING VIRG doorNumber=INT VIRG quatroPrimeirosDigitosCodPostal=INT '-' tresUltimosDigitosCodPostal=INT VIRG concelho=STRING')' #metodoAlterarResidenciaCliente
;//100% correct

alterarEstadoCivilCliente:
         'alterarEstadoCivilCliente('fich=STRING tipo=('.txt'|'.xml') VIRG idCliente=INT VIRG estadoCivil=STRING')' #metodoAlterarEstadoCivilCliente
;//100% correct

atualHabilit:
         'atualizaHabilit('fich=STRING tipo=('.txt'|'.xml') VIRG idCliente=INT VIRG habilit=STRING')' #metodoAtualHabilit
;//100% correct

marcaFerias :
         'marcaFerias('idCliente=INT VIRG diaEntrada=INT DOISPONTOS mesEntrada=INT DOISPONTOS anoEntrada=INT VIRG diaSaida=INT DOISPONTOS mesSaida=INT DOISPONTOS anoSaida=INT VIRG remet=remetente')' #metodoMarcaFerias
;//100% correct

justificaFalta :
         'justificaFalta('idCliente=INT VIRG justificacao=STRING VIRG diaFalta=INT DOISPONTOS mesFalta=INT DOISPONTOS anoFalta=INT VIRG remet=remetente')' #metodoJustificaFalta
;//100% correct

informaAusenciaFutura :
         'informaAusenciaFutura('diaEntrada=INT DOISPONTOS mesEntrada=INT DOISPONTOS anoEntrada=INT VIRG diaSaida=INT DOISPONTOS mesSaida=INT DOISPONTOS anoSaida=INT VIRG tipoAusencia=STRING VIRG justificacao=STRING VIRG remet=remetente')' #metodoInformaAusenciaFutura
;//100% correct

remetente: left=.*?'@'middle=.*?'.'right=.*? #metodoRemetente

;//100% correct

STRING:([A-Za-z]+ ' '?)+;
DOUBLE:[0-9]+[.][0-9]+;
INT :[0-9]+;
MAIS :'+';
IGUAL :'=';
MENOS:'-';
MUL:'*';
DIV:'/';
VIRG:',';
DOISPONTOS:':';
ESPACO:' ';
WS :[ \t\r]+ -> skip ;
ENTER :'\n';
