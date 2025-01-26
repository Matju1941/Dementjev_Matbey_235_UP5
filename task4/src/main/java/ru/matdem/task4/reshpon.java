package ru.matdem.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class reshpon {

    @FXML
    private TextField afield;

    @FXML
    private Button btnres;

    @FXML
    private Label reslab;

    @FXML
    void ButtonOnACtion(ActionEvent event) {
        int a = Integer.parseInt(afield.getText().toString());
        double un = 0;
        double c = 1;
        if (a < 0) reslab.setText("От нуля до N");
        else {
            for (int b = 1; b <= a; b++) {
                c = c * b;
                un = un + c;
            }

        }
        reslab.setText("" + un);
    }

}
