/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class ALeiaComando extends PComando
{
    private PDeclVariavel _declVariavel_;

    public ALeiaComando()
    {
        // Constructor
    }

    public ALeiaComando(
        @SuppressWarnings("hiding") PDeclVariavel _declVariavel_)
    {
        // Constructor
        setDeclVariavel(_declVariavel_);

    }

    @Override
    public Object clone()
    {
        return new ALeiaComando(
            cloneNode(this._declVariavel_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeiaComando(this);
    }

    public PDeclVariavel getDeclVariavel()
    {
        return this._declVariavel_;
    }

    public void setDeclVariavel(PDeclVariavel node)
    {
        if(this._declVariavel_ != null)
        {
            this._declVariavel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declVariavel_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declVariavel_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declVariavel_ == child)
        {
            this._declVariavel_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declVariavel_ == oldChild)
        {
            setDeclVariavel((PDeclVariavel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}