package versao01;

import java.awt.Graphics;

public class Circulo implements FormaGeometrica {

	private int raio;
	private Ponto centro;

	public Circulo(int raio, Ponto centro) {
		super();
		this.raio = raio;
		this.centro = centro;
	}

	public int getRaio() {
		return raio;
	}

	public Ponto getCentro() {
		return centro;
	}

	@Override
	public void desenha(Graphics g) {
		g.fillOval(centro.getX(), centro.getY(), raio, raio);
	}

}
