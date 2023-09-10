import javax.swing.*;

public class fatorial {

    public static void main(String[] args) {

        int n, i, f;
        String numInput;
        numInput = JOptionPane.showInputDialog(null, "Digite um número");
        n = Integer.parseInt(numInput);
        // ... Computation

        f = 1;
        for (i = n; i >= 1; i--) {
            f = f * i;
        }
        // ... Output
        JOptionPane.showMessageDialog(null, "O valor do fatorial é: " + f);
    }

}