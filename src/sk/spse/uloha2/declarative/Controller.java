package sk.spse.uloha2.declarative;

import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Controller pre FXML súbor – obsahuje logiku aplikácie
 */
public class Controller {
    @FXML
    public TextField userNameField;
    public ToggleGroup Pohlavie;
    public PasswordField hesloField;

    @FXML
    public void registruj() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registrácia užívateľa");
        alert.setTitle("Registrácia prebehla úspešne");
        String pohlavie = ((RadioButton)Pohlavie.getSelectedToggle()).getText();
        String message = String.format("Užívateľ %s (%s) s heslom %s bpol pridaný do systému", userNameField.getText(), pohlavie, hesloField.getText());
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void Zatvor() {

    }
}
