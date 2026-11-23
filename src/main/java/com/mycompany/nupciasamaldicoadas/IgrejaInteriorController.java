package com.mycompany.nupciasamaldicoadas;

import java.io.IOException;
import javafx.fxml.FXML;

public class IgrejaInteriorController {

    @FXML
    private void mudarJardim() throws IOException {
        App.setRoot("igrejaJardim");
    }
    
    @FXML
    private void mudarFrente() throws IOException {
        App.setRoot("igrejaFrente");
    }
   
    @FXML
    private void irLoja() throws IOException {
        App.cenarioAnterior = "igrejaInterior"; // Salva que está no interior
        App.setRoot("loja");
    }
}
