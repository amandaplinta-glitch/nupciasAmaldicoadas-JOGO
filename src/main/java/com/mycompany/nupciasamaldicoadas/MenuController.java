package com.mycompany.nupciasamaldicoadas;

import java.io.IOException;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private void comecarJogo() throws IOException {
        App.setRoot("igrejaFrente");
    }
    @FXML
    private void ranking() throws IOException {
        App.setRoot("ranking");
    }
    @FXML
    private void creditos() throws IOException {
        App.setRoot("creditos");
    }
    @FXML
    private void encerrar() throws IOException {
        App.setRoot("igrejaFrente");
    }
}
