/* This file was generated by SableCC (http://www.sablecc.org/). */

package jah.node;

import java.util.*;
import jah.analysis.*;

@SuppressWarnings("nls")
public final class AEscrevaComando extends PComando
{
    private final LinkedList<PExp> _exp_ = new LinkedList<PExp>();

    public AEscrevaComando()
    {
        // Constructor
    }

    public AEscrevaComando(
        @SuppressWarnings("hiding") List<?> _exp_)
    {
        // Constructor
        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AEscrevaComando(
            cloneList(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEscrevaComando(this);
    }

    public LinkedList<PExp> getExp()
    {
        return this._exp_;
    }

    public void setExp(List<?> list)
    {
        for(PExp e : this._exp_)
        {
            e.parent(null);
        }
        this._exp_.clear();

        for(Object obj_e : list)
        {
            PExp e = (PExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._exp_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PExp> i = this._exp_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExp) newChild);
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