package interes;

import java.util.Scanner;
//import java.text.DecimalFormat;

public class Interes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operation en = new Operation();

        Scanner Z = new Scanner(System.in);

        System.out.println("Elija entre estas operaciones:\n1: Para hallar el "
                + "interes simple\n2: Para hallar el interes compuesto\nDigite "
                + "1 o 2 para iniciar:");
        int Isimple = 0;
        int Icompuesto = 0;

        int numero = Z.nextInt();

        switch (numero) {

            case 1:
                en.Isimple(Isimple);
                break;
            case 2:
                en.Icompuesto(Icompuesto);
                break;
        }
    }
}
