/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author usamah
 */
public class GameBlock extends JPanel implements KeyListener {
  
    ArrayList<Block> blocks = new ArrayList<>();
    ArrayList<Block> ball = new ArrayList<>();
    Block base;
    Thread tr;
    Animate an;
    GameBlock() {            
            
            base = new Block (175,480,125,25,"black_bar.png");
            
            for (int i = 0; i <8; i++) {
            blocks.add(new Block((i*60+2),0,60,25,"blue.png"));            
            }   
            
             for (int i = 0; i <8; i++) {
            blocks.add(new Block((i*60+2),25,60,25,"green.png"));            
            }
             
              for (int i = 0; i <8; i++) {
            blocks.add(new Block((i*60+2),50,60,25,"red.png"));            
            }
              
               for (int i = 0; i <8; i++) {
            blocks.add(new Block((i*60+2),75,60,25,"yellow.png"));            
            }
               
            ball.add(new Block(237,437,25,25,"ball.png"));
            addKeyListener(this);
            setFocusable(true);
    
    }
    @Override
    public void paintComponent(Graphics gc){ 
        super.paintComponent(gc);
        for (Block b : blocks) {
            b.paint(gc, this);
        }
        for (Block ba : ball) {
            ba.paint(gc, this);
        }
        base.paint(gc, this);
       }
    public void update(){ 
        for(Block baa : ball){
            
            baa.x+=baa.dx;
            if(baa.x>(getWidth()-25) && baa.dx>0 || baa.x<0){
                baa.dx*=-1;
            }
            
             if(baa.y<0 || baa.intersects(base)){
                baa.dy*=-1;
            }
               baa.y+=baa.dy;
           for(Block b : blocks){
           
               if(baa.intersects(b) && !b.dsd ){
                   baa.dy*=-1;
                   b.dsd=true;
               }
           }
        
        }
        repaint();
    
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if (e.getKeyCode()== KeyEvent.VK_ENTER) {
            an = new Animate(this);
            tr = new Thread(an);
            tr.start();
        }      
         
        
        if (e.getKeyCode()== KeyEvent.VK_LEFT && base.x>0 ) {
            base.x-=25;
        }
        
        if (e.getKeyCode()== KeyEvent.VK_RIGHT && base.x <(getWidth() - base.width)) {
            base.x += 25;
     
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }
   
