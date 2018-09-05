package jah.interpret;

import jah.node.Token;

@SuppressWarnings("serial")
public class SemanticException extends Exception {
    private Token token;

    public SemanticException(@SuppressWarnings("hiding") Token token, String  message)
    {
        super(message);
        this.token = token;
    }

    public Token getToken()
    {
        return this.token;
    }
}
