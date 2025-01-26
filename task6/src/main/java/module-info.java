module ru.matdem.task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.matdem.task6 to javafx.fxml;
    exports ru.matdem.task6;
}