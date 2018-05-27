package simpleAdder.interpret;

import javax.swing.JOptionPane;

import simpleAdder.lexer.LexerException;
import simpleAdder.node.InvalidToken;

public class Comentario_Aninhado extends simpleAdder.lexer.Lexer
{ 
	
	private int line;
	private int pos;
	private String text;
	
	// Definimos o construtor
	public Comentario_Aninhado(java.io.PushbackReader in){ 
		super(in);
	}

	// Definimos um filtro que reconhece comentarios aninhados
	@Override
	protected void filter() throws LexerException
	{ 
		//Coloque o código aqui...
		System.out.println();
//		JOptionPane.showMessageDialog(null, "Erro comentario de bloco não aninhado");
		
		
		 throw new LexerException(
                            new InvalidToken(getText(),getLine(),getPos()),
                            "[" + getLine() + "," + getPos() + "]" +
                            " Comment Not Nested."); 
		 
		 
		
	}

	int getLine() {
		return line;
	}

	void setLine(int line) {
		this.line = line;
	}

	int getPos() {
		return pos;
	}

	void setPos(int pos) {
		this.pos = pos;
	}

	String getText() {
		return text;
	}

	void setText(String text) {
		this.text = text;
	}
}
