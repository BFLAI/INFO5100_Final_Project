import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Start extends JFrame{ //create the main frame
    JPanel panel =new JPanel();
    JLabel title = new JLabel("Guessing Number with AB",JLabel.CENTER);
    JButton[] buttons = {
            new JButton("New Game"),
            new JButton ("Ranking"),
            new JButton("Quit Game") };
    JPanel[] panels = new JPanel[3];

    public Start() {
        super("INFO 5100 Final Project_BING-FENG LAI");
        setLayout(new GridLayout(5,1));
        title.setFont(new Font("Guessing Number with AB",Font.BOLD,50) );

        add(title);
        add(new JPanel());
        for(int index=0;index<buttons.length;index++){
            buttons[index].addActionListener(new StartLis());
            panels[index]=new JPanel();
            panels[index].add(buttons[index]);
            add(panels[index]);
        }
    }

    private class StartLis implements ActionListener { //action listener function of start game
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==buttons[0]){
                setVisible(false);
                run.frames[1].setVisible(true);
            }
            else if(e.getSource()==buttons[1]){
                setVisible(false);
                run.frames[2].setVisible(true);
            }

            else if(e.getSource()==buttons[2]){
                System.exit(0);
            }
        }
    }
}