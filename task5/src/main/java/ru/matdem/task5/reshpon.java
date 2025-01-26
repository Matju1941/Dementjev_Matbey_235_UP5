package ru.matdem.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class reshpon {

    @FXML
    private TextField afield;

    @FXML
    private Button btnres;

    @FXML
    private Label reslab;

    @FXML
    void ButtonOnACtion(ActionEvent event) {
        int n = Integer.parseInt(afield.getText().toString());
        double a = 1;
        double b = 1;
        double un;
        double S=0;
        for (int k = 1; k <= n; k++) {
            b=b*(2*pow(a,2)+b);
            a=a*((double) 1 /2*(sqrt(b)+(double) 1/2*sqrt(a)));
            un = a * b;
            S=S+un;
        }
        reslab.setText(""+S);
    }

}
