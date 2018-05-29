/* Create an AST, then invoke our interpreter. */ 
package simpleAdder.interpret;

import simpleAdder.lexer.* ; 
import simpleAdder.node.* ; 
  
import java.io.* ;
import java.util.Stack;
  
public class Main {
	
	public static void verificador(String token_name, Comentario_Aninhado lexer, Token t) {
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
			case "TComment":
				System.out.print("TComentarioBloco");
				break;
			case "TFimComentario":	
				lexer.lancarExcecao(" : TComentarioBlocoFimErrado", t);
				break;
			case "TAbreChave":
				lexer.lancarExcecao(t);
				break;
			case "TFechaChave":
				lexer.lancarExcecao(t);
				break;
			case "EOF":
				return;
			default:
				System.out.print(token_name);
				break;
		}
		
	}
	

	public static void main(String[] args) { 
	   String token_name;
	   Token t;
	   if (args.length > 0) { 
         try { 
            /* Form our AST */ 
      	   PushbackReader pb = new PushbackReader( 
                   new FileReader(args[0]), 1024);
            Comentario_Aninhado lexer = new Comentario_Aninhado (pb); 	
            
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
            	verificador(token_name,lexer,t);
            	
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