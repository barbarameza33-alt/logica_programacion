import java.util.Scanner;

public class EjercicioArreglos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] num_completo = new int[10];

        System.out.println("Ingrese 10 números enteros: ");

        for (int i = 0; i < num_completo.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num_completo[i] = entrada.nextInt();
        }

        int mayor = num_completo[0];
        int posMayor = 0;
        int menor = num_completo[0];
        int posMenor = 0;

        for (int i = 1; i < num_completo.length; i++) {

            if (num_completo[i] > mayor) {    
                mayor = num_completo[i];
                posMayor = i;                 
            }

            if (num_completo[i] < menor) {
                menor = num_completo[i];
                posMenor = i;
            }
        }

        System.out.println("El número mayor es: " + mayor + " y está en la posición " + posMayor);
        System.out.println("El número menor es: " + menor + " y está en la posición " + posMenor);

        entrada.close();
    }
}
