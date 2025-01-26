module ru.matdem.task7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.matdem.task7 to javafx.fxml;
    exports ru.matdem.task7;
}