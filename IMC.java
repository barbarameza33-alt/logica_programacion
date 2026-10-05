void main() {
        // Código para calcular el Índice de Masa Corporal
    IO.println ("Calculadora de IMC");

    final double BAJO_PESO =18.5;
    final double NORMAL = 25;
    final double SOBREPESO = 30;   

    String respuesta;

    do {
        double peso = Double.parseDouble(IO.readln("Ingresa tu peso en kg: "));
        double estatura = Double.parseDouble(IO.readln("Ingresa tu estatura en metros: "));

        double imc = peso / (estatura * estatura);
        IO.println("Tu IMC es: " + imc);

        if (imc < BAJO_PESO) {
            IO.println("Clasificación: Bajo peso");
            IO.println("Recomendación:");
            IO.println("Se recomienda consultar a un especialista en nutrición para evaluar tu estado de salud y mantener una alimentación variada y suficiente.");
        } else if (imc < NORMAL) {
            IO.println("Clasificación: Normal");
            IO.println("Recomendación:");
            IO.println("Tu estado de salud es adecuado. Mantén un estilo de vida saludable con una dieta equilibrada y ejercicio regular.");
        } else if (imc < SOBREPESO) {
            IO.println("Clasificación: Sobrepeso");
            IO.println("Recomendación:");
            IO.println("Se recomienda mejorar la calidad de la alimentación y aumentar la actividad física y reducir el sedentarismo");
        } else {
            IO.println("Clasificación: Obesidad");
            IO.println("Recomendación:");
            IO.println("Es importante consultar a un especialista en nutrición para evaluar tu estado de salud y adoptar hábitos saludables de forma gradual, evitando dietas extremas.");
        }
    respuesta = IO.readln("¿Deseas calcular otro IMC?: Escribe S para sí o N para no: ");
    } while (respuesta.equalsIgnoreCase("S"));

}