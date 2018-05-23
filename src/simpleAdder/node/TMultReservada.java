/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TMultReservada extends Token
{
    public TMultReservada()
    {
        super.setText("mult");
    }

    public TMultReservada(int line, int pos)
    {
        super.setText("mult");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMultReservada(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMultReservada(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMultReservada text.");
    }
}
