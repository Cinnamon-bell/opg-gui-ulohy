package sk.spse.uloha4.declarative;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;

import java.util.Locale;
import java.util.Random;

public class Controller {

    public VBox vbox1;
    public VBox vbox2;
    public VBox vbox3;
    public VBox vbox4;

    public ImageView img1;
    public ImageView img2;
    public ImageView img3;
    public ImageView img4;

    private static final Random rand = new Random();

    public static String getRandomColor() {
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return String.format("#%02X%02X%02X", r, g, b);
    }

    public static String getRandomOpaque() {
        double x = rand.nextDouble();
        return String.format(Locale.ROOT, "%.2f", x);
    }

    public static double getRandomScale() {
        return 0.5 + rand.nextDouble();
    }

    public static double getRandomRotate() {
        return rand.nextInt(360);
    }

    @FXML
    private void randomize() {
        vbox1.setStyle("-fx-background-color: " + getRandomColor() + "; -fx-opacity: " + getRandomOpaque());
        vbox2.setStyle("-fx-background-color: " + getRandomColor() + "; -fx-opacity: " + getRandomOpaque());
        vbox3.setStyle("-fx-background-color: " + getRandomColor() + "; -fx-opacity: " + getRandomOpaque());
        vbox4.setStyle("-fx-background-color: " + getRandomColor() + "; -fx-opacity: " + getRandomOpaque());

        img4.setStyle("-fx-rotate: " + getRandomRotate());
        img2.setStyle("-fx-scale-x: " + getRandomScale());
        img3.setStyle("-fx-scale-y: " + getRandomScale());
        img1.setStyle("-fx-rotate: " + getRandomRotate());
    }

    @FXML
    public void close(ActionEvent keyEvent) {
        Platform.exit();
    }
}