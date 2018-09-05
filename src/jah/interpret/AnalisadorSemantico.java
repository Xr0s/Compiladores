/* An interpreter for the simple math language we all espouse. */ 
package jah.interpret; 

import jah.node.* ; 
import jah.analysis.* ; 
import java.util.*;

public class AnalisadorSemantico extends DepthFirstAdapter { 

	Hashtable<String, String> tabela_simbolos = new Hashtable(99999999);

	public void outAVariaveisDeclaracao(AVariaveisDeclaracao node){
		// identifier to be stored in the symbol table
				TId ident = null;
				LinkedList<PVar> listaVar  = node.getVar();
				for(PVar var: listaVar) {
					if(var instanceof AIdUnicaVar) {
						AIdUnicaVar acessarToken = (AIdUnicaVar) var;
						ident = acessarToken.getId();
					}else {
						AVetorVar acessarToken = (AVetorVar) var;
						ident = acessarToken.getId();
					}
					
					//FALTA VERIFICAR SE INDICE DO VETOR É NATURAL!!!!!!!!!!!!!!!
					
					String key = ident.getText().toUpperCase().trim();
	//				System.out.println(teste + "  :"+node.getTipo());
	//				String key = var.toString().toUpperCase().trim();
	//				System.out.println(key);
					//		 is the identifier in the table?
					if (tabela_simbolos.containsKey(key)) { // report an error
						try {
							throw new SemanticException(new InvalidToken(
									ident.getText(),
									ident.getLine(), 
									ident.getPos()),
									"Erro: Variável " + ident.getText() + " já declarada. Linha:"+ ident.getLine()+ "."
									);
						} catch (SemanticException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.exit(1);
						}
					}
					else {
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
				
				String key = ident.getText().toUpperCase().trim();
	//			System.out.println(tabela_simbolos);
	//			System.out.println(key);
				//		 is the identifier in the table?
				if (tabela_simbolos.containsKey(key)) { // report an error
					try {
						throw new SemanticException(new InvalidToken(
								ident.getText(),
								ident.getLine(), 
								ident.getPos()),
								"Erro: Variavel " + ident.getText() + " já declarada. Linha:"+ ident.getLine()+ "."
								);
					} catch (SemanticException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.exit(1);
					}
				}
				else {
			//		System.out.println(node.getValor().toString());
					tabela_simbolos.put(key,node.getValor().toString());
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
		
		String key = ident.getText().toUpperCase();
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