//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Hello World!!
        System.out.println("Hello World!");

        // Tipos de Variables
        int miPrimeraVariable = 18;

        System.out.println(miPrimeraVariable);

        //int miPrimeraVariable = 19;
        float estaturaMetro = 1.61f;
        double sensorData = 1.78;
        System.out.println();

        // Datos de tipo entero
        byte edad = 28; // -128 al 127
        short capacity = 32767;
        //short capacity = 32768; // excede la capacidad
        //int users =3147483647; // buffer overflow -> demasiado largo
        long worldPopulation = 2147483647;

    }
}