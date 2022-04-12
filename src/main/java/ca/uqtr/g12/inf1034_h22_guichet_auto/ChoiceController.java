package ca.uqtr.g12.inf1034_h22_guichet_auto;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ChoiceController {

    @FXML
    public Button bouton_quitter;

    @FXML
    public Button bouton_confirmer;

    @FXML
    public TextField fieldMontant;

    @FXML
    public void onQuitter(MouseEvent mouseEvent) {
        Stage stage = (Stage) bouton_quitter.getScene().getWindow();
        stage.close();
    }

    public void showScreen(ActionEvent actionEvent) {
        Node source = (Node) actionEvent.getSource();
        ChoiceList type = ChoiceList.valueOf((String) source.getUserData());
        chargerContenu(type.getFichierFxml());
    }

    private void chargerContenu(String nomFichier) {
        try {
            Parent racine = FXMLLoader.load(getClass().getResource(nomFichier));
            HelloApplication.getInstance().getStage().getScene().setRoot(racine);

        } catch (IOException exception) {
            System.out.println("Impossible de charger le fichier " + nomFichier + "\n" + exception.getMessage());
        }
    }

    @FXML
    private void showModal(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(ChangeDeviseModal.class.getResource("change-devise-modal.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("Confirmation - Changement de devise");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)event.getSource()).getScene().getWindow() );
        stage.show();
    }


//    @FXML
//    protected void onConnecter() throws IOException {
//        if (pin.getText().isBlank()) {
//            message.setText("Veuillez saisir votre PIN");
//        } else if (!(pin.getText().equals("12345"))) {
//            message.setText("PIN incorrect");
//        } else if (pin.getText().equals("12345")){
//            message.setText("");
//            changeScreen("choice-screen.fxml");
//        }
//    }

}