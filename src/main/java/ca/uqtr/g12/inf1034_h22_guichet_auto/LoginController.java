package ca.uqtr.g12.inf1034_h22_guichet_auto;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    public Button connexion;
    @FXML
    private PasswordField pin;
    @FXML
    private Text message;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;

//    @FXML
//    public void switchToChoiceScreen(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("choice-screen.fxml"));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    @FXML
//    public void changeScene(String fxml) throws IOException {
//        Parent pane = FXMLLoader.load(
//                getClass().getResource(fxml));
//
//        Scene scene = new Scene(pane);
//        stage.setScene(scene);
//    }

    @FXML
    protected void onConnecter() throws IOException {
        if (pin.getText().isBlank()) {
            message.setText("Veuillez saisir votre PIN");
        } else if (!(pin.getText().equals("12345"))) {
            message.setText("PIN incorrect");
        } else if (pin.getText().equals("12345")){
            message.setText("");
        }
    }
}