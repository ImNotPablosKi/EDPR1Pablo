public class Figures {

    public static char Asterisk = '*';

    public static void writeSquare(int a, String cosa) {

        if (cosa.equalsIgnoreCase("*")) {

            for(int i=0;i<a;i++){

                for(int j=0;j<a;j++){
                    System.out.printf("*");
                }

                System.out.println("");
            }

        } else if (cosa.equalsIgnoreCase("$")) {

            for(int i=0;i<a;i++){

                for(int j=0;j<a;j++){
                    System.out.printf("$");
                }

                System.out.println("");
            }

        }


    }

    public static void writeInvertedTriangle(int ancho, int alto) {

        for (int i = 0; i < alto ; i++) {

            for (int j = 0; j < ancho ; j++) {

                System.out.print("*");

            }
            ancho -= 1;
            System.out.println(" ");

        }



    }

    public static void writeRectangle(int base, int altura, String caracter) {

        for (int i = 0; i < altura ; i++) {

            for (int j = 0; j < base; j++) {

                System.out.print(caracter);

            }
            System.out.println(" ");
        }


    }


}
