package UncheckedException;

import javax.swing.*;

public class UncheckedExeption {
    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Numerador: ");

        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);
    }


    public static int dividir(int a, int b) {return a / b;}

}
