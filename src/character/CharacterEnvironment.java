/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Lauchlan
 */
class CharacterEnvironment extends Environment {

    Kirby bigKirby, smallKirby;

    public CharacterEnvironment() {
        bigKirby = new Kirby(50, 50, 500, 500);
        smallKirby = new Kirby(600, 50, 250, 250);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {

        if (bigKirby != null) {
            bigKirby.draw(graphics);
        }

        if (smallKirby != null) {
            smallKirby.draw(graphics);
        }


    }

}
