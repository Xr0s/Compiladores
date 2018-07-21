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
        node.getPExp().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAExpsomaExp(AExpsomaExp node)
    {
        defaultIn(node);
    }

    public void outAExpsomaExp(AExpsomaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpsomaExp(AExpsomaExp node)
    {
        inAExpsomaExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSoma() != null)
        {
            node.getSoma().apply(this);
        }
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outAExpsomaExp(node);
    }

    public void inATermoExp(ATermoExp node)
    {
        defaultIn(node);
    }

    public void outATermoExp(ATermoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermoExp(ATermoExp node)
    {
        inATermoExp(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outATermoExp(node);
    }

    public void inAMaisSoma(AMaisSoma node)
    {
        defaultIn(node);
    }

    public void outAMaisSoma(AMaisSoma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisSoma(AMaisSoma node)
    {
        inAMaisSoma(node);
        if(node.getMais() != null)
        {
            node.getMais().apply(this);
        }
        outAMaisSoma(node);
    }

    public void inAMenosSoma(AMenosSoma node)
    {
        defaultIn(node);
    }

    public void outAMenosSoma(AMenosSoma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosSoma(AMenosSoma node)
    {
        inAMenosSoma(node);
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        outAMenosSoma(node);
    }

    public void inAMultTermo(AMultTermo node)
    {
        defaultIn(node);
    }

    public void outAMultTermo(AMultTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultTermo(AMultTermo node)
    {
        inAMultTermo(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAMultTermo(node);
    }

    public void inAFatorTermo(AFatorTermo node)
    {
        defaultIn(node);
    }

    public void outAFatorTermo(AFatorTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorTermo(AFatorTermo node)
    {
        inAFatorTermo(node);
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAFatorTermo(node);
    }

    public void inADivFator(ADivFator node)
    {
        defaultIn(node);
    }

    public void outADivFator(ADivFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivFator(ADivFator node)
    {
        inADivFator(node);
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getPrioridade() != null)
        {
            node.getPrioridade().apply(this);
        }
        outADivFator(node);
    }

    public void inAPrioridadeFator(APrioridadeFator node)
    {
        defaultIn(node);
    }

    public void outAPrioridadeFator(APrioridadeFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrioridadeFator(APrioridadeFator node)
    {
        inAPrioridadeFator(node);
        if(node.getPrioridade() != null)
        {
            node.getPrioridade().apply(this);
        }
        outAPrioridadeFator(node);
    }

    public void inAExpPrioridade(AExpPrioridade node)
    {
        defaultIn(node);
    }

    public void outAExpPrioridade(AExpPrioridade node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpPrioridade(AExpPrioridade node)
    {
        inAExpPrioridade(node);
        if(node.getAbreParentese() != null)
        {
            node.getAbreParentese().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getFechaParentese() != null)
        {
            node.getFechaParentese().apply(this);
        }
        outAExpPrioridade(node);
    }

    public void inAValorPrioridade(AValorPrioridade node)
    {
        defaultIn(node);
    }

    public void outAValorPrioridade(AValorPrioridade node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorPrioridade(AValorPrioridade node)
    {
        inAValorPrioridade(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorPrioridade(node);
    }

    public void inAPrioridade(APrioridade node)
    {
        defaultIn(node);
    }

    public void outAPrioridade(APrioridade node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrioridade(APrioridade node)
    {
        inAPrioridade(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAPrioridade(node);
    }

    public void inAExpLogica(AExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpLogica(AExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogica(AExpLogica node)
    {
        inAExpLogica(node);
        if(node.getBooleano() != null)
        {
            node.getBooleano().apply(this);
        }
        outAExpLogica(node);
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
}
