module ru.matdem.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.matdem.task4 to javafx.fxml;
    exports ru.matdem.task4;
}