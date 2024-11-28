package ExemploTesteAtribuicao;
public class Professor {
    private String nome;
    private int idade;
    public Professor(String n, int i) {
        nome = n;
        idade = i;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String n) {
        nome = n;
    }
    public void setIdade(int i) {
        idade = i;
    }
    public String getDados(){
        return "ClasseProfessor[nome=" + nome + ",idade=" + idade +"]";
    }
}