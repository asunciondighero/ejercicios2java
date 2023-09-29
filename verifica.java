
public class verifica {

    public static boolean esMayorYMenor(int numero, int limiteInferior, int limiteSuperior) {
        return numero > limiteInferior && numero < limiteSuperior;
    }

    public static void main(String[] args) {
        int numero = 7; // Puedes cambiar el número aquí
        int limiteInferior = 5; // Puedes cambiar el límite inferior aquí
        int limiteSuperior = 10; // Puedes cambiar el límite superior aquí

        if (esMayorYMenor(numero, limiteInferior, limiteSuperior)) {
            System.out.println(numero + " es mayor que " + limiteInferior + " y menor que " + limiteSuperior + ".");
        } else {
            System.out.println(numero + " no cumple con los requisitos.");
        }
    }
}
