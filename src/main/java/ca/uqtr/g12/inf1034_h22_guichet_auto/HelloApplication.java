package ca.uqtr.g12.inf1034_h22_guichet_auto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static HelloApplication instance;
    private Stage stage;
    ScrollPane scrollPane = new ScrollPane();

    public HelloApplication(){
        instance = this;
    }

    @Override
    public void start(Stage stage) throws IOException {
        /**
         * Changer le nom des fichier .fxml pour pouvoir tester vos écrans,
         * on s'occupera de les lier après.                         Ex. .getResource("login-screen.fxml"))
         */
        this.stage = stage;
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 650);

        //stage.setFullScreen(true);
        stage.setTitle("Guichet Automatique!");
        stage.setScene(scene);
        stage.show();
    }

    public static HelloApplication getInstance() {
        return instance ;
    }

    public Stage getStage() {

        return stage;
    }

    public static void main(String[] args) {
        launch();
    }
}