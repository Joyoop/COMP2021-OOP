/**
 * Created by LX.Conan on 2016/11/7.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class TestMain {

    public static void main(String args[]) {
        // check all your implementation here
        JFrame win = new EgWindow(); //Create a window
        win.setLayout(new FlowLayout());
        win.setVisible(true); //Display it

    }
}
class EgWindow extends JFrame
{
    //
//* The constructor for EgWindow
//* ***************************
    public EgWindow()
    {
        setTitle("Example1");
        setSize(2000,1500);
        Container MyContentFrame = getContentPane();
        BufferedImage myImage;
        String filePath = "image/monopoly.png";
        try {
            myImage = ImageIO.read(new File(filePath));
            ImageIcon monopoly = new ImageIcon(myImage);
            JLabel label1 = new JLabel(monopoly);
            JLabel label2 = new JLabel("Enter 1 if You want to see the board map");
            String[] test = {"[Turn 1] [0] [$5000] Player 1 toss a die... Face is 6",
                    "[Turn 1] [6] [$5000] Player 1 goes to Jade Soi 4",
                    "[Turn 1] [6] [$5000] Player 1 buy Jade Soi 4 for 638",
                    "[Turn 1] [0] [$5000] Player 2 toss a die... Face is 4",
                    "[Turn 1] [4] [$5000] Player 2 goes to Village Peace",
"[Turn 1] [4] [$5000] Player 2, do you want to buy Village Peace? (1 for yes, 2 for no)"};
            //MyContentFrame.setLayout(new BorderLayout());
            MyContentFrame.add(label1);
            //MyContentFrame.add(label2);
            MyContentFrame.add(new JList(test));
        } catch (IOException ex) {
            // handle exception...
            ex.printStackTrace();
        }
        //BufferedImage myPicture = ImageIO.read(new File("monopoly.png"));

        //JLabel NiceDay=new JLabel(" Have a nice day!");
        //MyContentFrame.add(NiceDay);


        /*public ImageIcon createImageIcon(String path, String description) {
            java.net.URL imgURL = getClass().getResource(path);
            if (imgURL != null) {
                return new ImageIcon(imgURL, description);
            } else {
                System.err.println("Couldn't find file: " + path);
                return null;
            }
        }*/
//
//* An inner class is defined as the window Listener
//* It is only interested in the windowClosing event,
//* which will shut down the program
//* *****************************************
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            } // Terminate the program
        });
    }
}

class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel() {
        try {
            image = ImageIO.read(new File("monopoly.png"));
        } catch (IOException ex) {
            // handle exception...
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
    }

}
