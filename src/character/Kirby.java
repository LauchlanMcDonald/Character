/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Lauchlan
 */
public class Kirby {

    public void draw(Graphics graphics) {
        graphics.drawRect(x, y, width, height);
        
        
        //body
        graphics.setColor(new Color(246, 96, 171));
        graphics.fillOval(x, y, width, height);
        
        //eyesblack
        graphics.setColor(new Color(0, 0, 0));
        graphics.fillOval(x + (width * 37 / 100), y + (height * 30 / 100), width * 10 / 100, height * 20 / 100);
        graphics.setColor(new Color(0, 0, 0));
        graphics.fillOval(x + (width * 55 / 100), y + (height * 30 / 100), width * 10 / 100, height * 20 / 100);
        
        //eyesblue
        graphics.setColor(new Color(0,0,205));
        graphics.fillOval(x + (width * 38 / 100), y + (height * 31 / 100), width * 7 / 100, height * 17 / 100);
        graphics.setColor(new Color(0,0,205));
        graphics.fillOval(x + (width * 56 / 100), y + (height * 31 / 100), width * 7 / 100, height * 17 / 100);
        
        //eyeswhite
        graphics.setColor(new Color(255,255,255));
        graphics.fillOval(x + (width * 39 / 100), y + (height * 31 / 100), width * 4 / 100, height * 6 / 100);
        graphics.setColor(new Color(255,255,255));
        graphics.fillOval(x + (width * 57 / 100), y + (height * 31 / 100), width * 4 / 100, height * 6 / 100);
        
        //feet
        
        
    }
    
    public Kirby(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    private int x;
    private int y;
    private int height;
    private int width;
    
   
    
}