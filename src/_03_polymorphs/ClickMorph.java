package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class ClickMorph extends Polymorph implements MouseListener {

	ClickMorph(int x, int y) {
		super(x, y);
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, w, h);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("x = " + e.getX() + ", y = " + e.getY());
		if (e.getX() >= x && e.getX() < x + w && e.getY() >= y && e.getY() < y + h)
			JOptionPane.showMessageDialog(null, "You clicked the ClickMorph!");
	}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

}
