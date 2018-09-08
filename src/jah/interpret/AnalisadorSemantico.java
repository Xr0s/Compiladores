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
		

	}

	public void outAAddExp(AAddExp node) {
		
		System.out.println( node.getEsq().toString().trim() + "." + node.getDir() + ".");


	}
	

	
	
	public void outAAtribuicaoComando(AAtribuicaoComando node) {
		AIdUnicaVar variavel = null;
		AVetorVar vetor = null;
		String keyID = "";
		
		if( node.getVar() instanceof AIdUnicaVar) {
			variavel = (AIdUnicaVar) node.getVar();
			keyID = variavel.getId().getText().trim();
		}
		else {
			vetor = (AVetorVar) node.getVar();
			keyID = vetor.getId().getText().trim();
		}
		
		if(tabela_simbolos.containsKey(keyID) ) {// variavel declarada 
			System.out.println(keyID + ", tipo: " + tabela_simbolos.get(keyID).trim() + ".");
			if( !auxChecaTipoValido( keyID ) ) {//variavel é uma constante (erro)
				exibirErro(new InvalidToken(keyID,0,0) ,4);
			}
		}
		else {//variavel não declarada
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
			//				System.out.println(teste + "  :"+node.getTipo());
			//				String key = var.toString().trim();
			//				System.out.println(key);
			//		 is the identifier in the table?
			if (tabela_simbolos.containsKey(key)) { // report an error
				exibirErro(ident, 2);
			}
			else {
				if(! (var instanceof AIdUnicaVar)) {
					int indice = Integer.parseInt(identIndiceVetor.getText().toString());
					if(indice < 0) {
						exibirErro(identIndiceVetor, 1);
					}
				}

				//	System.out.println(node.getTipo().toString());
				tabela_simbolos.put(key,node.getTipo().toString());
			}
		}
	}

	public void outAConstanteDeclaracao(AConstanteDeclaracao node){
		// identifier to be stored in the symbol table
		TId ident = node.getId();
		//		System.out.println("Passou por constante declar");
		//		 name of the identifier to be stored in the table

		String key = ident.getText().trim();
		//			System.out.println(tabela_simbolos);
		//			System.out.println(key);
		//		 is the identifier in the table?
		if (tabela_simbolos.containsKey(key)) { // report an error
			exibirErro(ident, 2);
		}
		else {
			//		System.out.println(node.getValor().toString());
			tabela_simbolos.put(key,node.getValor().toString());
		}
	}

	//Funções Auxiliares
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
		else
			System.out.println("t");
		return false;
	}
	
	public void exibirErro(Token tokenComErro, int indiceErro) {
		String msg = "";

		switch(indiceErro){
			case 1: //erro IndiceNegativo
				msg = "Erro na linha " + tokenComErro.getLine() +
					  ": O índice de um vetor: [" + tokenComErro.getText() + "] não pode "
					   + "ser negativo.";
				break;
				
			case 2://erro variavel já declarada
				msg ="Erro na linha " + tokenComErro.getLine() + 
					 ": Variável '" + tokenComErro.getText() + "' já declarada.";
				break;
				
			case 3://variável não declarada
				msg = "Erro na linha " + tokenComErro.getLine() +
					  ": Variável '" + tokenComErro.getText() + "' não declarada.";
				break;
				
			case 4: //constante não pode ter valor alterado
				msg = ": Constante '" + tokenComErro.getText() + "' não pode ter valor alterado.";
				break;

		
		}

		try {
			throw new SemanticException(new InvalidToken(
					tokenComErro.getText(),
					tokenComErro.getLine(), 
					tokenComErro.getPos()),
					 msg 
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