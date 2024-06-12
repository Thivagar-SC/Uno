import java.awt.event.*;

public class MenuListener implements ActionListener{
    private UnoModel model;

    public MenuListener(UnoModel model){
        this.model = model;
    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Start")){
            model.startSelection();
        }
        else if(e.getActionCommand().equals("Play!")){
            model.startGame();
        }
    }
    
}
