package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {

	private int r;
	private double angle;
	private final int X, Y;
	
	
	CircleMorph(int x, int y, int r) {
		super(x, y);
		X = x;
		Y = y;
		angle = 0;
		this.r = r;
	}
	
	public void update() {
		x = ((int) (Math.cos(angle) * r)) + X;
		y = ((int) (Math.sin(angle) * r)) + Y;
		angle += (Math.PI / 180);
	}

	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, w, h);
	}
}
