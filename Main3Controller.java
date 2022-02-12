package aplikacja;

import javafx.fxml.FXML;
import javafx.scene.shape.Arc;

public class Main3Controller {
@FXML
    private Arc Pacman;
    private double x;
    private double y;
    public void up (){
        Pacman.setCenterY(--y);
    }
    public void down (){
        Pacman.setCenterY(y++);
    }
    public void left (){
        Pacman.setCenterX(--x);
    }
    public void right (){
        Pacman.setCenterX(x++);
    }

}
