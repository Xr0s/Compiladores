/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracao extends PDeclaracao
{
    private TInteiro _inteiro_;
    private TPontovirgula _pontovirgula_;

    public ADeclaracao()
    {
        // Constructor
    }

    public ADeclaracao(
        @SuppressWarnings("hiding") TInteiro _inteiro_,
        @SuppressWarnings("hiding") TPontovirgula _pontovirgula_)
    {
        // Constructor
        setInteiro(_inteiro_);

        setPontovirgula(_pontovirgula_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracao(
            cloneNode(this._inteiro_),
            cloneNode(this._pontovirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracao(this);
    }

    public TInteiro getInteiro()
    {
        return this._inteiro_;
    }

    public void setInteiro(TInteiro node)
    {
        if(this._inteiro_ != null)
        {
            this._inteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inteiro_ = node;
    }

    public TPontovirgula getPontovirgula()
    {
        return this._pontovirgula_;
    }

    public void setPontovirgula(TPontovirgula node)
    {
        if(this._pontovirgula_ != null)
        {
            this._pontovirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontovirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inteiro_)
            + toString(this._pontovirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inteiro_ == child)
        {
            this._inteiro_ = null;
            return;
        }

        if(this._pontovirgula_ == child)
        {
            this._pontovirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inteiro_ == oldChild)
        {
            setInteiro((TInteiro) newChild);
            return;
        }

        if(this._pontovirgula_ == oldChild)
        {
            setPontovirgula((TPontovirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
