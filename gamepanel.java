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
    public int[] xpos=new int[999999];
    public int[] ypos=new int[999999];
    { xpos[0]=100;
    ypos[0]=100;}
    
    
    public int snakelenght=9;
    int ti=snakelenght;    
    final int UP = 0;
    final int DOWN = 1;
    final int LEFT = 2;
    final int RIGHT = 3;
    int direction = DOWN;
     // initial direction
    
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

        

        //snakes body is here with the snake body arrray named slenght a= SNAKE LENGHT
        
        
        int[] slength=new int[snakelenght];
        
        //this loop will assingn the number in the slenth array
        for(int i=0;i<slength.length;i++){
            slength[i]=i;
            
        }
        
        
        //this loop will print the snake
        for(int i=0;i<slength.length;i++){

            if(slength[i]==0){
                Image image;
                image = new ImageIcon("C:\\Users\\RealS\\Documents\\GitHub\\Snakegame\\Screenshot 2025-07-05 172554.png").getImage();
                g.drawImage(image, xpos[0], ypos[0], 20, 20, null);
                //  System.out.println(xpos[0]+" "+ypos[0]);
            }
            

            if(slength[i]>0){
                
                Image image;
                image = new ImageIcon("C:\\Users\\RealS\\Documents\\GitHub\\Snakegame\\Screenshot 2025-07-05 172452.png").getImage();
                g.drawImage(image, xpos[ti-i], ypos[ti-i], 20, 20, null);
                // System.out.println(xpos[ti-i]+" "+ypos[ti-i]);
            }
           

            
        }

        


        
        

        
    }
    

    //THIS IS THE INPUT AREA HERE THE USER INPUTS ARE TAKEN INTO ACCOUNT

 @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
            
           
            xpos[ti]=xpos[0];
            ypos[ti]=ypos[0];

            System.out.println(direction);
        
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            if(direction!= LEFT){
                direction=RIGHT;
                System.out.println("right");
            xpos[0]=xpos[0]+20;
            repaint();
             ti++;
            }
            
             
            
            
        
            

        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            if(direction!= RIGHT){
                direction=LEFT;
                System.out.println("left");
            xpos[0]=xpos[0]-20;
            repaint();
             ti++;
            }
             
            
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            
            if(direction!= DOWN){
                direction=UP;
                System.out.println("up");
            ypos[0]=ypos[0]-20;
            repaint();
             ti++;
            }
             
             

            
        }

        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            if(direction!=UP){
                direction=DOWN;
                System.out.println("down");
            ypos[0]=ypos[0]+20;
            repaint();
             ti++;
            }
        }
    }  
             
            
        



        
        
    






    @Override
    public void keyReleased(KeyEvent e) {
        
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
        
   
    }

}
