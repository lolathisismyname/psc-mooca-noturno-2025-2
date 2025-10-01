import javax.swing.JOptionPane;

public class Calculadora {

    String modelo = "FX99";


    public Calculadora() {
   
        JOptionPane.showMessageDialog(null, "Calculadora simples!");
    }

    /* 
    public int soma(int a, int b){
        int resultado;
        resultado = a + b;
        return resultado;
        
    }*/

        public double soma(double a, double b){
            double resultado = a + b;
            return resultado;

        }

        public double soma(double a, double b, double c){
            double resultado = a + b + c;
            return resultado;

        }


/* 
     public int subtracao(int a, int b){
        int resultado;
        resultado = a - b;
        return resultado;
        
    } */
    public double subtracao(double a, double b){
        double resultado;
        resultado = a - b;
        return resultado;
        
    }
    public double subtracao(double a, double b, double c){
        double resultado;
        resultado = a - b - c;
        return resultado;
        
    }



    /* 

    public int multiplicao(int a, int b){
        int resultado;
        resultado = a * b;
        return resultado;
        
    }*/

    public double multiplicao(double a, double b){
        double resultado;
        resultado = a * b;
        return resultado;
        
    }
    public double multiplicao(double a, double b, double c){
        double resultado;
        resultado = a * b;
        return resultado;
        
    }
    
    
    /*

    public int divisao(int a, int b){
        int resultado;
        resultado = a / b;
        return resultado;
        
    }*/

    public double divisao(double a, double b){
        double resultado;
        resultado = a / b;
        return resultado;
        
    }

    public double divisao(double a, double b, double c){
        double resultado;
        resultado = a / b;
        return resultado;
    }

    
}
