package sk.spse.uloha1.procedural;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;

///
/// Trieda pre procedurálne vytvorené GUI
///
/// Upravujte túto triedu
///

public class Application extends javafx.application.Application {

    private TextField cField;
    private TextField fField;

    @Override
    public void start(Stage stage) {

        Label lblC = new Label("Stupne Celsia:");
        cField = new TextField("0");
        Label lblCUnit = new Label("C");

        HBox rowC = new HBox(5, lblC, cField, lblCUnit);
        rowC.setAlignment(Pos.CENTER_RIGHT);
        rowC.setPadding(new Insets(10));

        Label lblF = new Label("Stupne Fahrenheita:");
        fField = new TextField("0");
        Label lblFUnit = new Label("F");

        HBox rowF = new HBox(5, lblF, fField, lblFUnit);
        rowC.setAlignment(Pos.CENTER_RIGHT);
        rowC.setPadding(new Insets(10));

        VBox root = new VBox(0,rowC,rowF);

        Scene scene = new Scene(root, 420, 120);

        cField.setOnKeyTyped( e -> CtoF());
        fField.setOnKeyTyped( e -> FtoC());


        stage.setTitle("Procedural Application 1");
        stage.setScene(scene);
        stage.show();
        /*Label label = new Label("Počítadlo:");

        TextField textField = new TextField("0");

        Button button = new Button("Plus 1");

        button.setOnAction(e -> {
            counter++;
            textField.setText(String.valueOf(counter));
        });

        HBox root = new HBox(20, label, textField, button);
        root.setPadding(new Insets(10));

        */
    }

    public void CtoF() {
        try{
            double c = Double.parseDouble(cField.getText());
            double f = 1.8 * c+32;
            fField.setText(Double.toString(f));
        } catch (NumberFormatException e) {

        }
    }

    private void FtoC() {
        try{
            double f = Double.parseDouble(fField.getText());
            double c = (f - 32) / 1.8;
            cField.setText(Double.toString(c));
        } catch (NumberFormatException e) {

        }
    }
}