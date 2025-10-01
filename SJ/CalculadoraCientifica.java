import javax.swing.JOptionPane;

public class CalculadoraCientifica extends Calculadora {
  
    
public CalculadoraCientifica(){
    modelo = "FX99";
JOptionPane.showMessageDialog(null, "Calculadora! " + modelo);
}

public void mensagem () { 
    modelo = "FX99";
JOptionPane.showMessageDialog(null, "Calculadora! " + modelo);
  //  super.modelo = "Cientifica";
    super.soma(3, 2);


}
@Override
public double subtracao(double a, double b){
    double resultado;
    resultado = a - b;
    return resultado;


}

}