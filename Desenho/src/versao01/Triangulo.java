package versao01;

import java.awt.Graphics;

public class Triangulo implements FormaGeometrica {

	Ponto a,b,c;
	
	public Triangulo(Ponto a, Ponto b, Ponto c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void desenha(Graphics g) {
		System.out.println(1);
		int[] x= {a.getX(),b.getX(),c.getX()};
		int[] y = {a.getY(),b.getY(),c.getY()};
		g.fillPolygon(x,y,3);
	}

}
