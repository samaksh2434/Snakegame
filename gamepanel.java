import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class gamepanel extends JPanel implements KeyListener,ActionListener 

{
    

    public gamepanel(){
        this.addKeyListener(this);
        this.setFocusable(true);
        
    }

    public void paint(Graphics g){
        
        //titele    bar
        g.setColor(Color.blue);
        g.drawRect(20, 10, 745, 75);
        g.fillRect(23, 13, 740, 70);

        // image of the title
        ImageIcon c =new ImageIcon("C:\\Users\\RealS\\Documents\\GitHub\\Snakegame\\images-removebg-preview.png");
        g.drawImage(c.getImage(), 30, 0, 100, 100, null);
         c =new ImageIcon("C:\\Users\\RealS\\Documents\\GitHub\\Snakegame\\images-removebg-preview.png");
        g.drawImage(c.getImage(), 660, 0, 100, 100, null);

        
       
// this is the window of the game
        g.setColor(Color.black);
        g.drawRect(20, 90, 745, 455);
        g.fillRect(23, 93, 740, 450);

        //snake body 
        // Image image;
        // image = new ImageIcon("C:\\Users\\RealS\\Documents\\GitHub\\Snakegame\\Screenshot 2025-07-05 172554.png").getImage();
        // g.drawImage(image, 100, 100, 20, 20, null);
        snakelenght(g);
        


        
        

        
    }
 // here this will print the snake based on its size also this fuction will keep the track of the
 //snake lenght and size
    public void snakelenght(Graphics g){
        int a=3;
        int[] slength=new int[a];
        for(int i=0;i<slength.length;i++){

            if(slength[i]==0){
                Image image;
                image = new ImageIcon("C:\\Users\\RealS\\Documents\\GitHub\\Snakegame\\Screenshot 2025-07-05 172554.png").getImage();
                g.drawImage(image, 100, 100, 20, 20, null);
            }
            if(i>0){
                Image image;
                image = new ImageIcon("C:\\Users\\RealS\\Documents\\GitHub\\Snakegame\\Screenshot 2025-07-05 172452.png").getImage();
                g.drawImage(image, 100-(i*30), 100, 20, 20, null);
            }

            
        }

    }

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
