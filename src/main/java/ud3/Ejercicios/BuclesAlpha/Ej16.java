package ud3.Ejercicios.BuclesAlpha;

import javax.swing.*;

public class Ej16 {
    public static void main(String[] args) {
        int conPos = 0;
        int conNeg = 0;

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº"));
            if (num > 0) conPos++;
            if (num < 0) conNeg++;
        }

        JOptionPane.showMessageDialog(
                null,
                "Hay "+conPos+
                " nº positivos y "+conNeg+" nº negativos");
    }
}
