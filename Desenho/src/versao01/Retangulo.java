package versao01;

import java.awt.Graphics;

public class Retangulo implements FormaGeometrica {
	private int largura, altura;
	private Ponto verticeSuperiorEsquerdo;

	public Retangulo(int largura, int altura, Ponto verticeSuperiorEsquerdo) {
		super();
		this.largura = largura;
		this.altura = altura;
		this.verticeSuperiorEsquerdo = verticeSuperiorEsquerdo;
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

	@Override
	public void desenha(Graphics g) {
		g.fillRect(verticeSuperiorEsquerdo.getX(), verticeSuperiorEsquerdo.getY(), largura, altura);
	}

}
