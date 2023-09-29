public class esPrimo {

    public static boolean siesPrimo(int numero) {
        if (numero < 2) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean esMenorQue100(int numero) {
        return numero < 100;
    }

    public static void main(String[] args) {
        int numero = 89; // Puedes cambiar el número aquí

        if (siesPrimo(numero) && esMenorQue100(numero)) {
            System.out.println(numero + " es un número primo menor que 100.");
        } else {
            System.out.println(numero + " no es un número primo menor que 100.");
        }
    }
}

