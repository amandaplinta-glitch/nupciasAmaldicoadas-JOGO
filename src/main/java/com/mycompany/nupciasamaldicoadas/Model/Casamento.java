package com.mycompany.nupciasamaldicoadas.Model;

public class Casamento {
    private int numeroDia;
    private String nomeNoivos;
    private String cartaDescricao;
    
    // Índices das opções corretas (0, 1 ou 2)
    private int opcaoCertaInterior;
    private int opcaoMedianaInterior;
    
    private int opcaoCertaFundos;
    private int opcaoMedianaFundos;

    public Casamento(int numeroDia, String nomeNoivos, String cartaDescricao, 
                     int opcaoCertaInterior, int opcaoMedianaInterior, 
                     int opcaoCertaFundos, int opcaoMedianaFundos) {
        this.numeroDia = numeroDia;
        this.nomeNoivos = nomeNoivos;
        this.cartaDescricao = cartaDescricao;
        this.opcaoCertaInterior = opcaoCertaInterior;
        this.opcaoMedianaInterior = opcaoMedianaInterior;
        this.opcaoCertaFundos = opcaoCertaFundos;
        this.opcaoMedianaFundos = opcaoMedianaFundos;
    }

    // Calcula a porcentagem de acerto de uma área (100%, 70% ou 20%)
    public int calcularAcertoArea(int escolhaJogador, boolean isInterior) {
        int certa = isInterior ? opcaoCertaInterior : opcaoCertaFundos;
        int mediana = isInterior ? opcaoMedianaInterior : opcaoMedianaFundos;

        if (escolhaJogador == certa) {
            return 100;
        } else if (escolhaJogador == mediana) {
            return 70;
        } else {
            return 20;
        }
    }

    // Calcula o pagamento final baseado nas regras do seu PDF[cite: 6]
    public double calcularPagamento(int escolhaInterior, int escolhaFundos, boolean usouCenarioLoja, int nivelCarisma) {
        int acertoInt = calcularAcertoArea(escolhaInterior, true);
        int acertoFun = calcularAcertoArea(escolhaFundos, false);
        
        double pagamento = 0;

        // Regra do PDF: Todas (100% nas duas) = 300; Metade = 200; Nenhuma = -100[cite: 6]
        if (acertoInt == 100 && acertoFun == 100) {
            pagamento = 300.0;
        } else if (acertoInt >= 70 || acertoFun >= 70) {
            pagamento = 200.0;
        } else {
            pagamento = -100.0;
        }

        // Regra do PDF: Buff de +50 reais se usar cenário comprado na loja corretamente[cite: 6]
        if (usouCenarioLoja && pagamento > 0) {
            pagamento += 50.0;
        }

        // Bônus do Upgrade de Carisma (ex: +50 por nível)
        if (pagamento > 0) {
            pagamento += (nivelCarisma * 50.0);
        }

        return pagamento;
    }

    // Getters
    public String getNomeNoivos() { return nomeNoivos; }
    public String getCartaDescricao() { return cartaDescricao; }
    public int getNumeroDia() { return numeroDia; }
}
