module ru.matdem.task11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.matdem.task11 to javafx.fxml;
    exports ru.matdem.task11;
}