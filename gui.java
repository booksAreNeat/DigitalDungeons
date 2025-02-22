import javax.swing.*;
import java.awt.*;    
public class gui extends JFrame{
    guard player = new guard(lives.THREE, 5, 5, 5, 5, 5, 5, "");
    CardLayout cardlayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardlayout);

    JPanel welcome = new JPanel();
    JPanel start = new JPanel();
    JPanel lose = new JPanel();
    JPanel textblock1 = new JPanel();
    JPanel textblock2 = new JPanel();

    JTextField nameField = new JTextField();

    JLabel enterName = new JLabel("Enter your name: ");
    JLabel greetings = new JLabel("", JLabel.CENTER);
    JLabel gameOver = new JLabel("You lose!! Ha ha, would you like to play again?");
    JLabel intro = new JLabel("After a long shift " + player.getName() + ", the guard captain is off duty and drinking in the local tavern, The Wandering Trader. The atmosphere is cosy with a fire roaring in the grate. There are torches on the wall giving the large space a warm glow with the occasional flicker. " + player.getName() + " is chatting with the bartender and owner of the tavern, Deiter Haartman, a male half-elf. Suddenly there is a commotion outside, what do you do?");
    JLabel ignoreAnswer = new JLabel("");
    JLabel investigateAnswer = new JLabel("");

    JButton startButton = new JButton("Start Game");
    JButton nameButton = new JButton("Submit Name");
    JButton ignoreButton = new JButton("Ignore and keep drinking");
    JButton investigateButton = new JButton("Investigate the commotion");
    JButton endButton = new JButton("GAME OVER");
    JButton continueButton = new JButton("Continue");
    JButton continueButton1 = new JButton("Continue");
    JButton coninueButton2 = new JButton("Continue");

    gui(){
        startButton.setBounds(150, 300, 1000, 500);
        nameField.setPreferredSize(new Dimension(200, 30));
        enterName.setFont(new Font("Verdana", Font.PLAIN, 35));
        greetings.setFont(new Font("Verdana", Font.PLAIN, 35));

        welcome.setBackground(Color.white);
        start.setBackground(Color.white);

        welcome.add(startButton);

        lose.add(gameOver);

        start.add(enterName);
        start.add(nameField);
        start.add(nameButton);
        start.add(greetings);

        textblock1.add(intro);
        textblock1.add(ignoreButton);
        textblock1.add(investigateButton);
        textblock1.add(ignoreAnswer);
        textblock1.add(investigateAnswer);

        mainPanel.add(welcome, "welcome");
        mainPanel.add(start, "start");
        mainPanel.add(lose, "lose");
        mainPanel.add(textblock1, "textblock1");
        mainPanel.add(textblock2, "textblock2");

        startButton.addActionListener((e) ->{
            cardlayout.show(mainPanel, "start");
        });

        nameButton.addActionListener((e) ->{
            player.setName(nameField.getText());
                greetings.setText("Greetings " + player.getName() + "! Let's Play The Game!");
                start.add(greetings);
                start.add(continueButton);
        });

        continueButton.addActionListener((e) ->{
            cardlayout.show(mainPanel, "textblock1");
        });

        ignoreButton.addActionListener((e) ->{
            ignoreAnswer.setText("You have drank yourself into a stupor whilst chaos reigns outside. You have lost the game");
            textblock1.add(ignoreAnswer);
            textblock1.add(endButton);
        });

        investigateButton.addActionListener((e) ->{
            investigateAnswer.setText("You grab your weapon off the rack by the door and leave to investigate the noise");
            textblock1.add(investigateAnswer);
            textblock1.add(continueButton1);
        });

        continueButton1.addActionListener((e) ->{
            cardlayout.show(mainPanel, "textblock2");
        });

        endButton.addActionListener((e) -> {
            cardlayout.show(mainPanel, "lose");
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