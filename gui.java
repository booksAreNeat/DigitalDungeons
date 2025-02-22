import javax.swing.*;
import java.awt.*;      
public class gui extends JFrame {
    CardLayout cardlayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardlayout);
    JPanel card1 = new JPanel();
    JPanel card2 = new JPanel();

    JButton button1 = new JButton("Go to card 2");
    JButton button2 = new JButton("Go to card 1");

    gui(){
        card1.setBackground(Color.red);
        card2.setBackground(Color.blue);

        card1.add(button1);
        card2.add(button2);

        mainPanel.add(card1, "card1");
        mainPanel.add(card2, "card2");

        button1.addActionListener((e) ->{
            cardlayout.show(mainPanel, "card2");
        });

        button2.addActionListener((e) ->{
            cardlayout.show(mainPanel, "card1");
        });

        add(mainPanel);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[]){
        new gui();
    }
}