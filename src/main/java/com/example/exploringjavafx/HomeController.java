package com.example.exploringjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;


public class HomeController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onCalculatorPress(ActionEvent event) {
        try{
            Parent calcSceneRoot = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
            Scene calculatorScene = new Scene(calcSceneRoot);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(calculatorScene);
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}