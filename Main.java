import javax.swing.JFrame;


public class Main {
    static int Frame_width=800;
    static int Frame_height=600;


    public static void main(String[] args) {


        System.out.println("Hello world!");
        JFrame f=new JFrame();
        f.setTitle("🐍 साप का तमाशा");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setBounds(100,100,Frame_width,Frame_height);
        gamepanel p=new gamepanel();
        f.add(p);
        f.addKeyListener(p);
        
        


        
    }
}