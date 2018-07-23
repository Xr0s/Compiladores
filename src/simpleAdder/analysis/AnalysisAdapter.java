/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.analysis;

import java.util.*;
import simpleAdder.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExpLogica(AOuExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndExpLogica(AAndExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAELogicaAnd(AELogicaAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorLogicaAnd(AXorLogicaAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorLogicaXor(AXorLogicaXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegacaoLogicaXor(ANegacaoLogicaXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegacaoLogicaNeg(ANegacaoLogicaNeg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualdadeLogicaNeg(AIgualdadeLogicaNeg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualdadeOpLogicaIgualdade(AIgualdadeOpLogicaIgualdade node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualdadeParenteseLogicaIgualdade(AIgualdadeParenteseLogicaIgualdade node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenteseLogicaIgualdade(AParenteseLogicaIgualdade node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualIgualOp(AIgualIgualOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiferenteIgualOp(ADiferenteIgualOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenteseParenteseLogica(AParenteseParenteseLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUmRelacionalParenteseLogica(AUmRelacionalParenteseLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelRelacionais(ARelRelacionais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUmRelacionalRelacionais(AUmRelacionalRelacionais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorOpRelacional(AMenorOpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorigualOpRelacional(AMenorigualOpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorigualOpRelacional(AMaiorigualOpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorOpRelacional(AMaiorOpRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExp(ASomaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExp(ATermoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisOpSoma(AMaisOpSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosOpSoma(AMenosOpSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpTermo(AOpTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermo(ATermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultOp(AMultOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivOp(ADivOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpFator(AExpFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorFator(AValorFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarFator(AVarFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdUnicaVar(AIdUnicaVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealPalavraTipo(ARealPalavraTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInteiroPalavraTipo(AInteiroPalavraTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaracterPalavraTipo(ACaracterPalavraTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanoPalavraTipo(ABooleanoPalavraTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharValor(ACharValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntValor(AIntValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFloatValor(AFloatValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanoValor(ABooleanoValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBranco(TBranco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTabulacao(TTabulacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnter(TEnter node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEspaco(TEspaco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiroReservada(TInteiroReservada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRealReservada(TRealReservada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractereReservada(TCaractereReservada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleanoReservada(TBooleanoReservada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimComentario(TFimComentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioDeLinha(TComentarioDeLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentEnd(TCommentEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentBody(TCommentBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorig(TMaiorig node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorig(TMenorig node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreColchete(TAbreColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreParentese(TAbreParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaColchete(TFechaColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaParentese(TFechaParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoispontos(TDoispontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontovirgula(TPontovirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleano(TBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
