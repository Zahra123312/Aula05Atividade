package ExemploTesteArCondicionado;
public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;
    public CondicionadorDeAr() {
        this.termostato = new Termostato();
        this.ligado = false;
    }
    public boolean isLigado() {
        return ligado;
    }
    public Termostato getTermostato() {
        return termostato;
    }
    public void ligar() {
        this.ligado = true;
        System.out.println("Condicionador de Ar ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Condicionador de Ar desligado.");
    }
    public void aumentarTemperatura() {
        if (ligado) {
            int tempAtual = termostato.getTemperatura();
            if (tempAtual < 28) {
                termostato.setTemperatura(tempAtual + 1);
                System.out.println("A Temperatura aumentada para: " + termostato.getTemperatura() + "°C");
            } else {
                System.out.println("Erro: A Temperatura máxima de 28°C atingida.");
            }
        } else {
            System.out.println("Erro: O condicionador de ar está desligado.");
        }
    }

    public void reduzirTemperatura() {
        if (ligado) {
            int tempAtual = termostato.getTemperatura();
            if (tempAtual > 15) {
                termostato.setTemperatura(tempAtual - 1);
                System.out.println("Temperatura reduzida para: " + termostato.getTemperatura() + "°C");
            } else {
                System.out.println("Erro: Temperatura mínima de 15°C atingida.");
            }
        } else {
            System.out.println("Erro: O condicionador de ar está desligado.");
        }
    }
    public void imprimirTemperatura() {
        if (ligado) {
            System.out.println("A Temperatura atual: " + termostato.getTemperatura() + "°C");
        } else {
            System.out.println("Erro: O condicionador de ar está desligado.");
        }
    }
}