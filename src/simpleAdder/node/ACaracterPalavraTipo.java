/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class ACaracterPalavraTipo extends PTipo
{
    private TCaractereReservada _caractereReservada_;

    public ACaracterPalavraTipo()
    {
        // Constructor
    }

    public ACaracterPalavraTipo(
        @SuppressWarnings("hiding") TCaractereReservada _caractereReservada_)
    {
        // Constructor
        setCaractereReservada(_caractereReservada_);

    }

    @Override
    public Object clone()
    {
        return new ACaracterPalavraTipo(
            cloneNode(this._caractereReservada_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACaracterPalavraTipo(this);
    }

    public TCaractereReservada getCaractereReservada()
    {
        return this._caractereReservada_;
    }

    public void setCaractereReservada(TCaractereReservada node)
    {
        if(this._caractereReservada_ != null)
        {
            this._caractereReservada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caractereReservada_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._caractereReservada_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._caractereReservada_ == child)
        {
            this._caractereReservada_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._caractereReservada_ == oldChild)
        {
            setCaractereReservada((TCaractereReservada) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}