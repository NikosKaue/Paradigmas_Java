package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

public class Box{
    
    public Box(Point p, Dimension dim, String path, String color){
        this.pos = p;
        this.origem = new Point((int) p.getX(), (int) p.getY());
        this.dim = dim;
        this.path = path;
        this.width = 60;
        this.heigth = 30;
        this.color = color;
    }
    
    public void draw(Graphics g){
        g.setColor(this.stringToColor(this.color));
        g.fillOval((int)pos.getX(), (int) pos.getY(), this.width, this.heigth);
    }
}