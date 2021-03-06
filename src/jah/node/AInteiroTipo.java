/* This file was generated by SableCC (http://www.sablecc.org/). */

package jah.node;

import jah.analysis.*;

@SuppressWarnings("nls")
public final class AInteiroTipo extends PTipo
{
    private TInteiroReservada _inteiroReservada_;

    public AInteiroTipo()
    {
        // Constructor
    }

    public AInteiroTipo(
        @SuppressWarnings("hiding") TInteiroReservada _inteiroReservada_)
    {
        // Constructor
        setInteiroReservada(_inteiroReservada_);

    }

    @Override
    public Object clone()
    {
        return new AInteiroTipo(
            cloneNode(this._inteiroReservada_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInteiroTipo(this);
    }

    public TInteiroReservada getInteiroReservada()
    {
        return this._inteiroReservada_;
    }

    public void setInteiroReservada(TInteiroReservada node)
    {
        if(this._inteiroReservada_ != null)
        {
            this._inteiroReservada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inteiroReservada_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inteiroReservada_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inteiroReservada_ == child)
        {
            this._inteiroReservada_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inteiroReservada_ == oldChild)
        {
            setInteiroReservada((TInteiroReservada) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
