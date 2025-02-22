import javax.swing.*;
import java.awt.*;      
public class gui extends JFrame 
{
    
    CardLayout cardlayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardlayout);
    JPanel welcome = new JPanel();
    JPanel start = new JPanel()
    {

        @Override
        protected void paintComponent(Graphics g)
        {

            super.paintComponent(g);
            ImageIcon imageIcon = new ImageIcon("C:\\Users\\2004j\\Downloads\\dont delete later\\mai2\\DigitalDungeons\\another folder, take things out and delete when merging\\town.jpeg");
            Image image = imageIcon.getImage();
            setPreferredSize(new Dimension(1500, 1000));
            System.out.println("poopy");

            if (image != null)
            {

                int x = (getWidth() - image.getWidth(null)) / 2;
                int y = (getHeight() - image.getHeight(null)) / 2;
                g.drawImage(image, x, y, null);

            }

        }

    };

    JButton button1 = new JButton("Start Game");
    JButton button2 = new JButton("Go to card 1");

    

    gui()
    {
        
        welcome.setBackground(Color.white);

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