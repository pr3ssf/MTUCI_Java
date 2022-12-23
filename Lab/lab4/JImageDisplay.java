package Lab.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class JImageDisplay extends JComponent {
    private BufferedImage bufImg;

    public JImageDisplay(int width, int height) {
        bufImg = new BufferedImage(width, height, 1);
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bufImg, 0, 0, bufImg.getWidth(), bufImg.getHeight(), null);
    }

    public void clearImage() {
        bufImg.setRGB(0, 0, 0);
    }

    public void drawPixel(int x, int y, int rgbColor) {
        bufImg.setRGB(x, y, rgbColor);
    }
}
