package com.example.exploringjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class TextEditorController {
    File selectedFile;
    @FXML
    protected TextArea textArea;
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
    @FXML
    public void onOpenFilePress(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files (*.txt)", "*.txt"));

        selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            try {
                String contents = fetchContents(selectedFile);
                textArea.setText(contents);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String fetchContents(File file) throws IOException {
        List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        return String.join("\n", lines);
    }

    public void onSaveFilePress(ActionEvent actionEvent) {
        if(selectedFile != null) {
            try{
                FileWriter writer = new FileWriter(selectedFile);
                writer.write(textArea.getText());
                writer.close();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
