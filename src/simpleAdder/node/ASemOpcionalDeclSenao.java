/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class ASemOpcionalDeclSenao extends PDeclSenao
{
    private TFimAvalie _fimAvalie_;

    public ASemOpcionalDeclSenao()
    {
        // Constructor
    }

    public ASemOpcionalDeclSenao(
        @SuppressWarnings("hiding") TFimAvalie _fimAvalie_)
    {
        // Constructor
        setFimAvalie(_fimAvalie_);

    }

    @Override
    public Object clone()
    {
        return new ASemOpcionalDeclSenao(
            cloneNode(this._fimAvalie_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASemOpcionalDeclSenao(this);
    }

    public TFimAvalie getFimAvalie()
    {
        return this._fimAvalie_;
    }

    public void setFimAvalie(TFimAvalie node)
    {
        if(this._fimAvalie_ != null)
        {
            this._fimAvalie_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimAvalie_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fimAvalie_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fimAvalie_ == child)
        {
            this._fimAvalie_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fimAvalie_ == oldChild)
        {
            setFimAvalie((TFimAvalie) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}