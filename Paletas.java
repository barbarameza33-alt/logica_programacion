import java.util.Scanner;

public class Paletas {
    public static void main (String [] args) {

    final int FRESA = 15;
    final int LIMON = 12;
    final int COCO = 18;
    final int DIAS = 2;
    final int SABORES = 3;
    
    int venta_fresa;
    int venta_limon;
    int venta_coco;
    int dia;
    int total = 0;
            Scanner scanner = new Scanner(System.in);


    for (int i = 1; i <= DIAS; i++) {
        System.out.println("Ingrese la venta de paletas de fresa del día " + i);
        venta_fresa = scanner.nextInt();
        System.out.println("Ingrese la venta de paletas de limón del día " + i);
        venta_limon = scanner.nextInt();
        System.out.println("Ingrese la venta de paletas de coco del día " + i);
        venta_coco = scanner.nextInt();

        dia = (venta_fresa * FRESA) + (venta_limon * LIMON) + (venta_coco * COCO);
        System.out.println("La venta total del día " + i + " es: " + dia);
        total += dia;
    }
    System.out.println("La venta total de las " + DIAS + " días es: " + total);

}

    }

    
