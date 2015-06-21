package animator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle {
    
    private String path;
    private int radius1;
    private int radius2;
    private Point p;
       
    public Circle(Point p, String path, int radius1, int radius2){
        this.p = p;
        this.path = path;
        this.radius1 = radius1;
        this.radius2 = radius2;
    }
    
    public void desenha(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(p.x, p.y, radius1, radius2);
    }
    
    public String Path(){
        return path;
    }
    
    public void setPoint(Point p){
        this.p = p;
    }
    
    public Point getPoint(){
        return p;
    }
}