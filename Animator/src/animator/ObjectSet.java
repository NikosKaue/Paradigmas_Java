package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

// OBJETOS DA ANIMAÇÃO.
class ObjectSet {
    //herdando da classe Motion
    public double t = 1.2;
    private Random rnd = new Random();
    private Motion motion;
    public ObjectSet(Dimension dim){
        motion = new Motion(dim);          
    }
    //Arrays
    private Image[] images;
    private ArrayList<Rectangle> ret = new ArrayList<Rectangle>();
    private ArrayList<Star> stars = new ArrayList<Star>();
    private ArrayList<Circle> circles = new ArrayList<Circle>();
    
    // OBJETOS DA CLASSE IMAGE SAO ADICIONADOS A CLASSE OBJECTSET.
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        System.out.printf("Test: adding %d images\n", n);
        System.out.printf("Test: motion path %s\n", path);
        images = new Image[n];
        for (int i = 0; i < images.length; i++) {
            Point p = new Point(rnd.nextInt(dim.height-image.getHeight()), rnd.nextInt(dim.width-image.getWidth()));
            images[i] = new Image(p, image,path);
        }
    }
    
    // OBJETOS DA CLASSE STAR SAO ADICIONADOS A CLASSE OBJECTSET.
    void addStars(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d stars\n", n);
        System.out.printf("Test: motion path %s\n", path);
        for (int i = 0; i < n; i++) {
            Point p = new Point(rnd.nextInt(dim.height - 50), rnd.nextInt(dim.width - 50));
            Star star = new Star(p,path,50,100);
            stars.add(star);
        }
     }
    
    // OBJETOS DA CLASSE RECTANGLE SAO ADICIONADOS A CLASSE OBJECTSET.
    void addRectangles(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
        for (int i = 0; i < n; i++) {
            Point p = new Point(rnd.nextInt(dim.height - 50), rnd.nextInt(dim.width - 50));
            Rectangle retangulo = new Rectangle(p, path, 100, 50);
            ret.add(retangulo);
        }
    }
    
    // OBJETOS DA CLASSE CIRCLE SAO ADICIONADOS A CLASSE OBJECTSET.
    void addCircles(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d circles\n", n);
        System.out.printf("Test: motion path %s\n", path);
        for (int i = 0; i < n; i++) {
            Point p = new Point(rnd.nextInt(dim.height - 50), rnd.nextInt(dim.width - 50));
            Circle circle = new Circle(p, path, 50, 50);
            circles.add(circle);
        }
    }
    
    // DESENHO DE CADA OBJETO DA ANIMAÇÃO.
    void drawAll(Graphics g) {
        System.out.println("drawAll");
        
        if(images != null){
            for (int i = 0; i < images.length; i++) {
                images[i].draw(g);
            }
        }
        
        if(ret != null){
            for (int i = 0; i < ret.size(); i++) {
                ret.get(i).desenha(g);
            }
        }
        
        if(stars != null){
            for (int i = 0; i < stars.size(); i++) {
                stars.get(i).desenha(g);
            }
        }
        
        if(circles != null){
            for (int i = 0; i < circles.size(); i++) {
                circles.get(i).desenha(g);
            }
        }
        
    }

    // Move cada um dos objetos da animacao.
    // SÓ FOI POSSIVEL REALIZAR O MOVMENTO E LINHA, NÃO HOUVE EXITO PARA REALIZAR OS OUTROS MOVIMENTOS!
    void moveAll() {
        System.out.println("moveAll");
        
        //MOVIMENTO DA IMAGEM
        for(int i=0; i<images.length; i++){
            if(images[i].Path().equalsIgnoreCase("Line")){
                images[i].setPoint(motion.line(images[i].getPoint()));
            }
        }
                
        //MOVIMENTO EM LINHA DO RETANGULO
        for(int i=0; i<ret.size(); i++){
            if(ret.get(i).Path().equalsIgnoreCase("Line")){
                ret.get(i).setPoint(motion.line(ret.get(i).getPoint()));
            }
        }
        
        //MOVIMENTO EM LINHA DA ESTRELA
        for(int i=0; i<stars.size(); i++){
            if(stars.get(i).Path().equalsIgnoreCase("Line")){
               stars.get(i).setPoint(motion.line(stars.get(i).getPoint()));
            }
        }
        
        //MOVIMENTO EM LINHA DO CIRCULO
        for(int i=0; i<circles.size(); i++){
            if(circles.get(i).Path().equalsIgnoreCase("Line")){
                circles.get(i).setPoint(motion.line(circles.get(i).getPoint()));
            }
        }
     }
}