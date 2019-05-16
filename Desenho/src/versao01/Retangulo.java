package versao01;

public class Retangulo implements FormaGeometrica {
	private int largura, altura;
	private Ponto verticeSuperiorEsquerdo;

	public Retangulo(int largura, int altura, Ponto verticeSuperiorEsquerdo) {
		super();
		this.largura = largura;
		this.altura = altura;
		this.verticeSuperiorEsquerdo = verticeSuperiorEsquerdo;
	}

	@Override
	public String getTipoDaForma() {
		return "retangulo";
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}

	public Ponto getVerticeSuperiorEsquerdo() {
		return verticeSuperiorEsquerdo;
	}

}
