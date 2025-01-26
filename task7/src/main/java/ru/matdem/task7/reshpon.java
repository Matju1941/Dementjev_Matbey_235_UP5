package ru.matdem.task7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class reshpon {

    @FXML
    private Label RESLABA;

    @FXML
    private Label RESLABB;

    @FXML
    private Label RESLABC;

    @FXML
    private Label RESLABD;

    @FXML
    private Label RESLABE;

    @FXML
    private Label RESLABG;

    @FXML
    private TextField afield;

    @FXML
    private Button btnres;

    @FXML
    void ButtonOnACtion(ActionEvent event) {
        double inf = Double.POSITIVE_INFINITY;
        double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int i = 1; i <= 5; i++) {
            a = a + 1 / pow(i, 2);
            double fac = 1;
            fac = fac * i;
            b = b + 1 / i * (i + 1);
            d = d + pow(-1, i + 1) / i * (i + 1) * (i + 2);
            c = c + pow(-1, i) / fac;
        }
        RESLABA.setText("Результат бесконечной прогрессии=" + a);
        RESLABB.setText("Результат бесконечной прогрессии=" + b);
        RESLABC.setText("Результат бесконечной прогрессии=" + c);
        RESLABD.setText("Результат бесконечной прогрессии=" + d);
        for (int i = 0; i <= 5; i++) {
            double fac = 1;
            fac = fac * i;
            e = e + pow(-2, i) / fac;
            f = f + 1 / pow(4, i) + pow(5, i + 2);
        }
        RESLABE.setText("Результат бесконечной прогрессии=" + e);
        RESLABG.setText("Результат бесконечной прогрессии=" + f);

    }

}
