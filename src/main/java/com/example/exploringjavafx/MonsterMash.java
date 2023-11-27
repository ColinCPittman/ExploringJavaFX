package com.example.exploringjavafx;

import javafx.scene.control.Label;

public class MonsterMash {
    class Monster implements Runnable{
        int x_coordinate;
        int y_coordinate;
        Label label;

        public Monster(int x_coordinate, int y_coordinate, Label label) {
            this.x_coordinate = (int) (Math.random()*10);
            this.y_coordinate = (int) (Math.random()*10);
            label.setText("M");
        }

        @Override
        public void run() {
            switch ((int)(Math.random()*4)) {
                case 0: x_coordinate = Math.min(x_coordinate + 1, 9);
                    break;
                case 1: x_coordinate = Math.max(x_coordinate - 1,0);
                    break;
                case 2: y_coordinate = Math.min(y_coordinate + 1,9);
                    break;
                case 3: y_coordinate = Math.max(y_coordinate - 1,0);
                    break;
            }
        }
    }
}
