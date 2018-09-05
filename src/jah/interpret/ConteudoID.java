package jah.interpret;

public class ConteudoID {
	private int valorInt;
	private char valorChar;
	private boolean valorBool;
	private double valorReal;
	private String tipo;
	
	public ConteudoID() {
		setTipo("");
		valorInt = 0 ;
		valorChar = ' ';
		valorBool = false ;
		valorReal = 0 ;

	}
	public int getValorInt() {
		return valorInt;
	}

	public void setValorInt(int valorId) {
		this.valorInt = valorId;
	}

	public char getValorChar() {
		return valorChar;
	}

	public void setValorChar(char valorChar) {
		this.valorChar = valorChar;
	}

	public boolean isValorBool() {
		return valorBool;
	}

	public void setValorBool(boolean valorBool) {
		this.valorBool = valorBool;
	}

	public double getValorReal() {
		return valorReal;
	}

	public void setValorReal(Float valorReal) {
		this.valorReal = valorReal;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
