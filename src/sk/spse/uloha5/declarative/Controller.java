package sk.spse.uloha5.declarative;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

/**
 * Controller pre FXML súbor – obsahuje logiku aplikácie
 */
public class Controller {

    // RadioButtony (ubytovanie)
    @FXML
    private RadioButton hotelRadio;

    @FXML
    private RadioButton apartmanRadio;

    @FXML
    private RadioButton villaRadio;

    // CheckBoxy (vybavenie)
    @FXML
    private CheckBox bazenCheck;

    @FXML
    private CheckBox parkovanieCheck;

    @FXML
    private CheckBox wifiCheck;

    // Výstup
    @FXML
    private TextArea vystupArea;

    @FXML
    private void aktualizujVyber() {
        StringBuilder vystup = new StringBuilder();

        // Ubytovanie
        vystup.append("Vaše ubytovanie:\n");
        if (hotelRadio.isSelected()) {
            vystup.append("Hotel\n");
        } else if (apartmanRadio.isSelected()) {
            vystup.append("Apartmán\n");
        } else if (villaRadio.isSelected()) {
            vystup.append("Villa\n");
        }

        // Vybavenie
        vystup.append("\nVybavenie:\n");

        if (bazenCheck.isSelected()) {
            vystup.append("- Bazén\n");
        }
        if (parkovanieCheck.isSelected()) {
            vystup.append("- Parkovanie\n");
        }
        if (wifiCheck.isSelected()) {
            vystup.append("- Wifi\n");
        }

        vystupArea.setText(vystup.toString());
    }
}