package simpleAdder.interpret;

import simpleAdder.lexer.LexerException;

public class Comentario_Aninhado extends simpleAdder.lexer.Lexer
{ 
	// Definimos o construtor
	public Comentario_Aninhado(java.io.PushbackReader in){ 
		super(in);
	}

	// Definimos um filtro que reconhece comentarios aninhados
	@Override
	protected void filter() throws LexerException
	{ 
		//Coloque o código aqui...
		
	}
}
