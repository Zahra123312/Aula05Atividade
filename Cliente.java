package ExemploTesteCaixaEletronico;

public class Cliente {
    private String nome;
    private String cpf;
    private ContaCorrente conta;
    public Cliente(String nome, String cpf, ContaCorrente conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public ContaCorrente getConta() {
        return conta;
    }
    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }
  }
