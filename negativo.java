import java.util.Scanner;

public class negativo {

    /**
     * @param numero
     */
    public static void verificarNumero(int numero) {
        if (numero < 0) {
            System.out.println(numero + " es un número negativo.");
        } else if (numero == 0) {
            System.out.println(numero + " es cero.");
        } else {
            System.out.println(numero + " es un número positivo.");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args)
     
    {  try (Scanner scanner = new Scanner (System.in)) {
        int numero;
        System.out.println("ingrese el numero:   ");
           numero=scanner.nextInt();

        verificarNumero(numero);
    }
    }
}
