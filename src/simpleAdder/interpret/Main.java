/* Create an AST, then invoke our interpreter. */ 
package simpleAdder.interpret;

import simpleAdder.lexer.* ; 
import simpleAdder.node.* ; 
  
import java.io.* ;
import java.util.Stack;
  
public class Main {
	
	public static void verificador(String token_name, Token t, PushbackReader pb) {
		switch(token_name) {
			case "TEnter":
				System.out.print("\n");
				return;
			case "TEspaco":
				System.out.print(" ");
				return;
			case "TTabulacao":
				System.out.print("\t");
				return;
			case "TComentarioDeBloco":
				System.out.print(token_name);
				//checkAninhado(t, pb);
				break;
			case "TComentarioDeBlocoFim":	
				System.out.print("comentario de fim");
				
		//		lancarExcecao(t,pb);
				break;
			case "TComentarioDeBlocoInicio":
				System.out.print("comentario de inicio");
				
		//		lancarExcecao(t,pb);
				break;
			case "EOF":
			//	System.out.print("\nfimPrograma");
				return;
			default:
				System.out.print(token_name);
				break;
		}
		
	}
	
   	private static void checkAninhado(Token t,PushbackReader pb) {
		String comentario = t.getText();
		System.out.println("começa aqui\n"+comentario+"\ntermina aqui");
		
		int tamanho = comentario.length();
		Stack<Integer> pilha = new Stack<Integer>();
		
		for(int i = 0; i < tamanho ; i++) {
			  if(comentario.charAt(i) == '/' & comentario.charAt(i+1) == '*') {
				  i++;
				  pilha.push(1);
//				  System.out.print("TComentarioBlocoInicio");
			  }else//fim do comentario
				  if(comentario.charAt(i) == '*' & comentario.charAt(i+1) == '/') {
					  i++;
					  if(pilha.size() == 0) { // fim de comentario de bloco a mais
			//			  lancarExcecao(t,pb);
					  }
					  pilha.pop();
					  if(pilha.size() != 0) {
						  System.out.println("TComentarioBloco");
					  }
					  	
				  }
			  
			  
			  
			  
			  
/*				  else {
					  switch(comentario.charAt(i)) {
					  		case 10://quebra de linha
					  			System.out.println();
					  			break;
					  		case 32://espaco em branco
					  			System.out.print(" ");
					  			break;
					  		case 9://tab
					  			System.out.print("\t");
					  			break;
					  		
					  }//fim do switch
					  
					  
				  }
*/				  
			  
		}//fim for
		if( pilha.size() != 0) {//comentario não aninhado
	//		lancarExcecao(t, pb);

		}
		
	}
/*
	public static void lancarExcecao(Token t, PushbackReader pb) {
		try {
				Comentario_Aninhado objComent = new Comentario_Aninhado(pb);
				objComent.setLine(t.getLine());
				objComent.setPos(t.getPos());
				objComent.setText(t.getText());
				objComent.filter();
				
			} catch (LexerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
*/
	public static void main(String[] args) { 
	   String token_name;
	   Token t;
	   if (args.length > 0) { 
         try { 
            /* Form our AST */ 
      	   PushbackReader pb = new PushbackReader( 
                   new FileReader(args[0]), 1024);
            Lexer lexer = new Lexer (pb); 	
            
            //	Professor mandou tirar essa parte abaixo	 
/*
            Parser parser = new Parser(lexer); 
            Start ast = parser.parse() ; 
  
            Interpreter interp = new Interpreter () ; 
            ast.apply(interp) ;             
*/			
      //      System.out.print("Inicio do programa:\n\n");
            do {
            	t = lexer.next();
            	token_name = t.getClass().getSimpleName();
            	verificador(token_name,t,pb);
            	
           	}while(!token_name.equals("EOF"));
         } 
         catch (Exception e) { 
            System.out.println (e) ; 
         } 
      } else { 
         System.err.println("usage: java simpleAdder inputFile"); 
         System.exit(1); 
      } 
   } 
}