package jah.interpret;

public class TipoExp {
	private int linha;
	private String tipo;
	
	TipoExp(String tipo, int linha){
		this.setLinha(linha);
		this.setTipo(tipo);
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
