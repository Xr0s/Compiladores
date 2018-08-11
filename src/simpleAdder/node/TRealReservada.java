/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TRealReservada extends Token
{
    public TRealReservada()
    {
        super.setText("real");
    }

    public TRealReservada(int line, int pos)
    {
        super.setText("real");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRealReservada(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRealReservada(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRealReservada text.");
    }
}
