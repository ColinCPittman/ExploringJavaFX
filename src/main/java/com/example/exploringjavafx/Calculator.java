package com.example.exploringjavafx;

import java.math.BigDecimal;

//
//INVESTIGATE 9 * 5 = / 2 NOT RETURNING THE RESULT OF 45/2
//
//ALSO IMPLEMENT KEYBOARD SUPPORT
//

public class Calculator {
    private HistoryListener listener;
    CalculationList history = new CalculationList();
    public enum Operator {
        ADDITION("+"),
        SUBTRACTION("-"),
        MULTIPLICATION("X"),
        DIVISION("/"),
        EXPONENTIAL("^");

        private final String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }
        public String getSymbol() {
            return symbol;
        }
    }
    public void setHistoryListener(HistoryListener listener) {
        this.listener = listener;
    }
    public Calculator() {
        this.storedFirst = BigDecimal.ZERO;
        this.storedSecond = BigDecimal.ZERO;
        this.lastOperand = BigDecimal.ZERO;
    }

    BigDecimal storedFirst;
    BigDecimal storedSecond;
    BigDecimal lastOperand;
    private Operator operator;
    public void setStoredFirst(String number) {
        if(!number.contains("Error")) {
            storedFirst = new BigDecimal(number);
        } else {
            storedFirst = BigDecimal.ZERO;
        }
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    public String calculate(String number) {
        if (operator != null) {
            if (lastOperand.compareTo(BigDecimal.ZERO) != 0) {
                storedSecond = lastOperand;
            } else if (number != null) {
                storedSecond = new BigDecimal(number);
                lastOperand = storedSecond;
            }
        }
        BigDecimal result = BigDecimal.ZERO;

        try {
            switch (operator) {
                case ADDITION -> {
                    result = storedFirst.add(storedSecond);
                }
                case SUBTRACTION -> {
                    result = storedFirst.subtract(storedSecond);
                }
                case MULTIPLICATION -> {
                    result = storedFirst.multiply(storedSecond);
                }
                case DIVISION -> {
                    if (storedSecond.compareTo(BigDecimal.ZERO) != 0) {
                        result = storedFirst.divide(storedSecond, 10, BigDecimal.ROUND_HALF_UP);
                    } else {
                        return "Error: Div by zero";
                    }
                }
                case EXPONENTIAL -> {
                    result = storedFirst.pow(storedSecond.intValue());
                }
            }
            BigDecimal first = storedFirst;
            storedFirst = result;
            history.addCalculation(first,storedSecond,operator,result.stripTrailingZeros().toPlainString());
            if(listener != null) {
                listener.onCalculationUpdate(history.getLastCalculation());
            }
            return result.stripTrailingZeros().toPlainString();
        } catch (ArithmeticException e) {
            return "Error: Arithmetic Exception";
        }
    }


}
