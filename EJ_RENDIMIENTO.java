void main(){
    String num_vehiculo, clasificacion; 
    float km, litros, costo_litro, rend_esperado, rend_real;
    float diferencia, costo_total, margen;

    final float PORCEN_REAL = .1f;

    num_vehiculo = IO.readln("Ingresa No. Serie: ");
    km = Float.parseFloat(IO.readln("Km recorridos: "));
    litros = Float.parseFloat(IO.readln("Litros consumidos:"));
    costo_litro = Float.parseFloat(IO.readln("Costo por litro:"));
    rend_esperado = Float.parseFloat(IO.readln("Rendimiento esperado: "));

    rend_real = km / litros;
    margen = rend_esperado * PORCEN_REAL;

    if (rend_real >= rend_esperado){
        clasificacion = "Eficiente";
    } else if (rend_real >= (rend_esperado - margen )){
        clasificacion = "Aceptable";
    } else {
        clasificacion = "Ineficiente";
    }

    diferencia = rend_esperado - rend_real;
    costo_total = litros * costo_litro;

    IO.println("No. Serie: " + num_vehiculo);
    IO.println("Rendimiento esperado: " + rend_esperado);
    IO.println("Rendimiento real: " + rend_real);
    IO.println("Clasificacion: " + clasificacion);
    IO.println("Diferencia: " + diferencia);
    IO.println("Costo total: " + costo_total);
}