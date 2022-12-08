package Lab.fourth_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;


public class FractalExplorer
{
    private int displaySize;
    private JImageDisplay JIDisplay;
    private FractalGenerator fractal;
    private Rectangle2D.Double range;

    public FractalExplorer(int size) {
        displaySize = size;
        fractal = new Mandelbrot();
        range = new Rectangle2D.Double();
        fractal.getInitialRange(range);
        JIDisplay = new JImageDisplay(displaySize, displaySize);
    }

    public void createAndShowGUI()
    {
        JIDisplay.setLayout(new BorderLayout());
        JFrame frame = new JFrame("Fractal Explorer");

        frame.add(JIDisplay, BorderLayout.CENTER);

        JButton resetButton = new JButton("Reset Display");

        ButtonHandler resetHandler = new ButtonHandler();
        resetButton.addActionListener(resetHandler);

        MouseHandler click = new MouseHandler();
        JIDisplay.addMouseListener(click);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel myPanel = new JPanel();

        frame.add(myPanel, BorderLayout.NORTH);

        JPanel myBottomPanel = new JPanel();
        myBottomPanel.add(resetButton);
        frame.add(myBottomPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);

    }

    private void drawFractal()
    {
        for (int x = 0; x < displaySize; ++x){
            for (int y = 0; y < displaySize; ++y){

                double xCoord = FractalGenerator.getCoord(range.x,
                        range.x + range.width, displaySize, x);
                double yCoord = FractalGenerator.getCoord(range.y,
                        range.y + range.height, displaySize, y);

                int iteration = fractal.numIterations(xCoord, yCoord);

                if (iteration == -1){
                    JIDisplay.drawPixel(x, y, 0);
                }

                else {
                    float hue = 0.7f + (float) iteration / 200f;
                    int rgbColor = Color.HSBtoRGB(hue, 1f, 1f);
                    JIDisplay.drawPixel(x, y, rgbColor);
                }
            }
        }
        JIDisplay.repaint(); //parent method from jcomponent
    }

    private class ButtonHandler implements ActionListener
    {   
        public void actionPerformed(ActionEvent e)
        {
            String command = e.getActionCommand();

            if (command.equals("Reset Display")) {
                fractal.getInitialRange(range);
                drawFractal(); //draw fractal from 0
            }
            JIDisplay.repaint();
        }
    }

    private class MouseHandler extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            // calculate coords and scales view from this coords
            int x = e.getX();
            double xCoord = FractalGenerator.getCoord(range.x,
                    range.x + range.width, displaySize, x);

            int y = e.getY();
            double yCoord = FractalGenerator.getCoord(range.y,
                    range.y + range.height, displaySize, y);

            fractal.recenterAndZoomRange(range, xCoord, yCoord, 0.5);

            drawFractal();
        }
    }

    public static void main(String[] args)
    {
        FractalExplorer displayExplorer = new FractalExplorer(600);  //initial window size
        displayExplorer.createAndShowGUI(); //initialize GUI
        displayExplorer.drawFractal(); // initialize work with fractal
    }
}