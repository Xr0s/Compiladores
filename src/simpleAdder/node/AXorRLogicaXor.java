/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AXorRLogicaXor extends PLogicaXor
{
    private PLogicaXor _logicaXor_;
    private TXor _xor_;
    private PParenteseLogica _parenteseLogica_;

    public AXorRLogicaXor()
    {
        // Constructor
    }

    public AXorRLogicaXor(
        @SuppressWarnings("hiding") PLogicaXor _logicaXor_,
        @SuppressWarnings("hiding") TXor _xor_,
        @SuppressWarnings("hiding") PParenteseLogica _parenteseLogica_)
    {
        // Constructor
        setLogicaXor(_logicaXor_);

        setXor(_xor_);

        setParenteseLogica(_parenteseLogica_);

    }

    @Override
    public Object clone()
    {
        return new AXorRLogicaXor(
            cloneNode(this._logicaXor_),
            cloneNode(this._xor_),
            cloneNode(this._parenteseLogica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAXorRLogicaXor(this);
    }

    public PLogicaXor getLogicaXor()
    {
        return this._logicaXor_;
    }

    public void setLogicaXor(PLogicaXor node)
    {
        if(this._logicaXor_ != null)
        {
            this._logicaXor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicaXor_ = node;
    }

    public TXor getXor()
    {
        return this._xor_;
    }

    public void setXor(TXor node)
    {
        if(this._xor_ != null)
        {
            this._xor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._xor_ = node;
    }

    public PParenteseLogica getParenteseLogica()
    {
        return this._parenteseLogica_;
    }

    public void setParenteseLogica(PParenteseLogica node)
    {
        if(this._parenteseLogica_ != null)
        {
            this._parenteseLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteseLogica_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._logicaXor_)
            + toString(this._xor_)
            + toString(this._parenteseLogica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._logicaXor_ == child)
        {
            this._logicaXor_ = null;
            return;
        }

        if(this._xor_ == child)
        {
            this._xor_ = null;
            return;
        }

        if(this._parenteseLogica_ == child)
        {
            this._parenteseLogica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._logicaXor_ == oldChild)
        {
            setLogicaXor((PLogicaXor) newChild);
            return;
        }

        if(this._xor_ == oldChild)
        {
            setXor((TXor) newChild);
            return;
        }

        if(this._parenteseLogica_ == oldChild)
        {
            setParenteseLogica((PParenteseLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}