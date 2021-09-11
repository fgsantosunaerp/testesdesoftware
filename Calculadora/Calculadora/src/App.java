import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int x,y;
        String sX, sY;

        sX = JOptionPane.showInputDialog(null, "Digite o número 1:", "Primeiro Número", JOptionPane.QUESTION_MESSAGE);
        x = Integer.parseInt(sX);

        sY = JOptionPane.showInputDialog(null, "Digite o número 2: ", "Segundo número", JOptionPane.QUESTION_MESSAGE);
        y = Integer.parseInt(sY);

        Calculadora calc = new Calculadora();

        JOptionPane.showMessageDialog(null, "Somar: " + calc.somar(x,y));
        JOptionPane.showMessageDialog(null, "Subtrair: " + calc.subtrair(x,y));
        JOptionPane.showMessageDialog(null, "Multiplicar: " + calc.multiplicar(x,y));
        JOptionPane.showMessageDialog(null, "Dividir: " + calc.dividir(x,y));

        System.exit(0);
    }
}
