package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {

	BufferedImage img;

	ImageMorph(int x, int y) {
		super(x, y);
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("1023.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}
}
