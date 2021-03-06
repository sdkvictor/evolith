
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camerapanningtest;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author charles
 */
public class KeyManager implements KeyListener {
    
    public boolean left;
    public boolean right;
    
    /**
     * Keys to be used in the game
     */
    public boolean w;
    public boolean a;
    public boolean s;
    public boolean d;
    
    private boolean keys[];

    public KeyManager() {
        keys = new boolean[256];
    }
    
    /**
     * Not used
     * @param e 
     */
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    /**
     * Detect when a key has been pressed
     * @param e 
     */
    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }
    
    /**
     * Detect when a key has been released
     * @param e 
     */
    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
    
    /**
     * To update the object each frame
     */
    public void tick() {
        a = keys[KeyEvent.VK_A];
        w = keys[KeyEvent.VK_W];
        s = keys[KeyEvent.VK_S];
        d = keys[KeyEvent.VK_D];
    }
}
