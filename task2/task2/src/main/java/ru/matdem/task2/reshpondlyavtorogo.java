package ru.matdem.task2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class reshpondlyavtorogo {

    @FXML
    private Button Okbutton;

    @FXML
    private Button addbutton;

    @FXML
    private Button cancelbtn;

    @FXML
    private Label reslabel;

    @FXML
    private ListView<Integer> textdatapon;

    @FXML
    private TextField tfield;

    @FXML
    void CancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void OkbuttonOnAction(ActionEvent event) {
        List<Integer> data = textdatapon.getItems();
        int n = data.get(0);
        int sum = 0;
        int m;
        for (int i = 1; i <= n; i++) {
            m = i;
            if (m % 6 == 0 && m % 10 == 4) {
                sum += m;
            } else if (m < 1000 && m > 100) {
                if (m % 6 == 0 && m % 100 == 4) {
                    sum += m;
                }

            } else if (m > 1000 && m < 10000) {
                if (m % 6 == 0 && m % 1000 == 4) {
                    sum += m;
                }

            } else if (m > 10000 && m <= 30000) {
                if (m % 6 == 0 && m % 10000 == 4) {
                    sum += m;
                }
            }
        }
        if (sum != 0)
            reslabel.setText(String.valueOf(sum));
        else reslabel.setText("Чисел кратным 6 и оканчивающимися на 4 нет");

    }

    @FXML
    void addbtnOnAction(ActionEvent event) {
        if (tfield.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(tfield.getText().toString());
            textdatapon.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            tfield.setText("");
        }
    }

}
