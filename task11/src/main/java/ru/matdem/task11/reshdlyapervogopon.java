package ru.matdem.task11;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class reshdlyapervogopon {

    @FXML
    private ListView<Integer> Listik;

    @FXML
    private Label answerlabel;

    @FXML
    private Button bntAdd;

    @FXML
    private Button btncancel;

    @FXML
    private Button btnok;

    @FXML
    private TextField atextfield;

    @FXML
    void OKButtonOnAction(ActionEvent event) {
        List<Integer> data = Listik.getItems();
        int n = data.get(0);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int m= data.get(i);
            if (m < 100) {
                if (m % 7 == 0 && m % 10 == 2)
                    sum = sum + m;
            } else if (m < 1000 && m > 100) {
                if (m % 7 == 0 && m % 100 == 2)
                    sum = sum + m;
            } else if (m > 1000 && m < 10000) {
                if (m % 7 == 0 && m % 1000 == 2)
                    sum = sum + m;
            } else if (m > 10000 & m <= 30000)
                if (m % 7 == 0 && m % 10000 == 2)
                    sum = sum + m;

        }
        if (sum != 0)
            answerlabel.setText(String.valueOf(sum));
        else answerlabel.setText("Чисел кратным 7 и оканчивающимися на 2 нет");

    }

    @FXML
    void ButtonAddOnAction(ActionEvent event) {
        if (atextfield.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(atextfield.getText().toString());
            Listik.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            atextfield.setText("");
        }
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

}
