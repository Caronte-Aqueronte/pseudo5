import java.util.Scanner;

public class Seudo5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personas;
        int edad;
        int eleccion;
        int mayoredad = 0;
        int menoredad = 0;
        System.out.println("Ingrese la cantidad de participantes");
        personas = scanner.nextInt();
        for (int x = 0; x < personas; x++) {
            System.out.println("Ingrese la edad del participante");
            edad = scanner.nextInt();
            System.out.println("Ingrese sexo, 1.Hombre 2.Mujer");
            eleccion = scanner.nextInt();
            if (eleccion == 1) {
                if (edad < 18) {
                    menoredad++;
                }
            } else {
                if (edad >= 18) {
                    mayoredad++;
                }
            }
        }
        System.out.println("Hay " + mayoredad + " mujeres mayores de edad y hay " + menoredad + " hombres menores de edad");
    }
}