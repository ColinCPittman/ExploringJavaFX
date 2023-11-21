package com.example.exploringjavafx;

import java.math.BigDecimal;

public class CalculationList {
    class Node {
        @Override
        public String toString() {
            return calculation;
        }

        public Node(String calculation) {
            this.calculation = calculation;
        }

        String calculation;

        public String getCalculation() {
            return calculation;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public Node getPreviousNode() {
            return previousNode;
        }

        Node nextNode;
        Node previousNode;

    }
    public String getLastCalculation() {
        if(head == null) return "0";
        Node current = head;
        while (current.nextNode != null){
            current = current.nextNode;
        }
        return current.calculation;
    }
     Node head;
     public void addCalculation(BigDecimal first, BigDecimal second, Calculator.Operator operator, String calculation) {
         String result = first.toPlainString() + " " + operator.getSymbol() + " " + second.toPlainString() + " = " + calculation;
         if (head == null) {
             head = new Node(result);
         } else {
             Node current = head;
             while (current.nextNode != null) {
                 current = current.nextNode; // Advance to the next node
             }
             // Now current is the last node
             current.nextNode = new Node(result);
             current.nextNode.previousNode = current;
         }
     }
}
