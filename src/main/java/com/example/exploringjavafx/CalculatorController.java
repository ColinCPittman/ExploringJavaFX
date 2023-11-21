package com.example.exploringjavafx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable, HistoryListener {
    @Override
    public void onCalculationUpdate(String calculation) {
        updateHistory(calculation);
    }

    Calculator calc = new Calculator();
    boolean showingResult = false;
    @FXML
    private ListView<String> history;
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
    @FXML
    private Button add;
    @FXML
    private Button divide;
    @FXML
    private Button multiply;
    @FXML
    private Button subtract;
    @FXML
    private Button exponential;
    @FXML
    private Button equal;
    @FXML
    private Button dot;
    @FXML
    private Button sign;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        calc.setHistoryListener(this);
        int calcDisplayMaxLength = 19;
        calcDisplay.textProperty().addListener(((observable, oldValue, newValue) -> {
            if (newValue.length() >= calcDisplayMaxLength) {
                setDisableNumbers(true);
            } else {
                setDisableNumbers(false);
            }

        }));
    }
    public void updateHistory(String calculation) {
        Platform.runLater(() -> history.getItems().add(0,calculation));
    }
    private void setDisableNumbers(boolean value) {
        one.setDisable(value);
        two.setDisable(value);
        three.setDisable(value);
        four.setDisable(value);
        five.setDisable(value);
        six.setDisable(value);
        eight.setDisable(value);
        nine.setDisable(value);
        zero.setDisable(value);
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
        if(calcDisplay.getText().contains("Error")) {
            setDisableOperators(false);
        }
        if (showingResult) {
            calcDisplay.setText("0");
            showingResult = false;
            calc.lastOperand = BigDecimal.ZERO;
        }
        else if (!calcDisplay.getText().equals("0")) {
            calcDisplay.setText(calcDisplay.getText() + "0");
        } else if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("0");
            calc.storedFirst = BigDecimal.ZERO;
            setDisableOperators(false);
        }
    }

    public void onOnePress(ActionEvent actionEvent) {
        if(calcDisplay.getText().contains("Error")) {
            setDisableOperators(false);

        }        if (showingResult) {
            calcDisplay.setText("1");
            showingResult = false;
            calc.lastOperand = BigDecimal.ZERO;
        }
        else if (calcDisplay.getText().equals("0")) {
            calcDisplay.setText("1");
        } else if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("1");
            calc.storedFirst = BigDecimal.ZERO;
            setDisableOperators(false);
        } else {
            calcDisplay.setText(calcDisplay.getText() + "1");
        }
    }

    public void onTwoPress(ActionEvent actionEvent) {
        if(calcDisplay.getText().contains("Error")) {
            setDisableOperators(false);

        }        if (showingResult) {
            calcDisplay.setText("2");
            showingResult = false;
            calc.lastOperand = BigDecimal.ZERO;
        }
        else if (calcDisplay.getText().equals("0")) {
            calcDisplay.setText("2");
        } else if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("2");
            calc.storedFirst = BigDecimal.ZERO;
            setDisableOperators(false);
        } else {
            calcDisplay.setText(calcDisplay.getText() + "2");
        }
    }

    public void onThreePress(ActionEvent actionEvent) {
        if(calcDisplay.getText().contains("Error")) {
            setDisableOperators(false);

        }        if (showingResult) {
            calcDisplay.setText("3");
            showingResult = false;
            calc.lastOperand = BigDecimal.ZERO;
        }
        else if (calcDisplay.getText().equals("0")) {
            calcDisplay.setText("3");
        } else if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("3");
            calc.storedFirst = BigDecimal.ZERO;
            setDisableOperators(false);
        } else {
            calcDisplay.setText(calcDisplay.getText() + "3");
        }
    }

    public void onFourPress(ActionEvent actionEvent) {
        if(calcDisplay.getText().contains("Error")) {
            setDisableOperators(false);

        }        if (showingResult) {
            calcDisplay.setText("4");
            showingResult = false;
            calc.lastOperand = BigDecimal.ZERO;
        }
        else if (calcDisplay.getText().equals("0")) {
            calcDisplay.setText("4");
        } else if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("4");
            calc.storedFirst = BigDecimal.ZERO;
            setDisableOperators(false);
        } else {
            calcDisplay.setText(calcDisplay.getText() + "4");
        }
    }

    public void onFivePress(ActionEvent actionEvent) {
        if(calcDisplay.getText().contains("Error")) {
            setDisableOperators(false);

        }        if (showingResult) {
            calcDisplay.setText("5");
            showingResult = false;
            calc.lastOperand = BigDecimal.ZERO;
        }
        else if (calcDisplay.getText().equals("0")) {
            calcDisplay.setText("5");
        } else if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("5");
            calc.storedFirst = BigDecimal.ZERO;
            setDisableOperators(false);
        } else {
            calcDisplay.setText(calcDisplay.getText() + "5");
        }
    }

    public void onSixPress(ActionEvent actionEvent) {
        if(calcDisplay.getText().contains("Error")) {
            setDisableOperators(false);

        }        if (showingResult) {
            calcDisplay.setText("6");
            showingResult = false;
            calc.lastOperand = BigDecimal.ZERO;
        }
        else if (calcDisplay.getText().equals("0")) {
            calcDisplay.setText("6");
        } else if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("6");
            calc.storedFirst = BigDecimal.ZERO;
            setDisableOperators(false);
        } else {
            calcDisplay.setText(calcDisplay.getText() + "6");
        }
    }

    public void onSevenPress(ActionEvent actionEvent) {
        if(calcDisplay.getText().contains("Error")) {
            setDisableOperators(false);

        }        if (showingResult) {
            calcDisplay.setText("7");
            showingResult = false;
            calc.lastOperand = BigDecimal.ZERO;
        }
        else if (calcDisplay.getText().equals("0")) {
            calcDisplay.setText("7");
        } else if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("7");
            calc.storedFirst = BigDecimal.ZERO;
            setDisableOperators(false);
        } else {
            calcDisplay.setText(calcDisplay.getText() + "7");
        }
    }

    public void onEightPress(ActionEvent actionEvent) {
        if(calcDisplay.getText().contains("Error")) {
            setDisableOperators(false);

        }        if (showingResult) {
            calcDisplay.setText("8");
            showingResult = false;
            calc.lastOperand = BigDecimal.ZERO;
        }
        else if (calcDisplay.getText().equals("0")) {
            calcDisplay.setText("8");
        } else if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("8");
            calc.storedFirst = BigDecimal.ZERO;
            setDisableOperators(false);
        } else {
            calcDisplay.setText(calcDisplay.getText() + "8");
        }
    }

    public void onNinePress(ActionEvent actionEvent) {
        if(calcDisplay.getText().contains("Error")) {
            setDisableOperators(false);

        }        if (showingResult) {
            calcDisplay.setText("9");
            showingResult = false;
            calc.lastOperand = BigDecimal.ZERO;
        }
        else if (calcDisplay.getText().equals("0")) {
            calcDisplay.setText("9");
        } else if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("9");
            calc.storedFirst = BigDecimal.ZERO;
            setDisableOperators(false);
        } else {
            calcDisplay.setText(calcDisplay.getText() + "9");
        }
    }


    public void onDotPress(ActionEvent actionEvent) {
        if(showingResult) {
           showingResult = false;
           calcDisplay.setText("0.");
        }
        if (!calcDisplay.getText().contains(".")) {
            calcDisplay.setText(calcDisplay.getText() + ".");
        }
    }

    public void onSignPress(ActionEvent actionEvent) {
        if (calcDisplay.getText().equals("0") || showingResult) return;
        if (calcDisplay.getText().charAt(0) != '-') {
            calcDisplay.setText("-" + calcDisplay.getText());
        } else if (calcDisplay.getText().charAt(0) == '-') {
            calcDisplay.setText(calcDisplay.getText().substring(1));
        }
    }

    public void onDividePress(ActionEvent actionEvent) {
        if (!showingResult) {
            calc.setStoredFirst(calcDisplay.getText());
        }
        calc.setOperator(Calculator.Operator.DIVISION);
        calc.setStoredFirst(calcDisplay.getText());
        calcDisplay.setText("0");
        showingResult = false;
    }

    public void onSubtractPress(ActionEvent actionEvent) {
        if (!showingResult) {
            calc.setStoredFirst(calcDisplay.getText());
        }
        calc.setOperator(Calculator.Operator.SUBTRACTION);
        calc.setStoredFirst(calcDisplay.getText());
        calcDisplay.setText("0");
        showingResult = false;
    }

    public void onMultiplyPress(ActionEvent actionEvent) {
        if (!showingResult) {
            calc.setStoredFirst(calcDisplay.getText());
        }
        calc.setOperator(Calculator.Operator.MULTIPLICATION);
        calc.setStoredFirst(calcDisplay.getText());
        calcDisplay.setText("0");
        showingResult = false;
    }

    public void onAddPress(ActionEvent actionEvent) {
        if (!showingResult) {
            calc.setStoredFirst(calcDisplay.getText());
        }
        calc.setOperator(Calculator.Operator.ADDITION);
        calc.setStoredFirst(calcDisplay.getText());
        calcDisplay.setText("0");
        showingResult = false;
    }
    public void onExponentialPress(ActionEvent actionEvent) {
        if (!showingResult) {
            calc.setStoredFirst(calcDisplay.getText());
        }
        calc.setOperator(Calculator.Operator.EXPONENTIAL);
        calc.setStoredFirst(calcDisplay.getText());
        calcDisplay.setText("0");
        showingResult = false;
    }
    public void onEqualPress(ActionEvent actionEvent) {
        String result = calc.calculate(calcDisplay.getText());
        calcDisplay.setText(result);
        showingResult = true;
        if (calcDisplay.getText().contains("Error")) {
            setDisableOperators(true);
        }
    }

    private void setDisableOperators(boolean value) {
        add.setDisable(value);
        subtract.setDisable(value);
        divide.setDisable(value);
        multiply.setDisable(value);
        exponential.setDisable(value);
        equal.setDisable(value);
        dot.setDisable(value);
        sign.setDisable(value);
    }

    public void onDeletePress(ActionEvent actionEvent) {
        if (showingResult) {
            calcDisplay.setText("0");
            showingResult = false;
        }
        if (calcDisplay.getText().contains("Error")) {
            calcDisplay.setText("0");
        }
        if (!calcDisplay.getText().equals("0")) {
            if (calcDisplay.getText().length() == 1) {
                calcDisplay.setText("0");
            } else {
                calcDisplay.setText(calcDisplay.getText().substring(0, calcDisplay.getText().length() - 1));
            }
        }
    }




    public void onClearPress(ActionEvent actionEvent) {
        calcDisplay.setText("0");
        showingResult = false;
        calc.storedFirst = BigDecimal.ZERO;
        calc.storedSecond = BigDecimal.ZERO;
        calc.lastOperand = BigDecimal.ZERO;
    }
}
