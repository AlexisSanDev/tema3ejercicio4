package ejercicio;

public class ejercicio4 {
    public static void main(String[] args) {
        int numero = 5;

        //Creamos una variable tipo constante para utilizarla.
        final char simbolo = '*';
        //Creamos el primer for.
        //Se hace con un preincremento ++j.
        for (int i = 0; i < numero; ++i) {
            //Cada primer for, se hace un salto de línea.
            System.out.println();
            //Utilizamos dos "for" para lograr la forma.
            for (int j = 0; j < numero - i - 1; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; ++j) {
                //Condición para imprimir solo los bordes.
                if ((i == 0) || (j == 0) || (j == 2 * i)) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        }
        //Se utiliza otro grupo de for para lograr la forma de "rombo"
        for (int j = numero - 2; j >= 0; --j) {
            System.out.println();
            //Utilizamos dos "for" para lograr la forma.
            for (int i = 0; i < numero - j - 1; ++i) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * j + 1; ++i) {
                //Condición para imprimir solo los bordes.
                if ((j == 0) || (i == 0) || (i == 2 * j)) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}
