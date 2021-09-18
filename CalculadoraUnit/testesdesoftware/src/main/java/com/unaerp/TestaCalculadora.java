import javax.swing.JOptionPane;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        int valor1 = 5;
        int valor2 = 6;

        double valorTotal = c.somar(valor1,valor2);

        if(valorTotal == 10){
            JOptionPane.showMessageDialog(null, "Valor correto!");
        }
        else
            JOptionPane.showMessageDialog(null, "Valor incorreto!");
    }
}
