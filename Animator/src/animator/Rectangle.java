package animator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Rectangle {
    private String path;
    private int x;
    private int y;
    private Point p;
    
   public Rectangle(Point p, String path, int x, int y){
        this.p = p;
        this.path = path;
        this.x = x;
        this.y = y;
    }
    
    public void desenha(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(p.x,p.y,x,y);
    }

    void add(ArrayList<Rectangle> ret) {
        throw new UnsupportedOperationException("Not supported yet."); 
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