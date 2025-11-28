public class Titles {

    public static void writeTitle(String c) {

        System.out.println("");

        for(int i=0;i<c.length()+12;i++){
            System.out.printf("*");
        }
        System.out.print("***");
        System.out.print(" ");
        System.out.print(" ");
        System.out.print(" ");

        System.out.print(c);

        System.out.print(" ");
        System.out.print(" ");
        System.out.print(" ");
        System.out.print("***");

        for(int i=0;i<c.length()+12;i++){
            System.out.printf("*");
        }
        System.out.println("");
    }

    public static void writeHeader() {

        for (int i = 0; i < 80; i++) {

            System.out.print("<");

        }

        System.out.println();
    }

    public static void writeTailer(int veces) {

        for (int i = 0; i < veces ; i++) {

            System.out.print(">");

        }
        System.out.println();
    }
}