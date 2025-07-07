import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;



public class gamepanel extends JPanel implements KeyListener,ActionListener 

{
    public int[] xpos=new int[9999999];
    public int[] ypos=new int[9999999];
    { xpos[0]=100;
    ypos[0]=100;}

    Timer timer;
    public int speed=200;
    Random r=new Random();
    public int applex=r.nextInt(25,750);
    public int appley=r.nextInt(100,500);
    
    
    public int snakelenght=3;
    int ti=snakelenght;    
    final int UP = 0;
    final int DOWN = 1;
    final int LEFT = 2;
    final int RIGHT = 3;
    int direction = RIGHT;
     // initial direction
     
    public gamepanel(){
        
        this.addKeyListener(this);
        this.setFocusable(true);
        timer=new Timer(speed,this);
        timer.start();
        
    }
    
        

    



  

    


    public void paint(Graphics g){
        // System.out.println(snakelenght+"sppeed ki wvalue"+speed);
        
         
        
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
        for(int i=0;i<snakelenght;i++){
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



            //this will print the apple
            

            Image image;
            image = new ImageIcon("C:\\Users\\RealS\\Documents\\GitHub\\Snakegame\\download-removebg-preview.png").getImage();
            g.drawImage(image, applex, appley, 20, 20, null);
            // System.out.println(applex+" apple "+appley);
            // System.out.println(xpos[0]+" snake head "+ypos[0]);

            // this will print the score of the game
            g.setColor(Color.white);
            g.setFont(getFont().deriveFont(20f));
            g.drawString("Score: "+(snakelenght-3), 350, 55);

            /// this will die the snake and gameover messge will be showed
            if(xpos[0]<22||xpos[0]>745||ypos[0]<90||ypos[0]>540){
            timer.stop();
            System.out.println("game over");
            g.setColor(Color.white);
            Font font = new Font("Arial", Font.BOLD, 20);
            String newline = System.lineSeparator();
            g.drawString("Game Over "+newline+"Press Enter to Play Again", 220, 300);


        
       }
            

            
           

            
        }
        
        

        
    

    }
    
    
    
    

    
// this is resposible for the movement of the snake
 @Override
 
    public void actionPerformed(ActionEvent e) {
        xpos[ti]=xpos[0];
        ypos[ti]=ypos[0];
        
       if (direction==UP){
           ypos[0]=ypos[0]-20;
           repaint();
           ti++;
       }
       if(direction==DOWN){
           ypos[0]=ypos[0]+20;
           repaint();
           ti++;
       }
       if(direction==LEFT){
           xpos[0]=xpos[0]-20;
           repaint();
           ti++;
       }
       if(direction==RIGHT){
           xpos[0]=xpos[0]+20;
           repaint();
           ti++;
        
       }

       //this is the condition for the snake to die
    //    if(xpos[0]<22||xpos[0]>745||ypos[0]<90||ypos[0]>540){
    //     timer.stop();
    //     System.out.println("game over");

    //    }

         // condition for the the apple of the snake 
       if (Math.abs(xpos[0] - applex) < 20 && Math.abs(ypos[0] - appley) < 20) {
        // System.out.println("Collision detected!");
        repaint();
        applex=r.nextInt(25,750);
        appley=r.nextInt(100,500);
        
        
        // Add code to handle collision here
        // For example, you can increase the snake length
        snakelenght++;
        
        //here the speed of the snake is been regulated
        if(speed<=10){speed=speed-1;}
        if(speed>10&&speed<=20){speed=speed-2;}
        if(speed>20&&speed<=50){speed=speed-5;}
        if(speed>50&&speed<=100){speed=speed-10;} 
        if(speed>100&&speed<=200){speed=speed-50;}// increase the speed by 10
        timer.setDelay(speed);
    }
}
        
        
    
    //THIS IS THE INPUT AREA HERE THE USER INPUTS ARE TAKEN INTO ACCOUNT
    @Override
    public void keyPressed(KeyEvent e) {
            
           
            xpos[ti]=xpos[0];
            ypos[ti]=ypos[0];

            if(e.getKeyCode()==KeyEvent.VK_ENTER){
         // Reset game state
          snakelenght = 3;
          speed=200;
          timer.setDelay(speed);
           xpos[0] = 100;
           ypos[0] = 100;
           xpos[ti]=xpos[0];
           ypos[ti]=ypos[0]; 
           direction = 'r';
           
           timer.stop();
           
           timer.start();
           
            repaint();
}

            System.out.println(direction);
        
        if(e.getKeyCode()==KeyEvent.VK_RIGHT||e.getKeyCode()==KeyEvent.VK_D){
            if(direction!= LEFT){
                direction=RIGHT;
                System.out.println("right");
            xpos[0]=xpos[0]+20;
            repaint();
             ti++;
            }
            
             
            
            
        
            

        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT||e.getKeyCode()==KeyEvent.VK_A){
            if(direction!= RIGHT){
                direction=LEFT;
                System.out.println("left");
            xpos[0]=xpos[0]-20;
            repaint();
             ti++;
            }
             
            
        }
        if(e.getKeyCode()==KeyEvent.VK_UP||e.getKeyCode()==KeyEvent.VK_W){
            
            if(direction!= DOWN){
                direction=UP;
                System.out.println("up");
            ypos[0]=ypos[0]-20;
            repaint();
             ti++;
            }
             
             

            
        }

        if(e.getKeyCode()==KeyEvent.VK_DOWN||e.getKeyCode()==KeyEvent.VK_S){
            if(direction!=UP){
                direction=DOWN;
                System.out.println("down");
            ypos[0]=ypos[0]+20;
            repaint();
             ti++;
            }

//         if(e.getKeyCode()==KeyEvent.VK_ENTER){
//     // Reset game state
//     snakelenght = 3;
//     xpos = new int[100];
//     ypos = new int[100];
//     xpos[0] = 100;
//     ypos[0] = 100;
//     direction = 'r';
//     timer.stop();
//     timer.start();
//     repaint();
// }
        }
    }  
             
            
        



        
        
    






    @Override
    public void keyReleased(KeyEvent e) {
        
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

}