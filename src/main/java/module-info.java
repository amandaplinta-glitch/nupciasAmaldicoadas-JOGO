module com.mycompany.nupciasamaldicoadas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.nupciasamaldicoadas to javafx.fxml;
    exports com.mycompany.nupciasamaldicoadas;
}
