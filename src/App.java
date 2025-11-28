import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println(String.format("Write console tests"));

        Scanner teclado = new Scanner(System.in);

        for (; true; ) {
            System.out.println("Choose an option:\n" +
                    "  1. Square\n" +
                    "  2. Title\n" +
                    "  3. Triangle\n" +
                    "  4. Rectangle\n" +
                    "  0. Quit\n");

            int numero = teclado.nextInt();
            if (numero == 1) {
                System.out.printf("Lado del cuadrado: ");
                int lado = teclado.nextInt();
                System.out.println("Que carácter quieres? (* (o) $)");
                String cosa = teclado.next();
                Figures.writeSquare(lado, cosa);

            } else if (numero == 2) {
                System.out.printf("Titulo: ");
                String titulo = teclado.nextLine();
                titulo = teclado.nextLine();
                Titles.writeTitle(titulo);
            } else if (numero == 0) {
                Console.close();
            } else if (numero == 3) {
                System.out.println("Dime la altura del triangulo:");
                int alto = teclado.nextInt();
                Figures.writeInvertedTriangle(alto, alto);

            } else if (numero == 4) {

                System.out.println("Dame la base: ");
                int base = teclado.nextInt();
                System.out.println("Ahora la altura: ");
                int altura = teclado.nextInt();
                System.out.println("Para finalizar, dime el carácter a escribir: ");
                String car = teclado.next();
                Figures.writeRectangle(base, altura, car);

            }
        }
    }


}
