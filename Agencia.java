package ExemploTesteCaixaEletronico;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
        private int numero;
        private int digito;
        private String nome;
        public Agencia(String nome, int numero) {
                setNumero(numero);
                this.nome = nome;
                this.digito = calculaDigito(numero);
        }
        public int getNumero() {
                return numero;
        }
        public void setNumero(int numero) {
                String testeNumero = String.valueOf(numero);
                if (testeNumero.length() > 4) {
                        JOptionPane.showMessageDialog(null, "O Número da agência é inválido! É permitido apenas 4 números.");
                        System.exit(0);
                } else if (numero < 0) {
                        JOptionPane.showMessageDialog(null, "O Número da agência é inválido! Apenas números positivos são permitidos.");
                        System.exit(0);
                }
                this.numero = numero;
                setDigito(calculaDigito(numero));
        }

        public int getDigito() {
                return digito;
        }

        public void setDigito(int digito) {
                this.digito = digito;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }
        private int calculaDigito(int numero) {
                String numeroString = String.valueOf(numero);
                List<Integer> numeros = new ArrayList<>();
                for (int i = 0; i < numeroString.length(); i++) {
                        numeros.add(Integer.parseInt(String.valueOf(numeroString.charAt(i))));
                }
                int calculo = numeros.get(0) * 4 + numeros.get(1) * 6 + numeros.get(2) * 8 + numeros.get(3) * 2;
                calculo = calculo % 11;

                if (calculo == 10) {
                        return 0;
                } else {
                        return calculo;
                }
        }
}


