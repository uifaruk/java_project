/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;
import javax.swing.JFrame;

/**
 *
 * @author usamah
 */
public class Main {
    public static void main(String[] arg){    
        JFrame frame = new JFrame("My Games-USAMAH");
        
        GameBlock gb = new GameBlock();
        frame.getContentPane().add(gb);
        frame.setVisible(true);
        frame.setSize(490, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
       
        
    }
}
