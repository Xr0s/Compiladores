/* This file was generated by SableCC (http://www.sablecc.org/). */

package jah.node;

import java.util.*;
import jah.analysis.*;

@SuppressWarnings("nls")
public final class ARepitaComando extends PComando
{
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private PExpLogica _expLogica_;

    public ARepitaComando()
    {
        // Constructor
    }

    public ARepitaComando(
        @SuppressWarnings("hiding") List<?> _comando_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_)
    {
        // Constructor
        setComando(_comando_);

        setExpLogica(_expLogica_);

    }

    @Override
    public Object clone()
    {
        return new ARepitaComando(
            cloneList(this._comando_),
            cloneNode(this._expLogica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARepitaComando(this);
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comando_)
            + toString(this._expLogica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}