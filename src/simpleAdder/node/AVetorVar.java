/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AVetorVar extends PVar
{
    private TId _id_;
    private TAbreColchete _abreColchete_;
    private TInteiro _inteiro_;
    private TFechaColchete _fechaColchete_;

    public AVetorVar()
    {
        // Constructor
    }

    public AVetorVar(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TAbreColchete _abreColchete_,
        @SuppressWarnings("hiding") TInteiro _inteiro_,
        @SuppressWarnings("hiding") TFechaColchete _fechaColchete_)
    {
        // Constructor
        setId(_id_);

        setAbreColchete(_abreColchete_);

        setInteiro(_inteiro_);

        setFechaColchete(_fechaColchete_);

    }

    @Override
    public Object clone()
    {
        return new AVetorVar(
            cloneNode(this._id_),
            cloneNode(this._abreColchete_),
            cloneNode(this._inteiro_),
            cloneNode(this._fechaColchete_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVetorVar(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TAbreColchete getAbreColchete()
    {
        return this._abreColchete_;
    }

    public void setAbreColchete(TAbreColchete node)
    {
        if(this._abreColchete_ != null)
        {
            this._abreColchete_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreColchete_ = node;
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

    public TFechaColchete getFechaColchete()
    {
        return this._fechaColchete_;
    }

    public void setFechaColchete(TFechaColchete node)
    {
        if(this._fechaColchete_ != null)
        {
            this._fechaColchete_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaColchete_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._abreColchete_)
            + toString(this._inteiro_)
            + toString(this._fechaColchete_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._abreColchete_ == child)
        {
            this._abreColchete_ = null;
            return;
        }

        if(this._inteiro_ == child)
        {
            this._inteiro_ = null;
            return;
        }

        if(this._fechaColchete_ == child)
        {
            this._fechaColchete_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._abreColchete_ == oldChild)
        {
            setAbreColchete((TAbreColchete) newChild);
            return;
        }

        if(this._inteiro_ == oldChild)
        {
            setInteiro((TInteiro) newChild);
            return;
        }

        if(this._fechaColchete_ == oldChild)
        {
            setFechaColchete((TFechaColchete) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}