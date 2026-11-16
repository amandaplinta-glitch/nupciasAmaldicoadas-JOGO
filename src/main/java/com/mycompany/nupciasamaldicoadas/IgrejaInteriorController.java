package com.mycompany.nupciasamaldicoadas;

import java.io.IOException;
import javafx.fxml.FXML;

public class IgrejaInteriorController {
    private int dia=0;
    
    @FXML
    private void passarDia() throws IOException {
        dia++;
        if(dia>3){
            System.out.println("Acabou o jogo já");
        }else{
            System.out.println("Dia: " + dia);
            cartas();
        }
    }
    
    private void cartas(){
        if(dia==1){
            imagem(1 Carta);
        }else if(dia==2){
            imagem(2 Carta);
        }else{
            imagem(3 Carta);
        }
    }
    
    @FXML
    private void mudarJardim() throws IOException {
        App.setRoot("igrejaJardim");
    }
    
    @FXML
    private void mudarFrente() throws IOException {
        App.setRoot("igrejaFrente");
    }
    
    @FXML
    private void prepararCasamento() throws IOException {
        App.setRoot("carta");
    }
}
