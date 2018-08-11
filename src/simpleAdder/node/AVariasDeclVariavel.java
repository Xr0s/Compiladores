/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AVariasDeclVariavel extends PDeclVariavel
{
    private PVar _var_;
    private PDeclVariavel _declVariavel_;

    public AVariasDeclVariavel()
    {
        // Constructor
    }

    public AVariasDeclVariavel(
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") PDeclVariavel _declVariavel_)
    {
        // Constructor
        setVar(_var_);

        setDeclVariavel(_declVariavel_);

    }

    @Override
    public Object clone()
    {
        return new AVariasDeclVariavel(
            cloneNode(this._var_),
            cloneNode(this._declVariavel_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariasDeclVariavel(this);
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
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
            + toString(this._var_)
            + toString(this._declVariavel_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

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
        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._declVariavel_ == oldChild)
        {
            setDeclVariavel((PDeclVariavel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
