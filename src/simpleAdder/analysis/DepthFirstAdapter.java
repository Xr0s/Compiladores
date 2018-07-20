/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.analysis;

import java.util.*;
import simpleAdder.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPComando().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAComando(AComando node)
    {
        defaultIn(node);
    }

    public void outAComando(AComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComando(AComando node)
    {
        inAComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getAtribuicao() != null)
        {
            node.getAtribuicao().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outAComando(node);
    }

    public void inALeiaComando(ALeiaComando node)
    {
        defaultIn(node);
    }

    public void outALeiaComando(ALeiaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        inALeiaComando(node);
        if(node.getLeia() != null)
        {
            node.getLeia().apply(this);
        }
        if(node.getAbreParentese() != null)
        {
            node.getAbreParentese().apply(this);
        }
        if(node.getDeclVarSempontov() != null)
        {
            node.getDeclVarSempontov().apply(this);
        }
        if(node.getFechaParentese() != null)
        {
            node.getFechaParentese().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outALeiaComando(node);
    }

    public void inAEscrevaComando(AEscrevaComando node)
    {
        defaultIn(node);
    }

    public void outAEscrevaComando(AEscrevaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaComando(AEscrevaComando node)
    {
        inAEscrevaComando(node);
        if(node.getEscreva() != null)
        {
            node.getEscreva().apply(this);
        }
        if(node.getAbreParentese() != null)
        {
            node.getAbreParentese().apply(this);
        }
        if(node.getDeclExp() != null)
        {
            node.getDeclExp().apply(this);
        }
        if(node.getFechaParentese() != null)
        {
            node.getFechaParentese().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outAEscrevaComando(node);
    }

    public void inAEnquantoComando(AEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComando(AEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        inAEnquantoComando(node);
        if(node.getEnquanto() != null)
        {
            node.getEnquanto().apply(this);
        }
        if(node.getAbreParentese() != null)
        {
            node.getAbreParentese().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getFechaParentese() != null)
        {
            node.getFechaParentese().apply(this);
        }
        if(node.getFaca() != null)
        {
            node.getFaca().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFimEnquanto() != null)
        {
            node.getFimEnquanto().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outAEnquantoComando(node);
    }

    public void inARepitaComando(ARepitaComando node)
    {
        defaultIn(node);
    }

    public void outARepitaComando(ARepitaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        inARepitaComando(node);
        if(node.getRepita() != null)
        {
            node.getRepita().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getAbreParentese() != null)
        {
            node.getAbreParentese().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getFechaParentese() != null)
        {
            node.getFechaParentese().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outARepitaComando(node);
    }

    public void inAParaSemPassoComando(AParaSemPassoComando node)
    {
        defaultIn(node);
    }

    public void outAParaSemPassoComando(AParaSemPassoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaSemPassoComando(AParaSemPassoComando node)
    {
        inAParaSemPassoComando(node);
        if(node.getPara() != null)
        {
            node.getPara().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getDe() != null)
        {
            node.getDe().apply(this);
        }
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        if(node.getFaca() != null)
        {
            node.getFaca().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFimPara() != null)
        {
            node.getFimPara().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outAParaSemPassoComando(node);
    }

    public void inAParaComPassoComando(AParaComPassoComando node)
    {
        defaultIn(node);
    }

    public void outAParaComPassoComando(AParaComPassoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComPassoComando(AParaComPassoComando node)
    {
        inAParaComPassoComando(node);
        if(node.getPara() != null)
        {
            node.getPara().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getDe() != null)
        {
            node.getDe().apply(this);
        }
        if(node.getPrimeiro() != null)
        {
            node.getPrimeiro().apply(this);
        }
        if(node.getPasso() != null)
        {
            node.getPasso().apply(this);
        }
        if(node.getSegundo() != null)
        {
            node.getSegundo().apply(this);
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getTerceiro() != null)
        {
            node.getTerceiro().apply(this);
        }
        if(node.getFaca() != null)
        {
            node.getFaca().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFimPara() != null)
        {
            node.getFimPara().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outAParaComPassoComando(node);
    }

    public void inAAvalieComando(AAvalieComando node)
    {
        defaultIn(node);
    }

    public void outAAvalieComando(AAvalieComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        inAAvalieComando(node);
        if(node.getAvalie() != null)
        {
            node.getAvalie().apply(this);
        }
        if(node.getAbreParentese() != null)
        {
            node.getAbreParentese().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getFechaParentese() != null)
        {
            node.getFechaParentese().apply(this);
        }
        {
            List<PCasos> copy = new ArrayList<PCasos>(node.getCasos());
            for(PCasos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getDeclSenao() != null)
        {
            node.getDeclSenao().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outAAvalieComando(node);
    }

    public void inACasos(ACasos node)
    {
        defaultIn(node);
    }

    public void outACasos(ACasos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACasos(ACasos node)
    {
        inACasos(node);
        if(node.getCaso() != null)
        {
            node.getCaso().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getDoispontos() != null)
        {
            node.getDoispontos().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outACasos(node);
    }

    public void inAComOpcionalDeclSenao(AComOpcionalDeclSenao node)
    {
        defaultIn(node);
    }

    public void outAComOpcionalDeclSenao(AComOpcionalDeclSenao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComOpcionalDeclSenao(AComOpcionalDeclSenao node)
    {
        inAComOpcionalDeclSenao(node);
        if(node.getSenao() != null)
        {
            node.getSenao().apply(this);
        }
        if(node.getDoispontos() != null)
        {
            node.getDoispontos().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFimAvalie() != null)
        {
            node.getFimAvalie().apply(this);
        }
        outAComOpcionalDeclSenao(node);
    }

    public void inASemOpcionalDeclSenao(ASemOpcionalDeclSenao node)
    {
        defaultIn(node);
    }

    public void outASemOpcionalDeclSenao(ASemOpcionalDeclSenao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASemOpcionalDeclSenao(ASemOpcionalDeclSenao node)
    {
        inASemOpcionalDeclSenao(node);
        if(node.getFimAvalie() != null)
        {
            node.getFimAvalie().apply(this);
        }
        outASemOpcionalDeclSenao(node);
    }

    public void inAVariasDeclVarSempontov(AVariasDeclVarSempontov node)
    {
        defaultIn(node);
    }

    public void outAVariasDeclVarSempontov(AVariasDeclVarSempontov node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariasDeclVarSempontov(AVariasDeclVarSempontov node)
    {
        inAVariasDeclVarSempontov(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getDeclVarSempontov() != null)
        {
            node.getDeclVarSempontov().apply(this);
        }
        outAVariasDeclVarSempontov(node);
    }

    public void inAUnicaDeclVarSempontov(AUnicaDeclVarSempontov node)
    {
        defaultIn(node);
    }

    public void outAUnicaDeclVarSempontov(AUnicaDeclVarSempontov node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicaDeclVarSempontov(AUnicaDeclVarSempontov node)
    {
        inAUnicaDeclVarSempontov(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAUnicaDeclVarSempontov(node);
    }

    public void inAVariasExpDeclExp(AVariasExpDeclExp node)
    {
        defaultIn(node);
    }

    public void outAVariasExpDeclExp(AVariasExpDeclExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariasExpDeclExp(AVariasExpDeclExp node)
    {
        inAVariasExpDeclExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getDeclExp() != null)
        {
            node.getDeclExp().apply(this);
        }
        outAVariasExpDeclExp(node);
    }

    public void inAUnicaExpDeclExp(AUnicaExpDeclExp node)
    {
        defaultIn(node);
    }

    public void outAUnicaExpDeclExp(AUnicaExpDeclExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicaExpDeclExp(AUnicaExpDeclExp node)
    {
        inAUnicaExpDeclExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAUnicaExpDeclExp(node);
    }

    public void inAIdUnicaVar(AIdUnicaVar node)
    {
        defaultIn(node);
    }

    public void outAIdUnicaVar(AIdUnicaVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdUnicaVar(AIdUnicaVar node)
    {
        inAIdUnicaVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdUnicaVar(node);
    }

    public void inAVetorVar(AVetorVar node)
    {
        defaultIn(node);
    }

    public void outAVetorVar(AVetorVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node)
    {
        inAVetorVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAbreColchete() != null)
        {
            node.getAbreColchete().apply(this);
        }
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        if(node.getFechaColchete() != null)
        {
            node.getFechaColchete().apply(this);
        }
        outAVetorVar(node);
    }

    public void inAExp(AExp node)
    {
        defaultIn(node);
    }

    public void outAExp(AExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp(AExp node)
    {
        inAExp(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        if(node.getSoma() != null)
        {
            node.getSoma().apply(this);
        }
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outAExp(node);
    }

    public void inAExpLogica(AExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpLogica(AExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogica(AExpLogica node)
    {
        inAExpLogica(node);
        if(node.getBooleano() != null)
        {
            node.getBooleano().apply(this);
        }
        outAExpLogica(node);
    }

    public void inACharValor(ACharValor node)
    {
        defaultIn(node);
    }

    public void outACharValor(ACharValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharValor(ACharValor node)
    {
        inACharValor(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACharValor(node);
    }

    public void inAIntValor(AIntValor node)
    {
        defaultIn(node);
    }

    public void outAIntValor(AIntValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntValor(AIntValor node)
    {
        inAIntValor(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAIntValor(node);
    }

    public void inAFloatValor(AFloatValor node)
    {
        defaultIn(node);
    }

    public void outAFloatValor(AFloatValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFloatValor(AFloatValor node)
    {
        inAFloatValor(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outAFloatValor(node);
    }
}
