/* An interpreter for the simple math language we all espouse. */ 
package jah.interpret; 

import jah.node.* ; 
import jah.analysis.* ; 
import java.util.*;

public class AnalisadorSemantico extends DepthFirstAdapter { 

	Hashtable<String, String> tabela_simbolos = new Hashtable(99999999);
	Hashtable<String, String> tabela_expressoes = new Hashtable(99999999);
	private boolean flagLinha = false;
	private int linha;
	
	public void outAVarExp(AVarExp node) {
		AIdUnicaVar variavel = null;
		AVetorVar vetor = null;
		String nomeVar = "";

		if( node.getVar() instanceof AIdUnicaVar) {
			variavel = (AIdUnicaVar) node.getVar();
			nomeVar = variavel.getId().getText().trim();
		}
		else {
			vetor = (AVetorVar) node.getVar();
			nomeVar = vetor.getId().getText().trim();
		}

		if(!tabela_simbolos.containsKey(nomeVar) ) { // não foi declarado
			variavelNaoDeclarada(variavel, vetor);
		}
		else{//variavel foi declarada
			if(vetor != null)
				verificarPosicaoIndevida(vetor,nomeVar);
		}
		

	}

	public void outAAddExp(AAddExp node) {
		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		String tipoEsq = "", tipoDir = "";
		int linha = 0;
		
		System.out.println("nóesq: "+ node.getEsq().toString().trim()
						+"\nnódir: " + node.getDir().toString().trim()
						);
		
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tipoDir = getTipo(varDir).trim();
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tipoDir = retornaTipoValor(valorDir).trim();
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tipoEsq = getTipo(varEsq).trim();
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tipoEsq = retornaTipoValor(valorEsq).trim();
		}
		
		String tipoDaExpressao = "";
		
		if(!tipoEsq.equals("")) { //tipo esq caso base (Valor ou Var)
			if(!tipoDir.equals("")) { //tipo direito caso base (valor ou var)
				System.out.println(tipoEsq + "\\" + tipoDir);
				tipoDaExpressao = checarTiposCompativeis(tipoEsq, tipoDir);
				tabela_expressoes.put(node.toString().trim(),//expressao em si
								     tipoDaExpressao);	
			}
			else{// esq caso base || dir exp
				if( tabela_expressoes.containsKey(node.getDir().toString().trim())) {
					tipoDir = tabela_expressoes.get(node.getDir().toString().trim());
					tipoDaExpressao = checarTiposCompativeis(tipoEsq, tipoDir);
					tabela_expressoes.put(node.toString().trim(), 
							tipoDaExpressao);
					System.out.println(tipoDaExpressao);
				}
				else {
					System.out.println("Expressao nao encontrada: " + node.getDir().toString().trim() + ".");
				}

			}
		}
		else {		
			if(!tipoDir.equals("")) { // esq exp || dir caso base
				if( tabela_expressoes.containsKey(node.getEsq().toString().trim())) {
					tipoEsq = tabela_expressoes.get(node.getEsq().toString().trim());
					tipoDaExpressao = checarTiposCompativeis(tipoEsq,tipoDir);
					//descobri
					tabela_expressoes.put(node.toString().trim(), 
										tipoDaExpressao);
				}
				else {
					System.out.println("Expressao nao encontrada: " + node.getEsq().toString().trim() + ".");
				}
			}
			
		}
		
	}

	public String getTipo(AVarExp varExp) {
		AIdUnicaVar variavel;
		AVetorVar vetor;
		String tipo;
		if(varExp.getVar() instanceof AIdUnicaVar) {
			variavel = (AIdUnicaVar) varExp.getVar();
			tipo = tabela_simbolos.get(variavel.getId().getText().trim()).split("_")[0];
		}
		else {
			vetor = (AVetorVar) varExp.getVar();
			tipo = tabela_simbolos.get(vetor.getId().getText().trim()).split("_")[0];
		}
		return tipo;
	}

	public void outAParaSemPassoComando(AParaSemPassoComando node) {
		AIdUnicaVar variavel = null;
		AVetorVar vetor = null;
		String nomeVar = "";

		if( node.getVar() instanceof AIdUnicaVar) {
			variavel = (AIdUnicaVar) node.getVar();
			nomeVar = variavel.getId().getText().trim();
		}
		else {
			vetor = (AVetorVar) node.getVar();
			nomeVar = vetor.getId().getText().trim();
		}
		if( tabela_simbolos.containsKey(nomeVar)) {
			String quebra[] = tabela_simbolos.get(nomeVar).trim().split("_");
			if( !(tabela_simbolos.get(nomeVar).trim() ).equals("inteiro")  ){ 
				if(!(quebra[0].equals("const"))) { //mudar isso qdo italo atualizar o codigo
					if(variavel!= null) {//variavel deve ser do tipo inteiro
						exibirErro(variavel.getId(),6);
					}
					else
						exibirErro(vetor.getId(), 6);
				}
				else { //variavel não pode ser constante
					exibirErro(variavel.getId(), 4);
				}
			}
			else{//variavel é inteiro
				if(vetor != null) {//variavel só pode ser vetor se tiver com o indice
					verificarPosicaoIndevida(vetor,nomeVar);//se está acessando posição indevida
				}
				else {//se for vetor sem indice dar erro
					if(tabela_simbolos.containsKey("indice_" + nomeVar)) {
						exibirErro(variavel.getId(), 7);
					}
				}
			}
				
		}
		else{//variavel nao declarada
			variavelNaoDeclarada(variavel,vetor);
		}
		
	}
	
	public void outAParaComPassoComando(AParaComPassoComando node) {
		AIdUnicaVar variavel = null;
		AVetorVar vetor = null;
		String nomeVar = "";

		if( node.getVar() instanceof AIdUnicaVar) {
			variavel = (AIdUnicaVar) node.getVar();
			nomeVar = variavel.getId().getText().trim();
		}
		else {
			vetor = (AVetorVar) node.getVar();
			nomeVar = vetor.getId().getText().trim();
		}
		if( tabela_simbolos.containsKey(nomeVar)) {
			String quebra[] = tabela_simbolos.get(nomeVar).trim().split("_");
			if( !(tabela_simbolos.get(nomeVar).trim() ).equals("inteiro")  ){ 
				if(!(quebra[0].equals("const"))) { //mudar isso qdo italo atualizar o codigo
					if(variavel!= null) {//variavel deve ser do tipo inteiro
						exibirErro(variavel.getId(),6);
					}
					else
						exibirErro(vetor.getId(), 6);
				}
				else { //variavel não pode ser constante
					exibirErro(variavel.getId(), 4);
				}
			}
			else{//variavel é inteiro
				if(vetor != null) {//variavel só pode ser vetor se tiver com o indice
					verificarPosicaoIndevida(vetor,nomeVar);//se está acessando posição indevida
				}
				else {//se for vetor sem indice dar erro
					if(tabela_simbolos.containsKey("indice_" + nomeVar)) {
						exibirErro(variavel.getId(), 7);
					}
				}
			}
				
		}
		else{//variavel nao declarada
			variavelNaoDeclarada(variavel,vetor);
		}
	
	}
	
	public void outAAtribuicaoComando(AAtribuicaoComando node) {
		AIdUnicaVar variavel = null;
		AVetorVar vetor = null;
		String nomeVar = "";
		String tipoVar = "", tipoExp = "";
		int linha;
		if( node.getVar() instanceof AIdUnicaVar) {
			variavel = (AIdUnicaVar) node.getVar();
			nomeVar = variavel.getId().getText().trim();
			linha = variavel.getId().getLine();
		}
		else {
			vetor = (AVetorVar) node.getVar();
			nomeVar = vetor.getId().getText().trim();
			linha = vetor.getId().getLine();
		}
		
		if(tabela_simbolos.containsKey(nomeVar) ) {// variavel declarada 
		//	System.out.println(nomeVar + ", tipo: " + tabela_simbolos.get(nomeVar).trim() + ".");
			if( !tabela_simbolos.get(nomeVar).split("_")[1].equals("@") ) {//variavel é uma constante (erro)
				exibirErro(new InvalidToken(nomeVar,variavel.getId().getLine(),0) ,4);
			}
			else {// é uma variavel
				if(vetor != null){
					verificarPosicaoIndevida(vetor, nomeVar);
					//abaixo vai declarar a variavel no indice dado
			//		System.out.println("Inserido: " + nomeVar +"_" + vetor.getInteiro().toString().trim());
					tabela_simbolos.put(nomeVar +"_" + vetor.getInteiro().toString().trim(), 
							tabela_simbolos.get(nomeVar).trim());
				}
				tipoVar = tabela_simbolos.get(nomeVar).split("_")[0].trim();
				if(tabela_expressoes.containsKey(node.getExp().toString().trim())) {
					tipoExp = tabela_expressoes.get(node.getExp().toString().trim());
				}
				System.out.println("tipovar: " + tipoVar
								+ "\ntipoExp: " + tipoExp);
				
				if(!tipoVar.equals(checarTiposCompativeis(tipoVar,tipoExp)) ) {
					exibirErro(new InvalidToken(null, linha, 0 )
							, 8 );	
				}
						//GG?	
			}
		}
		else {//variavel não declarada
			variavelNaoDeclarada(variavel, vetor);
		}
	
	}


	
	public void outAVariaveisDeclaracao(AVariaveisDeclaracao node){
		// identifier to be stored in the symbol table
		TId ident = null;
		TInteiro identIndiceVetor = null;
		LinkedList<PVar> listaVar  = node.getVar();
		for(PVar var: listaVar) {
			if(var instanceof AIdUnicaVar) {
				AIdUnicaVar acessarToken = (AIdUnicaVar) var;
				ident = acessarToken.getId();
			}else {
				AVetorVar acessarToken = (AVetorVar) var;
				ident = acessarToken.getId();
				identIndiceVetor = acessarToken.getInteiro();
			}

			String key = ident.getText().trim();
				if (tabela_simbolos.containsKey(key)) { // report an error
				exibirErro(ident, 2);
			}
			else {
				if(! (var instanceof AIdUnicaVar)) {
					int indice = Integer.parseInt(identIndiceVetor.getText().toString());
					if(indice < 0) {
						exibirErro(identIndiceVetor, 1);
					}
					else {
						tabela_simbolos.put("indice_" + key, "" + indice);
					}
				}

				tabela_simbolos.put(key,node.getTipo().toString() + "_@");
			}
		}
	}

	public void outAConstanteDeclaracao(AConstanteDeclaracao node){
		TId ident = node.getId();
		String key = ident.getText().trim();

		if (tabela_simbolos.containsKey(key)) { // report an error
			exibirErro(ident, 2);
		}
		else {
			
			
			if(node.getValor().toString().trim().matches("[0-9]*")) {
				tabela_simbolos.put(key,"inteiro_" + node.getValor().toString());				
			}else if(node.getValor().toString().trim().matches("[0-9]*+,+[0-9]*")) {
				tabela_simbolos.put(key,"real_" + node.getValor().toString());
			}else if(node.getValor().toString().trim().matches("verdadeiro|falso")) {
				tabela_simbolos.put(key,"booleano_" + node.getValor().toString());
			}else {
				tabela_simbolos.put(key,"caractere_" + node.getValor().toString());
			}

		}
	}

	//Funções Auxiliares

	public boolean contemNaTabelaExp(PExp pExp) {
		return tabela_expressoes.containsKey(pExp.toString().trim() );
	}

	public String retornaTipoValor(AValorExp valorEsq) {
		if(valorEsq.getValor() instanceof ACharValor)
			return "caractere";
		else if(valorEsq.getValor() instanceof AIntValor)
			return "inteiro";
		else if(valorEsq.getValor() instanceof AFloatValor)
			return "real";
		else if(valorEsq.getValor() instanceof ABooleanoValor)
			return "booleano";
		
		return null;
	}

	
	public String checarTiposCompativeis(String tipoEsq, String tipoDir) {
		if(! tipoEsq.equals(tipoDir) ) {//se os tipos não forem iguais
			if( (  (tipoEsq.equals("real") || tipoEsq.equals("inteiro") )
					&&
					( tipoDir.equals("real") || tipoDir.equals("inteiro") ) 
					)
				) {
				return "real";
			}
			else
				exibirErro(null, 8);	
		}
		
		return tipoEsq;
	}


	public void variavelNaoDeclarada(AIdUnicaVar variavel, AVetorVar vetor) {
		if(variavel != null) {//variavel
			exibirErro(new InvalidToken(variavel.getId().getText(),
								 variavel.getId().getLine(),
								 variavel.getId().getPos()
								 ),
						3
					);
		}
		else {//vetor
			exibirErro(new InvalidToken(vetor.getId().getText(),
										vetor.getId().getLine(),
										vetor.getId().getPos()
					 					),
						3
					);
		}
	}

	
	
	public void verificarPosicaoIndevida(AVetorVar vetor, String nomeVar) {
		if(vetor != null) {//variavel do tipo vetor
			int indice = Integer.parseInt(vetor.getInteiro().getText() );
		//	System.out.println("vetor " + vetor.getId().getText().trim() 
		 //						+ " " + indice + ".");
			int tamVetor = Integer.parseInt(tabela_simbolos.get("indice_"+ nomeVar).trim() );
			if(indice >= tamVetor) {
				//se o indice utilizado for maior ou igual que o tamVetor
				erroPosicaoIndevida(vetor, nomeVar);
			}
		}
	}

	public void erroPosicaoIndevida(AVetorVar vetor, String nomeVar) {
		exibirErro(new InvalidToken(
				nomeVar,
				vetor.getId().getLine(),
				vetor.getId().getPos()
				)
				,
				5);
	}
	
	public boolean auxChecaTipoValido(String variavel) {
		return true;
/*		if(tabela_simbolos.containsKey(variavel) ) {
			switch(tabela_simbolos.get(variavel).trim().split("_")[0] ) {
				case "inteiro":
					return true;
				case "caractere":
					return true;
				case "booleano":
					return true;
				case "real":
					return true;
				default:
					return false;
			}
		}
		return false;
*/	}
	
	public void exibirErro(Token tokenComErro, int indiceErro) {
		String msg = "";
		String text = "";
		int line = 0;
		int pos = 0;
		
		if(indiceErro != 8) { 
			text = tokenComErro.getText();
			line = tokenComErro.getLine();
			pos = tokenComErro.getPos();
		}
		
		switch(indiceErro){
			case 1: //erro IndiceNegativo
				msg = ": O índice de um vetor: [" + text + "] não pode "
					   + "ser negativo.";
				break;
				
			case 2://erro variavel já declarada
				msg = ": Variável " + text + " já declarada.";
				break;
				
			case 3://variável não declarada
				msg = ": Variável " + text + " não declarada.";
				break;
				
			case 4: //constante não pode ter valor alterado
				msg = ": Constante " + text + " não pode ter valor alterado.";
				break;
			
			case 5:
				msg = ": Vetor "+ text + " tentou acessar uma posição"
						+ " indevida.";
				break;
				
			case 6:
				msg = ": Variavel " + text + " deve ser do tipo inteiro.";
				break;
			
			case 7:
				msg = ": Vetor " + text + " deve vir com o indice.";
				break;
			
			case 8:
				msg = "Tipos incorretos na expressão.";
				break;
		}
		
		if(indiceErro != 8) {
			msg = "Erro na linha " + line + msg;
		}
		
		try {
			
			throw new SemanticException(new InvalidToken(
					text,
					line, 
					pos ),
					msg 
					);



		} catch (SemanticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
	}



}