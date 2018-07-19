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
        if(node.getPrograma() != null)
        {
            node.getPrograma().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getInicio() != null)
        {
            node.getInicio().apply(this);
        }
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFim() != null)
        {
            node.getFim().apply(this);
        }
        outAProgram(node);
    }

    public void inADeclaracao(ADeclaracao node)
    {
        defaultIn(node);
    }

    public void outADeclaracao(ADeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracao(ADeclaracao node)
    {
        inADeclaracao(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outADeclaracao(node);
    }
}
