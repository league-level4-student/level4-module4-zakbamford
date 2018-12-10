package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y) {
		super(x, y);
	}

	public void update() {
		x++;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, w, h);
	}
}
