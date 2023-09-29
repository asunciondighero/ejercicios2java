 import java.util.Scanner;

public class aprobado {

    /**
     * @param numero
     */
    public static void verificarNumero(int numero) {
        if (numero < 60) {
            System.out.println(numero + " ha reprobado el examen");
        } else if (numero == 100) {
            System.out.println(numero + " haz aprobado el examen");
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

    
