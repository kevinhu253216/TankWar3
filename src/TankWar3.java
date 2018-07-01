import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankWar3 extends Frame {

    public static void main(String[] args){
        TankWar3 tc = new TankWar3();
        tc.launchFrame();

    }

    public void paint(Graphics g){  //自动调用
        Color c = g.getColor();
        g.setColor(Color.red);
        g.fillOval(50,50,30,30);
        g.setColor(c);
    }

    public void launchFrame(){
        this.setLocation(300,300);
        this.setSize(800,600);
        this.setTitle("TankWar");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setResizable(false);
        this.setBackground(Color.GREEN);
        this.setVisible(true);
    }
}
