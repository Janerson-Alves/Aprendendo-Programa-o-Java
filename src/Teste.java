
import javax.swing.JOptionPane;
public class Teste {

    public static void main(String[] args) {
        String nome, genero,endereco, idade;
        nome = JOptionPane.showInputDialog("Qual seu nome?");
        idade = JOptionPane.showInputDialog("Qual sua idade?");
        genero = JOptionPane.showInputDialog("Qual seu genero?");       
        endereco = JOptionPane.showInputDialog("Qual seu endereço residencial?")
        JOptionPane.showMessageDialog(null, "Bem-vindo " + nome);
        JOptionPane.showMessageDialog(null, "Você mora na " + endereco);
        JOptionPane.showMessageDialog(null, "Sua idade " + idade );
        JOptionPane.showMessageDialog(null,"Você e do genero " + genero);        
        
        
               
       
        

    }

}
