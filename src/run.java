import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class run {
    static Start start=new Start();
    static Game game=new Game();
    static Rank rank=new Rank();
    static JFrame[] frames = { start,game,rank};

    public static void main(String args[]) throws InterruptedException {

        for (int index = 0; index < frames.length; index++) {
            frames[index].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frames[index].setPreferredSize(new Dimension(1000,900));
            screencentre(frames[index]);

            frames[index].pack();
        }
        frames[0].setVisible(true);

    }

    public static void screencentre(JFrame frame) { //let the frame present on the center

        Toolkit kit = Toolkit.getDefaultToolkit(); // the tool package definition
        Dimension screenSize = kit.getScreenSize(); // gain the screen size information
        int screenWidth = screenSize.width; // gain the screen width information
        int screenHeight = screenSize.height; // gain the screen height information

        frame.setLocation(screenWidth/4, screenHeight/15);// set the screen location
    }
}