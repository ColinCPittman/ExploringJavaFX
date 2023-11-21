package com.example.exploringjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TextEditorController {
    @FXML
    public void onExitPress(ActionEvent event) {
        try {
            Parent homeSceneRoot = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Scene homeScene = new Scene(homeSceneRoot);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(homeScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
