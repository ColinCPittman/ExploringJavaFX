package com.example.exploringjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {
    @FXML
    private Label calcDisplay;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    int calcDisplayMaxLength = 19;
    calcDisplay.textProperty().addListener(((observable, oldValue, newValue) -> {
        if(newValue.length() >= calcDisplayMaxLength) {
            one.setDisable(true);
            two.setDisable(true);
            three.setDisable(true);
            four.setDisable(true);
            five.setDisable(true);
            six.setDisable(true);
            eight.setDisable(true);
            nine.setDisable(true);
            zero.setDisable(true);
        }
        else {
            one.setDisable(false);
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            eight.setDisable(false);
            nine.setDisable(false);
            zero.setDisable(false);
        }
    }));
    }

    @FXML
    protected void onExitPress(ActionEvent event) {
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

    public void onZeroPress(ActionEvent actionEvent) {
        if (!calcDisplay.getText().equals("0")) {
            calcDisplay.setText(calcDisplay.getText() + "0");
        }
    }

    public void onTwoPress(ActionEvent actionEvent) {
    if(calcDisplay.getText().equals("0")) {
       calcDisplay.setText("2");
    }
    else {
        calcDisplay.setText(calcDisplay.getText() + "2");
    }
    }

    public void onSevenPress(ActionEvent actionEvent) {
    if(calcDisplay.getText().equals("0")) {
       calcDisplay.setText("7");
    }
    else {
        calcDisplay.setText(calcDisplay.getText() + "7");
    }
    }

    public void onFourPress(ActionEvent actionEvent) {
    if(calcDisplay.getText().equals("0")) {
       calcDisplay.setText("4");
    }
    else {
        calcDisplay.setText(calcDisplay.getText() + "4");
    }
    }

    public void onOnePress(ActionEvent actionEvent) {
    if(calcDisplay.getText().equals("0")) {
       calcDisplay.setText("1");
    }
    else {
        calcDisplay.setText(calcDisplay.getText() + "1");
    }
    }

    public void onSubtractPress(ActionEvent actionEvent) {
    }

    public void onEightPress(ActionEvent actionEvent) {
    if(calcDisplay.getText().equals("0")) {
       calcDisplay.setText("8");
    }
    else {
        calcDisplay.setText(calcDisplay.getText() + "8");
    }
    }

    public void onNinePress(ActionEvent actionEvent) {
    if(calcDisplay.getText().equals("0")) {
       calcDisplay.setText("9");
    }
    else {
        calcDisplay.setText(calcDisplay.getText() + "9");
    }
    }

    public void onFivePress(ActionEvent actionEvent) {
    if(calcDisplay.getText().equals("0")) {
       calcDisplay.setText("5");
    }
    else {
        calcDisplay.setText(calcDisplay.getText() + "5");
    }
    }

    public void onSixPress(ActionEvent actionEvent) {
    if(calcDisplay.getText().equals("0")) {
       calcDisplay.setText("6");
    }
    else {
        calcDisplay.setText(calcDisplay.getText() + "6");
    }
    }

    public void onThreePress(ActionEvent actionEvent) {
    if(calcDisplay.getText().equals("0")) {
       calcDisplay.setText("3");
    }
    else {
        calcDisplay.setText(calcDisplay.getText() + "3");
    }
    }

    public void onDotPress(ActionEvent actionEvent) {
        if(!calcDisplay.getText().contains(".")){
            calcDisplay.setText(calcDisplay.getText()+".");
        }
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
        if(!calcDisplay.getText().equals("0")){
            if(calcDisplay.getText().length() == 1){
                calcDisplay.setText("0");
            }
            else {
                calcDisplay.setText(calcDisplay.getText().substring(0,calcDisplay.getText().length() - 1));
            }
        }
    }

    public void onExponentialPress(ActionEvent actionEvent) {
    }

    public void onClearPress(ActionEvent actionEvent) {
        calcDisplay.setText("0");
    }
}
