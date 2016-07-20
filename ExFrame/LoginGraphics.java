package hospital;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class LoginGraphics extends JPanel {
	public void paint(Graphics g) {
		File file = new File(".\\image\\test.jpg");
		BufferedImage bi = null;
		try {
			bi = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		paintComponent(g);
		g.drawImage(bi, 0, 0, 580, 486, null);
		
	}
}
