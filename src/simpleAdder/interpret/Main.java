/* Create an AST, then invoke our interpreter. */ 
package simpleAdder.interpret; 
import simpleAdder.interpret.Interpreter; 
import simpleAdder.parser.* ; 
import simpleAdder.lexer.* ; 
import simpleAdder.node.* ; 
  
import java.io.* ;
import java.util.regex.Pattern; 
  
public class Main {
	
	public static String getTokenName(String nameClass) {
		String[] quebraEspaco = nameClass.split(" "); 
		String token_name = quebraEspaco[1].split (Pattern.quote ("."))[2];

		return token_name;
	}
	
	public static void verificador(String token_name) {
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
			case "EOF":
			//	System.out.print("\nfimPrograma");
				return;
			default:
				System.out.print(token_name);
				break;
		}
		
	}
	
   	public static void main(String[] args) { 
	   String token_name;
	   if (args.length > 0) { 
         try { 
            /* Form our AST */ 
            Lexer lexer = new Lexer (new PushbackReader( 
               new FileReader(args[0]), 1024)); 	
            
            //	Professor mandou tirar essa parte abaixo	 
/*
            Parser parser = new Parser(lexer); 
            Start ast = parser.parse() ; 
  
            Interpreter interp = new Interpreter () ; 
            ast.apply(interp) ;             
*/			
      //      System.out.print("Inicio do programa:\n\n");
            do {
            	token_name = getTokenName(lexer.next().getClass().toString());
            	verificador(token_name);
            	
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