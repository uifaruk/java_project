/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author usamah
 */
public class Block extends Rectangle {
     
    Image pic;
    
    int dx = 3;
    int dy = -3;
    boolean dsd = false;
    Block(int a, int b, int w, int h, String s){
    
    x= a;
    y= b;
    width = w;
    height= h;
    pic = Toolkit.getDefaultToolkit().getImage(s);
     
    }
    
    public void paint(Graphics g, Component c){     
        if(!dsd)
            g.drawImage(pic, x, y, width, height, c);
    }
}
