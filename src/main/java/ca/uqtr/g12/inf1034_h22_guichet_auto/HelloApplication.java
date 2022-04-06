package ca.uqtr.g12.inf1034_h22_guichet_auto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /**
         * Changer le nom des fichier .fxml pour pouvoir tester vos écrans,
         * on s'occupera de les lier après.                         Ex. .getResource("login-screen.fxml"))
         */
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setFullScreen(true);
        stage.setTitle("Guichet Automatique!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}