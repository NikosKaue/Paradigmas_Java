package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle{
    private Dimension dim;

    Rectangle(Point pos, Dimension dim) {
        this.pos = pos;
        this.dim = dim;
    }

    void draw(Graphics g) {
        g.setColor(new Color(0,0,254));
        g.fillRect(pos.x, pos.y, dim.width, dim.height);
    }

    void move() {
      
    }
}