import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.*;

public class embedTest {
    public static void main(String[] args) {
        JFrame test = new JFrame();
        File te = new File("temp");
        File test2 = new File(te.getName(),"_HiddenCard - Copy.png");
        System.out.println(test2.getAbsolutePath());
        ImgComponent testing = new ImgComponent(test2.getAbsolutePath());
        test.setSize(new Dimension(100,100));
        test.setVisible(true);
        test.setContentPane(testing);
    }
}
