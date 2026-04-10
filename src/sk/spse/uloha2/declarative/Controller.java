package sk.spse.uloha2.declarative;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private TextField userNameField;

    @FXML
    private ToggleGroup Pohlavie;

    @FXML
    private TextField hesloField;

    @FXML
    public void registruj() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registrácia užívateľa");
        alert.setHeaderText("Registrácia prebehla úspešne");

        String pohlavie = ((RadioButton) Pohlavie.getSelectedToggle()).getText();

        String message = String.format(
                "Užívateľ %s (%s) s heslom %s bol pridaný do systému",
                userNameField.getText(),
                pohlavie,
                hesloField.getText()
        );

        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void close(ActionEvent keyEvent) {
        Platform.exit();
    }
}