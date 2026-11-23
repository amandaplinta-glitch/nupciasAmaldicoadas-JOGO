package com.mycompany.nupciasamaldicoadas;

import java.io.IOException;
import javafx.fxml.FXML;

public class IgrejaInteriorController {
    private int dia=0;
    
    @FXML
    private void prepararCasamento() throws IOException {
        dia++;
        if(dia>3){
            dia=1;
            
        }
        else{
            System.out.println("Dia: " + dia);
            if(dia==1){
                App.setRoot("casamento");
                //imagem(1 Carta);
            }else if(dia==2){
        App.setRoot("casamento");
                //imagem(2 Carta);
            }else{
        App.setRoot("casamento");
                //imagem(3 Carta);
            }
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
}
