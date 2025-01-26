module ru.matdem.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.matdem.task5 to javafx.fxml;
    exports ru.matdem.task5;
}