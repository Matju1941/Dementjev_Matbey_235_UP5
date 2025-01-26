package ru.matdem.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class reshpon {

    @FXML
    private TextField afield;

    @FXML
    private TextField bfield;

    @FXML
    private Button btnres;

    @FXML
    private Label reslab;

    @FXML
    void ButtonOnACtion(ActionEvent event) {

        int a = Integer.parseInt(afield.getText().toString());
        int b = Integer.parseInt(bfield.getText().toString());
        double sumofa = 0;


        for (a = Integer.parseInt(afield.getText().toString()); a <= b; a++) {
            sumofa = sumofa + pow(a, 2);
        }
        reslab.setText("" + sumofa);
    }

}
