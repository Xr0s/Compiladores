/* An interpreter for the simple math language we all espouse. */ 
package jah.interpret; 

import jah.node.* ; 
import jah.analysis.* ; 
import java.util.*;

public class AnalisadorSemantico extends DepthFirstAdapter { 

	Hashtable<String, String> tabela_simbolos = new Hashtable(99999999);

	Hashtable<String, String> tabela_expressoes = new Hashtable(99999999);


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
			verificarPosicaoIndevida(vetor,nomeVar);				
			if(!tabela_simbolos.containsKey(nomeVar + "_" + vetor.getInteiro().getText().trim())) {
				//se o vetor na posicao 'indice' foi declarado
				erroPosicaoIndevida(vetor);
			}
		}
		

	}

	public void outAAddExp(AAddExp node) {
		
	//	System.out.println( node.getEsq().toString().trim() + "." + node.getDir() + ".");


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
		
		if( node.getVar() instanceof AIdUnicaVar) {
			variavel = (AIdUnicaVar) node.getVar();
			nomeVar = variavel.getId().getText().trim();
		}
		else {
			vetor = (AVetorVar) node.getVar();
			nomeVar = vetor.getId().getText().trim();
		}
		
		if(tabela_simbolos.containsKey(nomeVar) ) {// variavel declarada 
		//	System.out.println(nomeVar + ", tipo: " + tabela_simbolos.get(nomeVar).trim() + ".");
			if( !auxChecaTipoValido( nomeVar ) ) {//variavel é uma constante (erro)
				exibirErro(new InvalidToken(nomeVar,variavel.getId().getLine(),0) ,4);
			}
			else {// é uma variavel
				verificarPosicaoIndevida(vetor, nomeVar);
				//abaixo vai declarar a variavel no indice dado
		//		System.out.println("Inserido: " + nomeVar +"_" + vetor.getInteiro().toString().trim());
				tabela_simbolos.put(nomeVar +"_" + vetor.getInteiro().toString().trim(), 
						tabela_simbolos.get(nomeVar).trim());
				
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

				tabela_simbolos.put(key,node.getTipo().toString());
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
		//	System.out.println("inserindo " + key + ".");
			tabela_simbolos.put(key,"const_" + node.getValor().toString());
		}
	}

	//Funções Auxiliares
	
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
				erroPosicaoIndevida(vetor);
			}
		}
	}

	public void erroPosicaoIndevida(AVetorVar vetor) {
		exibirErro(new InvalidToken(
				vetor.getId().getText(),
				vetor.getId().getLine(),
				vetor.getId().getPos()
				)
				,
				5);
	}
	
	public boolean auxChecaTipoValido(String variavel) {
		if(tabela_simbolos.containsKey(variavel) ) {
			switch(tabela_simbolos.get(variavel).trim() ) {
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
	}
	
	public void exibirErro(Token tokenComErro, int indiceErro) {
		String msg = "";

		switch(indiceErro){
			case 1: //erro IndiceNegativo
				msg = ": O índice de um vetor: [" + tokenComErro.getText() + "] não pode "
					   + "ser negativo.";
				break;
				
			case 2://erro variavel já declarada
				msg = ": Variável '" + tokenComErro.getText() + "' já declarada.";
				break;
				
			case 3://variável não declarada
				msg = ": Variável '" + tokenComErro.getText() + "' não declarada.";
				break;
				
			case 4: //constante não pode ter valor alterado
				msg = ": Constante '" + tokenComErro.getText() + "' não pode ter valor alterado.";
				break;
			
			case 5:
				msg = ": Vetor '" + tokenComErro.getText() + "' tentou acessar uma posição"
						+ " indevida.";
				break;
				
			case 6:
				msg = ": Variavel '" + tokenComErro.getText() + "' deve ser do tipo 'inteiro'.";
				break;
			
			case 7:
				msg = ": Vetor '" + tokenComErro.getText() + "' deve vir com o indice.";
				break;
		}

		try {
			throw new SemanticException(new InvalidToken(
					tokenComErro.getText(),
					tokenComErro.getLine(), 
					tokenComErro.getPos()),
					"Erro na linha " + tokenComErro.getLine() + msg 
					);



		} catch (SemanticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
	}






	/* Descoomente isso pra testar
  	public void caseAProgram(AProgram node) { 
		//      String lhs = node.getLeft().getText().trim(); 
		//      String rhs = node.getRight().getText().trim(); 
		//      int result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue(); 
		//      System.out.println(lhs + "+" + rhs + "=" + result); 
		String id_programa = node.getId().getText().trim();
		System.out.println("Rodando analisador Semantico do programa " + id_programa + ".jah. . .\n");
	}


	public void outAIdUnicaVar(AIdUnicaVar node) {
		// identifier to be stored in the symbol table
		TId ident = node.getId();
		//		 name of the identifier to be stored in the table

		String key = ident.getText();
		System.out.println(key);
		//		 is the identifier in the table?
		if (tabela_simbolos.containsKey(key)) { // report an error
			try {
				throw new SemanticException(new InvalidToken(
						ident.getText(),
						ident.getLine(), 
						ident.getPos()),
						"Erro: variavel " + key + " já declarada. Linha:"+ ident.getLine()+ "."
						);
			} catch (SemanticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			tabela_simbolos.put(key , "oi");
		}
	}
/*
	public void caseAVetorVar(AVetorVar node) {
		//		 identifier to be stored in the symbol table
		TId ident = node.getId();
		//		 name of the identifier to be stored in the table
		String key = ident.getText();

		//		 is the identifier in the table?
		if (tabela_simbolos.containsKey(key)) { // report an error
			try {
				throw new SemanticException(new InvalidToken(
						ident.getText(),
						ident.getLine(), 
						ident.getPos()),
						"Erro: variavel " + key + " já declarada. Linha:"+ ident.getLine()+ "."
						);
			} catch (SemanticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			ConteudoID valores = new ConteudoID();
			valores.setTipo("const");
			tabela_simbolos.put(key , valores);
		}

	}

	 */

}