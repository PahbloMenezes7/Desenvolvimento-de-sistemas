import javax.swing.JOptionPane;
public class aritmedicas {
    public static void main(String[] args) {
        String[] opcoes = {"Soma", "Substração", "Multiplicação", "Divisão"};
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma operação: ", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        double resultado = 0;

        switch (opcao) {
            case 0:
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 1:
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 3:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: não é possivel dividir por zero!");
                }
                break;
        }
    }
}
