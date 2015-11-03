/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Lauchlan
 */
public class Kirby {

    private static Color KIRBY_PINK = new Color(255, 105, 180);

    public void draw(Graphics graphics) {
        graphics.drawRect(x, y, width, height);

        //feetbehind
        graphics.setColor(new Color(220, 20, 60));
        graphics.fillOval(x + (width * 13 / 100), y + (height * 65 / 100), width * 20 / 100, height * 40 / 100);
        graphics.setColor(new Color(220, 20, 60));
        graphics.fillOval(x + (width * 67 / 100), y + (height * 65 / 100), width * 20 / 100, height * 40 / 100);

        //arms
        graphics.setColor(KIRBY_PINK);
        graphics.fillOval(x - (width * 10 / 100), y + (height * 30 / 100), width * 40 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 71 / 100), y + (height * 30 / 100), width * 40 / 100, height * 20 / 100);

        //body
        graphics.setColor(KIRBY_PINK);
        graphics.fillOval(x, y, width, height);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x, y, width, height);

        //eyesblack
        graphics.setColor(new Color(0, 0, 0));
        graphics.fillOval(x + (width * 37 / 100), y + (height * 30 / 100), width * 10 / 100, height * 20 / 100);
        graphics.setColor(new Color(0, 0, 0));
        graphics.fillOval(x + (width * 55 / 100), y + (height * 30 / 100), width * 10 / 100, height * 20 / 100);

        //eyesblue
        graphics.setColor(new Color(0, 0, 205));
        graphics.fillOval(x + (width * 38 / 100), y + (height * 31 / 100), width * 7 / 100, height * 17 / 100);
        graphics.setColor(new Color(0, 0, 205));
        graphics.fillOval(x + (width * 56 / 100), y + (height * 31 / 100), width * 7 / 100, height * 17 / 100);

        //eyeswhite
        graphics.setColor(new Color(255, 255, 255));
        graphics.fillOval(x + (width * 39 / 100), y + (height * 31 / 100), width * 4 / 100, height * 6 / 100);
        graphics.setColor(new Color(255, 255, 255));
        graphics.fillOval(x + (width * 57 / 100), y + (height * 31 / 100), width * 4 / 100, height * 6 / 100);

        //cheeks
        graphics.setColor(new Color(255, 20, 147, 85));
        graphics.fillOval(x + (width * 18 / 100), y + (height * 48 / 100), width * 15 / 100, height * 7 / 100);
        graphics.setColor(new Color(255, 20, 147, 85));
        graphics.fillOval(x + (width * 69 / 100), y + (height * 48 / 100), width * 15 / 100, height * 7 / 100);

        //mouthbackround
        graphics.setColor(new Color(139, 0, 0));
        graphics.fillOval(x + (width * 425 / 1000), y + (height * 55 / 100), width * 17 / 100, height * 14 / 100);

        //mouthtongue
        graphics.setColor(new Color(220, 20, 60));
        graphics.fillOval(x + (width * 437 / 1000), y + (height * 59 / 100), width * 15 / 100, height * 10 / 100);
        graphics.setColor(new Color(249, 0, 0));
        graphics.fillOval(x + (width * 447 / 1000), y + (height * 61 / 100), width * 13 / 100, height * 8 / 100);

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
