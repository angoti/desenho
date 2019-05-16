package versao01;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Sistema extends JFrame {
	private List<FormaGeometrica> listaDeFormas;

	public Sistema() {
		super();
		setSize(500, 500);
		setTitle("Desenhista de formas geométricas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		listaDeFormas = new ArrayList<FormaGeometrica>();
	}

	@Override
	public void paint(Graphics g) {
		desenhaTodasFormas(g);
	}

	public void adicionarForma(FormaGeometrica forma) {
		listaDeFormas.add(forma);
	}

	public void desenhaTodasFormas(Graphics g) {
		for (FormaGeometrica forma : listaDeFormas) {
			switch (forma.getTipoDaForma()) {
			case "circulo":
				desenhaCirculo((Circulo) forma, g);
				break;
			case "retangulo":
				desenhaRetangulo((Retangulo) forma, g);
				break;
			}
		}
	}

	private void desenhaCirculo(Circulo forma, Graphics g) {
		g.drawOval(forma.getCentro().getX(), forma.getCentro().getY(), forma.getRaio(),
				forma.getRaio());
	}

	private void desenhaRetangulo(Retangulo forma, Graphics g) {
		g.drawRect(forma.getVerticeSuperiorEsquerdo().getX(), forma.getVerticeSuperiorEsquerdo().getY(), forma.getLargura(), forma.getAltura());
	}

	public static void main(String[] args) {
		Sistema s = new Sistema();
		s.adicionarForma(new Circulo(50, new Ponto(100, 100)));
		s.adicionarForma(new Retangulo(50, 100, new Ponto(30, 30)));
		s.repaint();
	}
}
