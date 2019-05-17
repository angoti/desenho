package versao01;

public class Sistema {
	public static void main(String[] args) {
		Tela s = new Tela();
		s.adicionarForma(new Circulo(50, new Ponto(100, 100)));
		s.adicionarForma(new Retangulo(50, 100, new Ponto(30, 30)));
		s.adicionarForma(new Triangulo(new Ponto(300, 100), new Ponto(100, 200), new Ponto(250, 300)));
		s.repaint();
	}
}
