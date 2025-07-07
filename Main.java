import javax.swing.JFrame;


public class Main {
    static int Frame_width=1100;
    static int Frame_height=900;


    public static void main(String[] args) {


        System.out.println("Hello world!");
        JFrame f=new JFrame();
        f.setTitle("🐍 अजगर मोहम्मद");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setBounds(200,25,Frame_width,Frame_height);
        gamepanel p=new gamepanel();
        f.add(p);
        f.addKeyListener(p);
        
        


        
    }
}