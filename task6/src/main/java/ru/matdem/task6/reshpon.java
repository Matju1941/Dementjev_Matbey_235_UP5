package ru.matdem.task6;

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
    private Button btnres;

    @FXML
    private TextField kfield;

    @FXML
    private Label reslab;

    @FXML
    void ButtonOnACtion(ActionEvent event) {
        int n = Integer.parseInt(afield.getText().toString());
        int k = Integer.parseInt(kfield.getText().toString());
        double a=0;
        for (int r=1;r<=n;r++){
            a=a+pow(r,k);
        }
        reslab.setText(""+a);
    }

}
