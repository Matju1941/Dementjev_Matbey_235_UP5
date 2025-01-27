module ru.matdem.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.matdem.task2 to javafx.fxml;
    exports ru.matdem.task2;
}