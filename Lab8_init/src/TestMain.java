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
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class TestMain {

    public static void main(String args[]) {
        // check all your implementation here
        JFrame win = new EgWindow(); //Create a window
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
        setSize(400,300);
        Container MyContentFrame = getContentPane();
        BufferedImage myImage = null;
        try {
            myImage = ImageIO.read(new File(monopoly.png));
        } catch (IOException ex) {
            // handle exception...
        }
        //BufferedImage myPicture = ImageIO.read(new File("monopoly.png"));
        ImageIcon monopoly = new ImageIcon(myImage);
        JLabel label1 = new JLabel(monopoly, JLabel.CENTER);
        //JLabel NiceDay=new JLabel(" Have a nice day!");
        //MyContentFrame.add(NiceDay);
        MyContentFrame.add(label1);

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
