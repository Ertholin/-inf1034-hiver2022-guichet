module ca.uqtr.g12.inf1034_h22_guichet_auto {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.uqtr.g12.inf1034_h22_guichet_auto to javafx.fxml;
    exports ca.uqtr.g12.inf1034_h22_guichet_auto;
}