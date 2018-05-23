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

    void caseTTabulacao(TTabulacao node);
    void caseTEnter(TEnter node);
    void caseTEspaco(TEspaco node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTEnquanto(TEnquanto node);
    void caseTPara(TPara node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTIdReservada(TIdReservada node);
    void caseTInteiroReservada(TInteiroReservada node);
    void caseTRealReservada(TRealReservada node);
    void caseTCaractereReservada(TCaractereReservada node);
    void caseTBooleanoReservada(TBooleanoReservada node);
    void caseTVetorReservada(TVetorReservada node);
    void caseTComentarioDeLinha(TComentarioDeLinha node);
    void caseTComentarioDeBlocoInicio(TComentarioDeBlocoInicio node);
    void caseTComentarioDeBlocoFim(TComentarioDeBlocoFim node);
    void caseTSoma(TSoma node);
    void caseTSub(TSub node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTIgual(TIgual node);
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
    void caseTVetor(TVetor node);
    void caseTTipo(TTipo node);
    void caseTId(TId node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
