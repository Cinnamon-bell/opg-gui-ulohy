package sk.spse.uloha3.declarative;
//platform.exit
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;



/**
 * Controller pre FXML súbor – obsahuje logiku aplikácie
 */
public class Controller {

    public ImageView img;
    public Slider slider;

    @FXML
    public void link(ActionEvent keyEvent){

    }

    @FXML
    public void close(ActionEvent keyEvent) {
        Platform.exit();
    }

    public void rotuj(MouseEvent mouseEvent){
        img.setRotate(slider.getValue());
    }

}
