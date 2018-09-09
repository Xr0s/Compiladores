/* An interpreter for the simple math language we all espouse. */ 
package jah.interpret; 

import jah.node.* ; 
import jah.analysis.* ; 
import java.util.*;

public class AnalisadorSemantico extends DepthFirstAdapter { 

	Hashtable<String, String> tabela_simbolos = new Hashtable<String, String>(99999999);
	Hashtable<String, String> tabela_expressoes = new Hashtable<String, String>(99999999);
	
	public void outAIgualdadeExpExpLogica(AIgualdadeExpExpLogica node) {

		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		Token tokenId = null;
			
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tokenId = retornaToken(varDir);
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tokenId = retornaToken(valorDir);
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tokenId = retornaToken(varEsq);
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tokenId = retornaToken(valorEsq);
		}
			
			
		String tipoEsq = "", tipoDir = "";
		String expEsq = node.getEsq().toString().trim();
		String expDir = node.getDir().toString().trim();
		
		if(tabela_expressoes.containsKey(expEsq)) {
			tipoEsq = tabela_expressoes.get(expEsq);
		}
		
		if(tabela_expressoes.containsKey(expDir)) {
			tipoDir = tabela_expressoes.get(expDir);
		}
		
		checarTiposCompativeis(tipoEsq, tipoDir, tokenId);
	}
	
	public void outADiferenteExpExpLogica(ADiferenteExpExpLogica node) {

		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		Token tokenId = null;
			
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tokenId = retornaToken(varDir);
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tokenId = retornaToken(valorDir);
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tokenId = retornaToken(varEsq);
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tokenId = retornaToken(valorEsq);
		}
			
			
		String tipoEsq = "", tipoDir = "";
		String expEsq = node.getEsq().toString().trim();
		String expDir = node.getDir().toString().trim();
		
		if(tabela_expressoes.containsKey(expEsq)) {
			tipoEsq = tabela_expressoes.get(expEsq);
		}
		
		if(tabela_expressoes.containsKey(expDir)) {
			tipoDir = tabela_expressoes.get(expDir);
		}
		
		checarTiposCompativeis(tipoEsq, tipoDir, tokenId);
	}
	
	public void outAMenorExpLogica(AMenorExpLogica node) {
		

		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		Token tokenId = null;
			
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tokenId = retornaToken(varDir);
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tokenId = retornaToken(valorDir);
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tokenId = retornaToken(varEsq);
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tokenId = retornaToken(valorEsq);
		}
			
			
		String tipoEsq = "", tipoDir = "";
		String expEsq = node.getEsq().toString().trim();
		String expDir = node.getDir().toString().trim();
		
		if(tabela_expressoes.containsKey(expEsq)) {
			tipoEsq = tabela_expressoes.get(expEsq);
		}
		
		if(tabela_expressoes.containsKey(expDir)) {
			tipoDir = tabela_expressoes.get(expDir);
		}
		
		checarTiposCompativeis(tipoEsq, tipoDir, tokenId);
	}
	
	public void outAMenorigExpLogica(AMenorigExpLogica node) {

		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		Token tokenId = null;
			
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tokenId = retornaToken(varDir);
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tokenId = retornaToken(valorDir);
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tokenId = retornaToken(varEsq);
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tokenId = retornaToken(valorEsq);
		}
			
			
		String tipoEsq = "", tipoDir = "";
		String expEsq = node.getEsq().toString().trim();
		String expDir = node.getDir().toString().trim();
		
		if(tabela_expressoes.containsKey(expEsq)) {
			tipoEsq = tabela_expressoes.get(expEsq);
		}
		
		if(tabela_expressoes.containsKey(expDir)) {
			tipoDir = tabela_expressoes.get(expDir);
		}
		
		checarTiposCompativeis(tipoEsq, tipoDir, tokenId);
	}
	
	public void outAMaiorigExpLogica(AMaiorigExpLogica node) {

		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		Token tokenId = null;
			
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tokenId = retornaToken(varDir);
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tokenId = retornaToken(valorDir);
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tokenId = retornaToken(varEsq);
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tokenId = retornaToken(valorEsq);
		}
			
			
		String tipoEsq = "", tipoDir = "";
		String expEsq = node.getEsq().toString().trim();
		String expDir = node.getDir().toString().trim();
		
		if(tabela_expressoes.containsKey(expEsq)) {
			tipoEsq = tabela_expressoes.get(expEsq);
		}
		
		if(tabela_expressoes.containsKey(expDir)) {
			tipoDir = tabela_expressoes.get(expDir);
		}
		
		checarTiposCompativeis(tipoEsq, tipoDir, tokenId);
	}
	
	public void outAMaiorExpLogica(AMaiorExpLogica node) {

		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		Token tokenId = null;
			
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tokenId = retornaToken(varDir);
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tokenId = retornaToken(valorDir);
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tokenId = retornaToken(varEsq);
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tokenId = retornaToken(valorEsq);
		}
			
			
		String tipoEsq = "", tipoDir = "";
		String expEsq = node.getEsq().toString().trim();
		String expDir = node.getDir().toString().trim();
		
		if(tabela_expressoes.containsKey(expEsq)) {
			tipoEsq = tabela_expressoes.get(expEsq);
		}
		
		if(tabela_expressoes.containsKey(expDir)) {
			tipoDir = tabela_expressoes.get(expDir);
		}
		
		checarTiposCompativeis(tipoEsq, tipoDir, tokenId);
	}
	
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

			tabela_expressoes.put(nomeVar.trim(),
						tabela_simbolos.get(nomeVar.trim()).split("_")[0].trim()
						);
		}
		

	}

	public void outAValorExp(AValorExp node) {
		String expressao = "";
		
		if( node.getValor() instanceof ACharValor) {
			ACharValor valor = (ACharValor) node.getValor();
			expressao = valor.getCaractere().getText().trim();	
		
		}else if( node.getValor() instanceof AIntValor) {
			AIntValor valor = (AIntValor) node.getValor();
			expressao = valor.getInteiro().getText().trim();
		
		}else if( node.getValor() instanceof AFloatValor) {
			AFloatValor valor = (AFloatValor) node.getValor();
			expressao = valor.getReal().getText().trim();
			
		}else if( node.getValor() instanceof ABooleanoValor) {
			ABooleanoValor valor = (ABooleanoValor) node.getValor();
			expressao = valor.getBooleano().getText().trim();
		}
		
		tabela_expressoes.put(expressao.trim()
				, retornaTipoExp(expressao.trim()) );
	}

	public void outALeiaComando(ALeiaComando node) {
		Token tokenId;
		AIdUnicaVar variavel = null;
		AVetorVar vetor = null;
		
		LinkedList<PVar> listaVar  = node.getVar();
		
		for(PVar var: listaVar) {
			if(var instanceof AIdUnicaVar) {
				variavel = (AIdUnicaVar) var;
				tokenId = variavel.getId();
				if(tabela_simbolos.containsKey(tokenId.getText().trim() )) {
					if(tabela_simbolos.get( tokenId.getText().trim())
							.split("_")[1].equals("!") ){
						//se o que tiver sido declarado for vetor (tiver o '!')
						exibirErro( tokenId ,7);
					}
				}
			}else {
				vetor = (AVetorVar) var;
				tokenId = vetor.getId();
				////System.out.println(tokenId.getText().trim());
				verificarPosicaoIndevida(vetor, tokenId.getText().trim());

			}

			String key = tokenId.getText().trim();
			if (!tabela_simbolos.containsKey(key)) { // report an error
				variavelNaoDeclarada(variavel,vetor);
			}	
		}
	}
	
	public void outAAddExp(AAddExp node) {
		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		String tipoEsq = "", tipoDir = "";
		Token tokenId = null;
		
//		////System.out.println("nóesq: "+ node.getEsq().toString().trim()
//						+"\nnódir: " + node.getDir().toString().trim()
//						);
		
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tipoDir = getTipo(varDir).trim();
			tokenId = retornaToken(varDir);
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tipoDir = retornaTipoValor(valorDir).trim();
			tokenId = retornaToken(valorDir);
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tipoEsq = getTipo(varEsq).trim();
			tokenId = retornaToken(varEsq);
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tipoEsq = retornaTipoValor(valorEsq).trim();
			tokenId = retornaToken(valorEsq);
		}
		
		String tipoDaExpressao = "";
		
		
		if(!tipoEsq.equals("")) { //tipo esq caso base (Valor ou Var)
			if(!tipoDir.equals("")) { //tipo direito caso base (valor ou var)
	//			////System.out.println(tipoEsq + "\\" + tipoDir);
				
				verificaStringOuChar(tipoEsq,tipoDir,tokenId,12);
				
				tipoDaExpressao = checarTiposCompativeis(tipoEsq, tipoDir,tokenId);
				tabela_expressoes.put(node.toString().trim(),//expressao em si
								     tipoDaExpressao);	
			}
			else{// esq caso base || dir exp
				if( tabela_expressoes.containsKey(node.getDir().toString().trim())) {
					tipoDir = tabela_expressoes.get(node.getDir().toString().trim());
					
					verificaStringOuChar(tipoEsq,tipoDir,tokenId,12);
					
					tipoDaExpressao = checarTiposCompativeis(tipoEsq, tipoDir,tokenId);
					tabela_expressoes.put(node.toString().trim(), 
							tipoDaExpressao);
					////System.out.println(tipoDaExpressao);
				}
				else {
					////System.out.println("Expressao nao encontrada: " + node.getDir().toString().trim() + ".");
				}

			}
		}
		else {		
			if(!tipoDir.equals("")) { // esq exp || dir caso base
				if( tabela_expressoes.containsKey(node.getEsq().toString().trim())) {
					tipoEsq = tabela_expressoes.get(node.getEsq().toString().trim());
					
					verificaStringOuChar(tipoEsq,tipoDir,tokenId,12);
					
					tipoDaExpressao = checarTiposCompativeis(tipoEsq,tipoDir,tokenId);
					//descobri
					tabela_expressoes.put(node.toString().trim(), 
										tipoDaExpressao);
				}
			}
			else {//esq exp  || dir exp
//				System.out.println("Teste");
				tipoEsq = tabela_expressoes.get(node.getEsq().toString().trim());
				tipoDir = tabela_expressoes.get(node.getDir().toString().trim());
				tipoDaExpressao = checarTiposCompativeis(tipoEsq,tipoDir,tokenId);
				tabela_expressoes.put(node.toString().trim(), 
									tipoDaExpressao);
			}
			
		}
		
	}
	
	public void outASubExp(ASubExp node) {
		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		String tipoEsq = "", tipoDir = "";
		Token tokenId = null;
		
//		////System.out.println("nóesq: "+ node.getEsq().toString().trim()
//						+"\nnódir: " + node.getDir().toString().trim()
//						);
		
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tipoDir = getTipo(varDir).trim();
			tokenId = retornaToken(varDir);
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tipoDir = retornaTipoValor(valorDir).trim();
			tokenId = retornaToken(valorDir);
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tipoEsq = getTipo(varEsq).trim();
			tokenId = retornaToken(varEsq);
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tipoEsq = retornaTipoValor(valorEsq).trim();
			tokenId = retornaToken(valorEsq);
		}
		
		String tipoDaExpressao = "";
		
		
		if(!tipoEsq.equals("")) { //tipo esq caso base (Valor ou Var)
			if(!tipoDir.equals("")) { //tipo direito caso base (valor ou var)
	//			////System.out.println(tipoEsq + "\\" + tipoDir);
				
				verificaStringOuChar(tipoEsq,tipoDir,tokenId,13);
				
				tipoDaExpressao = checarTiposCompativeis(tipoEsq, tipoDir,tokenId);
				tabela_expressoes.put(node.toString().trim(),//expressao em si
								     tipoDaExpressao);	
			}
			else{// esq caso base || dir exp
				if( tabela_expressoes.containsKey(node.getDir().toString().trim())) {
					tipoDir = tabela_expressoes.get(node.getDir().toString().trim());
					
					verificaStringOuChar(tipoEsq,tipoDir,tokenId,13);
					
					tipoDaExpressao = checarTiposCompativeis(tipoEsq, tipoDir,tokenId);
					tabela_expressoes.put(node.toString().trim(), 
							tipoDaExpressao);
					////System.out.println(tipoDaExpressao);
				}
				else {
					////System.out.println("Expressao nao encontrada: " + node.getDir().toString().trim() + ".");
				}

			}
		}
		else {		
			if(!tipoDir.equals("")) { // esq exp || dir caso base
				if( tabela_expressoes.containsKey(node.getEsq().toString().trim())) {
					tipoEsq = tabela_expressoes.get(node.getEsq().toString().trim());
					
					verificaStringOuChar(tipoEsq,tipoDir,tokenId,13);
					
					tipoDaExpressao = checarTiposCompativeis(tipoEsq,tipoDir,tokenId);
					//descobri
					tabela_expressoes.put(node.toString().trim(), 
										tipoDaExpressao);
				}
			}
			else {//esq exp  || dir exp
//				System.out.println("Teste");
				tipoEsq = tabela_expressoes.get(node.getEsq().toString().trim());
				tipoDir = tabela_expressoes.get(node.getDir().toString().trim());
				tipoDaExpressao = checarTiposCompativeis(tipoEsq,tipoDir,tokenId);
				tabela_expressoes.put(node.toString().trim(), 
									tipoDaExpressao);
			}
			
		}
		
	}
	
	public void outAMultExp(AMultExp node) {
		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		String tipoEsq = "", tipoDir = "";
		Token tokenId = null;
		
//		////System.out.println("nóesq: "+ node.getEsq().toString().trim()
//						+"\nnódir: " + node.getDir().toString().trim()
//						);
		
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tipoDir = getTipo(varDir).trim();
			tokenId = retornaToken(varDir);
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tipoDir = retornaTipoValor(valorDir).trim();
			tokenId = retornaToken(valorDir);
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tipoEsq = getTipo(varEsq).trim();
			tokenId = retornaToken(varEsq);
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tipoEsq = retornaTipoValor(valorEsq).trim();
			tokenId = retornaToken(valorEsq);
		}
		
		String tipoDaExpressao = "";
		
		
		if(!tipoEsq.equals("")) { //tipo esq caso base (Valor ou Var)
			if(!tipoDir.equals("")) { //tipo direito caso base (valor ou var)
	//			////System.out.println(tipoEsq + "\\" + tipoDir);
				
				verificaStringOuChar(tipoEsq,tipoDir,tokenId,14);
				
				tipoDaExpressao = checarTiposCompativeis(tipoEsq, tipoDir,tokenId);
				tabela_expressoes.put(node.toString().trim(),//expressao em si
								     tipoDaExpressao);	
			}
			else{// esq caso base || dir exp
				if( tabela_expressoes.containsKey(node.getDir().toString().trim())) {
					tipoDir = tabela_expressoes.get(node.getDir().toString().trim());
					
					verificaStringOuChar(tipoEsq,tipoDir,tokenId,14);
					
					tipoDaExpressao = checarTiposCompativeis(tipoEsq, tipoDir,tokenId);
					tabela_expressoes.put(node.toString().trim(), 
							tipoDaExpressao);

				}
				else {
					////System.out.println("Expressao nao encontrada: " + node.getDir().toString().trim() + ".");
				}

			}
		}
		else {		
			if(!tipoDir.equals("")) { // esq exp || dir caso base
				if( tabela_expressoes.containsKey(node.getEsq().toString().trim())) {
					tipoEsq = tabela_expressoes.get(node.getEsq().toString().trim());
					
					verificaStringOuChar(tipoEsq,tipoDir,tokenId,14);
					
					tipoDaExpressao = checarTiposCompativeis(tipoEsq,tipoDir,tokenId);
					//descobri
					tabela_expressoes.put(node.toString().trim(), 
										tipoDaExpressao);
				}
			}
			else {//esq exp  || dir exp
//				System.out.println("Teste");
				tipoEsq = tabela_expressoes.get(node.getEsq().toString().trim());
				tipoDir = tabela_expressoes.get(node.getDir().toString().trim());
				tipoDaExpressao = checarTiposCompativeis(tipoEsq,tipoDir,tokenId);
				tabela_expressoes.put(node.toString().trim(), 
									tipoDaExpressao);
			}
			
		}
		
	}
	
	public void outADivExp(ADivExp node) {
		AVarExp varEsq = null,varDir = null;
		AValorExp valorEsq = null,valorDir = null;
		String tipoEsq = "", tipoDir = "";
		Token tokenId = null;
		
//		////System.out.println("nóesq: "+ node.getEsq().toString().trim()
//						+"\nnódir: " + node.getDir().toString().trim()
//						);
		
		if(node.getDir() instanceof AVarExp) {
			varDir = (AVarExp) node.getDir();
			tipoDir = getTipo(varDir).trim();
			tokenId = retornaToken(varDir);
		}else if(node.getDir() instanceof AValorExp){
			valorDir = (AValorExp) node.getDir();
			tipoDir = retornaTipoValor(valorDir).trim();
			tokenId = retornaToken(valorDir);
		}
		
		if(node.getEsq() instanceof AVarExp) {
			varEsq = (AVarExp) node.getEsq();
			tipoEsq = getTipo(varEsq).trim();
			tokenId = retornaToken(varEsq);
		}else if(node.getEsq() instanceof AValorExp){
			valorEsq = (AValorExp) node.getEsq();
			tipoEsq = retornaTipoValor(valorEsq).trim();
			tokenId = retornaToken(valorEsq);
		}
		
		String tipoDaExpressao = "";
		
		
		if(!tipoEsq.equals("")) { //tipo esq caso base (Valor ou Var)
			if(!tipoDir.equals("")) { //tipo direito caso base (valor ou var)
	//			////System.out.println(tipoEsq + "\\" + tipoDir);
				
				verificaStringOuChar(tipoEsq,tipoDir,tokenId,15);
				
				tipoDaExpressao = checarTiposCompativeis(tipoEsq, tipoDir,tokenId);
				tabela_expressoes.put(node.toString().trim(),//expressao em si
								     tipoDaExpressao);	
			}
			else{// esq caso base || dir exp
				if( tabela_expressoes.containsKey(node.getDir().toString().trim())) {
					tipoDir = tabela_expressoes.get(node.getDir().toString().trim());
					
					verificaStringOuChar(tipoEsq,tipoDir,tokenId,15);
					
					tipoDaExpressao = checarTiposCompativeis(tipoEsq, tipoDir,tokenId);
					tabela_expressoes.put(node.toString().trim(), 
							tipoDaExpressao);
					////System.out.println(tipoDaExpressao);
				}
				else {
					////System.out.println("Expressao nao encontrada: " + node.getDir().toString().trim() + ".");
				}

			}
		}
		else {		
			if(!tipoDir.equals("")) { // esq exp || dir caso base
				if( tabela_expressoes.containsKey(node.getEsq().toString().trim())) {
					tipoEsq = tabela_expressoes.get(node.getEsq().toString().trim());
					
					verificaStringOuChar(tipoEsq,tipoDir,tokenId,15);
					
					tipoDaExpressao = checarTiposCompativeis(tipoEsq,tipoDir,tokenId);
					//descobri
					tabela_expressoes.put(node.toString().trim(), 
										tipoDaExpressao);
				}
			}
			else {//esq exp  || dir exp
//				System.out.println("Teste");
				tipoEsq = tabela_expressoes.get(node.getEsq().toString().trim());
				tipoDir = tabela_expressoes.get(node.getDir().toString().trim());
				tipoDaExpressao = checarTiposCompativeis(tipoEsq,tipoDir,tokenId);
				tabela_expressoes.put(node.toString().trim(), 
									tipoDaExpressao);
			}
			
		}
		
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
	
	public void outAAvalieComando(AAvalieComando node) {
		LinkedList<PCasos> casos = node.getCasos();
		String Exp = node.getExp().toString().trim();
		String tipoExp = "";
		int linha = 0;
		if(tabela_expressoes.containsKey(Exp)) {
			tipoExp = tabela_expressoes.get(Exp);
		}
		
		for(PCasos caso: casos) {
			String tipoCaso = "";
			
			if(  caso instanceof ACasos){
				if( ((ACasos) caso).getValor() instanceof AIntValor) {
					AIntValor valor = (AIntValor) ((ACasos) caso).getValor();
					linha = valor.getInteiro().getLine();
					tipoCaso = retornaTipoExp(valor.getInteiro().toString().trim());
				}else if( ((ACasos) caso).getValor() instanceof AFloatValor) {
						AFloatValor valor = (AFloatValor) ((ACasos) caso).getValor();
						linha = valor.getReal().getLine();
						tipoCaso = retornaTipoExp(valor.getReal().toString().trim());
				}else if( ((ACasos) caso).getValor() 
								instanceof ABooleanoValor) {
						ABooleanoValor valor = (ABooleanoValor) ((ACasos) caso).getValor();
						linha = valor.getBooleano().getLine();
						tipoCaso = retornaTipoExp(valor.getBooleano().toString().trim());
				}else if( ((ACasos) caso).getValor() instanceof ACharValor) {
						ACharValor valor = (ACharValor) ((ACasos) caso).getValor();
						linha = valor.getCaractere().getLine();
						tipoCaso = retornaTipoExp(valor.getCaractere().toString().trim());
				}
				

			}
			if(!tipoExp.equals(checarTiposAuxiliar(tipoExp.trim(),tipoCaso.trim()))) {
				exibirErro(new InvalidToken(null, linha, 0 )
						, 10 );	
			}
		}
	}
	
	public void outAAtribuicaoComando(AAtribuicaoComando node) {
		AIdUnicaVar variavel = null;
		AVetorVar vetor = null;
		String nomeVar = "";
		String tipoVar = "", tipoExp = "";
		Token tokenId = null;
		int linha;
		if( node.getVar() instanceof AIdUnicaVar) {
			variavel = (AIdUnicaVar) node.getVar();
			nomeVar = variavel.getId().getText().trim();
			linha = variavel.getId().getLine();
			tokenId = variavel.getId();
		}
		else {
			vetor = (AVetorVar) node.getVar();
			nomeVar = vetor.getId().getText().trim();
			linha = vetor.getId().getLine();
			tokenId = vetor.getId();
		}
		
		if(tabela_simbolos.containsKey(nomeVar) ) {// variavel declarada 
			if( !( tabela_simbolos.get(nomeVar).trim().split("_")[1].equals("@")
				 ||
				 tabela_simbolos.get(nomeVar).trim().split("_")[1].equals("!"))) {//tb não é vetor
					exibirErro(new InvalidToken(nomeVar,variavel.getId().getLine(),0) ,4);
				
			}
			else if((tabela_simbolos.get(nomeVar).trim().split("_")[1].equals("@") )
					||
					(tabela_simbolos.get(nomeVar).trim().split("_")[1].equals("!") )
					){// é uma variavel
				if(vetor != null){
					verificarPosicaoIndevida(vetor, nomeVar);
					//abaixo vai declarar a variavel no indice dado
					tabela_simbolos.put(nomeVar +"_" + vetor.getInteiro().toString().trim(), 
							tabela_simbolos.get(nomeVar).trim());
				}
				tipoVar = tabela_simbolos.get(nomeVar).split("_")[0].trim();
				if(tabela_expressoes.containsKey(node.getExp().toString().trim())) {
					tipoExp = tabela_expressoes.get(node.getExp().toString().trim());
				}else{
					if(node.getExp() instanceof AVarExp
						&&
					   ((AVarExp) node.getExp()).getVar() instanceof AVetorVar) {
							String aux = (((AVetorVar)((AVarExp) node.getExp()).
									  getVar()).getId().getText().trim());
							if(tabela_simbolos.containsKey(aux)) {
								tipoExp = tabela_simbolos.get(aux).split("_")[0].trim();
							}
					}else {
						tipoExp = retornaTipoExp(node.getExp().toString().trim());
						if(tabela_simbolos.containsKey(node.getExp().toString().trim())){
						//se o nó exp for uma variavel
							tipoExp = tabela_simbolos.get(node.getExp().toString().trim()).split("_")[0].trim();
						}
					}
					
				}
				if(!tipoVar.equals(checarTiposCompativeisAtribuicao(tipoVar,tipoExp,tokenId)) ) {
					exibirErro(new InvalidToken(null, linha, 0 )
							, 8 );	
				}
						
			}
		}
		else {//variavel não declarada
			variavelNaoDeclarada(variavel, vetor);
		}
	
	
	}


	public String retornaTipoExp(String node) {
		String tipoExp;
		if(node.matches("[0-9]*")) {
			tipoExp = "inteiro";
		}else if(node.matches("[0-9]*+,+[0-9]*")) {
			tipoExp = "real";
		}else if(node.matches("verdadeiro|falso")) {
			tipoExp = "booleano";
		}else {
			tipoExp = "caractere";
		}
		return tipoExp;
	}


	
	public void outAVariaveisDeclaracao(AVariaveisDeclaracao node){
		// identifier to be stored in the symbol table
		TId ident = null;
		TInteiro identIndiceVetor = null;
		LinkedList<PVar> listaVar  = node.getVar();
		AVetorVar vetor = null;
		AIdUnicaVar variavel = null;
		
		for(PVar var: listaVar) {
			if(var instanceof AIdUnicaVar) {
				variavel = (AIdUnicaVar) var;
				ident = variavel.getId();
			}else {
				vetor = (AVetorVar) var;
				ident = vetor.getId();
				identIndiceVetor = vetor.getInteiro();
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
				if(vetor == null)//id unica var
					tabela_simbolos.put(key,node.getTipo().toString().trim() + "_@");
				else {//é um vetor
					tabela_simbolos.put(key,node.getTipo().toString().trim() + "_!");
				}
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
		else if(valorEsq.getValor() instanceof AStringValor)
			return "string";		
		return null;
	}

	public Token retornaToken(AValorExp valorEsq) {
		if(valorEsq.getValor() instanceof ACharValor) {
			ACharValor teste = (ACharValor)valorEsq.getValor();
			return teste.getCaractere();
		}
		else if(valorEsq.getValor() instanceof AIntValor) {
			AIntValor teste = (AIntValor)valorEsq.getValor();
			return teste.getInteiro();
		}
		else if(valorEsq.getValor() instanceof AFloatValor) {
			AFloatValor teste = (AFloatValor)valorEsq.getValor();
		return teste.getReal();
		}
		else if(valorEsq.getValor() instanceof ABooleanoValor) {
			ABooleanoValor teste = (ABooleanoValor)valorEsq.getValor();
		return teste.getBooleano();
		}
		else if(valorEsq.getValor() instanceof AStringValor) {
			AStringValor teste = (AStringValor)valorEsq.getValor();
		return teste.getString();
		}
		return null;
	}
	
	public void verificaStringOuChar(String tipoEsq, String tipoDir, Token id, int erro) {
		if(tipoEsq.equals("string") || tipoEsq.equals("caractere") 
		||	tipoDir.equals("string") || tipoDir.equals("caractere")
		) {
		
					
		 					exibirErro(id, erro);	
	   }
	}
	
	public String checarTiposCompativeis(String tipoEsq, String tipoDir, Token id) {
		if(! tipoEsq.equals(tipoDir) ) {//se os tipos não forem iguais
			if( (  (tipoEsq.trim().equals("real") || tipoEsq.trim().equals("inteiro") )
					&&
					( tipoDir.trim().equals("real") || tipoDir.trim().equals("inteiro") ) 
					)
				) {
				return "real";
			}
			else
				exibirErro(id, 9);	
		}
		
		return tipoEsq;
	}
	
	public String checarTiposCompativeisAtribuicao(String tipoEsq, String tipoDir, Token id) {
		if(! tipoEsq.equals(tipoDir) ) {//se os tipos não forem iguais
			if( (  (tipoEsq.trim().equals("real") || tipoEsq.trim().equals("inteiro") )
					&&
					( tipoDir.trim().equals("real") || tipoDir.trim().equals("inteiro") ) 
					)
				) {
				return "real";
			}
			else
				exibirErro(id,11);	
		}
		
		return tipoEsq;
	}

	public String checarTiposAuxiliar(String tipoEsq, String tipoDir) {
		if(! tipoEsq.equals(tipoDir) ) {//se os tipos não forem iguais
			if( (  (tipoEsq.trim().equals("real") || tipoEsq.trim().equals("inteiro") )
					&&
					( tipoDir.trim().equals("real") || tipoDir.trim().equals("inteiro") ) 
					)
				) {
				return "real";
			}
			else
				return "";	
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
	
	public Token retornaToken(AVarExp varExp) {
		AIdUnicaVar variavel;
		AVetorVar vetor;
		Token tokenId;
		if(varExp.getVar() instanceof AIdUnicaVar) {
			variavel = (AIdUnicaVar) varExp.getVar();
			tokenId = variavel.getId();
		}
		else {
			vetor = (AVetorVar) varExp.getVar();
			tokenId = vetor.getId();
		}
		return tokenId;
	}
	
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
				msg = ": Variável '" + text + "' já declarada.";
				break;
				
			case 3://variável não declarada
				msg = ": Variável '" + text + "' não declarada.";
				break;
				
			case 4: //constante não pode ter valor alterado
				msg = ": Constante '" + text + "' não pode ter valor alterado.";
				break;
			
			case 5:
				msg = ": Vetor '"+ text + "' tentou acessar uma posição"
						+ " indevida.";
				break;
				
			case 6:
				msg = ": Variavel " + text + " deve ser do tipo inteiro.";
				break;
			
			case 7:
				msg = ": Vetor '" + text + "' deve vir com o indice.";
				break;
			
			case 8:
				msg = "Tipos incompatíveis na expressão.";
				break;
			
			case 9:
				msg = "Tipos incompatíveis na expressão.";
				break;	
				
			case 10:
				msg = "O tipo do avalie é diferente do tipo do caso.";
				break;
				
			case 11:
				msg = "Tipos incompatíveis na atribuição.";
				break;
			case 12:
				msg = "Caracteres não podem ser somados.";
				break;
			case 13:
				msg = "Caracteres não podem ser subtraidos.";
				break;
			case 14:
				msg = "Caracteres não podem ser multiplicados.";
				break;
			case 15:
				msg = "Caracteres não podem ser divididos.";
				break;
		}
		
		if(indiceErro != 8) {
			msg = "Erro na linha " + line + ": " + msg;
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