import javax.swing.*;
import java.awt.*;      
public class gui extends JFrame {
    CardLayout cardlayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardlayout);
    JPanel welcome = new JPanel();
    JPanel start = new JPanel();

    JButton button1 = new JButton("Start Game");
    JButton button2 = new JButton("Go to card 1");

    gui(){
        welcome.setBackground(Color.white);
        start.setBackground(Color.blue);

        welcome.add(button1);

        mainPanel.add(welcome, "welcome");
        mainPanel.add(start, "start");

        button1.addActionListener((e) ->{
            cardlayout.show(mainPanel, "start");
        });

        add(mainPanel);
        setSize(1500,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[]){
        new gui();
    }
}