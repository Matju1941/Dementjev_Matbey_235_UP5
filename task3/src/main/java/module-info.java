module ru.matdem.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.matdem.task3 to javafx.fxml;
    exports ru.matdem.task3;
}