public class divisible {

    public static boolean esDivisiblePor2(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esDivisiblePor3(int numero) {
        return numero % 3 == 0;
    }

    public static void main(String[] args) {
        int numero = 18; // Puedes cambiar el número aquí

        if (esDivisiblePor2(numero) || esDivisiblePor3(numero)) {
            System.out.println(numero + " es divisible por 2 o por 3.");
        } else {
            System.out.println(numero + " no es divisible por 2 ni por 3.");
        }
    }
}
