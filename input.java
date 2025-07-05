import java.awt.event.*;

import javax.swing.JPanel;
public class input implements KeyListener,ActionListener{ 

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            System.out.println("right");

        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            System.out.println("left");
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            System.out.println("up");
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            System.out.println("down");
        }

        
        
    }






    @Override
    public void keyReleased(KeyEvent e) {
        
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
        
   
    }
   
}


