import java.util.Scanner;

public class Vivero {
    public static void main(String[] args) {
    
        // j= productos
        String [] productos = {"Cactus", "Suculentas", "Maceta", "Tierra", "Fertilizante" };
        double [] precio = {45.5, 35.5, 60, 80, 95};

        // i= dias
        String [] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        
        Scanner entrada = new Scanner(System.in);

        double [][] ventas = new double [6][5];

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < productos.length; j++) {
                System.out.println("Ingrese la cantidad vendida de " + productos[j] + " el " + dias[i] + ":");
                int cantidadVendida = entrada.nextInt();

                ventas[i][j] = cantidadVendida * precio[j];
            }
        }

        System.out.println("RESUMEN DE VENTAS");
        // Encabezados de productos
        System.out.printf("%15s", "Dia");

        for (int j = 0; j < productos.length; j++) {
            System.out.printf("%15s", productos[j]);
        }

        System.out.println();

        // Mostrar la matriz
        for (int fila = 0; fila < dias.length; fila++) {

            System.out.printf("%15s", dias[fila]);

            for (int j = 0; j < productos.length; j++) {
                System.out.printf("%15.2f", ventas[fila][j]);
            }
            System.out.println();
        }
    }
}

