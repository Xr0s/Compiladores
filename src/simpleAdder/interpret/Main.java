/* Create an AST, then invoke our interpreter. */ 
package simpleAdder.interpret;

import simpleAdder.lexer.* ; 
import simpleAdder.node.* ;
import simpleAdder.parser.Parser;
import simpleAdder.parser.ParserException;

import java.io.* ;

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
		case "EOF":
			return;
		case "TFimComentario":	
			break;

		default:
			System.out.print(token_name);
			break;
		}

	}

	public static void main(String[] args) throws IOException, ParserException, LexerException { 
		if (args.length > 0) {
			/* Form our AST */ 
			Comentario_Aninhado lexer = new Comentario_Aninhado (new PushbackReader( 
					new FileReader(args[0]), 1024)); 	

			//impressaoLexica(lexer); //necessario retirar "branco" dos tokens para nao ignorar o espaco, tab e enter
			analiseSintatica(lexer); //necessario "branco" sendo o primeiro dos tokens para o funcionamento do Ignored Tokens.


		} else { 
			System.err.println("usage: java simpleAdder inputFile"); 
			System.exit(1); 
		} 
	}

	public static void analiseSintatica(Comentario_Aninhado lexer) throws ParserException, LexerException, IOException {
		Parser parser = new Parser(lexer); 
		Start tree = parser.parse();
		System.out.println(tree);
		//tree.apply(new ASTPrinter());
	}


	public static void impressaoLexica(Comentario_Aninhado lexer) throws IOException {
		String token_name = null;
		Token t;
		do {
			try {
				t = lexer.next();
				token_name = t.getClass().getSimpleName();
				verificador(token_name,lexer,t);
			}catch(LexerException e) {
				System.out.print( e.getMessage() );
			}
		}while(!token_name.equals("EOF"));
		System.exit(0);
	} 
}