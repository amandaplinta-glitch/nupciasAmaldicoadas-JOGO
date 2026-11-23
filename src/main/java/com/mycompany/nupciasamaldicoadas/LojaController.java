package com.mycompany.nupciasamaldicoadas;

import java.io.IOException;
import javafx.fxml.FXML;

public class LojaController {
    
    @FXML
    private void irCenario() throws IOException {
        App.setRoot("cenario");
    }
    
    @FXML
    private void irArma() throws IOException {
        App.setRoot("arma");
    }
    
    @FXML
    private void voltarCenario() throws IOException {
        // Volta exatamente para o cenário que foi salvo antes de entrar aqui
        App.setRoot(App.cenarioAnterior);
    }
}