package com.mycompany.nupciasamaldicoadas;

import java.io.IOException;
import javafx.fxml.FXML;

public class IgrejaFrenteController {

    @FXML
    private void mudarInterior() throws IOException {
        App.setRoot("igrejaInterior");
    }
    
        
    @FXML
    private void irLoja() throws IOException {
         App.cenarioAnterior = "igrejaFrente"; // Salva que está na frente
         App.setRoot("loja");
    }
}