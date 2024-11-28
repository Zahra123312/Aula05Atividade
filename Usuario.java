package ExemploTesteArCondicionado;
public class Usuario {
    public static void main(String[] args) {
        CondicionadorDeAr condicionador = new CondicionadorDeAr();
        condicionador.ligar();

        for (int i = 0; i < 10; i++) {
            condicionador.aumentarTemperatura();
        }
        for (int i = 0; i < 20; i++) {
            condicionador.reduzirTemperatura();
        }
        while (condicionador.getTermostato().getTemperatura() < 25) {
            condicionador.aumentarTemperatura();
        }
        condicionador.imprimirTemperatura();
    }
}