/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AIgualLogicaIgualdade extends PLogicaIgualdade
{
    private PExp _esq_;
    private TIgual _igual_;
    private PExp _dir_;

    public AIgualLogicaIgualdade()
    {
        // Constructor
    }

    public AIgualLogicaIgualdade(
        @SuppressWarnings("hiding") PExp _esq_,
        @SuppressWarnings("hiding") TIgual _igual_,
        @SuppressWarnings("hiding") PExp _dir_)
    {
        // Constructor
        setEsq(_esq_);

        setIgual(_igual_);

        setDir(_dir_);

    }

    @Override
    public Object clone()
    {
        return new AIgualLogicaIgualdade(
            cloneNode(this._esq_),
            cloneNode(this._igual_),
            cloneNode(this._dir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIgualLogicaIgualdade(this);
    }

    public PExp getEsq()
    {
        return this._esq_;
    }

    public void setEsq(PExp node)
    {
        if(this._esq_ != null)
        {
            this._esq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esq_ = node;
    }

    public TIgual getIgual()
    {
        return this._igual_;
    }

    public void setIgual(TIgual node)
    {
        if(this._igual_ != null)
        {
            this._igual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._igual_ = node;
    }

    public PExp getDir()
    {
        return this._dir_;
    }

    public void setDir(PExp node)
    {
        if(this._dir_ != null)
        {
            this._dir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esq_)
            + toString(this._igual_)
            + toString(this._dir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esq_ == child)
        {
            this._esq_ = null;
            return;
        }

        if(this._igual_ == child)
        {
            this._igual_ = null;
            return;
        }

        if(this._dir_ == child)
        {
            this._dir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esq_ == oldChild)
        {
            setEsq((PExp) newChild);
            return;
        }

        if(this._igual_ == oldChild)
        {
            setIgual((TIgual) newChild);
            return;
        }

        if(this._dir_ == oldChild)
        {
            setDir((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
