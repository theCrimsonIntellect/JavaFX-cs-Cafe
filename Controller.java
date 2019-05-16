package sample1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Controller {
    @FXML
    Label myMessage;

    Image waterImage;

    @FXML
    ImageView waterImageView;

    public void generateRandomNumber(ActionEvent e) {
        myMessage.setText("Menu \nserved!");
    }

    public void setWaterImage(ActionEvent e) {
        waterImage = new Image("/sample1/water.png");
        waterImageView.setImage(waterImage);
    }
}
