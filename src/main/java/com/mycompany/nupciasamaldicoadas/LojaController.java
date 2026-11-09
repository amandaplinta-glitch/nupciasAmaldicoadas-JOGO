package com.mycompany.nupciasamaldicoadas;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author User
 */
public class LojaController {
    
     @FXML
    private void irCenario() throws IOException {
        App.setRoot("Cenario");
    }
    
     @FXML
    private void irArma() throws IOException {
        App.setRoot("Arma");
    }
    
    @FXML
    private void mudarFrente() throws IOException {
        App.setRoot("igrejaFrente");
    }
}
