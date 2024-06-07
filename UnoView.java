import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class UnoView extends JPanel
{
    private static ArrayList<JLayeredPane> cards = new ArrayList <JLayeredPane>();

    public UnoView(){
        super();
    }

    public static void main(String[] args) { //temporary
        UnoView gui = new UnoView();
        ImgComponent a = new ImgComponent("2156_uno_block.png");
        JPanel b = new JPanel();
        JLayeredPane test = new JLayeredPane();
        gui.setLayout(null);
        b.setPreferredSize(new Dimension(400,400));
        gui.setSize(new Dimension(500,900));
            test.setBounds(100,100,300,400);
        //test.setBackground(Color.RED);
        //b.setBackground(Color.RED);
        a.setBounds(100, 100,200,300);
        test.add(a);
        b.add(test);
        //for (int x = 0; x<1;x++){
            //cards.add(new JLayeredPane());
            //cards.get(x).setBounds(10+x*10,10,100,100);
            //b.add(cards.get(x));
            //cards.get(x).add(new JButton());
            //cards.get(x).add(a);
        //}

        gui.setVisible(true);
    }

//    public void escInput (int keyCode)
//    {
//        if (keyCode == KeyEvent.VK_ESCAPE)
//        {
//            setPause(pauseMenu.isEnabled());
//        }
//    }
//
//    public void setPause (boolean isPaused)
//    {
//        pauseMenu.setEnabled(isPaused);
//    }
}
