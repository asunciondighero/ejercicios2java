public class adulto {

    public static boolean esAdulto(int edad) {
        return edad >= 18;
    }

    public static boolean esJubilado(boolean jubilado) {
        return jubilado;
    }

    public static void main(String[] args) {
        int edad = 30; // Puedes cambiar la edad aquí
        boolean jubilado = false; // Puedes cambiar el estado de jubilado aquí

        if (esAdulto(edad) && !esJubilado(jubilado)) {
            System.out.println("La persona es adulta y no es jubilada.");
        } else {
            System.out.println("La persona no cumple con los requisitos.");
        }
    }
}

   
