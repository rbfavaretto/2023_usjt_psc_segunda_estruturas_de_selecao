//java.lang é o pacote padrão do Java
import javax.swing.JOptionPane;
public  class ExemploIf{
  static public void main(String [] args){
    //declaração de variáveis
    
    //entrada
    double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
    //processamento

    //saída
    if(nota >= 70)
      JOptionPane.showMessageDialog(null, "Aprovado");
  }
}