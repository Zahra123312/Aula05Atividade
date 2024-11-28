package ExemploTesteAtribuicao;
import javax.swing.JOptionPane;

public class TesteAtribuicao {
    public static void main(String[] args) {
        String nomeProfessor = JOptionPane.showInputDialog("Informe o nome do Professor:");
        int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Professor:"));

        Professor professor = new Professor(nomeProfessor, idadeProfessor);
        String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da Disciplina:");

        String praticaResposta = JOptionPane.showInputDialog("A disciplina é prática? (Sim / Não)");
        boolean pratica = praticaResposta.equalsIgnoreCase("Sim");

        Disciplina disciplina = new Disciplina(nomeDisciplina, pratica);
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());
    }
}
