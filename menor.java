
public class menor {
    public static boolean esMayorQue(int numero1, int numero2) {
        return numero1 > numero2;
    }

    public static boolean esMenorQue(int numero1, int numero2) {
        return numero1 < numero2;
    }

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = -100;

        boolean resultadoMayor = esMayorQue(num1, num2);
        boolean resultadoMenor = esMenorQue(num1, num2);

        System.out.println(num1 + " es mayor que " + num2 + ": " + resultadoMayor);
        System.out.println(num1 + " es menor que " + num2 + ": " + resultadoMenor);
    }
}
