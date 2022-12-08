package Lab.fourth_lab;

import java.awt.geom.Rectangle2D.Double;

public class Mandelbrot extends FractalGenerator {

    public static final int MAX_ITERATIONS = 2000;

    @Override
    public void getInitialRange(Double range) {
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }

    @Override
    public int numIterations(double x, double y) {
        int i = 0;
        double real = 0;
        double imaginary = 0;
        double newReal = 0;
        double newImaginary = 0;

        while (i < MAX_ITERATIONS && real * real + imaginary * imaginary < 4)
        {
            newReal = real * real - imaginary * imaginary + x;
            newImaginary = 2 * real * imaginary + y;
            real = newReal;
            imaginary = newImaginary;
            ++i;
        }

        if (i == MAX_ITERATIONS)
        {
            return -1;
        }

        return i;
    }
    
}
