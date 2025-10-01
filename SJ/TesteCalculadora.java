import javax.swing.JOptionPane;

public class TesteCalculadora extends Calculadora {
    public static void main(String[] args) {
        
        Calculadora cal = new Calculadora();
        CalculadoraCientifica CalculadoraCientifica = new CalculadoraCientifica();
        int op= Integer.parseInt(JOptionPane.showInputDialog("Escolha a operacao:\n1-Soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao\n5-soma 3 numeros"));
  
        CalculadoraCientifica.mensagem();
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
    switch (op ) {
        case 1:
        JOptionPane.showMessageDialog(null, "Resultado: " + cal.soma(n1, n2));     
            break;
    
        default:
            break;
            case 2:
            JOptionPane.showMessageDialog(null, "Resultado: " + cal.subtracao(n1, n2));
            break;
            case 3: 
            JOptionPane.showMessageDialog(null, "Resultado: " + cal.multiplicao(n1, n2)); 
            break;  
            case 4:
            JOptionPane.showMessageDialog(null, "Resultado: " + cal.divisao(n1, n2));   
            break;
            case 5:
            double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero:"));
            JOptionPane.showMessageDialog(null, "Resultado: " + cal.soma(n1, n2, n3));
            break;
    }

    
    
    }
}
