/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import java.util.*;
import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AParaComPassoComando extends PComando
{
    private TInteiro _pri_;
    private TInteiro _seg_;
    private TInteiro _ter_;
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public AParaComPassoComando()
    {
        // Constructor
    }

    public AParaComPassoComando(
        @SuppressWarnings("hiding") TInteiro _pri_,
        @SuppressWarnings("hiding") TInteiro _seg_,
        @SuppressWarnings("hiding") TInteiro _ter_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setPri(_pri_);

        setSeg(_seg_);

        setTer(_ter_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AParaComPassoComando(
            cloneNode(this._pri_),
            cloneNode(this._seg_),
            cloneNode(this._ter_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaComPassoComando(this);
    }

    public TInteiro getPri()
    {
        return this._pri_;
    }

    public void setPri(TInteiro node)
    {
        if(this._pri_ != null)
        {
            this._pri_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pri_ = node;
    }

    public TInteiro getSeg()
    {
        return this._seg_;
    }

    public void setSeg(TInteiro node)
    {
        if(this._seg_ != null)
        {
            this._seg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seg_ = node;
    }

    public TInteiro getTer()
    {
        return this._ter_;
    }

    public void setTer(TInteiro node)
    {
        if(this._ter_ != null)
        {
            this._ter_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ter_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._pri_)
            + toString(this._seg_)
            + toString(this._ter_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pri_ == child)
        {
            this._pri_ = null;
            return;
        }

        if(this._seg_ == child)
        {
            this._seg_ = null;
            return;
        }

        if(this._ter_ == child)
        {
            this._ter_ = null;
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pri_ == oldChild)
        {
            setPri((TInteiro) newChild);
            return;
        }

        if(this._seg_ == oldChild)
        {
            setSeg((TInteiro) newChild);
            return;
        }

        if(this._ter_ == oldChild)
        {
            setTer((TInteiro) newChild);
            return;
        }

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

        throw new RuntimeException("Not a child.");
    }
}
