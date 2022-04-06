package ca.uqtr.g12.inf1034_h22_guichet_auto;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ChoiceController {

    @FXML
    public Button bouton_quitter;

    @FXML
    public void onQuitter(MouseEvent mouseEvent) {
        Stage stage = (Stage) bouton_quitter.getScene().getWindow();
        stage.close();
    }
}