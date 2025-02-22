import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShowImageJFrame extends JFrame 
{

    public ShowImageJFrame(String imagePath)
    {

        JPanel panel = new JPanel()
        {

            @Override
            protected void paintComponent(Graphics g)
            {

                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon(imagePath);
                Image image = imageIcon.getImage();

                if (image != null)
                {

                    int x = (getWidth() - image.getWidth(null)) / 2;
                    int y = (getHeight() - image.getHeight(null)) / 2;
                    g.drawImage(image, x, y, this);

                }

            }

        };

        this.getContentPane().add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args)
    {

        new ShowImageJFrame("C:\\Users\\2004j\\Downloads\\dont delete later\\DigitalDungeons\\Dungeons and papas\\Teto pear.jpg");

    }

}

