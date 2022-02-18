
import javax.swing.JOptionPane;


public class Aula03 {
        
    public static void main(String[] args) {
        //Declaração de variáveis
        String nome, endereco,telefone;
        // Armazena valores nas variáveis
        nome = JOptionPane.showInputDialog("Qual seu nome? ");
        endereco = JOptionPane.showInputDialog("Qual seu endereco? ");
        telefone = JOptionPane.showInputDialog("Qual seu telefone? ");
        // Exibir na tela o conteúdo das variáveis na memoria
        JOptionPane.showMessageDialog(null, "Seu nome e " + nome);
        JOptionPane.showMessageDialog(null, "Seu endereço e " + endereco);
        JOptionPane.showMessageDialog(null, "Seu telefone  e " + telefone);
        JOptionPane.showMessageDialog(null,"Aproveite bastante o ensino");
        
        System.out.println("Aproveite o ensino")
        
    }

}
