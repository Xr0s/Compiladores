/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TVetorReservada extends Token
{
    public TVetorReservada()
    {
        super.setText("vetor");
    }

    public TVetorReservada(int line, int pos)
    {
        super.setText("vetor");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVetorReservada(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVetorReservada(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TVetorReservada text.");
    }
}