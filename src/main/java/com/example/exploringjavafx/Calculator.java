package com.example.exploringjavafx;

import static java.lang.Double.NaN;

public class Calculator {
    public enum Operator {
        ADDITION("+"),
        SUBTRACTION("-"),
        MULTIPLICATION("*"),
        DIVISION("/");

        private final String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }
    }
    private Operator operator;
    public void setOperator(Operator operator){
    this.operator = operator;
    }

    public Double add(String num) {
        try{
        double number = Double.parseDouble(num);
        }catch(NumberFormatException e) {
            return NaN;
        }

}
