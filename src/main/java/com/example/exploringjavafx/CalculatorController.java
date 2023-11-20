package com.example.exploringjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorController {
    @FXML
    protected void onExitPress(ActionEvent event) {
        try{
            Parent homeSceneRoot= FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Scene homeScene = new Scene(homeSceneRoot);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(homeScene);
            stage.show();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void onZeroPress(ActionEvent actionEvent) {
        
    }

    public void onTwoPress(ActionEvent actionEvent) {
    }

    public void onSevenPress(ActionEvent actionEvent) {
    }

    public void onFourPress(ActionEvent actionEvent) {
    }

    public void onOnePress(ActionEvent actionEvent) {
    }

    public void onSubtractPress(ActionEvent actionEvent) {
    }

    public void onEightPress(ActionEvent actionEvent) {
    }

    public void onNinePress(ActionEvent actionEvent) {
    }

    public void onFivePress(ActionEvent actionEvent) {
    }

    public void onSixPress(ActionEvent actionEvent) {
    }

    public void onThreePress(ActionEvent actionEvent) {
    }

    public void onDotPress(ActionEvent actionEvent) {
    }

    public void onSignPress(ActionEvent actionEvent) {
    }

    public void onDividePress(ActionEvent actionEvent) {
    }

    public void onMultiplyPress(ActionEvent actionEvent) {
    }

    public void onAddPress(ActionEvent actionEvent) {
    }

    public void onEqualPress(ActionEvent actionEvent) {
    }

    public void onDeletePress(ActionEvent actionEvent) {
    }

    public void onExponentialPress(ActionEvent actionEvent) {
    }
}
