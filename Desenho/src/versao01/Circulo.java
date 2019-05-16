package versao01;

public class Circulo implements FormaGeometrica {

	private int raio;
	private Ponto centro;

	@Override
	public String getTipoDaForma() {
		return "circulo";
	}

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

}
