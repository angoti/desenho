package versao01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela extends JFrame {
	private List<FormaGeometrica> listaDeFormas;

	public Tela() {
		super();
		preparaJanela();
		listaDeFormas = new ArrayList<FormaGeometrica>();
	}

	private void preparaJanela() {
		setSize(500, 500);
		setTitle("Desenhista de formas geométricas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocation(new Point(100, 100));
		getContentPane().setLayout(new BorderLayout(0, 0));
		setVisible(true);
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
			forma.desenha(g);
		}
	}
}
