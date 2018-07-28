/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.analysis;

import simpleAdder.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgram(AProgram node);
    void caseAVariavelDeclaracao(AVariavelDeclaracao node);
    void caseAConstanteDeclaracao(AConstanteDeclaracao node);
    void caseAVariasDeclVariavel(AVariasDeclVariavel node);
    void caseAUnicaDeclVariavel(AUnicaDeclVariavel node);
    void caseAComando(AComando node);
    void caseALeiaComando(ALeiaComando node);
    void caseAEscrevaComando(AEscrevaComando node);
    void caseASeComando(ASeComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseARepitaComando(ARepitaComando node);
    void caseAParaSemPassoComando(AParaSemPassoComando node);
    void caseAParaComPassoComando(AParaComPassoComando node);
    void caseAAvalieComando(AAvalieComando node);
    void caseADeclSenao(ADeclSenao node);
    void caseAComOpcionalDeclSenaoAvalie(AComOpcionalDeclSenaoAvalie node);
    void caseASemOpcionalDeclSenaoAvalie(ASemOpcionalDeclSenaoAvalie node);
    void caseACasos(ACasos node);
    void caseAVariasDeclVarSempontov(AVariasDeclVarSempontov node);
    void caseAUnicaDeclVarSempontov(AUnicaDeclVarSempontov node);
    void caseAVariasExpDeclExp(AVariasExpDeclExp node);
    void caseAUnicaExpDeclExp(AUnicaExpDeclExp node);
    void caseAOuExpLogica(AOuExpLogica node);
    void caseAAndExpLogica(AAndExpLogica node);
    void caseAELogicaAnd(AELogicaAnd node);
    void caseAXorLogicaAnd(AXorLogicaAnd node);
    void caseAXorLogicaXor(AXorLogicaXor node);
    void caseANegacaoLogicaXor(ANegacaoLogicaXor node);
    void caseANegacaoLogicaNeg(ANegacaoLogicaNeg node);
    void caseAIgualdadeLogicaNeg(AIgualdadeLogicaNeg node);
    void caseAIgualdadeOpLogicaIgualdade(AIgualdadeOpLogicaIgualdade node);
    void caseAIgualdadeParenteseLogicaIgualdade(AIgualdadeParenteseLogicaIgualdade node);
    void caseAParenteseLogicaIgualdade(AParenteseLogicaIgualdade node);
    void caseALogicaIgualdadePart(ALogicaIgualdadePart node);
    void caseAIgualIgualOp(AIgualIgualOp node);
    void caseADiferenteIgualOp(ADiferenteIgualOp node);
    void caseAParenteseParenteseLogica(AParenteseParenteseLogica node);
    void caseAUmRelacionalParenteseLogica(AUmRelacionalParenteseLogica node);
    void caseARelRelacionais(ARelRelacionais node);
    void caseAUmRelacionalRelacionais(AUmRelacionalRelacionais node);
    void caseAMenorOpRelacional(AMenorOpRelacional node);
    void caseAMenorigualOpRelacional(AMenorigualOpRelacional node);
    void caseAMaiorigualOpRelacional(AMaiorigualOpRelacional node);
    void caseAMaiorOpRelacional(AMaiorOpRelacional node);
    void caseASomaExp(ASomaExp node);
    void caseATermoExp(ATermoExp node);
    void caseAMaisOpSoma(AMaisOpSoma node);
    void caseAMenosOpSoma(AMenosOpSoma node);
    void caseAOpTermo(AOpTermo node);
    void caseATermo(ATermo node);
    void caseAMultOp(AMultOp node);
    void caseADivOp(ADivOp node);
    void caseAExpFator(AExpFator node);
    void caseAValorFator(AValorFator node);
    void caseAVarFator(AVarFator node);
    void caseAIdUnicaVar(AIdUnicaVar node);
    void caseAVetorVar(AVetorVar node);
    void caseARealPalavraTipo(ARealPalavraTipo node);
    void caseAInteiroPalavraTipo(AInteiroPalavraTipo node);
    void caseACaracterPalavraTipo(ACaracterPalavraTipo node);
    void caseABooleanoPalavraTipo(ABooleanoPalavraTipo node);
    void caseACharValor(ACharValor node);
    void caseAIntValor(AIntValor node);
    void caseAFloatValor(AFloatValor node);
    void caseABooleanoValor(ABooleanoValor node);

    void caseTBranco(TBranco node);
    void caseTTabulacao(TTabulacao node);
    void caseTEnter(TEnter node);
    void caseTEspaco(TEspaco node);
    void caseTPrograma(TPrograma node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTEnquanto(TEnquanto node);
    void caseTPara(TPara node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTLeia(TLeia node);
    void caseTEscreva(TEscreva node);
    void caseTEntao(TEntao node);
    void caseTFaca(TFaca node);
    void caseTRepita(TRepita node);
    void caseTAte(TAte node);
    void caseTXor(TXor node);
    void caseTDe(TDe node);
    void caseTPasso(TPasso node);
    void caseTFimAvalie(TFimAvalie node);
    void caseTFimSe(TFimSe node);
    void caseTFimPara(TFimPara node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTConst(TConst node);
    void caseTInteiroReservada(TInteiroReservada node);
    void caseTRealReservada(TRealReservada node);
    void caseTCaractereReservada(TCaractereReservada node);
    void caseTBooleanoReservada(TBooleanoReservada node);
    void caseTFimComentario(TFimComentario node);
    void caseTComentarioDeLinha(TComentarioDeLinha node);
    void caseTComment(TComment node);
    void caseTCommentEnd(TCommentEnd node);
    void caseTCommentBody(TCommentBody node);
    void caseTStar(TStar node);
    void caseTSlash(TSlash node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTMaiorig(TMaiorig node);
    void caseTMenorig(TMenorig node);
    void caseTMaior(TMaior node);
    void caseTMenor(TMenor node);
    void caseTAbreColchete(TAbreColchete node);
    void caseTAbreParentese(TAbreParentese node);
    void caseTFechaColchete(TFechaColchete node);
    void caseTFechaParentese(TFechaParentese node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTDoispontos(TDoispontos node);
    void caseTPontovirgula(TPontovirgula node);
    void caseTVirgula(TVirgula node);
    void caseTNao(TNao node);
    void caseTOu(TOu node);
    void caseTE(TE node);
    void caseTInteiro(TInteiro node);
    void caseTReal(TReal node);
    void caseTCaractere(TCaractere node);
    void caseTBooleano(TBooleano node);
    void caseTString(TString node);
    void caseTId(TId node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
