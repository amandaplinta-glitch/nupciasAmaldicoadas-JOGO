package com.mycompany.nupciasamaldicoadas;

import java.io.IOException;
import javafx.fxml.FXML;

public class IgrejaJardimController {

    @FXML
    private void mudarInterior() throws IOException {
        App.setRoot("igrejaInterior");
    }
    
     @FXML
    private void irLoja() throws IOException {
        App.cenarioAnterior = "igrejaJardim"; // Salva que está no Jardim
        App.setRoot("loja");
    }
}
