import java.util.Random;
        import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 0 y 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // Genera un número entre 0 y 100
        int intentosMaximos = 5;
        int intentos = 0;
        boolean adivinado = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He generado un número entre 0 y 100. Tienes " + intentosMaximos + " intentos para adivinarlo.");

        while (intentos < intentosMaximos) {
            System.out.print("Intento " + (intentos + 1) + ": Ingresa tu número: ");
            int numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                adivinado = true;
                break; // Salir del bucle porque el usuario adivinó
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, has agotado tus " + intentosMaximos + " intentos.");
            System.out.println("El número correcto era: " + numeroAleatorio);
        }

        scanner.close();
        System.out.println("¡Gracias por jugar!");
    }
}
