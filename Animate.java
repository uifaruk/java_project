/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usamah
 */

public class Animate implements Runnable {
    
    GameBlock b;     
    Animate(GameBlock gb){
        b = gb;    
    }
    public void run(){        
        while(true){
            b.update();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Animate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
        
        
    }
    
}
