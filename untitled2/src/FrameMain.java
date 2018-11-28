import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

public class FrameMain extends JFrame {
    private ArrayList<Rab> rab = new ArrayList<Rab>();
    private ArrayList<Thread> thread = new ArrayList<Thread>();
    private Container cp;

    public FrameMain() {
        init();
    }

    public void init() {
        this.setBounds(100, 100, 500, 500);
        this.setLayout(null);
        cp = this.getContentPane();
        cp.setLayout(null);


        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
            }
        });
    }


    class Rab extends JLabel implements Runnable {
        private ImageIcon image = new ImageIcon("18d9f66043474ec109fe92bbab984bce.jpg");
        private Timer t1;
        private Random rand = new Random(System.currentTimeMillis());
        private int dirFlag, x = 0, y = 0;


        public Rab() {
            Image icon = image.getImage();
            Image amg = icon.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
            image = new ImageIcon(amg);

      }

        @Override
        public void run() {
            t1 = new Timer((rand.nextInt(10)+1)*100,new ActionListener())
        }
    }
}