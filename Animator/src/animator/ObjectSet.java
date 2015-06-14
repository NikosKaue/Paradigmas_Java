package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

// Conjunto de objetos da animacao.
class ObjectSet {
    
    private Image[] images;
    
    // Adiciona objetos da classe Image ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        System.out.printf("Test: adding %d images\n", n);
        System.out.printf("Test: motion path %s\n", path);
        images = new Image[n];
        for (int i = 0; i < images.length; i++) {
            Point p = new Point(10,10);
            images[i] = new Image(p, image);
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addStars(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d stars\n", n);
        System.out.printf("Test: motion path %s\n", path);

    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addRectangles(int n, Dimension dim, String path) {
        for(int i = 0; i < n; i++) {
            dim = new Dimension(rnd.nextInt(100)+50, rnd.nextInt(100)+50);
            Point p = new Point(rnd.nextInt(600), rnd.nextInt(600-dim.height));
            figures.add(new Rectangle(p, dim));
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addCircles(int n, Dimension dim, String path) {
        BufferedImage buffer = new BufferedImage( 50, 50, BufferedImage.TRANSLUCENT );     
        Graphics2D g = buffer.createGraphics();     
        g.setColor( Color.GREEN );     
        g.fillOval( 0, 0, 15, 15 );     
        return new ImageIcon( buffer );     
  
    }
    
    // Desenha cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void drawAll(Graphics g) {
        System.out.println("drawAll");
    }

    // Move cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void moveAll() {
        System.out.println("moveAll");
    }
    }
