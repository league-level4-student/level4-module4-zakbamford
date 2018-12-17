package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;

public class MouseMorph extends Polymorph {

	MouseMorph(int x, int y) {
		super(x, y);
	}

	public void update() {
		Point p = MouseInfo.getPointerInfo().getLocation();
		x = p.x;
		y = p.y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, w, h);
	}
}
