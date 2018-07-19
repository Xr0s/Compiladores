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
        node.getPValor().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inARealValor(ARealValor node)
    {
        defaultIn(node);
    }

    public void outARealValor(ARealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        inARealValor(node);
        if(node.getRealReservada() != null)
        {
            node.getRealReservada().apply(this);
        }
        outARealValor(node);
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
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        outABooleanoValor(node);
    }
}
