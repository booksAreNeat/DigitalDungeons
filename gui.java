import javax.swing.*;
import java.awt.*;

public class gui extends JFrame{
    guard player = new guard("", lives.THREE, 16, Dice.rollDice(20), Dice.rollDice(20), Dice.rollDice(20), Dice.rollDice(20), Dice.rollDice(20));
    CardLayout cardlayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardlayout);

    JPanel welcome = new JPanel()
    {
        @Override
        protected void paintComponent(Graphics g)
        {

            super.paintComponent(g);
            ImageIcon imageIcon = new ImageIcon("C:\\Users\\abste\\OneDrive\\Desktop\\Computing\\25hack\\DigitalDungeons\\town.jpeg");
            Image image = imageIcon.getImage();

            if (image != null)
            {

                int x = (getWidth() - image.getWidth(null)) / 2;
                int y = (getHeight() - image.getHeight(null)) / 2;
                g.drawImage(image, x, y, null);

            }

        }

    };

    JPanel start = new JPanel()
    
    {
        @Override
        protected void paintComponent(Graphics g)
        {

            super.paintComponent(g);
            ImageIcon imageIcon = new ImageIcon("C:\\Users\\abste\\OneDrive\\Desktop\\Computing\\25hack\\DigitalDungeons\\town.jpeg");
            Image image = imageIcon.getImage();
            setPreferredSize(new Dimension(1500, 1000));

            if (image != null)
            {

                int x = (getWidth() - image.getWidth(null)) / 2;
                int y = (getHeight() - image.getHeight(null)) / 2;
                g.drawImage(image, x, y, null);

            }

        }

    };

    JPanel textblock1 = new JPanel(){
        @Override
        protected void paintComponent(Graphics g)
        {

            super.paintComponent(g);
            ImageIcon imageIcon = new ImageIcon("C:\\Users\\abste\\OneDrive\\Desktop\\Computing\\25hack\\DigitalDungeons\\nobugbear.jpeg");
            Image image = imageIcon.getImage();

            if (image != null)
            {

                int x = (getWidth() - image.getWidth(null)) / 2;
                int y = (getHeight() - image.getHeight(null)) / 2;
                g.drawImage(image, x, y, null);

            }

        }

    };

    JPanel textblock2 = new JPanel(){
        @Override
        protected void paintComponent(Graphics g)
        {

            super.paintComponent(g);
            ImageIcon imageIcon = new ImageIcon("C:\\Users\\abste\\OneDrive\\Desktop\\Computing\\25hack\\DigitalDungeons\\bugbear.jpeg");
            Image image = imageIcon.getImage();

            if (image != null)
            {

                int x = (getWidth() - image.getWidth(null)) / 2;
                int y = (getHeight() - image.getHeight(null)) / 2;
                g.drawImage(image, x, y, null);

            }

        }

    };

    JPanel textblock3 = new JPanel(){
        @Override
        protected void paintComponent(Graphics g)
        {

            super.paintComponent(g);
            ImageIcon imageIcon = new ImageIcon("C:\\Users\\abste\\OneDrive\\Desktop\\Computing\\25hack\\DigitalDungeons\\nobugbear.jpeg");
            Image image = imageIcon.getImage();

            if (image != null)
            {

                int x = (getWidth() - image.getWidth(null)) / 2;
                int y = (getHeight() - image.getHeight(null)) / 2;
                g.drawImage(image, x, y, null);

            }

        }

    };

    JPanel textblock4 = new JPanel(){
        @Override
        protected void paintComponent(Graphics g)
        {

            super.paintComponent(g);
            ImageIcon imageIcon = new ImageIcon("C:\\Users\\abste\\OneDrive\\Desktop\\Computing\\25hack\\DigitalDungeons\\player.jpeg");
            Image image = imageIcon.getImage();

            if (image != null)
            {

                int x = (getWidth() - image.getWidth(null)) / 2;
                int y = (getHeight() - image.getHeight(null)) / 2;
                g.drawImage(image, x, y, null);

            }

        }

    };

    JPanel textblock5 = new JPanel(){
        @Override
        protected void paintComponent(Graphics g)
        {

            super.paintComponent(g);
            ImageIcon imageIcon = new ImageIcon("C:\\Users\\abste\\OneDrive\\Desktop\\Computing\\25hack\\DigitalDungeons\\enemy.jpeg");
            Image image = imageIcon.getImage();

            if (image != null)
            {

                int x = (getWidth() - image.getWidth(null)) / 2;
                int y = (getHeight() - image.getHeight(null)) / 2;
                g.drawImage(image, x, y, null);

            }

        }

    };

    JTextField nameField = new JTextField();

    JLabel enterName = new JLabel("Enter your name: ");
    JLabel greetings = new JLabel("", JLabel.CENTER);
    JLabel intro = new JLabel("After a long shift " + player.getName() + ", the guard captain is off duty and drinking in the local tavern, The Wandering Trader. The atmosphere");
    JLabel intro2 = new JLabel("is cosy with a fire roaring in the grate. There are torches on the wall giving the large space a warm glow with the occasional");
    JLabel intro3 = new JLabel("flicker. " + player.getName() + " is chatting with the bartender and owner of the tavern, Deiter Haartman, a male half-elf. Suddenly there is a");
    JLabel intro4 = new JLabel("commotion outside, what do you do?");
    JLabel answer1 = new JLabel("");
    JLabel bugbear = new JLabel("A bugbear is outside! What will you do?");
    JLabel answer2 = new JLabel("");
    JLabel journey = new JLabel("You go to the watch tower to gather the guards to celebrate. You are warned of the dangers living on the hills nearby");
    JLabel what = new JLabel("What do you do?");
    JLabel answer3 = new JLabel("");
    JLabel boss = new JLabel("Once at the hills you see a skeletal figure with jet black hair obscuring their face. The figure is clearly making its way");
    JLabel boss2 = new JLabel("to your town. What do you do?");
    JLabel answer4 = new JLabel("");
    JLabel congrats = new JLabel("You have defeated the game against all odds! Truly an inspiration to us all");

    JButton startButton = new JButton("Start Game");
    JButton nameButton = new JButton("Submit Name");
    JButton ignoreButton = new JButton("Ignore and keep drinking");
    JButton investigateButton = new JButton("Investigate the commotion");
    JButton runButton = new JButton("Run away!");
    JButton punchButton = new JButton("Punch him!");
    JButton swordButton = new JButton("Attack with your sword!");
    JButton travelButton = new JButton("Travel to the hills");
    JButton stayButton = new JButton("Stay and party");
    JButton fightButton = new JButton("Defend your town");
    JButton fleeButton = new JButton("Flee from the monster");
    JButton endButton = new JButton("GAME OVER");
    JButton continueButton = new JButton("Continue");
    JButton continueButton1 = new JButton("Continue");
    JButton continueButton2 = new JButton("Continue");
    JButton continueButton3 = new JButton("Continue");
    JButton continueButton4 = new JButton("Continue to Victory");

    gui(){
        startButton.setBounds(150, 300, 1000, 500);
        startButton.setPreferredSize(new Dimension(200, 35));

        nameField.setPreferredSize(new Dimension(200, 30));
        enterName.setFont(new Font("Verdana", Font.PLAIN, 45));
        greetings.setFont(new Font("Verdana", Font.PLAIN, 45));
        intro.setPreferredSize(new Dimension(1450, 50));
        intro.setFont(new Font("Verdana", Font.BOLD, 20));
        intro2.setPreferredSize(new Dimension(1450, 50));
        intro2.setFont(new Font("Verdana", Font.BOLD, 20));
        intro3.setPreferredSize(new Dimension(1450, 50));
        intro3.setFont(new Font("Verdana", Font.BOLD, 20));
        intro4.setPreferredSize(new Dimension(1450, 50));
        intro4.setFont(new Font("Verdana", Font.BOLD, 20));
        answer1.setPreferredSize(new Dimension(1450, 50));
        answer1.setFont(new Font("Verdana", Font.BOLD, 20));
        bugbear.setPreferredSize(new Dimension(1450, 50));
        bugbear.setFont(new Font("Verdana", Font.BOLD, 20));
        answer2.setPreferredSize(new Dimension(1450, 50));
        answer2.setFont(new Font("Verdana", Font.BOLD, 20));
        journey.setPreferredSize(new Dimension(1450, 50));
        journey.setFont(new Font("Verdana", Font.BOLD, 20));
        what.setPreferredSize(new Dimension(1450, 50));
        what.setFont(new Font("Verdana", Font.BOLD, 20));
        answer3.setPreferredSize(new Dimension(1450, 50));
        answer3.setFont(new Font("Verdana", Font.BOLD, 20));
        boss.setPreferredSize(new Dimension(1450, 50));
        boss.setFont(new Font("Verdana", Font.BOLD, 20));
        boss2.setPreferredSize(new Dimension(1450, 50));
        boss2.setFont(new Font("Verdana", Font.BOLD, 20));
        answer4.setPreferredSize(new Dimension(1450, 50));
        answer4.setFont(new Font("Verdana", Font.BOLD, 20));
        congrats.setPreferredSize(new Dimension(1450, 50));
        congrats.setFont(new Font("Verdana", Font.BOLD, 20));

        welcome.add(startButton);

        start.add(enterName);
        start.add(nameField);
        start.add(nameButton);
        start.add(greetings);

        textblock1.add(intro);
        textblock1.add(intro2);
        textblock1.add(intro3);
        textblock1.add(intro4);
        textblock1.add(ignoreButton);
        textblock1.add(investigateButton);
        textblock1.add(answer1);

        textblock2.add(bugbear);
        textblock2.add(runButton);
        textblock2.add(punchButton);
        textblock2.add(swordButton);
        textblock2.add(answer2);

        textblock3.add(journey);
        textblock3.add(what);
        textblock3.add(travelButton);
        textblock3.add(stayButton);
        textblock3.add(answer3);

        textblock4.add(boss);
        textblock4.add(boss2);
        textblock4.add(fightButton);
        textblock4.add(fleeButton);
        textblock4.add(answer4);

        textblock5.add(congrats);

        mainPanel.add(welcome, "welcome");
        mainPanel.add(start, "start");
        mainPanel.add(textblock1, "textblock1");
        mainPanel.add(textblock2, "textblock2");
        mainPanel.add(textblock3, "textblock3");
        mainPanel.add(textblock4, "textblock4");
        mainPanel.add(textblock5, "textblock5");

        startButton.addActionListener((e) ->{
            cardlayout.show(mainPanel, "start");
            startButton.setPreferredSize(new Dimension(200, 30));
        });

        nameButton.addActionListener((e) ->{
            player.setName(nameField.getText());
            nameButton.setPreferredSize(new Dimension(200,30));
                greetings.setText("Greetings " + player.getName() + "! Let's Play The Game!");
                start.add(greetings);
                continueButton1.setPreferredSize(new Dimension(200, 30));
                start.add(continueButton);
        });

        continueButton.addActionListener((e) ->{
            continueButton.setPreferredSize(new Dimension(200, 30));
            cardlayout.show(mainPanel, "textblock1");
        });

        ignoreButton.addActionListener((e) ->{
            answer1.setText("You have drank yourself into a stupor whilst chaos reigns outside. You have lost the game");
            ignoreButton.setPreferredSize(new Dimension(200, 30));
            textblock1.add(answer1);
            textblock1.add(endButton);
        });

        investigateButton.addActionListener((e) ->{
            investigateButton.setPreferredSize(new Dimension(200,30));
            answer1.setText("You grab your weapon off the rack by the door and leave to investigate the noise");
            textblock1.add(answer1);
            textblock1.add(continueButton1);
        });

        continueButton1.addActionListener((e) ->{
            continueButton1.setPreferredSize(new Dimension(200,30));
            cardlayout.show(mainPanel, "textblock2");
        });

        runButton.addActionListener((e) ->{
            if (player.getDexterity() > 10){
                answer2.setText("You have ran away successfully. The bugbear kills all in its wake and destriys Hjem.");
            } else {
                answer2.setText("You failed to run away, the bugbear eats you alive");
            }
            textblock2.add(answer2);
            textblock2.add(endButton);
        });

        punchButton.addActionListener((e) ->{
            if (player.getStrength() > 15){
                answer2.setText("You successfully beat up the bugbear. You are a hero to the towns people");
                textblock2.add(answer2);
                textblock2.add(continueButton2);
            } else {
                answer2.setText("The bugbear pummels you until you die a slow painful death");
                textblock2.add(answer2);
                textblock2.add(endButton);
            }
        });

        swordButton.addActionListener((e) ->{
            if (player.getStrength() > 10){
                answer2.setText("You slaughter the beast with your sword. You are a hero to the towns people");
                textblock2.add(answer2);
                textblock2.add(continueButton2);
            } else {
                answer2.setText("The bugbear eats your sword, then eats you");
                textblock2.add(answer2);
                textblock2.add(endButton);
            }
        });

        continueButton2.addActionListener((e) ->{
            continueButton2.setPreferredSize(new Dimension(200,30));
            cardlayout.show(mainPanel, "textblock3");
        });

        travelButton.addActionListener((e) ->{
            answer3.setText("You arm yourself as heavily as you can, before begining your journey");
            textblock3.add(answer3);
            textblock3.add(continueButton3);
        });

        stayButton.addActionListener((e) ->{
            answer3.setText("You are a coward. Other guards go and die without your protection");
            textblock3.add(answer3);
            textblock3.add(endButton);
        });

        continueButton3.addActionListener((e) ->{
            continueButton3.setPreferredSize(new Dimension(200,30));
            cardlayout.show(mainPanel, "textblock4");
        });

        fightButton.addActionListener((e) ->{
            if (player.getStrength() > 15){
                answer4.setText("You successfully defend your town and kill the skeletal figure. You become a local legend");
                textblock4.add(answer4);
                textblock4.add(continueButton4);
            } else {
                answer4.setText("The skeletal figure looms over your dead body. You have been defeated");
                textblock4.add(answer4);
                textblock4.add(endButton);
            }
        });

        fleeButton.addActionListener((e) ->{
            answer4.setText("You are a coward. Other guards go instead and die without your protection");
            textblock4.add(answer4);
            textblock4.add(endButton);
        });

        continueButton4.addActionListener((e) ->{
            continueButton4.setPreferredSize(new Dimension(200,30));
            cardlayout.show(mainPanel, "textblock5");
        });

        endButton.addActionListener((e) -> {
            System.exit(0);
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