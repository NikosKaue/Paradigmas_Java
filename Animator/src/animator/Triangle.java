/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

public class Triangle {         
        BufferedImage buffer = new BufferedImage(600, 600, BufferedImage.TRANSLUCENT);  
        Graphics2D g = buffer.createGraphics();  
        Polygon p = new Polygon();  
        g.setColor(Color.red);  
        p.addPoint(0, 50);  
        p.addPoint(25, 0);  
        p.addPoint(50, 50);  
          
        g.fillPolygon(p);  
        return new ImageIcon(buffer);  
    }  