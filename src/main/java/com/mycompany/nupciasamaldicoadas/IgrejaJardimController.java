package com.mycompany.nupciasamaldicoadas;

import java.io.IOException;
import javafx.fxml.FXML;

public class IgrejaJardimController {

    @FXML
    private void mudarInterior() throws IOException {
        App.setRoot("igrejaInterior");
    }
}
