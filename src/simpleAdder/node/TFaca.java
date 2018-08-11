/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TFaca extends Token
{
    public TFaca()
    {
        super.setText("faca");
    }

    public TFaca(int line, int pos)
    {
        super.setText("faca");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFaca(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFaca(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFaca text.");
    }
}
