package animator;

import java.awt.Dimension;
import java.awt.Point;

public class Motion {
  //ONDE O MOVIMENTO DA IMAGEM É EDITADO  
    private Dimension dim;
    public double rot = 1.2;
    
    public Motion(Dimension dim){
        this.dim = dim;
    }
    
    public Point line(Point p){
        p.setLocation(p.getX()+5, p.getY());
        if(p.getX() > dim.height){
            p.setLocation(-100, p.getY());
        }
        return p;
    }
}