/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.analysis;

import java.util.*;
import simpleAdder.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAProgram(node);
    }

    public void inAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        inAVariaveisDeclaracao(node);
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVar());
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        outAVariaveisDeclaracao(node);
    }

    public void inAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        inAConstanteDeclaracao(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAConstanteDeclaracao(node);
    }

    public void inAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        inAAtribuicaoComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAAtribuicaoComando(node);
    }

    public void inALeiaComando(ALeiaComando node)
    {
        defaultIn(node);
    }

    public void outALeiaComando(ALeiaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        inALeiaComando(node);
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVar());
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        outALeiaComando(node);
    }

    public void inAEscrevaComando(AEscrevaComando node)
    {
        defaultIn(node);
    }

    public void outAEscrevaComando(AEscrevaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaComando(AEscrevaComando node)
    {
        inAEscrevaComando(node);
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExp());
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        outAEscrevaComando(node);
    }

    public void inASeComando(ASeComando node)
    {
        defaultIn(node);
    }

    public void outASeComando(ASeComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        inASeComando(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getObrigat());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getOpcional());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outASeComando(node);
    }

    public void inAEnquantoComando(AEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComando(AEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        inAEnquantoComando(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAEnquantoComando(node);
    }

    public void inARepitaComando(ARepitaComando node)
    {
        defaultIn(node);
    }

    public void outARepitaComando(ARepitaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        inARepitaComando(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outARepitaComando(node);
    }

    public void inAParaSemPassoComando(AParaSemPassoComando node)
    {
        defaultIn(node);
    }

    public void outAParaSemPassoComando(AParaSemPassoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaSemPassoComando(AParaSemPassoComando node)
    {
        inAParaSemPassoComando(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAParaSemPassoComando(node);
    }

    public void inAParaComPassoComando(AParaComPassoComando node)
    {
        defaultIn(node);
    }

    public void outAParaComPassoComando(AParaComPassoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComPassoComando(AParaComPassoComando node)
    {
        inAParaComPassoComando(node);
        if(node.getPri() != null)
        {
            node.getPri().apply(this);
        }
        if(node.getSeg() != null)
        {
            node.getSeg().apply(this);
        }
        if(node.getTer() != null)
        {
            node.getTer().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAParaComPassoComando(node);
    }

    public void inAAvalieComando(AAvalieComando node)
    {
        defaultIn(node);
    }

    public void outAAvalieComando(AAvalieComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        inAAvalieComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        {
            List<PCasos> copy = new ArrayList<PCasos>(node.getCasos());
            for(PCasos e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAAvalieComando(node);
    }

    public void inACasos(ACasos node)
    {
        defaultIn(node);
    }

    public void outACasos(ACasos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACasos(ACasos node)
    {
        inACasos(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outACasos(node);
    }

    public void inAAddExp(AAddExp node)
    {
        defaultIn(node);
    }

    public void outAAddExp(AAddExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAddExp(AAddExp node)
    {
        inAAddExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAddExp(node);
    }

    public void inASubExp(ASubExp node)
    {
        defaultIn(node);
    }

    public void outASubExp(ASubExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubExp(ASubExp node)
    {
        inASubExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outASubExp(node);
    }

    public void inAMultExp(AMultExp node)
    {
        defaultIn(node);
    }

    public void outAMultExp(AMultExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        inAMultExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAMultExp(node);
    }

    public void inADivExp(ADivExp node)
    {
        defaultIn(node);
    }

    public void outADivExp(ADivExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        inADivExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outADivExp(node);
    }

    public void inAValorExp(AValorExp node)
    {
        defaultIn(node);
    }

    public void outAValorExp(AValorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorExp(AValorExp node)
    {
        inAValorExp(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorExp(node);
    }

    public void inAVarExp(AVarExp node)
    {
        defaultIn(node);
    }

    public void outAVarExp(AVarExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarExp(AVarExp node)
    {
        inAVarExp(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarExp(node);
    }

    public void inAOuExpLogica(AOuExpLogica node)
    {
        defaultIn(node);
    }

    public void outAOuExpLogica(AOuExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExpLogica(AOuExpLogica node)
    {
        inAOuExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAOuExpLogica(node);
    }

    public void inAEExpLogica(AEExpLogica node)
    {
        defaultIn(node);
    }

    public void outAEExpLogica(AEExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExpLogica(AEExpLogica node)
    {
        inAEExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAEExpLogica(node);
    }

    public void inAXorExpLogica(AXorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAXorExpLogica(AXorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpLogica(AXorExpLogica node)
    {
        inAXorExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAXorExpLogica(node);
    }

    public void inANegacaoExpLogica(ANegacaoExpLogica node)
    {
        defaultIn(node);
    }

    public void outANegacaoExpLogica(ANegacaoExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegacaoExpLogica(ANegacaoExpLogica node)
    {
        inANegacaoExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outANegacaoExpLogica(node);
    }

    public void inAIgualdadeExpExpLogica(AIgualdadeExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAIgualdadeExpExpLogica(AIgualdadeExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualdadeExpExpLogica(AIgualdadeExpExpLogica node)
    {
        inAIgualdadeExpExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAIgualdadeExpExpLogica(node);
    }

    public void inADiferenteExpExpLogica(ADiferenteExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outADiferenteExpExpLogica(ADiferenteExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteExpExpLogica(ADiferenteExpExpLogica node)
    {
        inADiferenteExpExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outADiferenteExpExpLogica(node);
    }

    public void inAIgualdadePExpLogica(AIgualdadePExpLogica node)
    {
        defaultIn(node);
    }

    public void outAIgualdadePExpLogica(AIgualdadePExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualdadePExpLogica(AIgualdadePExpLogica node)
    {
        inAIgualdadePExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAIgualdadePExpLogica(node);
    }

    public void inADiferentePExpLogica(ADiferentePExpLogica node)
    {
        defaultIn(node);
    }

    public void outADiferentePExpLogica(ADiferentePExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferentePExpLogica(ADiferentePExpLogica node)
    {
        inADiferentePExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outADiferentePExpLogica(node);
    }

    public void inAParenteseExpLogica(AParenteseExpLogica node)
    {
        defaultIn(node);
    }

    public void outAParenteseExpLogica(AParenteseExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParenteseExpLogica(AParenteseExpLogica node)
    {
        inAParenteseExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAParenteseExpLogica(node);
    }

    public void inAMenorExpLogica(AMenorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorExpLogica(AMenorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorExpLogica(AMenorExpLogica node)
    {
        inAMenorExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAMenorExpLogica(node);
    }

    public void inAMenorigualExpLogica(AMenorigualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorigualExpLogica(AMenorigualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorigualExpLogica(AMenorigualExpLogica node)
    {
        inAMenorigualExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAMenorigualExpLogica(node);
    }

    public void inAMaiorigualExpLogica(AMaiorigualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorigualExpLogica(AMaiorigualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorigualExpLogica(AMaiorigualExpLogica node)
    {
        inAMaiorigualExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAMaiorigualExpLogica(node);
    }

    public void inAMaiorExpLogica(AMaiorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorExpLogica(AMaiorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorExpLogica(AMaiorExpLogica node)
    {
        inAMaiorExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAMaiorExpLogica(node);
    }

    public void inAUmMenorExpLogica(AUmMenorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAUmMenorExpLogica(AUmMenorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUmMenorExpLogica(AUmMenorExpLogica node)
    {
        inAUmMenorExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAUmMenorExpLogica(node);
    }

    public void inAUmMenorigExpLogica(AUmMenorigExpLogica node)
    {
        defaultIn(node);
    }

    public void outAUmMenorigExpLogica(AUmMenorigExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUmMenorigExpLogica(AUmMenorigExpLogica node)
    {
        inAUmMenorigExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAUmMenorigExpLogica(node);
    }

    public void inAUmMaiorigExpLogica(AUmMaiorigExpLogica node)
    {
        defaultIn(node);
    }

    public void outAUmMaiorigExpLogica(AUmMaiorigExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUmMaiorigExpLogica(AUmMaiorigExpLogica node)
    {
        inAUmMaiorigExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAUmMaiorigExpLogica(node);
    }

    public void inAUmMaiorExpLogica(AUmMaiorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAUmMaiorExpLogica(AUmMaiorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUmMaiorExpLogica(AUmMaiorExpLogica node)
    {
        inAUmMaiorExpLogica(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAUmMaiorExpLogica(node);
    }

    public void inAIdUnicaVar(AIdUnicaVar node)
    {
        defaultIn(node);
    }

    public void outAIdUnicaVar(AIdUnicaVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdUnicaVar(AIdUnicaVar node)
    {
        inAIdUnicaVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdUnicaVar(node);
    }

    public void inAVetorVar(AVetorVar node)
    {
        defaultIn(node);
    }

    public void outAVetorVar(AVetorVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node)
    {
        inAVetorVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAVetorVar(node);
    }

    public void inACharValor(ACharValor node)
    {
        defaultIn(node);
    }

    public void outACharValor(ACharValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharValor(ACharValor node)
    {
        inACharValor(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACharValor(node);
    }

    public void inAIntValor(AIntValor node)
    {
        defaultIn(node);
    }

    public void outAIntValor(AIntValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntValor(AIntValor node)
    {
        inAIntValor(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAIntValor(node);
    }

    public void inAFloatValor(AFloatValor node)
    {
        defaultIn(node);
    }

    public void outAFloatValor(AFloatValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFloatValor(AFloatValor node)
    {
        inAFloatValor(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outAFloatValor(node);
    }

    public void inABooleanoValor(ABooleanoValor node)
    {
        defaultIn(node);
    }

    public void outABooleanoValor(ABooleanoValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanoValor(ABooleanoValor node)
    {
        inABooleanoValor(node);
        if(node.getBooleano() != null)
        {
            node.getBooleano().apply(this);
        }
        outABooleanoValor(node);
    }
}
