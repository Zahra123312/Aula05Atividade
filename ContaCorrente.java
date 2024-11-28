package ExemploTesteCaixaEletronico;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;
    public ContaCorrente(int numero, Agencia agencia, double saldo) {
        setNumero(numero);
        this.agencia = agencia;
        this.saldo = saldo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        String testeNumero = String.valueOf(numero);
        if (testeNumero.length() > 4) {
            JOptionPane.showMessageDialog(null, "O Número é inválido! É permitido apenas 4 números.");
            System.exit(0);
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Número é inválido! É permitido apenas números positivos ");
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
    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        saldo += valor;
        JOptionPane.showMessageDialog(null, "O Depósito de R$ " + valor + " realizado com sucesso!");
    }

    public double sacar(double valor) {
        if (valor > saldo) {
            JOptionPane.showMessageDialog(null, "Saque não efetuado. Saldo insuficiente.");
            return 0;
        } else {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque de R$ " + valor + " realizado com sucesso!");
            return valor;
        }
    }
    public double consultarSaldo() {
        return saldo;
    }

    public void imprimirSaldo() {
        JOptionPane.showMessageDialog(null, "Conta Corrente: " + numero + "-" + digito
                + "\nAgência: " + agencia.getNumero() + "-" + agencia.getDigito()
                + "\nSaldo: R$ " + saldo);
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
