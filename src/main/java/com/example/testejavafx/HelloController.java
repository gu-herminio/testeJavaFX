package com.example.testejavafx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Vai curintia");
    }

    @FXML
    protected void onCloseButtonClick(){
        System.exit(0);
    }
}