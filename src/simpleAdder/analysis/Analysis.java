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
    void caseAValorTeste(AValorTeste node);
    void caseAVddTeste(AVddTeste node);
    void caseARealValor(ARealValor node);
    void caseABooleanoValor(ABooleanoValor node);

    void caseTTabulacao(TTabulacao node);
    void caseTEnter(TEnter node);
    void caseTEspaco(TEspaco node);
    void caseTBranco(TBranco node);
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
    void caseTSoma(TSoma node);
    void caseTSub(TSub node);
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
