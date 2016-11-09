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
        BufferedImage myImage = null;
        String filePath = "image/monopoly.png";
        try {
            //board image load and resize
            myImage = ImageIO.read(new File(filePath));
            Image myImage2 = myImage.getScaledInstance(400, 400,Image.SCALE_SMOOTH);
            ImageIcon monopoly = new ImageIcon(myImage2);
            JLabel label1 = new JLabel(monopoly);
            //piece1 image load and resize

            BufferedImage piece1 = ImageIO.read(new File("image/piece3.png"));
            Image piece1Image = piece1.getScaledInstance(90,90,Image.SCALE_SMOOTH);
            ImageIcon piece1Icon = new ImageIcon(piece1Image);
            JLabel label2 = new JLabel(piece1Icon);

            label2.setBounds(20,20,90,90);
            label1.add(label2);

            String[] test = {"[Turn 1] [0] [$5000] Player 1 toss a die... Face is 6",
                    "[Turn 1] [6] [$5000] Player 1 goes to Jade Soi 4",
                    "[Turn 1] [6] [$5000] Player 1 buy Jade Soi 4 for 638",
                    "[Turn 1] [0] [$5000] Player 2 toss a die... Face is 4",
                    "[Turn 1] [4] [$5000] Player 2 goes to Village Peace",
"[Turn 1] [4] [$5000] Player 2, do you want to buy Village Peace? (1 for yes, 2 for no)"};
            JPanel backgroundPanel = new JPanel();
            MyContentFrame.setLayout(null);
            MyContentFrame.add(label1);
            MyContentFrame.add(new JList(test));
            //MyContentFrame.add(label2);

        } catch (IOException ex) {
            // handle exception...
            ex.printStackTrace();
        }

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

    /*public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillOval(20, 50, 100, 100);
        g.setColor(Color.blue);
        g.fillRect(100, 100, 100, 200);
    }*/

}

class DrawPane extends JPanel{
    public void paint(Graphics g){
        //draw on g here e.g.
        g.fillRect(20, 20, 100, 200);
    }
}
