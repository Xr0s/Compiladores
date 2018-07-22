/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AXorLogicaXor extends PLogicaXor
{
    private PLogicaXor _logicaXor_;
    private TXor _xor_;
    private PRelacionais _relacionais_;

    public AXorLogicaXor()
    {
        // Constructor
    }

    public AXorLogicaXor(
        @SuppressWarnings("hiding") PLogicaXor _logicaXor_,
        @SuppressWarnings("hiding") TXor _xor_,
        @SuppressWarnings("hiding") PRelacionais _relacionais_)
    {
        // Constructor
        setLogicaXor(_logicaXor_);

        setXor(_xor_);

        setRelacionais(_relacionais_);

    }

    @Override
    public Object clone()
    {
        return new AXorLogicaXor(
            cloneNode(this._logicaXor_),
            cloneNode(this._xor_),
            cloneNode(this._relacionais_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAXorLogicaXor(this);
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

    public PRelacionais getRelacionais()
    {
        return this._relacionais_;
    }

    public void setRelacionais(PRelacionais node)
    {
        if(this._relacionais_ != null)
        {
            this._relacionais_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relacionais_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._logicaXor_)
            + toString(this._xor_)
            + toString(this._relacionais_);
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

        if(this._relacionais_ == child)
        {
            this._relacionais_ = null;
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

        if(this._relacionais_ == oldChild)
        {
            setRelacionais((PRelacionais) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
