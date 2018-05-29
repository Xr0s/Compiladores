package simpleAdder.interpret;

import java.util.Stack;

import simpleAdder.lexer.*;
import simpleAdder.node.*;
public class Comentario_Aninhado extends Lexer
{
  private int count;
  private TComment comment;
  private StringBuffer text;
  Stack<Token> pilha_tokens = new Stack<Token>();
  // We define a constructor
  public Comentario_Aninhado(java.io.PushbackReader in)
  { super(in);
  }
  // We define a filter that recognizes nested comments.
  protected void filter(){ // if we are in the comment state
	  
	  if(state.equals(State.COMMENT)){ // if we are just entering this state

      if(comment == null){ // The token is supposed to be a comment.
        // We keep a reference to it and set the count to one
        comment = (TComment) token;
        pilha_tokens.clear();
        pilha_tokens.push(token);
        text = new StringBuffer(comment.getText());
        count = 1;
        token = null; // continue to scan the input.
      }
      else { // we were already in the comment state
        text.append(token.getText()); // accumulate the text.
        if(token instanceof TComment){
        	
        	pilha_tokens.push(token);
            count++;
          
      	}else if(token instanceof TCommentEnd){
        	count--;
        	pilha_tokens.pop();
        }
        if(token instanceof EOF) {
        	lancarExcecao("",pilha_tokens.elementAt(0));
        	System.exit(1);        	
        }
        
        
        if(count != 0) {
          token = null; // continue to scan the input.
        }
        else {
//          comment.setText(text.toString());
          token = comment; //return a comment with the full text.
          state = State.NORMAL; //go back to normal.
          comment = null; // We release this reference.
        }
      }
    }
    
  }
  
  public void lancarExcecao(String mensagem_extra, Token token_especial) {
	try {
		throw new LexerException(new InvalidToken(
				token_especial.getText(),
				token_especial.getLine(), 
				token_especial.getPos()),
				"Erro de comentario de bloco. Linha:"+ token_especial.getLine()+", posicao: "
				+token_especial.getPos()+"."+mensagem_extra
				
				);
	} catch (LexerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

}
